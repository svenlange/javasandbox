package za.co.svenlange.eclipse;

import static com.google.common.collect.Lists.newArrayList;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.utils.GenModelHelper;
import org.eclipse.emf.mwe2.ecore.CvsIdFilteringGeneratorAdapterFactoryDescriptor;
import org.eclipse.emf.mwe2.runtime.Mandatory;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;

import com.google.common.base.Function;

// copied from org.eclipse.emf.mwe2.ecore.EcoreGenerator
public class XsdToJavaGenerator implements IWorkflowComponent {

	private static Logger log = Logger.getLogger(XsdToJavaGenerator.class);
	static {
		EcorePackage.eINSTANCE.getEFactoryInstance();
		GenModelPackage.eINSTANCE.getEFactoryInstance();
		XSDPackage.eINSTANCE.getEFactoryInstance();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xsd", new XSDResourceFactoryImpl());
	}

	private String modelDirectory;

	protected List<String> srcPaths = newArrayList(); //FIXME TODO notwendig????
	
	private String xsdSchema;

	@Mandatory
	public void setModelDirectory(final String modelDirectory) {
		this.modelDirectory = modelDirectory;
	}

	@Mandatory
	public void addSrcPath(final String srcPath) {
		this.srcPaths.add(srcPath);
	}

	@Mandatory
	public void setXsdSchema(final String xsdSchema) {
		this.xsdSchema = xsdSchema;
	}

	@Override
	public void preInvoke() {
		// nothing to do here in this component
	}

	@Override
	public void postInvoke() {
		// nothing to do here in this component
	}

	protected GenModelHelper createGenModelSetup() {
		return new GenModelHelper();
	}

