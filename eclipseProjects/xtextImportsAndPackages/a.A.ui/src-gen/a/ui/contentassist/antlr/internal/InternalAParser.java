package a.ui.contentassist.antlr.internal; 

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
import a.services.AGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g"; }


     
     	private AGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AGrammarAccess grammarAccess) {
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:61:1: ( ruleModel EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:62:1: ruleModel EOF
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:76:1: ( rule__Model__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:76:2: rule__Model__Group__0
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:88:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:89:1: ( rulePackageDeclaration EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:90:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration121);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration128); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:97:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:101:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:103:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:104:1: ( rule__PackageDeclaration__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:104:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration154);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:117:1: ( ruleQualifiedName EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:118:1: ruleQualifiedName EOF
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:132:2: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleGreeting"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:144:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:145:1: ( ruleGreeting EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:146:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting241);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting248); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:153:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:157:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:158:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:158:1: ( ( rule__Greeting__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:159:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:160:1: ( rule__Greeting__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:160:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting274);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "rule__Model__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:174:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:178:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:179:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:186:1: rule__Model__Group__0__Impl : ( ( rule__Model__PackageAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:190:1: ( ( ( rule__Model__PackageAssignment_0 )? ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:191:1: ( ( rule__Model__PackageAssignment_0 )? )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:191:1: ( ( rule__Model__PackageAssignment_0 )? )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:192:1: ( rule__Model__PackageAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_0()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:193:1: ( rule__Model__PackageAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:193:2: rule__Model__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__PackageAssignment_0_in_rule__Model__Group__0__Impl338);
                    rule__Model__PackageAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getPackageAssignment_0()); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:203:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:207:1: ( rule__Model__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:208:2: rule__Model__Group__1__Impl
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:214:1: rule__Model__Group__1__Impl : ( ( rule__Model__GreetingsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:218:1: ( ( ( rule__Model__GreetingsAssignment_1 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:219:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:219:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:220:1: ( rule__Model__GreetingsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:221:1: ( rule__Model__GreetingsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:221:2: rule__Model__GreetingsAssignment_1
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:235:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:239:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:240:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0431);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0434);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:247:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:251:1: ( ( 'package' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:252:1: ( 'package' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:252:1: ( 'package' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:253:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl462); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:266:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:270:1: ( rule__PackageDeclaration__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:271:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1493);
            rule__PackageDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:277:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:281:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:282:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:282:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:283:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:284:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:284:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl520);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:298:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:302:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:303:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:310:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:314:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:315:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:315:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:316:1: RULE_ID
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:327:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:331:1: ( rule__QualifiedName__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:332:2: rule__QualifiedName__Group__1__Impl
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:338:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:342:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:343:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:343:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:344:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:345:1: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:345:2: rule__QualifiedName__Group_1__0
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:359:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:363:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:364:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:371:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:375:1: ( ( '.' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:376:1: ( '.' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:376:1: ( '.' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:377:1: '.'
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:390:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:394:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:395:2: rule__QualifiedName__Group_1__1__Impl
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:401:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:405:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:406:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:406:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:407:1: RULE_ID
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


    // $ANTLR start "rule__Greeting__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:422:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:426:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:427:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0797);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0800);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:434:1: rule__Greeting__Group__0__Impl : ( '-' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:438:1: ( ( '-' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:439:1: ( '-' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:439:1: ( '-' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:440:1: '-'
            {
             before(grammarAccess.getGreetingAccess().getHyphenMinusKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Greeting__Group__0__Impl828); 
             after(grammarAccess.getGreetingAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:453:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:457:1: ( rule__Greeting__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:458:2: rule__Greeting__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1859);
            rule__Greeting__Group__1__Impl();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:464:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:468:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:469:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:469:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:470:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:471:1: ( rule__Greeting__NameAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:471:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl886);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Model__PackageAssignment_0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:486:1: rule__Model__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:490:1: ( ( rulePackageDeclaration ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:491:1: ( rulePackageDeclaration )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:491:1: ( rulePackageDeclaration )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:492:1: rulePackageDeclaration
            {
             before(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment_0925);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__PackageAssignment_0"


    // $ANTLR start "rule__Model__GreetingsAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:501:1: rule__Model__GreetingsAssignment_1 : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:505:1: ( ( ruleGreeting ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:506:1: ( ruleGreeting )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:506:1: ( ruleGreeting )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:507:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_1956);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:516:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:520:1: ( ( ruleQualifiedName ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:521:1: ( ruleQualifiedName )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:521:1: ( ruleQualifiedName )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:522:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_1987);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:531:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:535:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:536:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:536:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:537:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11018); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageAssignment_0_in_rule__Model__Group__0__Impl338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_1_in_rule__Model__Group__1__Impl396 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl520 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Greeting__Group__0__Impl828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment_0925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11018 = new BitSet(new long[]{0x0000000000000002L});

}