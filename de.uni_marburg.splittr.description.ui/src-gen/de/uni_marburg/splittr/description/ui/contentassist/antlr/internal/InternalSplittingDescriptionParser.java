package de.uni_marburg.splittr.description.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import de.uni_marburg.splittr.description.services.SplittingDescriptionGrammarAccess;

@SuppressWarnings("all")
public class InternalSplittingDescriptionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOUBLE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'split model'", "'into'", "'partially with threshold'", "'fine-tune'", "'weight of generalization'", "'='", "'weight of aggregation'", "'weight of association'", "'weight of containment'", "'weight of interface realization'", "'weight of enum instantiation'", "'alpha = '", "'sub-model'", "'{'", "'}'"
    };
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSplittingDescriptionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSplittingDescriptionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSplittingDescriptionParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g"; }


     
     	private SplittingDescriptionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SplittingDescriptionGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSplittingDescription"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:60:1: entryRuleSplittingDescription : ruleSplittingDescription EOF ;
    public final void entryRuleSplittingDescription() throws RecognitionException {
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:61:1: ( ruleSplittingDescription EOF )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:62:1: ruleSplittingDescription EOF
            {
             before(grammarAccess.getSplittingDescriptionRule()); 
            pushFollow(FOLLOW_ruleSplittingDescription_in_entryRuleSplittingDescription61);
            ruleSplittingDescription();

            state._fsp--;

             after(grammarAccess.getSplittingDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplittingDescription68); 

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
    // $ANTLR end "entryRuleSplittingDescription"


    // $ANTLR start "ruleSplittingDescription"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:69:1: ruleSplittingDescription : ( ( rule__SplittingDescription__Group__0 ) ) ;
    public final void ruleSplittingDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:73:2: ( ( ( rule__SplittingDescription__Group__0 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:74:1: ( ( rule__SplittingDescription__Group__0 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:74:1: ( ( rule__SplittingDescription__Group__0 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:75:1: ( rule__SplittingDescription__Group__0 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getGroup()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:76:1: ( rule__SplittingDescription__Group__0 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:76:2: rule__SplittingDescription__Group__0
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group__0_in_ruleSplittingDescription94);
            rule__SplittingDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleSplittingDescription"


    // $ANTLR start "entryRuleSubModel"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:88:1: entryRuleSubModel : ruleSubModel EOF ;
    public final void entryRuleSubModel() throws RecognitionException {
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:89:1: ( ruleSubModel EOF )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:90:1: ruleSubModel EOF
            {
             before(grammarAccess.getSubModelRule()); 
            pushFollow(FOLLOW_ruleSubModel_in_entryRuleSubModel121);
            ruleSubModel();

            state._fsp--;

             after(grammarAccess.getSubModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubModel128); 

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
    // $ANTLR end "entryRuleSubModel"


    // $ANTLR start "ruleSubModel"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:97:1: ruleSubModel : ( ( rule__SubModel__Group__0 ) ) ;
    public final void ruleSubModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:101:2: ( ( ( rule__SubModel__Group__0 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:102:1: ( ( rule__SubModel__Group__0 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:102:1: ( ( rule__SubModel__Group__0 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:103:1: ( rule__SubModel__Group__0 )
            {
             before(grammarAccess.getSubModelAccess().getGroup()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:104:1: ( rule__SubModel__Group__0 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:104:2: rule__SubModel__Group__0
            {
            pushFollow(FOLLOW_rule__SubModel__Group__0_in_ruleSubModel154);
            rule__SubModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubModelAccess().getGroup()); 

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
    // $ANTLR end "ruleSubModel"


    // $ANTLR start "rule__SplittingDescription__Group__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:118:1: rule__SplittingDescription__Group__0 : rule__SplittingDescription__Group__0__Impl rule__SplittingDescription__Group__1 ;
    public final void rule__SplittingDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:122:1: ( rule__SplittingDescription__Group__0__Impl rule__SplittingDescription__Group__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:123:2: rule__SplittingDescription__Group__0__Impl rule__SplittingDescription__Group__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group__0__Impl_in_rule__SplittingDescription__Group__0188);
            rule__SplittingDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group__1_in_rule__SplittingDescription__Group__0191);
            rule__SplittingDescription__Group__1();

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
    // $ANTLR end "rule__SplittingDescription__Group__0"


    // $ANTLR start "rule__SplittingDescription__Group__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:130:1: rule__SplittingDescription__Group__0__Impl : ( 'split model' ) ;
    public final void rule__SplittingDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:134:1: ( ( 'split model' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:135:1: ( 'split model' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:135:1: ( 'split model' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:136:1: 'split model'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getSplitModelKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__SplittingDescription__Group__0__Impl219); 
             after(grammarAccess.getSplittingDescriptionAccess().getSplitModelKeyword_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:149:1: rule__SplittingDescription__Group__1 : rule__SplittingDescription__Group__1__Impl rule__SplittingDescription__Group__2 ;
    public final void rule__SplittingDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:153:1: ( rule__SplittingDescription__Group__1__Impl rule__SplittingDescription__Group__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:154:2: rule__SplittingDescription__Group__1__Impl rule__SplittingDescription__Group__2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group__1__Impl_in_rule__SplittingDescription__Group__1250);
            rule__SplittingDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group__2_in_rule__SplittingDescription__Group__1253);
            rule__SplittingDescription__Group__2();

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
    // $ANTLR end "rule__SplittingDescription__Group__1"


    // $ANTLR start "rule__SplittingDescription__Group__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:161:1: rule__SplittingDescription__Group__1__Impl : ( ( rule__SplittingDescription__ModelLocationAssignment_1 ) ) ;
    public final void rule__SplittingDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:165:1: ( ( ( rule__SplittingDescription__ModelLocationAssignment_1 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:166:1: ( ( rule__SplittingDescription__ModelLocationAssignment_1 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:166:1: ( ( rule__SplittingDescription__ModelLocationAssignment_1 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:167:1: ( rule__SplittingDescription__ModelLocationAssignment_1 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getModelLocationAssignment_1()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:168:1: ( rule__SplittingDescription__ModelLocationAssignment_1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:168:2: rule__SplittingDescription__ModelLocationAssignment_1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__ModelLocationAssignment_1_in_rule__SplittingDescription__Group__1__Impl280);
            rule__SplittingDescription__ModelLocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getModelLocationAssignment_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:178:1: rule__SplittingDescription__Group__2 : rule__SplittingDescription__Group__2__Impl rule__SplittingDescription__Group__3 ;
    public final void rule__SplittingDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:182:1: ( rule__SplittingDescription__Group__2__Impl rule__SplittingDescription__Group__3 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:183:2: rule__SplittingDescription__Group__2__Impl rule__SplittingDescription__Group__3
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group__2__Impl_in_rule__SplittingDescription__Group__2310);
            rule__SplittingDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group__3_in_rule__SplittingDescription__Group__2313);
            rule__SplittingDescription__Group__3();

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
    // $ANTLR end "rule__SplittingDescription__Group__2"


    // $ANTLR start "rule__SplittingDescription__Group__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:190:1: rule__SplittingDescription__Group__2__Impl : ( ( rule__SplittingDescription__Group_2__0 )? ) ;
    public final void rule__SplittingDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:194:1: ( ( ( rule__SplittingDescription__Group_2__0 )? ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:195:1: ( ( rule__SplittingDescription__Group_2__0 )? )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:195:1: ( ( rule__SplittingDescription__Group_2__0 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:196:1: ( rule__SplittingDescription__Group_2__0 )?
            {
             before(grammarAccess.getSplittingDescriptionAccess().getGroup_2()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:197:1: ( rule__SplittingDescription__Group_2__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:197:2: rule__SplittingDescription__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_2__0_in_rule__SplittingDescription__Group__2__Impl340);
                    rule__SplittingDescription__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSplittingDescriptionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SplittingDescription__Group__2__Impl"


    // $ANTLR start "rule__SplittingDescription__Group__3"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:207:1: rule__SplittingDescription__Group__3 : rule__SplittingDescription__Group__3__Impl rule__SplittingDescription__Group__4 ;
    public final void rule__SplittingDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:211:1: ( rule__SplittingDescription__Group__3__Impl rule__SplittingDescription__Group__4 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:212:2: rule__SplittingDescription__Group__3__Impl rule__SplittingDescription__Group__4
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group__3__Impl_in_rule__SplittingDescription__Group__3371);
            rule__SplittingDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group__4_in_rule__SplittingDescription__Group__3374);
            rule__SplittingDescription__Group__4();

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
    // $ANTLR end "rule__SplittingDescription__Group__3"


    // $ANTLR start "rule__SplittingDescription__Group__3__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:219:1: rule__SplittingDescription__Group__3__Impl : ( 'into' ) ;
    public final void rule__SplittingDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:223:1: ( ( 'into' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:224:1: ( 'into' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:224:1: ( 'into' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:225:1: 'into'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getIntoKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__SplittingDescription__Group__3__Impl402); 
             after(grammarAccess.getSplittingDescriptionAccess().getIntoKeyword_3()); 

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
    // $ANTLR end "rule__SplittingDescription__Group__3__Impl"


    // $ANTLR start "rule__SplittingDescription__Group__4"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:238:1: rule__SplittingDescription__Group__4 : rule__SplittingDescription__Group__4__Impl rule__SplittingDescription__Group__5 ;
    public final void rule__SplittingDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:242:1: ( rule__SplittingDescription__Group__4__Impl rule__SplittingDescription__Group__5 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:243:2: rule__SplittingDescription__Group__4__Impl rule__SplittingDescription__Group__5
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group__4__Impl_in_rule__SplittingDescription__Group__4433);
            rule__SplittingDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group__5_in_rule__SplittingDescription__Group__4436);
            rule__SplittingDescription__Group__5();

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
    // $ANTLR end "rule__SplittingDescription__Group__4"


    // $ANTLR start "rule__SplittingDescription__Group__4__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:250:1: rule__SplittingDescription__Group__4__Impl : ( ( rule__SplittingDescription__SubmodelsAssignment_4 )* ) ;
    public final void rule__SplittingDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:254:1: ( ( ( rule__SplittingDescription__SubmodelsAssignment_4 )* ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:255:1: ( ( rule__SplittingDescription__SubmodelsAssignment_4 )* )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:255:1: ( ( rule__SplittingDescription__SubmodelsAssignment_4 )* )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:256:1: ( rule__SplittingDescription__SubmodelsAssignment_4 )*
            {
             before(grammarAccess.getSplittingDescriptionAccess().getSubmodelsAssignment_4()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:257:1: ( rule__SplittingDescription__SubmodelsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:257:2: rule__SplittingDescription__SubmodelsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SplittingDescription__SubmodelsAssignment_4_in_rule__SplittingDescription__Group__4__Impl463);
            	    rule__SplittingDescription__SubmodelsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSplittingDescriptionAccess().getSubmodelsAssignment_4()); 

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
    // $ANTLR end "rule__SplittingDescription__Group__4__Impl"


    // $ANTLR start "rule__SplittingDescription__Group__5"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:267:1: rule__SplittingDescription__Group__5 : rule__SplittingDescription__Group__5__Impl ;
    public final void rule__SplittingDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:271:1: ( rule__SplittingDescription__Group__5__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:272:2: rule__SplittingDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group__5__Impl_in_rule__SplittingDescription__Group__5494);
            rule__SplittingDescription__Group__5__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group__5"


    // $ANTLR start "rule__SplittingDescription__Group__5__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:278:1: rule__SplittingDescription__Group__5__Impl : ( ( rule__SplittingDescription__UnorderedGroup_5 )? ) ;
    public final void rule__SplittingDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:282:1: ( ( ( rule__SplittingDescription__UnorderedGroup_5 )? ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:283:1: ( ( rule__SplittingDescription__UnorderedGroup_5 )? )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:283:1: ( ( rule__SplittingDescription__UnorderedGroup_5 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:284:1: ( rule__SplittingDescription__UnorderedGroup_5 )?
            {
             before(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:285:1: ( rule__SplittingDescription__UnorderedGroup_5 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( LA3_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt3=1;
            }
            else if ( LA3_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt3=1;
            }
            else if ( LA3_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt3=1;
            }
            else if ( LA3_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt3=1;
            }
            else if ( LA3_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt3=1;
            }
            else if ( LA3_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt3=1;
            }
            else if ( LA3_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:285:2: rule__SplittingDescription__UnorderedGroup_5
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5_in_rule__SplittingDescription__Group__5__Impl521);
                    rule__SplittingDescription__UnorderedGroup_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5()); 

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
    // $ANTLR end "rule__SplittingDescription__Group__5__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_2__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:307:1: rule__SplittingDescription__Group_2__0 : rule__SplittingDescription__Group_2__0__Impl rule__SplittingDescription__Group_2__1 ;
    public final void rule__SplittingDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:311:1: ( rule__SplittingDescription__Group_2__0__Impl rule__SplittingDescription__Group_2__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:312:2: rule__SplittingDescription__Group_2__0__Impl rule__SplittingDescription__Group_2__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_2__0__Impl_in_rule__SplittingDescription__Group_2__0564);
            rule__SplittingDescription__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_2__1_in_rule__SplittingDescription__Group_2__0567);
            rule__SplittingDescription__Group_2__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_2__0"


    // $ANTLR start "rule__SplittingDescription__Group_2__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:319:1: rule__SplittingDescription__Group_2__0__Impl : ( 'partially with threshold' ) ;
    public final void rule__SplittingDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:323:1: ( ( 'partially with threshold' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:324:1: ( 'partially with threshold' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:324:1: ( 'partially with threshold' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:325:1: 'partially with threshold'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getPartiallyWithThresholdKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__SplittingDescription__Group_2__0__Impl595); 
             after(grammarAccess.getSplittingDescriptionAccess().getPartiallyWithThresholdKeyword_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_2__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_2__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:338:1: rule__SplittingDescription__Group_2__1 : rule__SplittingDescription__Group_2__1__Impl ;
    public final void rule__SplittingDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:342:1: ( rule__SplittingDescription__Group_2__1__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:343:2: rule__SplittingDescription__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_2__1__Impl_in_rule__SplittingDescription__Group_2__1626);
            rule__SplittingDescription__Group_2__1__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_2__1"


    // $ANTLR start "rule__SplittingDescription__Group_2__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:349:1: rule__SplittingDescription__Group_2__1__Impl : ( ( rule__SplittingDescription__ThresholdAssignment_2_1 ) ) ;
    public final void rule__SplittingDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:353:1: ( ( ( rule__SplittingDescription__ThresholdAssignment_2_1 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:354:1: ( ( rule__SplittingDescription__ThresholdAssignment_2_1 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:354:1: ( ( rule__SplittingDescription__ThresholdAssignment_2_1 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:355:1: ( rule__SplittingDescription__ThresholdAssignment_2_1 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getThresholdAssignment_2_1()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:356:1: ( rule__SplittingDescription__ThresholdAssignment_2_1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:356:2: rule__SplittingDescription__ThresholdAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__ThresholdAssignment_2_1_in_rule__SplittingDescription__Group_2__1__Impl653);
            rule__SplittingDescription__ThresholdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getThresholdAssignment_2_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_2__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_0__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:370:1: rule__SplittingDescription__Group_5_0__0 : rule__SplittingDescription__Group_5_0__0__Impl rule__SplittingDescription__Group_5_0__1 ;
    public final void rule__SplittingDescription__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:374:1: ( rule__SplittingDescription__Group_5_0__0__Impl rule__SplittingDescription__Group_5_0__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:375:2: rule__SplittingDescription__Group_5_0__0__Impl rule__SplittingDescription__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0__0__Impl_in_rule__SplittingDescription__Group_5_0__0687);
            rule__SplittingDescription__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0__1_in_rule__SplittingDescription__Group_5_0__0690);
            rule__SplittingDescription__Group_5_0__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_0__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:382:1: rule__SplittingDescription__Group_5_0__0__Impl : ( 'fine-tune' ) ;
    public final void rule__SplittingDescription__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:386:1: ( ( 'fine-tune' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:387:1: ( 'fine-tune' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:387:1: ( 'fine-tune' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:388:1: 'fine-tune'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getFineTuneKeyword_5_0_0()); 
            match(input,15,FOLLOW_15_in_rule__SplittingDescription__Group_5_0__0__Impl718); 
             after(grammarAccess.getSplittingDescriptionAccess().getFineTuneKeyword_5_0_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_0__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:401:1: rule__SplittingDescription__Group_5_0__1 : rule__SplittingDescription__Group_5_0__1__Impl ;
    public final void rule__SplittingDescription__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:405:1: ( rule__SplittingDescription__Group_5_0__1__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:406:2: rule__SplittingDescription__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0__1__Impl_in_rule__SplittingDescription__Group_5_0__1749);
            rule__SplittingDescription__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_0__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:412:1: rule__SplittingDescription__Group_5_0__1__Impl : ( ( rule__SplittingDescription__Group_5_0_1__0 )? ) ;
    public final void rule__SplittingDescription__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:416:1: ( ( ( rule__SplittingDescription__Group_5_0_1__0 )? ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:417:1: ( ( rule__SplittingDescription__Group_5_0_1__0 )? )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:417:1: ( ( rule__SplittingDescription__Group_5_0_1__0 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:418:1: ( rule__SplittingDescription__Group_5_0_1__0 )?
            {
             before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_0_1()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:419:1: ( rule__SplittingDescription__Group_5_0_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:419:2: rule__SplittingDescription__Group_5_0_1__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0_1__0_in_rule__SplittingDescription__Group_5_0__1__Impl776);
                    rule__SplittingDescription__Group_5_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_0_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_0_1__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:433:1: rule__SplittingDescription__Group_5_0_1__0 : rule__SplittingDescription__Group_5_0_1__0__Impl rule__SplittingDescription__Group_5_0_1__1 ;
    public final void rule__SplittingDescription__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:437:1: ( rule__SplittingDescription__Group_5_0_1__0__Impl rule__SplittingDescription__Group_5_0_1__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:438:2: rule__SplittingDescription__Group_5_0_1__0__Impl rule__SplittingDescription__Group_5_0_1__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0_1__0__Impl_in_rule__SplittingDescription__Group_5_0_1__0811);
            rule__SplittingDescription__Group_5_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0_1__1_in_rule__SplittingDescription__Group_5_0_1__0814);
            rule__SplittingDescription__Group_5_0_1__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0_1__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_0_1__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:445:1: rule__SplittingDescription__Group_5_0_1__0__Impl : ( 'weight of generalization' ) ;
    public final void rule__SplittingDescription__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:449:1: ( ( 'weight of generalization' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:450:1: ( 'weight of generalization' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:450:1: ( 'weight of generalization' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:451:1: 'weight of generalization'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightOfGeneralizationKeyword_5_0_1_0()); 
            match(input,16,FOLLOW_16_in_rule__SplittingDescription__Group_5_0_1__0__Impl842); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightOfGeneralizationKeyword_5_0_1_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0_1__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_0_1__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:464:1: rule__SplittingDescription__Group_5_0_1__1 : rule__SplittingDescription__Group_5_0_1__1__Impl rule__SplittingDescription__Group_5_0_1__2 ;
    public final void rule__SplittingDescription__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:468:1: ( rule__SplittingDescription__Group_5_0_1__1__Impl rule__SplittingDescription__Group_5_0_1__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:469:2: rule__SplittingDescription__Group_5_0_1__1__Impl rule__SplittingDescription__Group_5_0_1__2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0_1__1__Impl_in_rule__SplittingDescription__Group_5_0_1__1873);
            rule__SplittingDescription__Group_5_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0_1__2_in_rule__SplittingDescription__Group_5_0_1__1876);
            rule__SplittingDescription__Group_5_0_1__2();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0_1__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_0_1__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:476:1: rule__SplittingDescription__Group_5_0_1__1__Impl : ( '=' ) ;
    public final void rule__SplittingDescription__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:480:1: ( ( '=' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:481:1: ( '=' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:481:1: ( '=' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:482:1: '='
            {
             before(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_0_1_1()); 
            match(input,17,FOLLOW_17_in_rule__SplittingDescription__Group_5_0_1__1__Impl904); 
             after(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_0_1_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0_1__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_0_1__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:495:1: rule__SplittingDescription__Group_5_0_1__2 : rule__SplittingDescription__Group_5_0_1__2__Impl ;
    public final void rule__SplittingDescription__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:499:1: ( rule__SplittingDescription__Group_5_0_1__2__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:500:2: rule__SplittingDescription__Group_5_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0_1__2__Impl_in_rule__SplittingDescription__Group_5_0_1__2935);
            rule__SplittingDescription__Group_5_0_1__2__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0_1__2"


    // $ANTLR start "rule__SplittingDescription__Group_5_0_1__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:506:1: rule__SplittingDescription__Group_5_0_1__2__Impl : ( ( rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2 ) ) ;
    public final void rule__SplittingDescription__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:510:1: ( ( ( rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:511:1: ( ( rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:511:1: ( ( rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:512:1: ( rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightGeneralizationAssignment_5_0_1_2()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:513:1: ( rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:513:2: rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2_in_rule__SplittingDescription__Group_5_0_1__2__Impl962);
            rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getWeightGeneralizationAssignment_5_0_1_2()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_0_1__2__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_1__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:529:1: rule__SplittingDescription__Group_5_1__0 : rule__SplittingDescription__Group_5_1__0__Impl rule__SplittingDescription__Group_5_1__1 ;
    public final void rule__SplittingDescription__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:533:1: ( rule__SplittingDescription__Group_5_1__0__Impl rule__SplittingDescription__Group_5_1__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:534:2: rule__SplittingDescription__Group_5_1__0__Impl rule__SplittingDescription__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_1__0__Impl_in_rule__SplittingDescription__Group_5_1__0998);
            rule__SplittingDescription__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_1__1_in_rule__SplittingDescription__Group_5_1__01001);
            rule__SplittingDescription__Group_5_1__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_1__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_1__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:541:1: rule__SplittingDescription__Group_5_1__0__Impl : ( 'weight of aggregation' ) ;
    public final void rule__SplittingDescription__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:545:1: ( ( 'weight of aggregation' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:546:1: ( 'weight of aggregation' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:546:1: ( 'weight of aggregation' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:547:1: 'weight of aggregation'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightOfAggregationKeyword_5_1_0()); 
            match(input,18,FOLLOW_18_in_rule__SplittingDescription__Group_5_1__0__Impl1029); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightOfAggregationKeyword_5_1_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_1__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_1__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:560:1: rule__SplittingDescription__Group_5_1__1 : rule__SplittingDescription__Group_5_1__1__Impl rule__SplittingDescription__Group_5_1__2 ;
    public final void rule__SplittingDescription__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:564:1: ( rule__SplittingDescription__Group_5_1__1__Impl rule__SplittingDescription__Group_5_1__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:565:2: rule__SplittingDescription__Group_5_1__1__Impl rule__SplittingDescription__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_1__1__Impl_in_rule__SplittingDescription__Group_5_1__11060);
            rule__SplittingDescription__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_1__2_in_rule__SplittingDescription__Group_5_1__11063);
            rule__SplittingDescription__Group_5_1__2();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_1__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_1__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:572:1: rule__SplittingDescription__Group_5_1__1__Impl : ( '=' ) ;
    public final void rule__SplittingDescription__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:576:1: ( ( '=' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:577:1: ( '=' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:577:1: ( '=' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:578:1: '='
            {
             before(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_1_1()); 
            match(input,17,FOLLOW_17_in_rule__SplittingDescription__Group_5_1__1__Impl1091); 
             after(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_1_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_1__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_1__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:591:1: rule__SplittingDescription__Group_5_1__2 : rule__SplittingDescription__Group_5_1__2__Impl ;
    public final void rule__SplittingDescription__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:595:1: ( rule__SplittingDescription__Group_5_1__2__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:596:2: rule__SplittingDescription__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_1__2__Impl_in_rule__SplittingDescription__Group_5_1__21122);
            rule__SplittingDescription__Group_5_1__2__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_1__2"


    // $ANTLR start "rule__SplittingDescription__Group_5_1__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:602:1: rule__SplittingDescription__Group_5_1__2__Impl : ( ( rule__SplittingDescription__WeightAggregationAssignment_5_1_2 ) ) ;
    public final void rule__SplittingDescription__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:606:1: ( ( ( rule__SplittingDescription__WeightAggregationAssignment_5_1_2 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:607:1: ( ( rule__SplittingDescription__WeightAggregationAssignment_5_1_2 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:607:1: ( ( rule__SplittingDescription__WeightAggregationAssignment_5_1_2 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:608:1: ( rule__SplittingDescription__WeightAggregationAssignment_5_1_2 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightAggregationAssignment_5_1_2()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:609:1: ( rule__SplittingDescription__WeightAggregationAssignment_5_1_2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:609:2: rule__SplittingDescription__WeightAggregationAssignment_5_1_2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__WeightAggregationAssignment_5_1_2_in_rule__SplittingDescription__Group_5_1__2__Impl1149);
            rule__SplittingDescription__WeightAggregationAssignment_5_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getWeightAggregationAssignment_5_1_2()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_1__2__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_2__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:625:1: rule__SplittingDescription__Group_5_2__0 : rule__SplittingDescription__Group_5_2__0__Impl rule__SplittingDescription__Group_5_2__1 ;
    public final void rule__SplittingDescription__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:629:1: ( rule__SplittingDescription__Group_5_2__0__Impl rule__SplittingDescription__Group_5_2__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:630:2: rule__SplittingDescription__Group_5_2__0__Impl rule__SplittingDescription__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_2__0__Impl_in_rule__SplittingDescription__Group_5_2__01185);
            rule__SplittingDescription__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_2__1_in_rule__SplittingDescription__Group_5_2__01188);
            rule__SplittingDescription__Group_5_2__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_2__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_2__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:637:1: rule__SplittingDescription__Group_5_2__0__Impl : ( 'weight of association' ) ;
    public final void rule__SplittingDescription__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:641:1: ( ( 'weight of association' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:642:1: ( 'weight of association' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:642:1: ( 'weight of association' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:643:1: 'weight of association'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightOfAssociationKeyword_5_2_0()); 
            match(input,19,FOLLOW_19_in_rule__SplittingDescription__Group_5_2__0__Impl1216); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightOfAssociationKeyword_5_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_2__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_2__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:656:1: rule__SplittingDescription__Group_5_2__1 : rule__SplittingDescription__Group_5_2__1__Impl rule__SplittingDescription__Group_5_2__2 ;
    public final void rule__SplittingDescription__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:660:1: ( rule__SplittingDescription__Group_5_2__1__Impl rule__SplittingDescription__Group_5_2__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:661:2: rule__SplittingDescription__Group_5_2__1__Impl rule__SplittingDescription__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_2__1__Impl_in_rule__SplittingDescription__Group_5_2__11247);
            rule__SplittingDescription__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_2__2_in_rule__SplittingDescription__Group_5_2__11250);
            rule__SplittingDescription__Group_5_2__2();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_2__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_2__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:668:1: rule__SplittingDescription__Group_5_2__1__Impl : ( '=' ) ;
    public final void rule__SplittingDescription__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:672:1: ( ( '=' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:673:1: ( '=' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:673:1: ( '=' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:674:1: '='
            {
             before(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_2_1()); 
            match(input,17,FOLLOW_17_in_rule__SplittingDescription__Group_5_2__1__Impl1278); 
             after(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_2_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_2__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_2__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:687:1: rule__SplittingDescription__Group_5_2__2 : rule__SplittingDescription__Group_5_2__2__Impl ;
    public final void rule__SplittingDescription__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:691:1: ( rule__SplittingDescription__Group_5_2__2__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:692:2: rule__SplittingDescription__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_2__2__Impl_in_rule__SplittingDescription__Group_5_2__21309);
            rule__SplittingDescription__Group_5_2__2__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_2__2"


    // $ANTLR start "rule__SplittingDescription__Group_5_2__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:698:1: rule__SplittingDescription__Group_5_2__2__Impl : ( ( rule__SplittingDescription__WeightAssociationAssignment_5_2_2 ) ) ;
    public final void rule__SplittingDescription__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:702:1: ( ( ( rule__SplittingDescription__WeightAssociationAssignment_5_2_2 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:703:1: ( ( rule__SplittingDescription__WeightAssociationAssignment_5_2_2 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:703:1: ( ( rule__SplittingDescription__WeightAssociationAssignment_5_2_2 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:704:1: ( rule__SplittingDescription__WeightAssociationAssignment_5_2_2 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightAssociationAssignment_5_2_2()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:705:1: ( rule__SplittingDescription__WeightAssociationAssignment_5_2_2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:705:2: rule__SplittingDescription__WeightAssociationAssignment_5_2_2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__WeightAssociationAssignment_5_2_2_in_rule__SplittingDescription__Group_5_2__2__Impl1336);
            rule__SplittingDescription__WeightAssociationAssignment_5_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getWeightAssociationAssignment_5_2_2()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_2__2__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_3__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:721:1: rule__SplittingDescription__Group_5_3__0 : rule__SplittingDescription__Group_5_3__0__Impl rule__SplittingDescription__Group_5_3__1 ;
    public final void rule__SplittingDescription__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:725:1: ( rule__SplittingDescription__Group_5_3__0__Impl rule__SplittingDescription__Group_5_3__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:726:2: rule__SplittingDescription__Group_5_3__0__Impl rule__SplittingDescription__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_3__0__Impl_in_rule__SplittingDescription__Group_5_3__01372);
            rule__SplittingDescription__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_3__1_in_rule__SplittingDescription__Group_5_3__01375);
            rule__SplittingDescription__Group_5_3__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_3__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_3__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:733:1: rule__SplittingDescription__Group_5_3__0__Impl : ( 'weight of containment' ) ;
    public final void rule__SplittingDescription__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:737:1: ( ( 'weight of containment' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:738:1: ( 'weight of containment' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:738:1: ( 'weight of containment' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:739:1: 'weight of containment'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightOfContainmentKeyword_5_3_0()); 
            match(input,20,FOLLOW_20_in_rule__SplittingDescription__Group_5_3__0__Impl1403); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightOfContainmentKeyword_5_3_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_3__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_3__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:752:1: rule__SplittingDescription__Group_5_3__1 : rule__SplittingDescription__Group_5_3__1__Impl rule__SplittingDescription__Group_5_3__2 ;
    public final void rule__SplittingDescription__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:756:1: ( rule__SplittingDescription__Group_5_3__1__Impl rule__SplittingDescription__Group_5_3__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:757:2: rule__SplittingDescription__Group_5_3__1__Impl rule__SplittingDescription__Group_5_3__2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_3__1__Impl_in_rule__SplittingDescription__Group_5_3__11434);
            rule__SplittingDescription__Group_5_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_3__2_in_rule__SplittingDescription__Group_5_3__11437);
            rule__SplittingDescription__Group_5_3__2();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_3__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_3__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:764:1: rule__SplittingDescription__Group_5_3__1__Impl : ( '=' ) ;
    public final void rule__SplittingDescription__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:768:1: ( ( '=' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:769:1: ( '=' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:769:1: ( '=' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:770:1: '='
            {
             before(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_3_1()); 
            match(input,17,FOLLOW_17_in_rule__SplittingDescription__Group_5_3__1__Impl1465); 
             after(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_3_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_3__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_3__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:783:1: rule__SplittingDescription__Group_5_3__2 : rule__SplittingDescription__Group_5_3__2__Impl ;
    public final void rule__SplittingDescription__Group_5_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:787:1: ( rule__SplittingDescription__Group_5_3__2__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:788:2: rule__SplittingDescription__Group_5_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_3__2__Impl_in_rule__SplittingDescription__Group_5_3__21496);
            rule__SplittingDescription__Group_5_3__2__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_3__2"


    // $ANTLR start "rule__SplittingDescription__Group_5_3__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:794:1: rule__SplittingDescription__Group_5_3__2__Impl : ( ( rule__SplittingDescription__WeightContainmentAssignment_5_3_2 ) ) ;
    public final void rule__SplittingDescription__Group_5_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:798:1: ( ( ( rule__SplittingDescription__WeightContainmentAssignment_5_3_2 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:799:1: ( ( rule__SplittingDescription__WeightContainmentAssignment_5_3_2 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:799:1: ( ( rule__SplittingDescription__WeightContainmentAssignment_5_3_2 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:800:1: ( rule__SplittingDescription__WeightContainmentAssignment_5_3_2 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightContainmentAssignment_5_3_2()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:801:1: ( rule__SplittingDescription__WeightContainmentAssignment_5_3_2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:801:2: rule__SplittingDescription__WeightContainmentAssignment_5_3_2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__WeightContainmentAssignment_5_3_2_in_rule__SplittingDescription__Group_5_3__2__Impl1523);
            rule__SplittingDescription__WeightContainmentAssignment_5_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getWeightContainmentAssignment_5_3_2()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_3__2__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_4__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:817:1: rule__SplittingDescription__Group_5_4__0 : rule__SplittingDescription__Group_5_4__0__Impl rule__SplittingDescription__Group_5_4__1 ;
    public final void rule__SplittingDescription__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:821:1: ( rule__SplittingDescription__Group_5_4__0__Impl rule__SplittingDescription__Group_5_4__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:822:2: rule__SplittingDescription__Group_5_4__0__Impl rule__SplittingDescription__Group_5_4__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_4__0__Impl_in_rule__SplittingDescription__Group_5_4__01559);
            rule__SplittingDescription__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_4__1_in_rule__SplittingDescription__Group_5_4__01562);
            rule__SplittingDescription__Group_5_4__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_4__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_4__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:829:1: rule__SplittingDescription__Group_5_4__0__Impl : ( 'weight of interface realization' ) ;
    public final void rule__SplittingDescription__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:833:1: ( ( 'weight of interface realization' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:834:1: ( 'weight of interface realization' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:834:1: ( 'weight of interface realization' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:835:1: 'weight of interface realization'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightOfInterfaceRealizationKeyword_5_4_0()); 
            match(input,21,FOLLOW_21_in_rule__SplittingDescription__Group_5_4__0__Impl1590); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightOfInterfaceRealizationKeyword_5_4_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_4__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_4__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:848:1: rule__SplittingDescription__Group_5_4__1 : rule__SplittingDescription__Group_5_4__1__Impl rule__SplittingDescription__Group_5_4__2 ;
    public final void rule__SplittingDescription__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:852:1: ( rule__SplittingDescription__Group_5_4__1__Impl rule__SplittingDescription__Group_5_4__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:853:2: rule__SplittingDescription__Group_5_4__1__Impl rule__SplittingDescription__Group_5_4__2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_4__1__Impl_in_rule__SplittingDescription__Group_5_4__11621);
            rule__SplittingDescription__Group_5_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_4__2_in_rule__SplittingDescription__Group_5_4__11624);
            rule__SplittingDescription__Group_5_4__2();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_4__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_4__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:860:1: rule__SplittingDescription__Group_5_4__1__Impl : ( '=' ) ;
    public final void rule__SplittingDescription__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:864:1: ( ( '=' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:865:1: ( '=' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:865:1: ( '=' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:866:1: '='
            {
             before(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_4_1()); 
            match(input,17,FOLLOW_17_in_rule__SplittingDescription__Group_5_4__1__Impl1652); 
             after(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_4_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_4__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_4__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:879:1: rule__SplittingDescription__Group_5_4__2 : rule__SplittingDescription__Group_5_4__2__Impl ;
    public final void rule__SplittingDescription__Group_5_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:883:1: ( rule__SplittingDescription__Group_5_4__2__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:884:2: rule__SplittingDescription__Group_5_4__2__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_4__2__Impl_in_rule__SplittingDescription__Group_5_4__21683);
            rule__SplittingDescription__Group_5_4__2__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_4__2"


    // $ANTLR start "rule__SplittingDescription__Group_5_4__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:890:1: rule__SplittingDescription__Group_5_4__2__Impl : ( ( rule__SplittingDescription__WeightInterfaceAssignment_5_4_2 ) ) ;
    public final void rule__SplittingDescription__Group_5_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:894:1: ( ( ( rule__SplittingDescription__WeightInterfaceAssignment_5_4_2 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:895:1: ( ( rule__SplittingDescription__WeightInterfaceAssignment_5_4_2 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:895:1: ( ( rule__SplittingDescription__WeightInterfaceAssignment_5_4_2 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:896:1: ( rule__SplittingDescription__WeightInterfaceAssignment_5_4_2 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightInterfaceAssignment_5_4_2()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:897:1: ( rule__SplittingDescription__WeightInterfaceAssignment_5_4_2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:897:2: rule__SplittingDescription__WeightInterfaceAssignment_5_4_2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__WeightInterfaceAssignment_5_4_2_in_rule__SplittingDescription__Group_5_4__2__Impl1710);
            rule__SplittingDescription__WeightInterfaceAssignment_5_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getWeightInterfaceAssignment_5_4_2()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_4__2__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_5__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:913:1: rule__SplittingDescription__Group_5_5__0 : rule__SplittingDescription__Group_5_5__0__Impl rule__SplittingDescription__Group_5_5__1 ;
    public final void rule__SplittingDescription__Group_5_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:917:1: ( rule__SplittingDescription__Group_5_5__0__Impl rule__SplittingDescription__Group_5_5__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:918:2: rule__SplittingDescription__Group_5_5__0__Impl rule__SplittingDescription__Group_5_5__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_5__0__Impl_in_rule__SplittingDescription__Group_5_5__01746);
            rule__SplittingDescription__Group_5_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_5__1_in_rule__SplittingDescription__Group_5_5__01749);
            rule__SplittingDescription__Group_5_5__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_5__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_5__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:925:1: rule__SplittingDescription__Group_5_5__0__Impl : ( 'weight of enum instantiation' ) ;
    public final void rule__SplittingDescription__Group_5_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:929:1: ( ( 'weight of enum instantiation' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:930:1: ( 'weight of enum instantiation' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:930:1: ( 'weight of enum instantiation' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:931:1: 'weight of enum instantiation'
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightOfEnumInstantiationKeyword_5_5_0()); 
            match(input,22,FOLLOW_22_in_rule__SplittingDescription__Group_5_5__0__Impl1777); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightOfEnumInstantiationKeyword_5_5_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_5__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_5__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:944:1: rule__SplittingDescription__Group_5_5__1 : rule__SplittingDescription__Group_5_5__1__Impl rule__SplittingDescription__Group_5_5__2 ;
    public final void rule__SplittingDescription__Group_5_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:948:1: ( rule__SplittingDescription__Group_5_5__1__Impl rule__SplittingDescription__Group_5_5__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:949:2: rule__SplittingDescription__Group_5_5__1__Impl rule__SplittingDescription__Group_5_5__2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_5__1__Impl_in_rule__SplittingDescription__Group_5_5__11808);
            rule__SplittingDescription__Group_5_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_5__2_in_rule__SplittingDescription__Group_5_5__11811);
            rule__SplittingDescription__Group_5_5__2();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_5__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_5__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:956:1: rule__SplittingDescription__Group_5_5__1__Impl : ( '=' ) ;
    public final void rule__SplittingDescription__Group_5_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:960:1: ( ( '=' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:961:1: ( '=' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:961:1: ( '=' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:962:1: '='
            {
             before(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_5_1()); 
            match(input,17,FOLLOW_17_in_rule__SplittingDescription__Group_5_5__1__Impl1839); 
             after(grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_5_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_5__1__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_5__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:975:1: rule__SplittingDescription__Group_5_5__2 : rule__SplittingDescription__Group_5_5__2__Impl ;
    public final void rule__SplittingDescription__Group_5_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:979:1: ( rule__SplittingDescription__Group_5_5__2__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:980:2: rule__SplittingDescription__Group_5_5__2__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_5__2__Impl_in_rule__SplittingDescription__Group_5_5__21870);
            rule__SplittingDescription__Group_5_5__2__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_5__2"


    // $ANTLR start "rule__SplittingDescription__Group_5_5__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:986:1: rule__SplittingDescription__Group_5_5__2__Impl : ( ( rule__SplittingDescription__WeightEnumAssignment_5_5_2 ) ) ;
    public final void rule__SplittingDescription__Group_5_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:990:1: ( ( ( rule__SplittingDescription__WeightEnumAssignment_5_5_2 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:991:1: ( ( rule__SplittingDescription__WeightEnumAssignment_5_5_2 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:991:1: ( ( rule__SplittingDescription__WeightEnumAssignment_5_5_2 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:992:1: ( rule__SplittingDescription__WeightEnumAssignment_5_5_2 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightEnumAssignment_5_5_2()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:993:1: ( rule__SplittingDescription__WeightEnumAssignment_5_5_2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:993:2: rule__SplittingDescription__WeightEnumAssignment_5_5_2
            {
            pushFollow(FOLLOW_rule__SplittingDescription__WeightEnumAssignment_5_5_2_in_rule__SplittingDescription__Group_5_5__2__Impl1897);
            rule__SplittingDescription__WeightEnumAssignment_5_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getWeightEnumAssignment_5_5_2()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_5__2__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_6__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1009:1: rule__SplittingDescription__Group_5_6__0 : rule__SplittingDescription__Group_5_6__0__Impl rule__SplittingDescription__Group_5_6__1 ;
    public final void rule__SplittingDescription__Group_5_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1013:1: ( rule__SplittingDescription__Group_5_6__0__Impl rule__SplittingDescription__Group_5_6__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1014:2: rule__SplittingDescription__Group_5_6__0__Impl rule__SplittingDescription__Group_5_6__1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_6__0__Impl_in_rule__SplittingDescription__Group_5_6__01933);
            rule__SplittingDescription__Group_5_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_6__1_in_rule__SplittingDescription__Group_5_6__01936);
            rule__SplittingDescription__Group_5_6__1();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_6__0"


    // $ANTLR start "rule__SplittingDescription__Group_5_6__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1021:1: rule__SplittingDescription__Group_5_6__0__Impl : ( 'alpha = ' ) ;
    public final void rule__SplittingDescription__Group_5_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1025:1: ( ( 'alpha = ' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1026:1: ( 'alpha = ' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1026:1: ( 'alpha = ' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1027:1: 'alpha = '
            {
             before(grammarAccess.getSplittingDescriptionAccess().getAlphaKeyword_5_6_0()); 
            match(input,23,FOLLOW_23_in_rule__SplittingDescription__Group_5_6__0__Impl1964); 
             after(grammarAccess.getSplittingDescriptionAccess().getAlphaKeyword_5_6_0()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_6__0__Impl"


    // $ANTLR start "rule__SplittingDescription__Group_5_6__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1040:1: rule__SplittingDescription__Group_5_6__1 : rule__SplittingDescription__Group_5_6__1__Impl ;
    public final void rule__SplittingDescription__Group_5_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1044:1: ( rule__SplittingDescription__Group_5_6__1__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1045:2: rule__SplittingDescription__Group_5_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__Group_5_6__1__Impl_in_rule__SplittingDescription__Group_5_6__11995);
            rule__SplittingDescription__Group_5_6__1__Impl();

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
    // $ANTLR end "rule__SplittingDescription__Group_5_6__1"


    // $ANTLR start "rule__SplittingDescription__Group_5_6__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1051:1: rule__SplittingDescription__Group_5_6__1__Impl : ( ( rule__SplittingDescription__AlphaAssignment_5_6_1 ) ) ;
    public final void rule__SplittingDescription__Group_5_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1055:1: ( ( ( rule__SplittingDescription__AlphaAssignment_5_6_1 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1056:1: ( ( rule__SplittingDescription__AlphaAssignment_5_6_1 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1056:1: ( ( rule__SplittingDescription__AlphaAssignment_5_6_1 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1057:1: ( rule__SplittingDescription__AlphaAssignment_5_6_1 )
            {
             before(grammarAccess.getSplittingDescriptionAccess().getAlphaAssignment_5_6_1()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1058:1: ( rule__SplittingDescription__AlphaAssignment_5_6_1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1058:2: rule__SplittingDescription__AlphaAssignment_5_6_1
            {
            pushFollow(FOLLOW_rule__SplittingDescription__AlphaAssignment_5_6_1_in_rule__SplittingDescription__Group_5_6__1__Impl2022);
            rule__SplittingDescription__AlphaAssignment_5_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSplittingDescriptionAccess().getAlphaAssignment_5_6_1()); 

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
    // $ANTLR end "rule__SplittingDescription__Group_5_6__1__Impl"


    // $ANTLR start "rule__SubModel__Group__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1072:1: rule__SubModel__Group__0 : rule__SubModel__Group__0__Impl rule__SubModel__Group__1 ;
    public final void rule__SubModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1076:1: ( rule__SubModel__Group__0__Impl rule__SubModel__Group__1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1077:2: rule__SubModel__Group__0__Impl rule__SubModel__Group__1
            {
            pushFollow(FOLLOW_rule__SubModel__Group__0__Impl_in_rule__SubModel__Group__02056);
            rule__SubModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubModel__Group__1_in_rule__SubModel__Group__02059);
            rule__SubModel__Group__1();

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
    // $ANTLR end "rule__SubModel__Group__0"


    // $ANTLR start "rule__SubModel__Group__0__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1084:1: rule__SubModel__Group__0__Impl : ( 'sub-model' ) ;
    public final void rule__SubModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1088:1: ( ( 'sub-model' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1089:1: ( 'sub-model' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1089:1: ( 'sub-model' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1090:1: 'sub-model'
            {
             before(grammarAccess.getSubModelAccess().getSubModelKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__SubModel__Group__0__Impl2087); 
             after(grammarAccess.getSubModelAccess().getSubModelKeyword_0()); 

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
    // $ANTLR end "rule__SubModel__Group__0__Impl"


    // $ANTLR start "rule__SubModel__Group__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1103:1: rule__SubModel__Group__1 : rule__SubModel__Group__1__Impl rule__SubModel__Group__2 ;
    public final void rule__SubModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1107:1: ( rule__SubModel__Group__1__Impl rule__SubModel__Group__2 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1108:2: rule__SubModel__Group__1__Impl rule__SubModel__Group__2
            {
            pushFollow(FOLLOW_rule__SubModel__Group__1__Impl_in_rule__SubModel__Group__12118);
            rule__SubModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubModel__Group__2_in_rule__SubModel__Group__12121);
            rule__SubModel__Group__2();

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
    // $ANTLR end "rule__SubModel__Group__1"


    // $ANTLR start "rule__SubModel__Group__1__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1115:1: rule__SubModel__Group__1__Impl : ( ( rule__SubModel__NameAssignment_1 ) ) ;
    public final void rule__SubModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1119:1: ( ( ( rule__SubModel__NameAssignment_1 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1120:1: ( ( rule__SubModel__NameAssignment_1 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1120:1: ( ( rule__SubModel__NameAssignment_1 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1121:1: ( rule__SubModel__NameAssignment_1 )
            {
             before(grammarAccess.getSubModelAccess().getNameAssignment_1()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1122:1: ( rule__SubModel__NameAssignment_1 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1122:2: rule__SubModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubModel__NameAssignment_1_in_rule__SubModel__Group__1__Impl2148);
            rule__SubModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SubModel__Group__1__Impl"


    // $ANTLR start "rule__SubModel__Group__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1132:1: rule__SubModel__Group__2 : rule__SubModel__Group__2__Impl rule__SubModel__Group__3 ;
    public final void rule__SubModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1136:1: ( rule__SubModel__Group__2__Impl rule__SubModel__Group__3 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1137:2: rule__SubModel__Group__2__Impl rule__SubModel__Group__3
            {
            pushFollow(FOLLOW_rule__SubModel__Group__2__Impl_in_rule__SubModel__Group__22178);
            rule__SubModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubModel__Group__3_in_rule__SubModel__Group__22181);
            rule__SubModel__Group__3();

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
    // $ANTLR end "rule__SubModel__Group__2"


    // $ANTLR start "rule__SubModel__Group__2__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1144:1: rule__SubModel__Group__2__Impl : ( '{' ) ;
    public final void rule__SubModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1148:1: ( ( '{' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1149:1: ( '{' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1149:1: ( '{' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1150:1: '{'
            {
             before(grammarAccess.getSubModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__SubModel__Group__2__Impl2209); 
             after(grammarAccess.getSubModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SubModel__Group__2__Impl"


    // $ANTLR start "rule__SubModel__Group__3"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1163:1: rule__SubModel__Group__3 : rule__SubModel__Group__3__Impl rule__SubModel__Group__4 ;
    public final void rule__SubModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1167:1: ( rule__SubModel__Group__3__Impl rule__SubModel__Group__4 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1168:2: rule__SubModel__Group__3__Impl rule__SubModel__Group__4
            {
            pushFollow(FOLLOW_rule__SubModel__Group__3__Impl_in_rule__SubModel__Group__32240);
            rule__SubModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubModel__Group__4_in_rule__SubModel__Group__32243);
            rule__SubModel__Group__4();

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
    // $ANTLR end "rule__SubModel__Group__3"


    // $ANTLR start "rule__SubModel__Group__3__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1175:1: rule__SubModel__Group__3__Impl : ( ( rule__SubModel__DescriptionAssignment_3 ) ) ;
    public final void rule__SubModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1179:1: ( ( ( rule__SubModel__DescriptionAssignment_3 ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1180:1: ( ( rule__SubModel__DescriptionAssignment_3 ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1180:1: ( ( rule__SubModel__DescriptionAssignment_3 ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1181:1: ( rule__SubModel__DescriptionAssignment_3 )
            {
             before(grammarAccess.getSubModelAccess().getDescriptionAssignment_3()); 
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1182:1: ( rule__SubModel__DescriptionAssignment_3 )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1182:2: rule__SubModel__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__SubModel__DescriptionAssignment_3_in_rule__SubModel__Group__3__Impl2270);
            rule__SubModel__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubModelAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__SubModel__Group__3__Impl"


    // $ANTLR start "rule__SubModel__Group__4"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1192:1: rule__SubModel__Group__4 : rule__SubModel__Group__4__Impl ;
    public final void rule__SubModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1196:1: ( rule__SubModel__Group__4__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1197:2: rule__SubModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SubModel__Group__4__Impl_in_rule__SubModel__Group__42300);
            rule__SubModel__Group__4__Impl();

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
    // $ANTLR end "rule__SubModel__Group__4"


    // $ANTLR start "rule__SubModel__Group__4__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1203:1: rule__SubModel__Group__4__Impl : ( '}' ) ;
    public final void rule__SubModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1207:1: ( ( '}' ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1208:1: ( '}' )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1208:1: ( '}' )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1209:1: '}'
            {
             before(grammarAccess.getSubModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__SubModel__Group__4__Impl2328); 
             after(grammarAccess.getSubModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SubModel__Group__4__Impl"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1233:1: rule__SplittingDescription__UnorderedGroup_5 : rule__SplittingDescription__UnorderedGroup_5__0 {...}?;
    public final void rule__SplittingDescription__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1238:1: ( rule__SplittingDescription__UnorderedGroup_5__0 {...}?)
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1239:2: rule__SplittingDescription__UnorderedGroup_5__0 {...}?
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__0_in_rule__SplittingDescription__UnorderedGroup_52370);
            rule__SplittingDescription__UnorderedGroup_5__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5", "getUnorderedGroupHelper().canLeave(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__Impl"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1250:1: rule__SplittingDescription__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) ) ) ) ;
    public final void rule__SplittingDescription__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1255:1: ( ( ({...}? => ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) ) ) ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1256:3: ( ({...}? => ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) ) ) )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1256:3: ( ({...}? => ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) ) ) | ({...}? => ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) ) ) )
            int alt5=7;
            int LA5_0 = input.LA(1);

            if ( LA5_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt5=2;
            }
            else if ( LA5_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt5=3;
            }
            else if ( LA5_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt5=4;
            }
            else if ( LA5_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt5=5;
            }
            else if ( LA5_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt5=6;
            }
            else if ( LA5_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt5=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1258:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) ) )
                    {
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1258:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1259:5: {...}? => ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1259:117: ( ( ( rule__SplittingDescription__Group_5_0__0 ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1260:6: ( ( rule__SplittingDescription__Group_5_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1266:6: ( ( rule__SplittingDescription__Group_5_0__0 ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1268:7: ( rule__SplittingDescription__Group_5_0__0 )
                    {
                     before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_0()); 
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1269:7: ( rule__SplittingDescription__Group_5_0__0 )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1269:8: rule__SplittingDescription__Group_5_0__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_0__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2459);
                    rule__SplittingDescription__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1275:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) ) )
                    {
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1275:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1276:5: {...}? => ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1276:117: ( ( ( rule__SplittingDescription__Group_5_1__0 ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1277:6: ( ( rule__SplittingDescription__Group_5_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1283:6: ( ( rule__SplittingDescription__Group_5_1__0 ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1285:7: ( rule__SplittingDescription__Group_5_1__0 )
                    {
                     before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_1()); 
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1286:7: ( rule__SplittingDescription__Group_5_1__0 )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1286:8: rule__SplittingDescription__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_1__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2550);
                    rule__SplittingDescription__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1292:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) ) )
                    {
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1292:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1293:5: {...}? => ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2)");
                    }
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1293:117: ( ( ( rule__SplittingDescription__Group_5_2__0 ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1294:6: ( ( rule__SplittingDescription__Group_5_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1300:6: ( ( rule__SplittingDescription__Group_5_2__0 ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1302:7: ( rule__SplittingDescription__Group_5_2__0 )
                    {
                     before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_2()); 
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1303:7: ( rule__SplittingDescription__Group_5_2__0 )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1303:8: rule__SplittingDescription__Group_5_2__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_2__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2641);
                    rule__SplittingDescription__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1309:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) ) )
                    {
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1309:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1310:5: {...}? => ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                        throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3)");
                    }
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1310:117: ( ( ( rule__SplittingDescription__Group_5_3__0 ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1311:6: ( ( rule__SplittingDescription__Group_5_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1317:6: ( ( rule__SplittingDescription__Group_5_3__0 ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1319:7: ( rule__SplittingDescription__Group_5_3__0 )
                    {
                     before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_3()); 
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1320:7: ( rule__SplittingDescription__Group_5_3__0 )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1320:8: rule__SplittingDescription__Group_5_3__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_3__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2732);
                    rule__SplittingDescription__Group_5_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1326:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) ) )
                    {
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1326:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1327:5: {...}? => ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                        throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4)");
                    }
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1327:117: ( ( ( rule__SplittingDescription__Group_5_4__0 ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1328:6: ( ( rule__SplittingDescription__Group_5_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1334:6: ( ( rule__SplittingDescription__Group_5_4__0 ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1336:7: ( rule__SplittingDescription__Group_5_4__0 )
                    {
                     before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_4()); 
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1337:7: ( rule__SplittingDescription__Group_5_4__0 )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1337:8: rule__SplittingDescription__Group_5_4__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_4__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2823);
                    rule__SplittingDescription__Group_5_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1343:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) ) )
                    {
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1343:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1344:5: {...}? => ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                        throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5)");
                    }
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1344:117: ( ( ( rule__SplittingDescription__Group_5_5__0 ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1345:6: ( ( rule__SplittingDescription__Group_5_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1351:6: ( ( rule__SplittingDescription__Group_5_5__0 ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1353:7: ( rule__SplittingDescription__Group_5_5__0 )
                    {
                     before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_5()); 
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1354:7: ( rule__SplittingDescription__Group_5_5__0 )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1354:8: rule__SplittingDescription__Group_5_5__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_5__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2914);
                    rule__SplittingDescription__Group_5_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1360:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) ) )
                    {
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1360:4: ({...}? => ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1361:5: {...}? => ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                        throw new FailedPredicateException(input, "rule__SplittingDescription__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6)");
                    }
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1361:117: ( ( ( rule__SplittingDescription__Group_5_6__0 ) ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1362:6: ( ( rule__SplittingDescription__Group_5_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1368:6: ( ( rule__SplittingDescription__Group_5_6__0 ) )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1370:7: ( rule__SplittingDescription__Group_5_6__0 )
                    {
                     before(grammarAccess.getSplittingDescriptionAccess().getGroup_5_6()); 
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1371:7: ( rule__SplittingDescription__Group_5_6__0 )
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1371:8: rule__SplittingDescription__Group_5_6__0
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__Group_5_6__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl3005);
                    rule__SplittingDescription__Group_5_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSplittingDescriptionAccess().getGroup_5_6()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__0"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1386:1: rule__SplittingDescription__UnorderedGroup_5__0 : rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__1 )? ;
    public final void rule__SplittingDescription__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1390:1: ( rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__1 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1391:2: rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__03064);
            rule__SplittingDescription__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1392:2: ( rule__SplittingDescription__UnorderedGroup_5__1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt6=1;
            }
            else if ( LA6_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt6=1;
            }
            else if ( LA6_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt6=1;
            }
            else if ( LA6_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt6=1;
            }
            else if ( LA6_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1392:2: rule__SplittingDescription__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__1_in_rule__SplittingDescription__UnorderedGroup_5__03067);
                    rule__SplittingDescription__UnorderedGroup_5__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__0"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1399:1: rule__SplittingDescription__UnorderedGroup_5__1 : rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__2 )? ;
    public final void rule__SplittingDescription__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1403:1: ( rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__2 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1404:2: rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__13092);
            rule__SplittingDescription__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1405:2: ( rule__SplittingDescription__UnorderedGroup_5__2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt7=1;
            }
            else if ( LA7_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt7=1;
            }
            else if ( LA7_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt7=1;
            }
            else if ( LA7_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt7=1;
            }
            else if ( LA7_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1405:2: rule__SplittingDescription__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__2_in_rule__SplittingDescription__UnorderedGroup_5__13095);
                    rule__SplittingDescription__UnorderedGroup_5__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__1"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1412:1: rule__SplittingDescription__UnorderedGroup_5__2 : rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__3 )? ;
    public final void rule__SplittingDescription__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1416:1: ( rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__3 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1417:2: rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__3 )?
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__23120);
            rule__SplittingDescription__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1418:2: ( rule__SplittingDescription__UnorderedGroup_5__3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt8=1;
            }
            else if ( LA8_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt8=1;
            }
            else if ( LA8_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt8=1;
            }
            else if ( LA8_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt8=1;
            }
            else if ( LA8_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt8=1;
            }
            else if ( LA8_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1418:2: rule__SplittingDescription__UnorderedGroup_5__3
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__3_in_rule__SplittingDescription__UnorderedGroup_5__23123);
                    rule__SplittingDescription__UnorderedGroup_5__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__2"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__3"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1425:1: rule__SplittingDescription__UnorderedGroup_5__3 : rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__4 )? ;
    public final void rule__SplittingDescription__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1429:1: ( rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__4 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1430:2: rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__4 )?
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__33148);
            rule__SplittingDescription__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1431:2: ( rule__SplittingDescription__UnorderedGroup_5__4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( LA9_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt9=1;
            }
            else if ( LA9_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt9=1;
            }
            else if ( LA9_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt9=1;
            }
            else if ( LA9_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt9=1;
            }
            else if ( LA9_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt9=1;
            }
            else if ( LA9_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1431:2: rule__SplittingDescription__UnorderedGroup_5__4
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__4_in_rule__SplittingDescription__UnorderedGroup_5__33151);
                    rule__SplittingDescription__UnorderedGroup_5__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__3"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__4"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1438:1: rule__SplittingDescription__UnorderedGroup_5__4 : rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__5 )? ;
    public final void rule__SplittingDescription__UnorderedGroup_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1442:1: ( rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__5 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1443:2: rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__5 )?
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__43176);
            rule__SplittingDescription__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1444:2: ( rule__SplittingDescription__UnorderedGroup_5__5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt10=1;
            }
            else if ( LA10_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt10=1;
            }
            else if ( LA10_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt10=1;
            }
            else if ( LA10_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt10=1;
            }
            else if ( LA10_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1444:2: rule__SplittingDescription__UnorderedGroup_5__5
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__5_in_rule__SplittingDescription__UnorderedGroup_5__43179);
                    rule__SplittingDescription__UnorderedGroup_5__5();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__4"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__5"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1451:1: rule__SplittingDescription__UnorderedGroup_5__5 : rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__6 )? ;
    public final void rule__SplittingDescription__UnorderedGroup_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1455:1: ( rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__6 )? )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1456:2: rule__SplittingDescription__UnorderedGroup_5__Impl ( rule__SplittingDescription__UnorderedGroup_5__6 )?
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__53204);
            rule__SplittingDescription__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1457:2: ( rule__SplittingDescription__UnorderedGroup_5__6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                alt11=1;
            }
            else if ( LA11_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                alt11=1;
            }
            else if ( LA11_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                alt11=1;
            }
            else if ( LA11_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                alt11=1;
            }
            else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1457:2: rule__SplittingDescription__UnorderedGroup_5__6
                    {
                    pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__6_in_rule__SplittingDescription__UnorderedGroup_5__53207);
                    rule__SplittingDescription__UnorderedGroup_5__6();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__5"


    // $ANTLR start "rule__SplittingDescription__UnorderedGroup_5__6"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1464:1: rule__SplittingDescription__UnorderedGroup_5__6 : rule__SplittingDescription__UnorderedGroup_5__Impl ;
    public final void rule__SplittingDescription__UnorderedGroup_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1468:1: ( rule__SplittingDescription__UnorderedGroup_5__Impl )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1469:2: rule__SplittingDescription__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__63232);
            rule__SplittingDescription__UnorderedGroup_5__Impl();

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
    // $ANTLR end "rule__SplittingDescription__UnorderedGroup_5__6"


    // $ANTLR start "rule__SplittingDescription__ModelLocationAssignment_1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1490:1: rule__SplittingDescription__ModelLocationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SplittingDescription__ModelLocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1494:1: ( ( RULE_STRING ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1495:1: ( RULE_STRING )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1495:1: ( RULE_STRING )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1496:1: RULE_STRING
            {
             before(grammarAccess.getSplittingDescriptionAccess().getModelLocationSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SplittingDescription__ModelLocationAssignment_13274); 
             after(grammarAccess.getSplittingDescriptionAccess().getModelLocationSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SplittingDescription__ModelLocationAssignment_1"


    // $ANTLR start "rule__SplittingDescription__ThresholdAssignment_2_1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1505:1: rule__SplittingDescription__ThresholdAssignment_2_1 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__ThresholdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1509:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1510:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1510:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1511:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getThresholdDOUBLETerminalRuleCall_2_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__ThresholdAssignment_2_13305); 
             after(grammarAccess.getSplittingDescriptionAccess().getThresholdDOUBLETerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__SplittingDescription__ThresholdAssignment_2_1"


    // $ANTLR start "rule__SplittingDescription__SubmodelsAssignment_4"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1520:1: rule__SplittingDescription__SubmodelsAssignment_4 : ( ruleSubModel ) ;
    public final void rule__SplittingDescription__SubmodelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1524:1: ( ( ruleSubModel ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1525:1: ( ruleSubModel )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1525:1: ( ruleSubModel )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1526:1: ruleSubModel
            {
             before(grammarAccess.getSplittingDescriptionAccess().getSubmodelsSubModelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSubModel_in_rule__SplittingDescription__SubmodelsAssignment_43336);
            ruleSubModel();

            state._fsp--;

             after(grammarAccess.getSplittingDescriptionAccess().getSubmodelsSubModelParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SplittingDescription__SubmodelsAssignment_4"


    // $ANTLR start "rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1535:1: rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1539:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1540:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1540:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1541:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightGeneralizationDOUBLETerminalRuleCall_5_0_1_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_23367); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightGeneralizationDOUBLETerminalRuleCall_5_0_1_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2"


    // $ANTLR start "rule__SplittingDescription__WeightAggregationAssignment_5_1_2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1550:1: rule__SplittingDescription__WeightAggregationAssignment_5_1_2 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__WeightAggregationAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1554:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1555:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1555:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1556:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightAggregationDOUBLETerminalRuleCall_5_1_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightAggregationAssignment_5_1_23398); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightAggregationDOUBLETerminalRuleCall_5_1_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__WeightAggregationAssignment_5_1_2"


    // $ANTLR start "rule__SplittingDescription__WeightAssociationAssignment_5_2_2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1565:1: rule__SplittingDescription__WeightAssociationAssignment_5_2_2 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__WeightAssociationAssignment_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1569:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1570:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1570:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1571:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightAssociationDOUBLETerminalRuleCall_5_2_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightAssociationAssignment_5_2_23429); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightAssociationDOUBLETerminalRuleCall_5_2_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__WeightAssociationAssignment_5_2_2"


    // $ANTLR start "rule__SplittingDescription__WeightContainmentAssignment_5_3_2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1580:1: rule__SplittingDescription__WeightContainmentAssignment_5_3_2 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__WeightContainmentAssignment_5_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1584:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1585:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1585:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1586:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightContainmentDOUBLETerminalRuleCall_5_3_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightContainmentAssignment_5_3_23460); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightContainmentDOUBLETerminalRuleCall_5_3_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__WeightContainmentAssignment_5_3_2"


    // $ANTLR start "rule__SplittingDescription__WeightInterfaceAssignment_5_4_2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1595:1: rule__SplittingDescription__WeightInterfaceAssignment_5_4_2 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__WeightInterfaceAssignment_5_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1599:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1600:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1600:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1601:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightInterfaceDOUBLETerminalRuleCall_5_4_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightInterfaceAssignment_5_4_23491); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightInterfaceDOUBLETerminalRuleCall_5_4_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__WeightInterfaceAssignment_5_4_2"


    // $ANTLR start "rule__SplittingDescription__WeightEnumAssignment_5_5_2"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1610:1: rule__SplittingDescription__WeightEnumAssignment_5_5_2 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__WeightEnumAssignment_5_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1614:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1615:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1615:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1616:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getWeightEnumDOUBLETerminalRuleCall_5_5_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightEnumAssignment_5_5_23522); 
             after(grammarAccess.getSplittingDescriptionAccess().getWeightEnumDOUBLETerminalRuleCall_5_5_2_0()); 

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
    // $ANTLR end "rule__SplittingDescription__WeightEnumAssignment_5_5_2"


    // $ANTLR start "rule__SplittingDescription__AlphaAssignment_5_6_1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1625:1: rule__SplittingDescription__AlphaAssignment_5_6_1 : ( RULE_DOUBLE ) ;
    public final void rule__SplittingDescription__AlphaAssignment_5_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1629:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1630:1: ( RULE_DOUBLE )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1630:1: ( RULE_DOUBLE )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1631:1: RULE_DOUBLE
            {
             before(grammarAccess.getSplittingDescriptionAccess().getAlphaDOUBLETerminalRuleCall_5_6_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__AlphaAssignment_5_6_13553); 
             after(grammarAccess.getSplittingDescriptionAccess().getAlphaDOUBLETerminalRuleCall_5_6_1_0()); 

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
    // $ANTLR end "rule__SplittingDescription__AlphaAssignment_5_6_1"


    // $ANTLR start "rule__SubModel__NameAssignment_1"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1640:1: rule__SubModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1644:1: ( ( RULE_ID ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1645:1: ( RULE_ID )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1645:1: ( RULE_ID )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1646:1: RULE_ID
            {
             before(grammarAccess.getSubModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubModel__NameAssignment_13584); 
             after(grammarAccess.getSubModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SubModel__NameAssignment_1"


    // $ANTLR start "rule__SubModel__DescriptionAssignment_3"
    // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1655:1: rule__SubModel__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SubModel__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1659:1: ( ( RULE_STRING ) )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1660:1: ( RULE_STRING )
            {
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1660:1: ( RULE_STRING )
            // ../de.uni_marburg.splittr.description.ui/src-gen/de/uni_marburg/splittr/description/ui/contentassist/antlr/internal/InternalSplittingDescription.g:1661:1: RULE_STRING
            {
             before(grammarAccess.getSubModelAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SubModel__DescriptionAssignment_33615); 
             after(grammarAccess.getSubModelAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SubModel__DescriptionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSplittingDescription_in_entryRuleSplittingDescription61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplittingDescription68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__0_in_ruleSplittingDescription94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubModel_in_entryRuleSubModel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubModel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__Group__0_in_ruleSubModel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__0__Impl_in_rule__SplittingDescription__Group__0188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__1_in_rule__SplittingDescription__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SplittingDescription__Group__0__Impl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__1__Impl_in_rule__SplittingDescription__Group__1250 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__2_in_rule__SplittingDescription__Group__1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__ModelLocationAssignment_1_in_rule__SplittingDescription__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__2__Impl_in_rule__SplittingDescription__Group__2310 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__3_in_rule__SplittingDescription__Group__2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_2__0_in_rule__SplittingDescription__Group__2__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__3__Impl_in_rule__SplittingDescription__Group__3371 = new BitSet(new long[]{0x0000000001FC8000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__4_in_rule__SplittingDescription__Group__3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SplittingDescription__Group__3__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__4__Impl_in_rule__SplittingDescription__Group__4433 = new BitSet(new long[]{0x0000000001FC8000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__5_in_rule__SplittingDescription__Group__4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__SubmodelsAssignment_4_in_rule__SplittingDescription__Group__4__Impl463 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group__5__Impl_in_rule__SplittingDescription__Group__5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5_in_rule__SplittingDescription__Group__5__Impl521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_2__0__Impl_in_rule__SplittingDescription__Group_2__0564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_2__1_in_rule__SplittingDescription__Group_2__0567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SplittingDescription__Group_2__0__Impl595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_2__1__Impl_in_rule__SplittingDescription__Group_2__1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__ThresholdAssignment_2_1_in_rule__SplittingDescription__Group_2__1__Impl653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0__0__Impl_in_rule__SplittingDescription__Group_5_0__0687 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0__1_in_rule__SplittingDescription__Group_5_0__0690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SplittingDescription__Group_5_0__0__Impl718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0__1__Impl_in_rule__SplittingDescription__Group_5_0__1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0_1__0_in_rule__SplittingDescription__Group_5_0__1__Impl776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0_1__0__Impl_in_rule__SplittingDescription__Group_5_0_1__0811 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0_1__1_in_rule__SplittingDescription__Group_5_0_1__0814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SplittingDescription__Group_5_0_1__0__Impl842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0_1__1__Impl_in_rule__SplittingDescription__Group_5_0_1__1873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0_1__2_in_rule__SplittingDescription__Group_5_0_1__1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SplittingDescription__Group_5_0_1__1__Impl904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0_1__2__Impl_in_rule__SplittingDescription__Group_5_0_1__2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_2_in_rule__SplittingDescription__Group_5_0_1__2__Impl962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_1__0__Impl_in_rule__SplittingDescription__Group_5_1__0998 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_1__1_in_rule__SplittingDescription__Group_5_1__01001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SplittingDescription__Group_5_1__0__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_1__1__Impl_in_rule__SplittingDescription__Group_5_1__11060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_1__2_in_rule__SplittingDescription__Group_5_1__11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SplittingDescription__Group_5_1__1__Impl1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_1__2__Impl_in_rule__SplittingDescription__Group_5_1__21122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__WeightAggregationAssignment_5_1_2_in_rule__SplittingDescription__Group_5_1__2__Impl1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_2__0__Impl_in_rule__SplittingDescription__Group_5_2__01185 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_2__1_in_rule__SplittingDescription__Group_5_2__01188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SplittingDescription__Group_5_2__0__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_2__1__Impl_in_rule__SplittingDescription__Group_5_2__11247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_2__2_in_rule__SplittingDescription__Group_5_2__11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SplittingDescription__Group_5_2__1__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_2__2__Impl_in_rule__SplittingDescription__Group_5_2__21309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__WeightAssociationAssignment_5_2_2_in_rule__SplittingDescription__Group_5_2__2__Impl1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_3__0__Impl_in_rule__SplittingDescription__Group_5_3__01372 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_3__1_in_rule__SplittingDescription__Group_5_3__01375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SplittingDescription__Group_5_3__0__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_3__1__Impl_in_rule__SplittingDescription__Group_5_3__11434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_3__2_in_rule__SplittingDescription__Group_5_3__11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SplittingDescription__Group_5_3__1__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_3__2__Impl_in_rule__SplittingDescription__Group_5_3__21496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__WeightContainmentAssignment_5_3_2_in_rule__SplittingDescription__Group_5_3__2__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_4__0__Impl_in_rule__SplittingDescription__Group_5_4__01559 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_4__1_in_rule__SplittingDescription__Group_5_4__01562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SplittingDescription__Group_5_4__0__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_4__1__Impl_in_rule__SplittingDescription__Group_5_4__11621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_4__2_in_rule__SplittingDescription__Group_5_4__11624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SplittingDescription__Group_5_4__1__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_4__2__Impl_in_rule__SplittingDescription__Group_5_4__21683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__WeightInterfaceAssignment_5_4_2_in_rule__SplittingDescription__Group_5_4__2__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_5__0__Impl_in_rule__SplittingDescription__Group_5_5__01746 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_5__1_in_rule__SplittingDescription__Group_5_5__01749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SplittingDescription__Group_5_5__0__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_5__1__Impl_in_rule__SplittingDescription__Group_5_5__11808 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_5__2_in_rule__SplittingDescription__Group_5_5__11811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SplittingDescription__Group_5_5__1__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_5__2__Impl_in_rule__SplittingDescription__Group_5_5__21870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__WeightEnumAssignment_5_5_2_in_rule__SplittingDescription__Group_5_5__2__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_6__0__Impl_in_rule__SplittingDescription__Group_5_6__01933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_6__1_in_rule__SplittingDescription__Group_5_6__01936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SplittingDescription__Group_5_6__0__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_6__1__Impl_in_rule__SplittingDescription__Group_5_6__11995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__AlphaAssignment_5_6_1_in_rule__SplittingDescription__Group_5_6__1__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__Group__0__Impl_in_rule__SubModel__Group__02056 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SubModel__Group__1_in_rule__SubModel__Group__02059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SubModel__Group__0__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__Group__1__Impl_in_rule__SubModel__Group__12118 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SubModel__Group__2_in_rule__SubModel__Group__12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__NameAssignment_1_in_rule__SubModel__Group__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__Group__2__Impl_in_rule__SubModel__Group__22178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubModel__Group__3_in_rule__SubModel__Group__22181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SubModel__Group__2__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__Group__3__Impl_in_rule__SubModel__Group__32240 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SubModel__Group__4_in_rule__SubModel__Group__32243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__DescriptionAssignment_3_in_rule__SubModel__Group__3__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubModel__Group__4__Impl_in_rule__SubModel__Group__42300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SubModel__Group__4__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__0_in_rule__SplittingDescription__UnorderedGroup_52370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_0__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_1__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_2__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_3__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_4__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_5__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__Group_5_6__0_in_rule__SplittingDescription__UnorderedGroup_5__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__03064 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__1_in_rule__SplittingDescription__UnorderedGroup_5__03067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__13092 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__2_in_rule__SplittingDescription__UnorderedGroup_5__13095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__23120 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__3_in_rule__SplittingDescription__UnorderedGroup_5__23123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__33148 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__4_in_rule__SplittingDescription__UnorderedGroup_5__33151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__43176 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__5_in_rule__SplittingDescription__UnorderedGroup_5__43179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__53204 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__6_in_rule__SplittingDescription__UnorderedGroup_5__53207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplittingDescription__UnorderedGroup_5__Impl_in_rule__SplittingDescription__UnorderedGroup_5__63232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SplittingDescription__ModelLocationAssignment_13274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__ThresholdAssignment_2_13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubModel_in_rule__SplittingDescription__SubmodelsAssignment_43336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightGeneralizationAssignment_5_0_1_23367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightAggregationAssignment_5_1_23398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightAssociationAssignment_5_2_23429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightContainmentAssignment_5_3_23460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightInterfaceAssignment_5_4_23491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__WeightEnumAssignment_5_5_23522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SplittingDescription__AlphaAssignment_5_6_13553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubModel__NameAssignment_13584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SubModel__DescriptionAssignment_33615 = new BitSet(new long[]{0x0000000000000002L});

}
