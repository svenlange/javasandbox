package za.co.svenlange.xtend.example

import java.util.logging.Logger
import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.Visibility

class ProfileMethodsClassProcessor extends AbstractClassProcessor {

    override doTransform(MutableClassDeclaration it, extension TransformationContext context) {
        addLoggerToClass(context)
        addLoggingToAllMethods(context)
    }

    def private void addLoggerToClass(MutableClassDeclaration annotatedClass, extension TransformationContext context) {
        annotatedClass.addField("LOGGER") [
            static = true
            final = true
            type = Logger.newTypeReference()
            initializer = ['''Logger.getLogger(«annotatedClass.qualifiedName».class.getName());''']
            primarySourceElement = annotatedClass
        ]
    }

    def private void addLoggingToAllMethods(MutableClassDeclaration it, extension TransformationContext context) {
        declaredMethods.forEach [ method |
            addMethod(method.simpleName + 'Delegate') [
                visibility = Visibility.PRIVATE
                returnType = method.returnType
                docComment = method.docComment
                static = method.static
                body = method.body
                for (p : method.parameters) {
                    addParameter(p.simpleName, p.type)
                }
                exceptions = method.exceptions
                primarySourceElement = method
            ]
            method.body = [
                '''
                    long start = System.currentTimeMillis();
                    try {
                      «if(!method.returnType.void) "return "»«method.simpleName + 'Delegate'»(«method.parameters.map[simpleName].join(", ")»);
                    } finally {
                      LOGGER.info("Executing method '«method.simpleName»' took: " + (System.currentTimeMillis() - start) + " milliseconds.");
                    }
                '''
            ]
        ]
    }

}
