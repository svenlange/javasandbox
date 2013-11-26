package za.co.svenlange.xtend.example;

import java.util.List;
import org.eclipse.xtend.lib.macro.AbstractClassProcessor;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.declaration.CompilationStrategy;
import org.eclipse.xtend.lib.macro.declaration.CompilationStrategy.CompilationContext;
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration;
import org.eclipse.xtend.lib.macro.expression.Expression;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ProfileMethodsClassProcessor extends AbstractClassProcessor {
  public void doTransform(final List<? extends MutableClassDeclaration> annotatedClasses, @Extension final TransformationContext context) {
    for (final MutableClassDeclaration clazz : annotatedClasses) {
      Iterable<? extends MutableMethodDeclaration> _declaredMethods = clazz.getDeclaredMethods();
      for (final MutableMethodDeclaration m : _declaredMethods) {
        {
          final Expression oldBody = m.getBody();
          final CompilationStrategy _function = new CompilationStrategy() {
            public CharSequence compile(final CompilationContext it) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("System.out.println(\"Moin!\");");
              _builder.newLine();
              return _builder;
            }
          };
          m.setBody(_function);
        }
      }
    }
  }
}
