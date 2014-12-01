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


    // $ANTLR start "entryRuleImport"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:89:1: ( ruleImport EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:90:1: ruleImport EOF
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:104:1: ( rule__Import__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:104:2: rule__Import__Group__0
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:116:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:117:1: ( rulePackageDeclaration EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:118:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration181);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration188); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:125:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:129:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:131:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:132:1: ( rule__PackageDeclaration__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:132:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration214);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:145:1: ( ruleQualifiedName EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:146:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName248); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:172:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:173:1: ( ruleGreeting EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:174:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting301);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting308); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:181:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:185:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:186:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:186:1: ( ( rule__Greeting__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:187:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:188:1: ( rule__Greeting__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:188:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting334);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:202:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:206:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:207:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0368);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0371);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:214:1: rule__Model__Group__0__Impl : ( ( rule__Model__PackageAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:218:1: ( ( ( rule__Model__PackageAssignment_0 )? ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:219:1: ( ( rule__Model__PackageAssignment_0 )? )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:219:1: ( ( rule__Model__PackageAssignment_0 )? )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:220:1: ( rule__Model__PackageAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_0()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:221:1: ( rule__Model__PackageAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:221:2: rule__Model__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__PackageAssignment_0_in_rule__Model__Group__0__Impl398);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:231:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:235:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:236:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1429);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1432);
            rule__Model__Group__2();

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:243:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:247:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:248:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:248:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:249:1: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:250:1: ( rule__Model__ImportsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:250:2: rule__Model__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl459);
            	    rule__Model__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_1()); 

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


    // $ANTLR start "rule__Model__Group__2"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:260:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:264:1: ( rule__Model__Group__2__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:265:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2490);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:271:1: rule__Model__Group__2__Impl : ( ( rule__Model__GreetingsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:275:1: ( ( ( rule__Model__GreetingsAssignment_2 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:276:1: ( ( rule__Model__GreetingsAssignment_2 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:276:1: ( ( rule__Model__GreetingsAssignment_2 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:277:1: ( rule__Model__GreetingsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment_2()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:278:1: ( rule__Model__GreetingsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:278:2: rule__Model__GreetingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_2_in_rule__Model__Group__2__Impl517);
            	    rule__Model__GreetingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:294:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:298:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:299:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0554);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0557);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:306:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:310:1: ( ( 'import' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:311:1: ( 'import' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:311:1: ( 'import' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:312:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Import__Group__0__Impl585); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:325:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:329:1: ( rule__Import__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:330:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1616);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:336:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:340:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:341:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:341:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:342:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:343:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:343:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl643);
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:357:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:361:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:362:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0677);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0680);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:369:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:373:1: ( ( 'package' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:374:1: ( 'package' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:374:1: ( 'package' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:375:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__PackageDeclaration__Group__0__Impl708); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:388:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:392:1: ( rule__PackageDeclaration__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:393:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1739);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:399:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:403:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:404:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:404:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:405:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:406:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:406:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl766);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:420:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:424:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:425:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0800);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0803);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:432:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:436:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:437:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:437:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:438:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl830); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:449:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:453:1: ( rule__QualifiedName__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:454:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1859);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:460:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:464:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:465:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:465:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:466:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:467:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:467:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl886);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:481:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:485:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:486:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0921);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0924);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:493:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:497:1: ( ( '.' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:498:1: ( '.' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:498:1: ( '.' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:499:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl952); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:512:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:516:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:517:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1983);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:523:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:527:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:528:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:528:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:529:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1010); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:544:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:548:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:549:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__01043);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__01046);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:556:1: rule__Greeting__Group__0__Impl : ( '\\u2605' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:560:1: ( ( '\\u2605' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:561:1: ( '\\u2605' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:561:1: ( '\\u2605' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:562:1: '\\u2605'
            {
             before(grammarAccess.getGreetingAccess().getBlackStarKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Greeting__Group__0__Impl1074); 
             after(grammarAccess.getGreetingAccess().getBlackStarKeyword_0()); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:575:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:579:1: ( rule__Greeting__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:580:2: rule__Greeting__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__11105);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:586:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__StringAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:590:1: ( ( ( rule__Greeting__StringAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:591:1: ( ( rule__Greeting__StringAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:591:1: ( ( rule__Greeting__StringAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:592:1: ( rule__Greeting__StringAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getStringAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:593:1: ( rule__Greeting__StringAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:593:2: rule__Greeting__StringAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__StringAssignment_1_in_rule__Greeting__Group__1__Impl1132);
            rule__Greeting__StringAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getStringAssignment_1()); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:608:1: rule__Model__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:612:1: ( ( rulePackageDeclaration ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:613:1: ( rulePackageDeclaration )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:613:1: ( rulePackageDeclaration )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:614:1: rulePackageDeclaration
            {
             before(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment_01171);
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


    // $ANTLR start "rule__Model__ImportsAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:623:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:627:1: ( ( ruleImport ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:628:1: ( ruleImport )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:628:1: ( ruleImport )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:629:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_11202);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ImportsAssignment_1"


    // $ANTLR start "rule__Model__GreetingsAssignment_2"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:638:1: rule__Model__GreetingsAssignment_2 : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:642:1: ( ( ruleGreeting ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:643:1: ( ruleGreeting )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:643:1: ( ruleGreeting )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:644:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_21233);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:653:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:657:1: ( ( ruleQualifiedName ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:658:1: ( ruleQualifiedName )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:658:1: ( ruleQualifiedName )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:659:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_11264);
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


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:668:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:672:1: ( ( ruleQualifiedName ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:673:1: ( ruleQualifiedName )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:673:1: ( ruleQualifiedName )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:674:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_11295);
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


    // $ANTLR start "rule__Greeting__StringAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:683:1: rule__Greeting__StringAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:687:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:688:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:688:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:689:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getStringIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__StringAssignment_11326); 
             after(grammarAccess.getGreetingAccess().getStringIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__StringAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0368 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageAssignment_0_in_rule__Model__Group__0__Impl398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1429 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl459 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_2_in_rule__Model__Group__2__Impl517 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0__Impl585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PackageDeclaration__Group__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0800 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl886 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__01043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__01046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greeting__Group__0__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__StringAssignment_1_in_rule__Greeting__Group__1__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment_01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_11202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_21233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_11264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__StringAssignment_11326 = new BitSet(new long[]{0x0000000000000002L});

}