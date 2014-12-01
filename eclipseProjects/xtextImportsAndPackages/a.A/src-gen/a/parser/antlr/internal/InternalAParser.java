package a.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import a.services.AGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'.'", "'\\u2605'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
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


        public InternalAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAParser.tokenNames; }
    public String getGrammarFileName() { return "../a.A/src-gen/a/parser/antlr/internal/InternalA.g"; }



     	private AGrammarAccess grammarAccess;
     	
        public InternalAParser(TokenStream input, AGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_greetings_2_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_greetings_2_0 = null;


         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:79:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_greetings_2_0= ruleGreeting ) )* ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:1: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_greetings_2_0= ruleGreeting ) )* )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:1: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_greetings_2_0= ruleGreeting ) )* )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:2: ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_greetings_2_0= ruleGreeting ) )*
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:2: ( (lv_package_0_0= rulePackageDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:81:1: (lv_package_0_0= rulePackageDeclaration )
                    {
                    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:81:1: (lv_package_0_0= rulePackageDeclaration )
                    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:82:3: lv_package_0_0= rulePackageDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleModel131);
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
                    break;

            }

            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:98:3: ( (lv_imports_1_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:99:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:99:1: (lv_imports_1_0= ruleImport )
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:100:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel153);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:116:3: ( (lv_greetings_2_0= ruleGreeting ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:117:1: (lv_greetings_2_0= ruleGreeting )
            	    {
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:117:1: (lv_greetings_2_0= ruleGreeting )
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:118:3: lv_greetings_2_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel175);
            	    lv_greetings_2_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_2_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:142:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:143:2: (iv_ruleImport= ruleImport EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:144:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport212);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport222); 

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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:154:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:155:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:155:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:155:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport259); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:159:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:160:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:160:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:161:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport280);
            lv_importedNamespace_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedName");
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:185:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:186:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:187:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration316);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration326); 

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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:194:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:197:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:198:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:198:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:198:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration363); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:202:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:203:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:203:1: (lv_name_1_0= ruleQualifiedName )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:204:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration384);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:228:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:229:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:230:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName421);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName432); 

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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:237:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:240:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:241:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:241:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:241:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName472); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:248:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:249:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName491); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName506); 

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


    // $ANTLR start "entryRuleGreeting"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:269:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:270:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:271:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting553);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting563); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:278:1: ruleGreeting returns [EObject current=null] : (otherlv_0= '\\u2605' ( (lv_string_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_1_0=null;

         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:281:28: ( (otherlv_0= '\\u2605' ( (lv_string_1_0= RULE_ID ) ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:282:1: (otherlv_0= '\\u2605' ( (lv_string_1_0= RULE_ID ) ) )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:282:1: (otherlv_0= '\\u2605' ( (lv_string_1_0= RULE_ID ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:282:3: otherlv_0= '\\u2605' ( (lv_string_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleGreeting600); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getBlackStarKeyword_0());
                
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:286:1: ( (lv_string_1_0= RULE_ID ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:287:1: (lv_string_1_0= RULE_ID )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:287:1: (lv_string_1_0= RULE_ID )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:288:3: lv_string_1_0= RULE_ID
            {
            lv_string_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting617); 

            			newLeafNode(lv_string_1_0, grammarAccess.getGreetingAccess().getStringIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"string",
                    		lv_string_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel153 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel175 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName472 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName506 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGreeting600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting617 = new BitSet(new long[]{0x0000000000000002L});

}