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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_greetings_1_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_greetings_1_0 = null;


         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:79:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_greetings_1_0= ruleGreeting ) )* ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:1: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_greetings_1_0= ruleGreeting ) )* )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:1: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_greetings_1_0= ruleGreeting ) )* )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:2: ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_greetings_1_0= ruleGreeting ) )*
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:80:2: ( (lv_package_0_0= rulePackageDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
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

            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:98:3: ( (lv_greetings_1_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    {
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:100:3: lv_greetings_1_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel153);
            	    lv_greetings_1_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_1_0, 
            	            		"Greeting");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:124:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:125:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:126:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration190);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration200); 

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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:133:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:136:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:137:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:137:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:137:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackageDeclaration237); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:141:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:142:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:142:1: (lv_name_1_0= ruleQualifiedName )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:143:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration258);
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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:167:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:168:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:169:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName295);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName306); 

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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:176:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:179:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:180:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName346); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:187:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:188:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName365); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName380); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGreeting"
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:208:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:209:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:210:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting427);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting437); 

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
    // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:217:1: ruleGreeting returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:220:28: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:221:1: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:221:1: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:221:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGreeting474); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHyphenMinusKeyword_0());
                
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:225:1: ( (lv_name_1_0= RULE_ID ) )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:226:1: (lv_name_1_0= RULE_ID )
            {
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:226:1: (lv_name_1_0= RULE_ID )
            // ../a.A/src-gen/a/parser/antlr/internal/InternalA.g:227:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting491); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
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
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel153 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackageDeclaration237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName346 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName380 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreeting474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting491 = new BitSet(new long[]{0x0000000000000002L});

}