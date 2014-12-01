package b.serializer;

import b.b.BPackage;
import b.b.Import;
import b.b.Model;
import b.b.ReferencedGreetings;
import b.services.BGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case BPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case BPackage.REFERENCED_GREETINGS:
				if(context == grammarAccess.getReferencedGreetingsRule()) {
					sequence_ReferencedGreetings(context, (ReferencedGreetings) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedName
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* greetings+=ReferencedGreetings*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=[Greeting|ID]
	 */
	protected void sequence_ReferencedGreetings(EObject context, ReferencedGreetings semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BPackage.Literals.REFERENCED_GREETINGS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BPackage.Literals.REFERENCED_GREETINGS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferencedGreetingsAccess().getNameGreetingIDTerminalRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
}