	private GenModel loadAndConvert() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource schemaRes = resourceSet.getResource(URI.createURI(xsdSchema), true);
		XSDSchema schema = (XSDSchema) schemaRes.getContents().get(0);
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		xsdEcoreBuilder.generate(schema);

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		addResource(resourceSet, genModel);
		for (EPackage ePackage : xsdEcoreBuilder.getTargetNamespaceToEPackageMap().values()) {
			addResource(resourceSet, ePackage);
			GenPackage genPackage = GenModelFactory.eINSTANCE.createGenPackage();
			genPackage.setEcorePackage(ePackage);
			genModel.getGenPackages().add(genPackage);
		}
		genModel.setModelDirectory(modelDirectory);
		// target code should Java 6 compliant
		genModel.setComplianceLevel(GenJDKLevel.JDK60_LITERAL);
		return genModel;
	}

	private void addResource(final ResourceSet resSet, final EObject eObject) {
		Resource res = new XMIResourceFactoryImpl().createResource(URI.createURI("xsd.genmodel"));
		res.getContents().add(eObject);
		resSet.getResources().add(res);
	}

	@Override
	public void invoke(final IWorkflowContext ctx) {
		final GenModel genModel = loadAndConvert();
		genModel.setCanGenerate(true);
		genModel.reconcile();
		createGenModelSetup().registerGenModel(genModel);

		Generator generator = new Generator() {
			@Override
			public JControlModel getJControlModel() {
				return new JControlModel() {
					@Override
					public boolean canMerge() {
						return false;
					}
				};
			}
		};
		log.info("Generating EMF code for " + this.xsdSchema);
		generator.getAdapterFactoryDescriptorRegistry().addDescriptor(GenModelPackage.eNS_URI, new GeneratorAdapterDescriptor(getTypeMapper()));
		generator.setInput(genModel);

		Diagnostic diagnostic = generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor());

		if (diagnostic.getSeverity() != Diagnostic.OK)
			log.info(diagnostic);
	}

	protected Function<String, String> getTypeMapper() {
		return new mapper();
	}

	protected final class mapper implements Function<String, String> {
		@Override
		public String apply(final String from) {
			if (from.startsWith("org.eclipse.emf.ecore"))
				return null;
			for (String srcPath : srcPaths) {
				URI createURI = URI.createURI(srcPath + "/" + from.replace('.', '/') + "Custom.java");
				String customClassName = from + "Custom";
				if (URIConverter.INSTANCE.exists(createURI, null)) {
					return customClassName;
				}
			}
			return null;
		}
	}

	public void generate(final String from, final String customClassName, final URI path) {
		StringBuilder sb = new StringBuilder();
		int lastIndexOfDot = customClassName.lastIndexOf('.');
		sb.append("package ").append(customClassName.substring(0, lastIndexOfDot)).append(";\n\n\n");
		sb.append("public class ").append(customClassName.substring(lastIndexOfDot + 1)).append(" extends ").append(from).append(" {\n\n");
		sb.append("}\n");

		try {
			OutputStream stream = URIConverter.INSTANCE.createOutputStream(path);
			stream.write(sb.toString().getBytes());
			stream.close();
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}

	/**
	 * @author Sven Efftinge - Initial contribution and API
	 */
	protected static class GeneratorAdapterDescriptor extends CvsIdFilteringGeneratorAdapterFactoryDescriptor {
		/**
		 * @author Sebastian Zarnekow - Initial contribution and API
		 */
		private final class CustomImplAwareGeneratorAdapterFactory extends IdFilteringGenModelGeneratorAdapterFactory {
			@Override
			public Adapter createGenClassAdapter() {
				return new IdFilteringGenClassAdapter(this) {
					@Override
					protected void createImportManager(final String packageName, final String className) {
						importManager = new ImportManagerHack(packageName, typeMapper);
						importManager.addMasterImport(packageName, className);
						if (generatingObject != null)
							((GenBase) generatingObject).getGenModel().setImportManager(importManager);
					}
				};
			}

			@Override
			public Adapter createGenEnumAdapter() {
				return new IdFilteringGenEnumAdapter(this) {
					@Override
					protected void createImportManager(final String packageName, final String className) {
						importManager = new ImportManagerHack(packageName, typeMapper);
						importManager.addMasterImport(packageName, className);
						if (generatingObject != null)
							((GenBase) generatingObject).getGenModel().setImportManager(importManager);
					}
				};
			}

			@Override
			public Adapter createGenModelAdapter() {
				if (genModelGeneratorAdapter == null) {
					genModelGeneratorAdapter = new GenModelGeneratorAdapter(this) {
						@Override
						protected void createImportManager(final String packageName, final String className) {
							importManager = new ImportManagerHack(packageName, typeMapper);
							importManager.addMasterImport(packageName, className);
							if (generatingObject != null)
								((GenBase) generatingObject).getGenModel().setImportManager(importManager);
						}

					};
				}
				return genModelGeneratorAdapter;
			}

			@Override
			public Adapter createGenPackageAdapter() {
				return new IdFilteringGenPackageAdapter(this) {
					@Override
					protected void createImportManager(final String packageName, final String className) {
						importManager = new ImportManagerHack(packageName, typeMapper);
						importManager.addMasterImport(packageName, className);
						if (generatingObject != null)
							((GenBase) generatingObject).getGenModel().setImportManager(importManager);
					}
				};
			}
		}

		private final Function<String, String> typeMapper;

		protected GeneratorAdapterDescriptor(final Function<String, String> typeMapper) {
			this.typeMapper = typeMapper;
		}

		@Override
		public GeneratorAdapterFactory createAdapterFactory() {
			return new CustomImplAwareGeneratorAdapterFactory();
		}
	}

	protected static class ImportManagerHack extends ImportManager {

		private final Function<String, String> typeMapper;

		public ImportManagerHack(final String compilationUnitPackage, final Function<String, String> typeMapper) {
			super(compilationUnitPackage);
			this.typeMapper = typeMapper;
		}

		@Override
		public String getImportedName(final String qualifiedName, final boolean autoImport) {
			String mapped = typeMapper.apply(qualifiedName);
			if (mapped != null) {
				log.debug("mapping " + qualifiedName + " to " + mapped);
				return super.getImportedName(mapped, autoImport);
			} else
				return super.getImportedName(qualifiedName, autoImport);
		}
	}

}
