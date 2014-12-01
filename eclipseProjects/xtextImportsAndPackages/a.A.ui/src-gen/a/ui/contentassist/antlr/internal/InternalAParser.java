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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.*'", "'.'", "'-'"
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:69:1: ruleModel : ( ( rule__Model__PackageAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:73:2: ( ( ( rule__Model__PackageAssignment ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:74:1: ( ( rule__Model__PackageAssignment ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:74:1: ( ( rule__Model__PackageAssignment ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:75:1: ( rule__Model__PackageAssignment )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:76:1: ( rule__Model__PackageAssignment )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:76:2: rule__Model__PackageAssignment
            {
            pushFollow(FOLLOW_rule__Model__PackageAssignment_in_ruleModel94);
            rule__Model__PackageAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageAssignment()); 

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


    // $ANTLR start "entryRuleImport"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:117:1: ( ruleImport EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:132:1: ( rule__Import__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:144:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:145:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:146:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard241);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard248); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:153:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:157:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:159:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:160:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:160:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard274);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:172:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:173:1: ( ruleQualifiedName EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:174:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName308); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:181:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:185:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:187:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:188:1: ( rule__QualifiedName__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:188:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:200:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:201:1: ( ruleGreeting EOF )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:202:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting361);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting368); 

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:209:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:213:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:214:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:214:1: ( ( rule__Greeting__Group__0 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:215:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:216:1: ( rule__Greeting__Group__0 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:216:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting394);
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:230:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:234:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:235:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0428);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0431);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:242:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:246:1: ( ( 'package' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:247:1: ( 'package' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:247:1: ( 'package' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:248:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl459); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:261:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:265:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:266:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1490);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__1493);
            rule__PackageDeclaration__Group__2();

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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:273:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:277:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:278:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:278:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:279:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:280:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:280:2: rule__PackageDeclaration__NameAssignment_1
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


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:290:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:294:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:295:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__2550);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__2553);
            rule__PackageDeclaration__Group__3();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:302:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__ImportsAssignment_2 )* ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:306:1: ( ( ( rule__PackageDeclaration__ImportsAssignment_2 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:307:1: ( ( rule__PackageDeclaration__ImportsAssignment_2 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:307:1: ( ( rule__PackageDeclaration__ImportsAssignment_2 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:308:1: ( rule__PackageDeclaration__ImportsAssignment_2 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_2()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:309:1: ( rule__PackageDeclaration__ImportsAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:309:2: rule__PackageDeclaration__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ImportsAssignment_2_in_rule__PackageDeclaration__Group__2__Impl580);
            	    rule__PackageDeclaration__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:319:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:323:1: ( rule__PackageDeclaration__Group__3__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:324:2: rule__PackageDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__3611);
            rule__PackageDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:330:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:334:1: ( ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:335:1: ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:335:1: ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:336:1: ( rule__PackageDeclaration__GreetingsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getGreetingsAssignment_3()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:337:1: ( rule__PackageDeclaration__GreetingsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:337:2: rule__PackageDeclaration__GreetingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__GreetingsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl638);
            	    rule__PackageDeclaration__GreetingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getGreetingsAssignment_3()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:355:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:359:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:360:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0677);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0680);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:367:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:371:1: ( ( 'import' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:372:1: ( 'import' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:372:1: ( 'import' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:373:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Import__Group__0__Impl708); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:386:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:390:1: ( rule__Import__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:391:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1739);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:397:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:401:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:402:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:402:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:403:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:404:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:404:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl766);
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


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:418:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:422:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:423:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__0800);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__0803);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:430:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:434:1: ( ( ruleQualifiedName ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:435:1: ( ruleQualifiedName )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:435:1: ( ruleQualifiedName )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:436:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl830);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:447:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:451:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:452:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__1859);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:458:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:462:1: ( ( ( '.*' )? ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:463:1: ( ( '.*' )? )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:463:1: ( ( '.*' )? )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:464:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:465:1: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:466:2: '.*'
                    {
                    match(input,13,FOLLOW_13_in_rule__QualifiedNameWithWildcard__Group__1__Impl888); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:481:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:485:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:486:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0925);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0928);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:493:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:497:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:498:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:498:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:499:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl955); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:510:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:514:1: ( rule__QualifiedName__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:515:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1984);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:521:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:525:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:526:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:526:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:527:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:528:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:528:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1011);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:542:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:546:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:547:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01046);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01049);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:554:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:558:1: ( ( '.' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:559:1: ( '.' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:559:1: ( '.' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:560:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1077); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:573:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:577:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:578:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11108);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:584:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:588:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:589:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:589:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:590:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1135); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:605:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:609:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:610:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__01168);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__01171);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:617:1: rule__Greeting__Group__0__Impl : ( '-' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:621:1: ( ( '-' ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:622:1: ( '-' )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:622:1: ( '-' )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:623:1: '-'
            {
             before(grammarAccess.getGreetingAccess().getHyphenMinusKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Greeting__Group__0__Impl1199); 
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:636:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:640:1: ( rule__Greeting__Group__1__Impl )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:641:2: rule__Greeting__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__11230);
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
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:647:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:651:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:652:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:652:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:653:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:654:1: ( rule__Greeting__NameAssignment_1 )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:654:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl1257);
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


    // $ANTLR start "rule__Model__PackageAssignment"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:669:1: rule__Model__PackageAssignment : ( rulePackageDeclaration ) ;
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:673:1: ( ( rulePackageDeclaration ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:674:1: ( rulePackageDeclaration )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:674:1: ( rulePackageDeclaration )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:675:1: rulePackageDeclaration
            {
             before(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment1296);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__PackageAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:684:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:688:1: ( ( ruleQualifiedName ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:689:1: ( ruleQualifiedName )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:689:1: ( ruleQualifiedName )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:690:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_11327);
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


    // $ANTLR start "rule__PackageDeclaration__ImportsAssignment_2"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:699:1: rule__PackageDeclaration__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__PackageDeclaration__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:703:1: ( ( ruleImport ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:704:1: ( ruleImport )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:704:1: ( ruleImport )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:705:1: ruleImport
            {
             before(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__PackageDeclaration__ImportsAssignment_21358);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__ImportsAssignment_2"


    // $ANTLR start "rule__PackageDeclaration__GreetingsAssignment_3"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:714:1: rule__PackageDeclaration__GreetingsAssignment_3 : ( ruleGreeting ) ;
    public final void rule__PackageDeclaration__GreetingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:718:1: ( ( ruleGreeting ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:719:1: ( ruleGreeting )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:719:1: ( ruleGreeting )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:720:1: ruleGreeting
            {
             before(grammarAccess.getPackageDeclarationAccess().getGreetingsGreetingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__PackageDeclaration__GreetingsAssignment_31389);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getGreetingsGreetingParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__GreetingsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:729:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:733:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:734:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:734:1: ( ruleQualifiedNameWithWildcard )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:735:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11420);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:744:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:748:1: ( ( RULE_ID ) )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:749:1: ( RULE_ID )
            {
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:749:1: ( RULE_ID )
            // ../a.A.ui/src-gen/a/ui/contentassist/antlr/internal/InternalA.g:750:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11451); 
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
    public static final BitSet FOLLOW_rule__Model__PackageAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1490 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__2550 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ImportsAssignment_2_in_rule__PackageDeclaration__Group__2__Impl580 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__GreetingsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl638 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__0800 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__0803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedNameWithWildcard__Group__1__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0925 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1011 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__01168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Greeting__Group__0__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__PackageDeclaration__ImportsAssignment_21358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__PackageDeclaration__GreetingsAssignment_31389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11451 = new BitSet(new long[]{0x0000000000000002L});

}