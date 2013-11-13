package za.co.svenlange.eclipse;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.log4j.Logger;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;

import za.co.svenlange.eclipse.VariableResolvingProperties;

import com.google.common.collect.Lists;

/**
 * A specialized MWE2 launcher that accepts properties files as input. Values
 * from the properties will be handled as workflow properties. The properties
 * definitions might contain Ant style variables.
 * 
 * @author thomkar
 * 
 */
public class Mwe2LauncherExt extends Mwe2Launcher {
	private static final String PARAM_PARAMDEF = "p";
	private static final String PARAM_PROPERTIES = "f";

	private static final Logger logger = Logger.getLogger(Mwe2Launcher.class);

	public static void main(final String[] args) {
		try {
			new Mwe2LauncherExt().run(args);
		} catch (Throwable throwable) {
			logger.error(throwable.getMessage(), throwable);
			System.exit(1);
		}
	}

	@Override
	public void run(final String[] args) {
		Options options = getOptions();
		final CommandLineParser parser = new PosixParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
			String[] optionValues = line.getOptionValues(PARAM_PROPERTIES);
			if (optionValues != null) {
				VariableResolvingProperties props = new VariableResolvingProperties();
				List<String> params = Lists.newArrayList();
				params.add(args[0]);
				String[] paramDefs = line.getOptionValues(PARAM_PARAMDEF);
				if (paramDefs != null) {
					for (String value : paramDefs) {
						params.add("-p");
						params.add(value);
					}
				}
				// load all .properties files and store values into 'props'
				for (String propertiesPath : optionValues) {
					FileReader reader = new FileReader(propertiesPath);
					Properties propsFromFile = new Properties();
					propsFromFile.load(reader);
					props.putAll(propsFromFile);
				}
				for (String p : props.stringPropertyNames()) {
					params.add("-p");
					params.add(p + "=" + props.getProperty(p));
				}
				String[] modifiedArgs = params.toArray(new String[params.size()]);
				super.run(modifiedArgs);
				return;
			}

		} catch (ParseException exp) {
			final HelpFormatter formatter = new HelpFormatter();
			System.err.println("Parsing arguments failed.  Reason: " + exp.getMessage());
			formatter.printHelp("java " + Mwe2LauncherExt.class.getName() + " some.mwe2.Module [options]\n", options);
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		super.run(args);
	}

	@Override
	public Options getOptions() {
		Options options = super.getOptions();

		@SuppressWarnings("static-access")
		final Option paramOption = OptionBuilder.withArgName("path").withDescription("external .properties file").hasArgs().create(PARAM_PROPERTIES);
		paramOption.setLongOpt("properties");
		options.addOption(paramOption);

		return options;
	}
}
