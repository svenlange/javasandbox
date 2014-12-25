package za.co.svenlange.xtend.example

import org.eclipse.xtend.core.compiler.batch.XtendCompilerTester
import org.junit.Test

class ProfileMethodsTest {
	extension XtendCompilerTester compilerTester = XtendCompilerTester.newXtendCompilerTester(ProfileMethods)

  @Test def void testLazy() {
    '''
      class Person {
        String name = 'foo'
      }
    '''.assertCompilesTo(
    '''
      @SuppressWarnings("all")
      public class Person {
        private String name = "foo";
      }
    ''')
  }
}