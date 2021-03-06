/*
* generated by Xtext
*/
grammar InternalB;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package b.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package b.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import b.services.BGrammarAccess;

}

@parser::members {
 
 	private BGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(BGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getPackageAssignment()); }
(rule__Model__PackageAssignment)
{ after(grammarAccess.getModelAccess().getPackageAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePackageDeclaration
entryRulePackageDeclaration 
:
{ before(grammarAccess.getPackageDeclarationRule()); }
	 rulePackageDeclaration
{ after(grammarAccess.getPackageDeclarationRule()); } 
	 EOF 
;

// Rule PackageDeclaration
rulePackageDeclaration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPackageDeclarationAccess().getGroup()); }
(rule__PackageDeclaration__Group__0)
{ after(grammarAccess.getPackageDeclarationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImport
entryRuleImport 
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportAccess().getGroup()); }
(rule__Import__Group__0)
{ after(grammarAccess.getImportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard 
:
{ before(grammarAccess.getQualifiedNameWithWildcardRule()); }
	 ruleQualifiedNameWithWildcard
{ after(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
(rule__QualifiedNameWithWildcard__Group__0)
{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleReferencedGreeting
entryRuleReferencedGreeting 
:
{ before(grammarAccess.getReferencedGreetingRule()); }
	 ruleReferencedGreeting
{ after(grammarAccess.getReferencedGreetingRule()); } 
	 EOF 
;

// Rule ReferencedGreeting
ruleReferencedGreeting
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getReferencedGreetingAccess().getGroup()); }
(rule__ReferencedGreeting__Group__0)
{ after(grammarAccess.getReferencedGreetingAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PackageDeclaration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PackageDeclaration__Group__0__Impl
	rule__PackageDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PackageDeclaration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PackageDeclaration__Group__1__Impl
	rule__PackageDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); }
(rule__PackageDeclaration__NameAssignment_1)
{ after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PackageDeclaration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PackageDeclaration__Group__2__Impl
	rule__PackageDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_2()); }
(rule__PackageDeclaration__ImportsAssignment_2)*
{ after(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PackageDeclaration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PackageDeclaration__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageDeclarationAccess().getGreetingsAssignment_3()); }
(rule__PackageDeclaration__GreetingsAssignment_3)*
{ after(grammarAccess.getPackageDeclarationAccess().getGreetingsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Import__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
(rule__Import__ImportedNamespaceAssignment_1)
{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedNameWithWildcard__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedNameWithWildcard__Group__0__Impl
	rule__QualifiedNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedNameWithWildcard__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
(
	'.*' 
)?
{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ReferencedGreeting__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferencedGreeting__Group__0__Impl
	rule__ReferencedGreeting__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedGreeting__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencedGreetingAccess().getGKeyword_0()); }

	'g: ' 

{ after(grammarAccess.getReferencedGreetingAccess().getGKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReferencedGreeting__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReferencedGreeting__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedGreeting__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencedGreetingAccess().getNameAssignment_1()); }
(rule__ReferencedGreeting__NameAssignment_1)
{ after(grammarAccess.getReferencedGreetingAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__PackageAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0()); }
	rulePackageDeclaration{ after(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); }
	ruleQualifiedName{ after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__ImportsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0()); }
	ruleImport{ after(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PackageDeclaration__GreetingsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageDeclarationAccess().getGreetingsReferencedGreetingParserRuleCall_3_0()); }
	ruleReferencedGreeting{ after(grammarAccess.getPackageDeclarationAccess().getGreetingsReferencedGreetingParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
	ruleQualifiedNameWithWildcard{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedGreeting__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferencedGreetingAccess().getNameGreetingCrossReference_1_0()); }
(
{ before(grammarAccess.getReferencedGreetingAccess().getNameGreetingQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getReferencedGreetingAccess().getNameGreetingQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getReferencedGreetingAccess().getNameGreetingCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


