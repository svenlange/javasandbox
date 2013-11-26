package za.co.svenlange.eclipse;

import static org.junit.Assert.*;

import org.junit.Test;

public class VariableResolvingPropertiesTest {

	@Test
	public void test1() {
		VariableResolvingProperties props = new VariableResolvingProperties();
		props.put("a", "a/${hallo}");
		props.put("hallo", "moin");		
		assertEquals("a/moin", props.getProperty("a"));
	}
	
	@Test
	public void test2() {
		VariableResolvingProperties props = new VariableResolvingProperties();
		props.put("a", "a/${hallo}");
		assertEquals("a/${hallo}", props.getProperty("a"));
	}

}
