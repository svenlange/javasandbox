package za.co.svenlange.xtend.example

import org.eclipse.xtend.core.compiler.batch.XtendCompilerTester
import org.junit.Test

class ProfileMethodsTest {

  extension XtendCompilerTester compilerTester = XtendCompilerTester.newXtendCompilerTester(ProfileMethods)

  @Test
  def assertCompilesTo() {
    '''
      import za.co.svenlange.xtend.example.ProfileMethods
      
      @ProfileMethods
      class EineKlasse {
        def void methode() {
          println("Tach!")
        }
      }
    '''.assertCompilesTo(
    '''
      import java.util.logging.Logger;
      import org.eclipse.xtext.xbase.lib.InputOutput;
      import za.co.svenlange.xtend.example.ProfileMethods;
      
      @ProfileMethods
      @SuppressWarnings("all")
      public class EineKlasse {
        public void methode() {
          long start = System.currentTimeMillis();
          try {
            methodeDelegate();
          } finally {
            LOGGER.info("Executing method 'methode' took: " + (System.currentTimeMillis() - start) + " milliseconds.");
          }
        }
        
        private final static Logger LOGGER = Logger.getLogger(EineKlasse.class.getName());;
        
        private void methodeDelegate() {
          InputOutput.<String>println("Tach!");
        }
      }
    ''')
  }
}