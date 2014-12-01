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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'g: '", "'.'"
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:172:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:173:1: ( ruleQualifiedName EOF )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:174:1: ruleQualifiedName EOF
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:181:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:185:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:187:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:188:1: ( rule__QualifiedName__Group__0 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:188:2: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__Model__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:202:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:206:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:207:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:214:1: rule__Model__Group__0__Impl : ( ( rule__Model__PackageAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:218:1: ( ( ( rule__Model__PackageAssignment_0 )? ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:219:1: ( ( rule__Model__PackageAssignment_0 )? )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:219:1: ( ( rule__Model__PackageAssignment_0 )? )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:220:1: ( rule__Model__PackageAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_0()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:221:1: ( rule__Model__PackageAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:221:2: rule__Model__PackageAssignment_0
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:231:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:235:1: ( rule__Model__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:236:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1429);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:242:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:246:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:247:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:247:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:248:1: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:249:1: ( rule__Model__ImportsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:249:2: rule__Model__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl456);
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:263:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:267:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:268:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0491);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0494);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:275:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:279:1: ( ( 'package' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:280:1: ( 'package' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:280:1: ( 'package' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:281:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl522); 
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:294:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:298:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:299:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1553);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__1556);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:306:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:310:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:311:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:311:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:312:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:313:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:313:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl583);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:323:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:327:1: ( rule__PackageDeclaration__Group__2__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:328:2: rule__PackageDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__2613);
            rule__PackageDeclaration__Group__2__Impl();

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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:334:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__GreetingsAssignment_2 )* ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:338:1: ( ( ( rule__PackageDeclaration__GreetingsAssignment_2 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:339:1: ( ( rule__PackageDeclaration__GreetingsAssignment_2 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:339:1: ( ( rule__PackageDeclaration__GreetingsAssignment_2 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:340:1: ( rule__PackageDeclaration__GreetingsAssignment_2 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getGreetingsAssignment_2()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:341:1: ( rule__PackageDeclaration__GreetingsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:341:2: rule__PackageDeclaration__GreetingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__GreetingsAssignment_2_in_rule__PackageDeclaration__Group__2__Impl640);
            	    rule__PackageDeclaration__GreetingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getGreetingsAssignment_2()); 

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


    // $ANTLR start "rule__Import__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:357:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:361:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:362:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:369:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:373:1: ( ( 'import' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:374:1: ( 'import' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:374:1: ( 'import' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:375:1: 'import'
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:388:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:392:1: ( rule__Import__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:393:2: rule__Import__Group__1__Impl
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:399:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:403:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:404:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:404:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:405:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:406:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:406:2: rule__Import__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__ReferencedGreetings__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:420:1: rule__ReferencedGreetings__Group__0 : rule__ReferencedGreetings__Group__0__Impl rule__ReferencedGreetings__Group__1 ;
    public final void rule__ReferencedGreetings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:424:1: ( rule__ReferencedGreetings__Group__0__Impl rule__ReferencedGreetings__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:425:2: rule__ReferencedGreetings__Group__0__Impl rule__ReferencedGreetings__Group__1
            {
            pushFollow(FOLLOW_rule__ReferencedGreetings__Group__0__Impl_in_rule__ReferencedGreetings__Group__0800);
            rule__ReferencedGreetings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReferencedGreetings__Group__1_in_rule__ReferencedGreetings__Group__0803);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:432:1: rule__ReferencedGreetings__Group__0__Impl : ( 'g: ' ) ;
    public final void rule__ReferencedGreetings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:436:1: ( ( 'g: ' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:437:1: ( 'g: ' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:437:1: ( 'g: ' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:438:1: 'g: '
            {
             before(grammarAccess.getReferencedGreetingsAccess().getGKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ReferencedGreetings__Group__0__Impl831); 
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:451:1: rule__ReferencedGreetings__Group__1 : rule__ReferencedGreetings__Group__1__Impl ;
    public final void rule__ReferencedGreetings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:455:1: ( rule__ReferencedGreetings__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:456:2: rule__ReferencedGreetings__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferencedGreetings__Group__1__Impl_in_rule__ReferencedGreetings__Group__1862);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:462:1: rule__ReferencedGreetings__Group__1__Impl : ( ( rule__ReferencedGreetings__NameAssignment_1 ) ) ;
    public final void rule__ReferencedGreetings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:466:1: ( ( ( rule__ReferencedGreetings__NameAssignment_1 ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:467:1: ( ( rule__ReferencedGreetings__NameAssignment_1 ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:467:1: ( ( rule__ReferencedGreetings__NameAssignment_1 ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:468:1: ( rule__ReferencedGreetings__NameAssignment_1 )
            {
             before(grammarAccess.getReferencedGreetingsAccess().getNameAssignment_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:469:1: ( rule__ReferencedGreetings__NameAssignment_1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:469:2: rule__ReferencedGreetings__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferencedGreetings__NameAssignment_1_in_rule__ReferencedGreetings__Group__1__Impl889);
            rule__ReferencedGreetings__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencedGreetingsAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:483:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:487:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:488:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0923);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0926);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:495:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:499:1: ( ( RULE_ID ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:500:1: ( RULE_ID )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:500:1: ( RULE_ID )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:501:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl953); 
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:512:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:516:1: ( rule__QualifiedName__Group__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:517:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1982);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:523:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:527:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:528:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:528:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:529:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:530:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:530:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1009);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:544:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:548:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:549:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01044);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01047);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:556:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:560:1: ( ( '.' ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:561:1: ( '.' )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:561:1: ( '.' )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:562:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1075); 
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:575:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:579:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:580:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11106);
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:586:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:590:1: ( ( RULE_ID ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:591:1: ( RULE_ID )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:591:1: ( RULE_ID )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:592:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1133); 
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


    // $ANTLR start "rule__Model__PackageAssignment_0"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:608:1: rule__Model__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:612:1: ( ( rulePackageDeclaration ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:613:1: ( rulePackageDeclaration )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:613:1: ( rulePackageDeclaration )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:614:1: rulePackageDeclaration
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
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:623:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:627:1: ( ( ruleImport ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:628:1: ( ruleImport )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:628:1: ( ruleImport )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:629:1: ruleImport
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


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:638:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:642:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:643:1: ( ruleQualifiedName )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:643:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:644:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_11233);
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


    // $ANTLR start "rule__PackageDeclaration__GreetingsAssignment_2"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:653:1: rule__PackageDeclaration__GreetingsAssignment_2 : ( ruleReferencedGreetings ) ;
    public final void rule__PackageDeclaration__GreetingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:657:1: ( ( ruleReferencedGreetings ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:658:1: ( ruleReferencedGreetings )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:658:1: ( ruleReferencedGreetings )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:659:1: ruleReferencedGreetings
            {
             before(grammarAccess.getPackageDeclarationAccess().getGreetingsReferencedGreetingsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleReferencedGreetings_in_rule__PackageDeclaration__GreetingsAssignment_21264);
            ruleReferencedGreetings();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getGreetingsReferencedGreetingsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__GreetingsAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:668:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:672:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:673:1: ( ruleQualifiedName )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:673:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:674:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_11295);
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


    // $ANTLR start "rule__ReferencedGreetings__NameAssignment_1"
    // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:683:1: rule__ReferencedGreetings__NameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferencedGreetings__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:687:1: ( ( ( ruleQualifiedName ) ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:688:1: ( ( ruleQualifiedName ) )
            {
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:688:1: ( ( ruleQualifiedName ) )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:689:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferencedGreetingsAccess().getNameGreetingCrossReference_1_0()); 
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:690:1: ( ruleQualifiedName )
            // ../b.B.ui/src-gen/b/ui/contentassist/antlr/internal/InternalB.g:691:1: ruleQualifiedName
            {
             before(grammarAccess.getReferencedGreetingsAccess().getNameGreetingQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ReferencedGreetings__NameAssignment_11330);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferencedGreetingsAccess().getNameGreetingQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferencedGreetingsAccess().getNameGreetingCrossReference_1_0()); 

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
    // $ANTLR end "rule__ReferencedGreetings__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedGreetings_in_entryRuleReferencedGreetings241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencedGreetings248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__0_in_ruleReferencedGreetings274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0368 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageAssignment_0_in_rule__Model__Group__0__Impl398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl456 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__0491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__0494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PackageDeclaration__Group__0__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__1553 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__GreetingsAssignment_2_in_rule__PackageDeclaration__Group__2__Impl640 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__0__Impl_in_rule__ReferencedGreetings__Group__0800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__1_in_rule__ReferencedGreetings__Group__0803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ReferencedGreetings__Group__0__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__Group__1__Impl_in_rule__ReferencedGreetings__Group__1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferencedGreetings__NameAssignment_1_in_rule__ReferencedGreetings__Group__1__Impl889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0923 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1009 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Model__PackageAssignment_01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_11202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencedGreetings_in_rule__PackageDeclaration__GreetingsAssignment_21264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ReferencedGreetings__NameAssignment_11330 = new BitSet(new long[]{0x0000000000000002L});

}