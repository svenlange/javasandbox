/*
* generated by Xtext
*/
package b.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class BGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cGreetingsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGreetingsReferencedGreetingsParserRuleCall_1_0 = (RuleCall)cGreetingsAssignment_1.eContents().get(0);
		
		//Model:
		//	imports+=Import* greetings+=ReferencedGreetings*;
		public ParserRule getRule() { return rule; }

		//imports+=Import* greetings+=ReferencedGreetings*
		public Group getGroup() { return cGroup; }

		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//greetings+=ReferencedGreetings*
		public Assignment getGreetingsAssignment_1() { return cGreetingsAssignment_1; }

		//ReferencedGreetings
		public RuleCall getGreetingsReferencedGreetingsParserRuleCall_1_0() { return cGreetingsReferencedGreetingsParserRuleCall_1_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=QualifiedName;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedName
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedName
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameParserRuleCall_1_0; }
	}

	public class ReferencedGreetingsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReferencedGreetings");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNameGreetingCrossReference_1_0 = (CrossReference)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameGreetingIDTerminalRuleCall_1_0_1 = (RuleCall)cNameGreetingCrossReference_1_0.eContents().get(1);
		
		//ReferencedGreetings:
		//	"g: " name=[a::Greeting];
		public ParserRule getRule() { return rule; }

		//"g: " name=[a::Greeting]
		public Group getGroup() { return cGroup; }

		//"g: "
		public Keyword getGKeyword_0() { return cGKeyword_0; }

		//name=[a::Greeting]
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//[a::Greeting]
		public CrossReference getNameGreetingCrossReference_1_0() { return cNameGreetingCrossReference_1_0; }

		//ID
		public RuleCall getNameGreetingIDTerminalRuleCall_1_0_1() { return cNameGreetingIDTerminalRuleCall_1_0_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final ModelElements pModel;
	private final ImportElements pImport;
	private final ReferencedGreetingsElements pReferencedGreetings;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pImport = new ImportElements();
		this.pReferencedGreetings = new ReferencedGreetingsElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("b.B".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	imports+=Import* greetings+=ReferencedGreetings*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=QualifiedName;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//ReferencedGreetings:
	//	"g: " name=[a::Greeting];
	public ReferencedGreetingsElements getReferencedGreetingsAccess() {
		return pReferencedGreetings;
	}
	
	public ParserRule getReferencedGreetingsRule() {
		return getReferencedGreetingsAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
