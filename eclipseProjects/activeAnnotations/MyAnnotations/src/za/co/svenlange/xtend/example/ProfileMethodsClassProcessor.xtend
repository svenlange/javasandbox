package za.co.svenlange.xtend.example

import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import java.util.List
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.expression.Expression

class ProfileMethodsClassProcessor extends AbstractClassProcessor {
	
	override void doTransform(List<? extends MutableClassDeclaration> annotatedClasses, @Extension TransformationContext context) {
		for(clazz: annotatedClasses) {
			for (m : clazz.declaredMethods) {
				val oldBody = m.body.class
				
				
				m.body = ['''"moin"''']
				
				
			}
		}
	}
	
}
