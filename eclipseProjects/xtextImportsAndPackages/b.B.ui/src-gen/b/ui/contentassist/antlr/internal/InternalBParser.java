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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'g: '"
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


        public InternalBParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBParser.tokenNames; }
    public String getGrammarFileName() { return "../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:61:1: ( ruleModel EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:76:1: ( rule__Model__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:89:1: ( ruleImport EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:104:1: ( rule__Import__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:117:1: ( ruleQualifiedName EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName181);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName214);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleReferencedGreetings"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:144:1: entryRuleReferencedGreetings : ruleReferencedGreetings EOF ;
    public final void entryRuleReferencedGreetings() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:145:1: ( ruleReferencedGreetings EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:146:1: ruleReferencedGreetings EOF
            {
             before(grammarAccess.getReferencedGreetingsRule()); 
            pushFollow(FOLLOW_ruleReferencedGreetings_in_entryRuleReferencedGreetings241);
            ruleReferencedGreetings();

            state._fsp--;

             after(grammarAccess.getReferencedGreetingsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedGreetings248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferencedGreetings"


    // $ANTLR start "ruleReferencedGreetings"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:153:1: ruleReferencedGreetings : ( ( rule__ReferencedGreetings__Group__0 ) ) ;
    public final void ruleReferencedGreetings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:157:2: ( ( ( rule__ReferencedGreetings__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:158:1: ( ( rule__ReferencedGreetings__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:158:1: ( ( rule__ReferencedGreetings__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:159:1: ( rule__ReferencedGreetings__Group__0 )
            {
             before(grammarAccess.getReferencedGreetingsAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:160:1: ( rule__ReferencedGreetings__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:160:2: rule__ReferencedGreetings__Group__0
            {
            pushFollow(FOLLOW_rule__ReferencedGreetings__Group__0_in_ruleReferencedGreetings274);
            rule__ReferencedGreetings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencedGreetingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferencedGreetings"


    // $ANTLR start "rule__Model__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:174:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:178:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:179:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0308);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0311);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:186:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:190:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:191:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:191:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:192:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:193:1: ( rule__Model__ImportsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:193:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl338);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:203:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:207:1: ( rule__Model__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:208:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1369);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:214:1: rule__Model__Group__1__Impl : ( ( rule__Model__GreetingsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:218:1: ( ( ( rule__Model__GreetingsAssignment_1 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:219:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:219:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:220:1: ( rule__Model__GreetingsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:221:1: ( rule__Model__GreetingsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:221:2: rule__Model__GreetingsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_1_in_rule__Model__Group__1__Impl396);
            	    rule__Model__GreetingsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:235:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:239:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:240:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0431);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0434);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:247:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:251:1: ( ( 'import' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:252:1: ( 'import' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:252:1: ( 'import' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:253:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Import__Group__0__Impl462); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:266:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:270:1: ( rule__Import__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:271:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1493);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:277:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:281:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:282:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:282:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:283:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:284:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:284:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl520);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:298:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:302:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:303:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0554);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0557);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:310:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:314:1: ( ( RULE_ID ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:315:1: ( RULE_ID )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:315:1: ( RULE_ID )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:316:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl584); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:327:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:331:1: ( rule__QualifiedName__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:332:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1613);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:338:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:342:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:343:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:343:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:344:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:345:1: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:345:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl640);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:359:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:363:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:364:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0675);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0678);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:371:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:375:1: ( ( '.' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:376:1: ( '.' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:376:1: ( '.' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:377:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl706); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:390:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:394:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:395:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1737);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:401:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:405:1: ( ( RULE_ID ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:406:1: ( RULE_ID )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:406:1: ( RULE_ID )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:407:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl764); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ReferencedGreetings__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:422:1: rule__ReferencedGreetings__Group__0 : rule__ReferencedGreetings__Group__0__Impl rule__ReferencedGreetings__Group__1 ;
    public final void rule__ReferencedGreetings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:426:1: ( rule__ReferencedGreetings__Group__0__Impl rule__ReferencedGreetings__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:427:2: rule__ReferencedGreetings__Group__0__Impl rule__ReferencedGreetings__Group__1
            {
            pushFollow(FOLLOW_rule__ReferencedGreetings__Group__0__Impl_in_rule__ReferencedGreetings__Group__0797);
            rule__ReferencedGreetings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReferencedGreetings__Group__1_in_rule__ReferencedGreetings__Group__0800);
            rule__ReferencedGreetings__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedGreetings__Group__0"


    // $ANTLR start "rule__ReferencedGreetings__Group__0__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:434:1: rule__ReferencedGreetings__Group__0__Impl : ( 'g: ' ) ;
    public final void rule__ReferencedGreetings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:438:1: ( ( 'g: ' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:439:1: ( 'g: ' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:439:1: ( 'g: ' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:440:1: 'g: '
            {
             before(grammarAccess.getReferencedGreetingsAccess().getGKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ReferencedGreetings__Group__0__Impl828); 
             after(grammarAccess.getReferencedGreetingsAccess().getGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedGreetings__Group__0__Impl"


    // $ANTLR start "rule__ReferencedGreetings__Group__1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:453:1: rule__ReferencedGreetings__Group__1 : rule__ReferencedGreetings__Group__1__Impl ;
    public final void rule__ReferencedGreetings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:457:1: ( rule__ReferencedGreetings__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:458:2: rule__ReferencedGreetings__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferencedGreetings__Group__1__Impl_in_rule__ReferencedGreetings__Group__1859);
            rule__ReferencedGreetings__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedGreetings__Group__1"


    // $ANTLR start "rule__ReferencedGreetings__Group__1__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:464:1: rule__ReferencedGreetings__Group__1__Impl : ( ( rule__ReferencedGreetings__GreetAssignment_1 ) ) ;
    public final void rule__ReferencedGreetings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:468:1: ( ( ( rule__ReferencedGreetings__GreetAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:469:1: ( ( rule__ReferencedGreetings__GreetAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:469:1: ( ( rule__ReferencedGreetings__GreetAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:470:1: ( rule__ReferencedGreetings__GreetAssignment_1 )
            {
             before(grammarAccess.getReferencedGreetingsAccess().getGreetAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:471:1: ( rule__ReferencedGreetings__GreetAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:471:2: rule__ReferencedGreetings__GreetAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferencedGreetings__GreetAssignment_1_in_rule__ReferencedGreetings__Group__1__Impl886);
            rule__ReferencedGreetings__GreetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencedGreetingsAccess().getGreetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedGreetings__Group__1__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:486:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:490:1: ( ( ruleImport ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:491:1: ( ruleImport )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:491:1: ( ruleImport )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:492:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_0925);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__GreetingsAssignment_1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:501:1: rule__Model__GreetingsAssignment_1 : ( ruleReferencedGreetings ) ;
    public final void rule__Model__GreetingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:505:1: ( ( ruleReferencedGreetings ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:506:1: ( ruleReferencedGreetings )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:506:1: ( ruleReferencedGreetings )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:507:1: ruleReferencedGreetings
            {
             before(grammarAccess.getModelAccess().getGreetingsReferencedGreetingsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReferencedGreetings_in_rule__Model__GreetingsAssignment_1956);
            ruleReferencedGreetings();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsReferencedGreetingsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:516:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:520:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:521:1: ( ruleQualifiedName )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:521:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:522:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_1987);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ReferencedGreetings__GreetAssignment_1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:531:1: rule__ReferencedGreetings__GreetAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferencedGreetings__GreetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:535:1: ( ( ( ruleQualifiedName ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:536:1: ( ( ruleQualifiedName ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:536:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:537:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferencedGreetingsAccess().getGreetGreetingCrossReference_1_0()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:538:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:539:1: ruleQualifiedName
            {
             before(grammarAccess.getReferencedGreetingsAccess().getGreetGreetingQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ReferencedGreetings__GreetAssignment_11022);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferencedGreetingsAccess().getGreetGreetingQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferencedGreetingsAccess().getGreetGreetingCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedGreetings__GreetAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedGreetings_in_entryRuleReferencedGreetings241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedGreetings248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__0_in_ruleReferencedGreetings274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl338 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_1_in_rule__Model__Group__1__Impl396 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0__Impl462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0554 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl640 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__0__Impl_in_rule__ReferencedGreetings__Group__0797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__1_in_rule__ReferencedGreetings__Group__0800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ReferencedGreetings__Group__0__Impl828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__1__Impl_in_rule__ReferencedGreetings__Group__1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__GreetAssignment_1_in_rule__ReferencedGreetings__Group__1__Impl886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_0925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedGreetings_in_rule__Model__GreetingsAssignment_1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ReferencedGreetings__GreetAssignment_11022 = new BitSet(new long[]{0x0000000000000002L});

}