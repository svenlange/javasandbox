package za.co.svenlange.eclipse;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A Properties implementation that is capable of resolving variable values in
 * Ant style. Variables might be referred by quoting them with ${VARNAME}. If
 * another property exists with name VARNAME then it will be resolved when
 * accessing the property value with {@link #getProperty(String)}.
 * 
 * @author thomkar
 * @author langsve
 * 
 */
public class VariableResolvingProperties extends Properties {

	private static final Pattern PROPERTY_PATTERN = Pattern.compile("\\$\\{([\\w_\\.-]+)\\}");

	private static final long serialVersionUID = 1L;

	/**
	 * Originates from
	 * {@code org.eclipse.emf.mwe.internal.core.ast.util.VisitorInitializer}
	 */
	private String replaceProperties(final String toResolve) {
		if (toResolve == null) {
			return null;
		}
		final Matcher m = PROPERTY_PATTERN.matcher(toResolve);
		final StringBuffer buff = new StringBuffer();
		int index = 0;
		while (m.find()) {
			final String varName = m.group(1);
			String propValue = super.getProperty(varName);
			if (propValue == null) {
				propValue = "${" + varName + "}";
			} else {
				propValue = replaceProperties(propValue);
			}
			final int start = m.start();
			final int end = m.end();
			buff.append(toResolve.substring(index, start));
			buff.append(propValue);
			index = end;
		}
		buff.append(toResolve.substring(index));
		return buff.toString();
	}

	@Override
	public String getProperty(final String key) {
		String property = super.getProperty(key);
		return replaceProperties(property);
	}

}
