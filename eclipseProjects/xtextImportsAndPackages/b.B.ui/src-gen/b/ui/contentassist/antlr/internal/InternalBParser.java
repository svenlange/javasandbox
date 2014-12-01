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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:69:1: ruleModel : ( ( rule__Model__PackageAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:73:2: ( ( ( rule__Model__PackageAssignment ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:74:1: ( ( rule__Model__PackageAssignment ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:74:1: ( ( rule__Model__PackageAssignment ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:75:1: ( rule__Model__PackageAssignment )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:76:1: ( rule__Model__PackageAssignment )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:76:2: rule__Model__PackageAssignment
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:88:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:89:1: ( rulePackageDeclaration EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:90:1: rulePackageDeclaration EOF
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:97:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:101:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:103:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:104:1: ( rule__PackageDeclaration__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:104:2: rule__PackageDeclaration__Group__0
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:117:1: ( ruleImport EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:118:1: ruleImport EOF
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:132:1: ( rule__Import__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:132:2: rule__Import__Group__0
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:144:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:145:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:146:1: ruleQualifiedNameWithWildcard EOF
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:153:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:157:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:159:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:160:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:160:2: rule__QualifiedNameWithWildcard__Group__0
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


    // $ANTLR start "entryRuleReferencedGreeting"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:172:1: entryRuleReferencedGreeting : ruleReferencedGreeting EOF ;
    public final void entryRuleReferencedGreeting() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:173:1: ( ruleReferencedGreeting EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:174:1: ruleReferencedGreeting EOF
            {
             before(grammarAccess.getReferencedGreetingRule()); 
            pushFollow(FOLLOW_ruleReferencedGreeting_in_entryRuleReferencedGreeting301);
            ruleReferencedGreeting();

            state._fsp--;

             after(grammarAccess.getReferencedGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencedGreeting308); 

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
    // $ANTLR end "entryRuleReferencedGreeting"


    // $ANTLR start "ruleReferencedGreeting"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:181:1: ruleReferencedGreeting : ( ( rule__ReferencedGreeting__Group__0 ) ) ;
    public final void ruleReferencedGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:185:2: ( ( ( rule__ReferencedGreeting__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:186:1: ( ( rule__ReferencedGreeting__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:186:1: ( ( rule__ReferencedGreeting__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:187:1: ( rule__ReferencedGreeting__Group__0 )
            {
             before(grammarAccess.getReferencedGreetingAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:188:1: ( rule__ReferencedGreeting__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:188:2: rule__ReferencedGreeting__Group__0
            {
            pushFollow(FOLLOW_rule__ReferencedGreeting__Group__0_in_ruleReferencedGreeting334);
            rule__ReferencedGreeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencedGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleReferencedGreeting"


    // $ANTLR start "entryRuleQualifiedName"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:200:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:201:1: ( ruleQualifiedName EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:202:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName368); 

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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:209:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:213:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:215:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:216:1: ( rule__QualifiedName__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:216:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394);
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:230:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:234:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:235:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:242:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:246:1: ( ( 'package' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:247:1: ( 'package' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:247:1: ( 'package' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:248:1: 'package'
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:261:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:265:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:266:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:273:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:277:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:278:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:278:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:279:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:280:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:280:2: rule__PackageDeclaration__NameAssignment_1
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:290:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:294:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:295:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:302:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__ImportsAssignment_2 )* ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:306:1: ( ( ( rule__PackageDeclaration__ImportsAssignment_2 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:307:1: ( ( rule__PackageDeclaration__ImportsAssignment_2 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:307:1: ( ( rule__PackageDeclaration__ImportsAssignment_2 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:308:1: ( rule__PackageDeclaration__ImportsAssignment_2 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_2()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:309:1: ( rule__PackageDeclaration__ImportsAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:309:2: rule__PackageDeclaration__ImportsAssignment_2
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:319:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:323:1: ( rule__PackageDeclaration__Group__3__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:324:2: rule__PackageDeclaration__Group__3__Impl
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:330:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:334:1: ( ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:335:1: ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:335:1: ( ( rule__PackageDeclaration__GreetingsAssignment_3 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:336:1: ( rule__PackageDeclaration__GreetingsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getGreetingsAssignment_3()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:337:1: ( rule__PackageDeclaration__GreetingsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:337:2: rule__PackageDeclaration__GreetingsAssignment_3
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:355:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:359:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:360:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:367:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:371:1: ( ( 'import' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:372:1: ( 'import' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:372:1: ( 'import' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:373:1: 'import'
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:386:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:390:1: ( rule__Import__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:391:2: rule__Import__Group__1__Impl
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:397:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:401:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:402:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:402:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:403:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:404:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:404:2: rule__Import__ImportedNamespaceAssignment_1
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:418:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:422:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:423:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:430:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:434:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:435:1: ( ruleQualifiedName )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:435:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:436:1: ruleQualifiedName
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:447:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:451:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:452:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:458:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:462:1: ( ( ( '.*' )? ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:463:1: ( ( '.*' )? )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:463:1: ( ( '.*' )? )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:464:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:465:1: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:466:2: '.*'
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


    // $ANTLR start "rule__ReferencedGreeting__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:481:1: rule__ReferencedGreeting__Group__0 : rule__ReferencedGreeting__Group__0__Impl rule__ReferencedGreeting__Group__1 ;
    public final void rule__ReferencedGreeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:485:1: ( rule__ReferencedGreeting__Group__0__Impl rule__ReferencedGreeting__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:486:2: rule__ReferencedGreeting__Group__0__Impl rule__ReferencedGreeting__Group__1
            {
            pushFollow(FOLLOW_rule__ReferencedGreeting__Group__0__Impl_in_rule__ReferencedGreeting__Group__0925);
            rule__ReferencedGreeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReferencedGreeting__Group__1_in_rule__ReferencedGreeting__Group__0928);
            rule__ReferencedGreeting__Group__1();

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
    // $ANTLR end "rule__ReferencedGreeting__Group__0"


    // $ANTLR start "rule__ReferencedGreeting__Group__0__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:493:1: rule__ReferencedGreeting__Group__0__Impl : ( 'g: ' ) ;
    public final void rule__ReferencedGreeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:497:1: ( ( 'g: ' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:498:1: ( 'g: ' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:498:1: ( 'g: ' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:499:1: 'g: '
            {
             before(grammarAccess.getReferencedGreetingAccess().getGKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__ReferencedGreeting__Group__0__Impl956); 
             after(grammarAccess.getReferencedGreetingAccess().getGKeyword_0()); 

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
    // $ANTLR end "rule__ReferencedGreeting__Group__0__Impl"


    // $ANTLR start "rule__ReferencedGreeting__Group__1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:512:1: rule__ReferencedGreeting__Group__1 : rule__ReferencedGreeting__Group__1__Impl ;
    public final void rule__ReferencedGreeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:516:1: ( rule__ReferencedGreeting__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:517:2: rule__ReferencedGreeting__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferencedGreeting__Group__1__Impl_in_rule__ReferencedGreeting__Group__1987);
            rule__ReferencedGreeting__Group__1__Impl();

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
    // $ANTLR end "rule__ReferencedGreeting__Group__1"


    // $ANTLR start "rule__ReferencedGreeting__Group__1__Impl"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:523:1: rule__ReferencedGreeting__Group__1__Impl : ( ( rule__ReferencedGreeting__NameAssignment_1 ) ) ;
    public final void rule__ReferencedGreeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:527:1: ( ( ( rule__ReferencedGreeting__NameAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:528:1: ( ( rule__ReferencedGreeting__NameAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:528:1: ( ( rule__ReferencedGreeting__NameAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:529:1: ( rule__ReferencedGreeting__NameAssignment_1 )
            {
             before(grammarAccess.getReferencedGreetingAccess().getNameAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:530:1: ( rule__ReferencedGreeting__NameAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:530:2: rule__ReferencedGreeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferencedGreeting__NameAssignment_1_in_rule__ReferencedGreeting__Group__1__Impl1014);
            rule__ReferencedGreeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencedGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ReferencedGreeting__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:544:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:548:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:549:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01048);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01051);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:556:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:560:1: ( ( RULE_ID ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:561:1: ( RULE_ID )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:561:1: ( RULE_ID )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:562:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1078); 
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:573:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:577:1: ( rule__QualifiedName__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:578:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11107);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:584:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:588:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:590:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:591:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:591:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1134);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:605:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:609:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:610:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01169);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01172);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:617:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:621:1: ( ( '.' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:622:1: ( '.' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:622:1: ( '.' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:623:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1200); 
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:636:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:640:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:641:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11231);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:647:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:651:1: ( ( RULE_ID ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:652:1: ( RULE_ID )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:652:1: ( RULE_ID )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:653:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1258); 
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


    // $ANTLR start "rule__Model__PackageAssignment"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:669:1: rule__Model__PackageAssignment : ( rulePackageDeclaration ) ;
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:673:1: ( ( rulePackageDeclaration ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:674:1: ( rulePackageDeclaration )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:674:1: ( rulePackageDeclaration )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:675:1: rulePackageDeclaration
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:684:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:688:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:689:1: ( ruleQualifiedName )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:689:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:690:1: ruleQualifiedName
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:699:1: rule__PackageDeclaration__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__PackageDeclaration__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:703:1: ( ( ruleImport ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:704:1: ( ruleImport )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:704:1: ( ruleImport )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:705:1: ruleImport
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:714:1: rule__PackageDeclaration__GreetingsAssignment_3 : ( ruleReferencedGreeting ) ;
    public final void rule__PackageDeclaration__GreetingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:718:1: ( ( ruleReferencedGreeting ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:719:1: ( ruleReferencedGreeting )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:719:1: ( ruleReferencedGreeting )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:720:1: ruleReferencedGreeting
            {
             before(grammarAccess.getPackageDeclarationAccess().getGreetingsReferencedGreetingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleReferencedGreeting_in_rule__PackageDeclaration__GreetingsAssignment_31389);
            ruleReferencedGreeting();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getGreetingsReferencedGreetingParserRuleCall_3_0()); 

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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:729:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:733:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:734:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:734:1: ( ruleQualifiedNameWithWildcard )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:735:1: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__ReferencedGreeting__NameAssignment_1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:744:1: rule__ReferencedGreeting__NameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferencedGreeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:748:1: ( ( ( ruleQualifiedName ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:749:1: ( ( ruleQualifiedName ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:749:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:750:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferencedGreetingAccess().getNameGreetingCrossReference_1_0()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:751:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:752:1: ruleQualifiedName
            {
             before(grammarAccess.getReferencedGreetingAccess().getNameGreetingQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ReferencedGreeting__NameAssignment_11455);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferencedGreetingAccess().getNameGreetingQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferencedGreetingAccess().getNameGreetingCrossReference_1_0()); 

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
    // $ANTLR end "rule__ReferencedGreeting__NameAssignment_1"

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
    public static final BitSet FOLLOW_ruleReferencedGreeting_in_entryRuleReferencedGreeting301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedGreeting308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreeting__Group__0_in_ruleReferencedGreeting334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1490 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__2550 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ImportsAssignment_2_in_rule__PackageDeclaration__Group__2__Impl580 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__GreetingsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl638 = new BitSet(new long[]{0x0000000000004002L});
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
    public static final BitSet FOLLOW_rule__ReferencedGreeting__Group__0__Impl_in_rule__ReferencedGreeting__Group__0925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReferencedGreeting__Group__1_in_rule__ReferencedGreeting__Group__0928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReferencedGreeting__Group__0__Impl956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreeting__Group__1__Impl_in_rule__ReferencedGreeting__Group__1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreeting__NameAssignment_1_in_rule__ReferencedGreeting__Group__1__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01048 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1134 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__PackageDeclaration__ImportsAssignment_21358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedGreeting_in_rule__PackageDeclaration__GreetingsAssignment_31389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ReferencedGreeting__NameAssignment_11455 = new BitSet(new long[]{0x0000000000000002L});

}