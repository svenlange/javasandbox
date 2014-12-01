package b.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import b.services.BGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.*'", "'g: '", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalBParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBParser.tokenNames; }
    public String getGrammarFileName() { return "../b.B/src-gen/b/parser/antlr/internal/InternalB.g"; }



     	private BGrammarAccess grammarAccess;
     	
        public InternalBParser(TokenStream input, BGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected BGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:76:1: ruleModel returns [EObject current=null] : ( (lv_package_0_0= rulePackageDeclaration ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;


         enterRule(); 
            
        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:79:28: ( ( (lv_package_0_0= rulePackageDeclaration ) ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:80:1: ( (lv_package_0_0= rulePackageDeclaration ) )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:80:1: ( (lv_package_0_0= rulePackageDeclaration ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:81:1: (lv_package_0_0= rulePackageDeclaration )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:81:1: (lv_package_0_0= rulePackageDeclaration )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:82:3: lv_package_0_0= rulePackageDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePackageDeclaration_in_ruleModel130);
            lv_package_0_0=rulePackageDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"package",
                    		lv_package_0_0, 
                    		"PackageDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:106:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:107:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:108:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration165);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:115:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_greetings_3_0= ruleReferencedGreeting ) )* ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_greetings_3_0 = null;


         enterRule(); 
            
        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_greetings_3_0= ruleReferencedGreeting ) )* ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_greetings_3_0= ruleReferencedGreeting ) )* )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_greetings_3_0= ruleReferencedGreeting ) )* )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_greetings_3_0= ruleReferencedGreeting ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackageDeclaration212); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:123:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:124:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:124:1: (lv_name_1_0= ruleQualifiedName )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:125:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration233);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:141:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:142:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:142:1: (lv_imports_2_0= ruleImport )
            	    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:143:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePackageDeclaration254);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:159:3: ( (lv_greetings_3_0= ruleReferencedGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:160:1: (lv_greetings_3_0= ruleReferencedGreeting )
            	    {
            	    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:160:1: (lv_greetings_3_0= ruleReferencedGreeting )
            	    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:161:3: lv_greetings_3_0= ruleReferencedGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getGreetingsReferencedGreetingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReferencedGreeting_in_rulePackageDeclaration276);
            	    lv_greetings_3_0=ruleReferencedGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_3_0, 
            	            		"ReferencedGreeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImport"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:185:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:186:2: (iv_ruleImport= ruleImport EOF )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:187:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport313);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport323); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:194:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:197:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:198:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:198:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:198:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport360); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:202:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:203:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:203:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:204:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport381);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:228:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:229:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:230:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard418);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:237:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:240:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:241:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:241:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:242:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard476);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:252:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:253:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildcard495); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleReferencedGreeting"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:266:1: entryRuleReferencedGreeting returns [EObject current=null] : iv_ruleReferencedGreeting= ruleReferencedGreeting EOF ;
    public final EObject entryRuleReferencedGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencedGreeting = null;


        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:267:2: (iv_ruleReferencedGreeting= ruleReferencedGreeting EOF )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:268:2: iv_ruleReferencedGreeting= ruleReferencedGreeting EOF
            {
             newCompositeNode(grammarAccess.getReferencedGreetingRule()); 
            pushFollow(FOLLOW_ruleReferencedGreeting_in_entryRuleReferencedGreeting537);
            iv_ruleReferencedGreeting=ruleReferencedGreeting();

            state._fsp--;

             current =iv_ruleReferencedGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedGreeting547); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferencedGreeting"


    // $ANTLR start "ruleReferencedGreeting"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:275:1: ruleReferencedGreeting returns [EObject current=null] : (otherlv_0= 'g: ' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleReferencedGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:278:28: ( (otherlv_0= 'g: ' ( ( ruleQualifiedName ) ) ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:279:1: (otherlv_0= 'g: ' ( ( ruleQualifiedName ) ) )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:279:1: (otherlv_0= 'g: ' ( ( ruleQualifiedName ) ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:279:3: otherlv_0= 'g: ' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleReferencedGreeting584); 

                	newLeafNode(otherlv_0, grammarAccess.getReferencedGreetingAccess().getGKeyword_0());
                
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:283:1: ( ( ruleQualifiedName ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:284:1: ( ruleQualifiedName )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:284:1: ( ruleQualifiedName )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:285:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencedGreetingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferencedGreetingAccess().getNameGreetingCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferencedGreeting607);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferencedGreeting"


    // $ANTLR start "entryRuleQualifiedName"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:306:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:307:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:308:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName644);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:315:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:318:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:319:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:319:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:319:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName695); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:326:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../b.B/src-gen/b/parser/antlr/internal/InternalB.g:327:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName714); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName729); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackageDeclaration212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration233 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackageDeclaration254 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleReferencedGreeting_in_rulePackageDeclaration276 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard476 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildcard495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedGreeting_in_entryRuleReferencedGreeting537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedGreeting547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleReferencedGreeting584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferencedGreeting607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName695 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName729 = new BitSet(new long[]{0x0000000000008002L});

}