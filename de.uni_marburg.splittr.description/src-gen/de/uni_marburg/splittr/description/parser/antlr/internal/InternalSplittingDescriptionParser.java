package de.uni_marburg.splittr.description.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

import de.uni_marburg.splittr.description.services.SplittingDescriptionGrammarAccess;

@SuppressWarnings("all")
public class InternalSplittingDescriptionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOUBLE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'split model'", "'partially with threshold'", "'into'", "'fine-tune'", "'weight of generalization'", "'='", "'weight of aggregation'", "'weight of association'", "'weight of containment'", "'weight of interface realization'", "'weight of enum instantiation'", "'alpha = '", "'sub-model'", "'{'", "'}'"
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
    public String getGrammarFileName() { return "../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g"; }



     	private SplittingDescriptionGrammarAccess grammarAccess;
     	
        public InternalSplittingDescriptionParser(TokenStream input, SplittingDescriptionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SplittingDescription";	
       	}
       	
       	@Override
       	protected SplittingDescriptionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSplittingDescription"
    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:67:1: entryRuleSplittingDescription returns [EObject current=null] : iv_ruleSplittingDescription= ruleSplittingDescription EOF ;
    public final EObject entryRuleSplittingDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplittingDescription = null;


        try {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:68:2: (iv_ruleSplittingDescription= ruleSplittingDescription EOF )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:69:2: iv_ruleSplittingDescription= ruleSplittingDescription EOF
            {
             newCompositeNode(grammarAccess.getSplittingDescriptionRule()); 
            pushFollow(FOLLOW_ruleSplittingDescription_in_entryRuleSplittingDescription75);
            iv_ruleSplittingDescription=ruleSplittingDescription();

            state._fsp--;

             current =iv_ruleSplittingDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplittingDescription85); 

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
    // $ANTLR end "entryRuleSplittingDescription"


    // $ANTLR start "ruleSplittingDescription"
    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:76:1: ruleSplittingDescription returns [EObject current=null] : (otherlv_0= 'split model' ( (lv_modelLocation_1_0= RULE_STRING ) ) (otherlv_2= 'partially with threshold' ( (lv_threshold_3_0= RULE_DOUBLE ) ) )? otherlv_4= 'into' ( (lv_submodels_5_0= ruleSubModel ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleSplittingDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_modelLocation_1_0=null;
        Token otherlv_2=null;
        Token lv_threshold_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_weightGeneralization_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_weightAggregation_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_weightAssociation_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_weightContainment_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_weightInterface_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_weightEnum_25_0=null;
        Token otherlv_26=null;
        Token lv_alpha_27_0=null;
        EObject lv_submodels_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:79:28: ( (otherlv_0= 'split model' ( (lv_modelLocation_1_0= RULE_STRING ) ) (otherlv_2= 'partially with threshold' ( (lv_threshold_3_0= RULE_DOUBLE ) ) )? otherlv_4= 'into' ( (lv_submodels_5_0= ruleSubModel ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) ) )? ) )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:80:1: (otherlv_0= 'split model' ( (lv_modelLocation_1_0= RULE_STRING ) ) (otherlv_2= 'partially with threshold' ( (lv_threshold_3_0= RULE_DOUBLE ) ) )? otherlv_4= 'into' ( (lv_submodels_5_0= ruleSubModel ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) ) )? )
            {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:80:1: (otherlv_0= 'split model' ( (lv_modelLocation_1_0= RULE_STRING ) ) (otherlv_2= 'partially with threshold' ( (lv_threshold_3_0= RULE_DOUBLE ) ) )? otherlv_4= 'into' ( (lv_submodels_5_0= ruleSubModel ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) ) )? )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:80:3: otherlv_0= 'split model' ( (lv_modelLocation_1_0= RULE_STRING ) ) (otherlv_2= 'partially with threshold' ( (lv_threshold_3_0= RULE_DOUBLE ) ) )? otherlv_4= 'into' ( (lv_submodels_5_0= ruleSubModel ) )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSplittingDescription122); 

                	newLeafNode(otherlv_0, grammarAccess.getSplittingDescriptionAccess().getSplitModelKeyword_0());
                
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:84:1: ( (lv_modelLocation_1_0= RULE_STRING ) )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:85:1: (lv_modelLocation_1_0= RULE_STRING )
            {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:85:1: (lv_modelLocation_1_0= RULE_STRING )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:86:3: lv_modelLocation_1_0= RULE_STRING
            {
            lv_modelLocation_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSplittingDescription139); 

            			newLeafNode(lv_modelLocation_1_0, grammarAccess.getSplittingDescriptionAccess().getModelLocationSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modelLocation",
                    		lv_modelLocation_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:102:2: (otherlv_2= 'partially with threshold' ( (lv_threshold_3_0= RULE_DOUBLE ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:102:4: otherlv_2= 'partially with threshold' ( (lv_threshold_3_0= RULE_DOUBLE ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSplittingDescription157); 

                        	newLeafNode(otherlv_2, grammarAccess.getSplittingDescriptionAccess().getPartiallyWithThresholdKeyword_2_0());
                        
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:106:1: ( (lv_threshold_3_0= RULE_DOUBLE ) )
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:107:1: (lv_threshold_3_0= RULE_DOUBLE )
                    {
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:107:1: (lv_threshold_3_0= RULE_DOUBLE )
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:108:3: lv_threshold_3_0= RULE_DOUBLE
                    {
                    lv_threshold_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription174); 

                    			newLeafNode(lv_threshold_3_0, grammarAccess.getSplittingDescriptionAccess().getThresholdDOUBLETerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"threshold",
                            		lv_threshold_3_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSplittingDescription193); 

                	newLeafNode(otherlv_4, grammarAccess.getSplittingDescriptionAccess().getIntoKeyword_3());
                
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:128:1: ( (lv_submodels_5_0= ruleSubModel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:129:1: (lv_submodels_5_0= ruleSubModel )
            	    {
            	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:129:1: (lv_submodels_5_0= ruleSubModel )
            	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:130:3: lv_submodels_5_0= ruleSubModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSplittingDescriptionAccess().getSubmodelsSubModelParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubModel_in_ruleSplittingDescription214);
            	    lv_submodels_5_0=ruleSubModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSplittingDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"submodels",
            	            		lv_submodels_5_0, 
            	            		"SubModel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:146:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15||(LA5_0>=18 && LA5_0<=23)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:148:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) )
                    {
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:148:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?) )
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:149:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:152:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?)
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:153:3: ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+ {...}?
                    {
                    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:153:3: ( ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=8;
                        int LA4_0 = input.LA(1);

                        if ( LA4_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                            alt4=1;
                        }
                        else if ( LA4_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                            alt4=2;
                        }
                        else if ( LA4_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                            alt4=3;
                        }
                        else if ( LA4_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                            alt4=4;
                        }
                        else if ( LA4_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                            alt4=5;
                        }
                        else if ( LA4_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                            alt4=6;
                        }
                        else if ( LA4_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                            alt4=7;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:155:4: ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:155:4: ({...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:156:5: {...}? => ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0)");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:156:117: ( ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:157:6: ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 0);
                    	    	 				
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:160:6: ({...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:160:7: {...}? => (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "true");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:160:16: (otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )? )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:160:18: otherlv_7= 'fine-tune' (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )?
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSplittingDescription273); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSplittingDescriptionAccess().getFineTuneKeyword_5_0_0());
                    	        
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:164:1: (otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) ) )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==16) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:164:3: otherlv_8= 'weight of generalization' otherlv_9= '=' ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) )
                    	            {
                    	            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleSplittingDescription286); 

                    	                	newLeafNode(otherlv_8, grammarAccess.getSplittingDescriptionAccess().getWeightOfGeneralizationKeyword_5_0_1_0());
                    	                
                    	            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleSplittingDescription298); 

                    	                	newLeafNode(otherlv_9, grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_0_1_1());
                    	                
                    	            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:172:1: ( (lv_weightGeneralization_10_0= RULE_DOUBLE ) )
                    	            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:173:1: (lv_weightGeneralization_10_0= RULE_DOUBLE )
                    	            {
                    	            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:173:1: (lv_weightGeneralization_10_0= RULE_DOUBLE )
                    	            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:174:3: lv_weightGeneralization_10_0= RULE_DOUBLE
                    	            {
                    	            lv_weightGeneralization_10_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription315); 

                    	            			newLeafNode(lv_weightGeneralization_10_0, grammarAccess.getSplittingDescriptionAccess().getWeightGeneralizationDOUBLETerminalRuleCall_5_0_1_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"weightGeneralization",
                    	                    		lv_weightGeneralization_10_0, 
                    	                    		"DOUBLE");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:197:4: ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:197:4: ({...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:198:5: {...}? => ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1)");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:198:117: ( ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:199:6: ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 1);
                    	    	 				
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:202:6: ({...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:202:7: {...}? => (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "true");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:202:16: (otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:202:18: otherlv_11= 'weight of aggregation' otherlv_12= '=' ( (lv_weightAggregation_13_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleSplittingDescription390); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getSplittingDescriptionAccess().getWeightOfAggregationKeyword_5_1_0());
                    	        
                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleSplittingDescription402); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_1_1());
                    	        
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:210:1: ( (lv_weightAggregation_13_0= RULE_DOUBLE ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:211:1: (lv_weightAggregation_13_0= RULE_DOUBLE )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:211:1: (lv_weightAggregation_13_0= RULE_DOUBLE )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:212:3: lv_weightAggregation_13_0= RULE_DOUBLE
                    	    {
                    	    lv_weightAggregation_13_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription419); 

                    	    			newLeafNode(lv_weightAggregation_13_0, grammarAccess.getSplittingDescriptionAccess().getWeightAggregationDOUBLETerminalRuleCall_5_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"weightAggregation",
                    	            		lv_weightAggregation_13_0, 
                    	            		"DOUBLE");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:235:4: ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:235:4: ({...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:236:5: {...}? => ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2)");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:236:117: ( ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:237:6: ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 2);
                    	    	 				
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:240:6: ({...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:240:7: {...}? => (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "true");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:240:16: (otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:240:18: otherlv_14= 'weight of association' otherlv_15= '=' ( (lv_weightAssociation_16_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleSplittingDescription492); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSplittingDescriptionAccess().getWeightOfAssociationKeyword_5_2_0());
                    	        
                    	    otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleSplittingDescription504); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_2_1());
                    	        
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:248:1: ( (lv_weightAssociation_16_0= RULE_DOUBLE ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:249:1: (lv_weightAssociation_16_0= RULE_DOUBLE )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:249:1: (lv_weightAssociation_16_0= RULE_DOUBLE )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:250:3: lv_weightAssociation_16_0= RULE_DOUBLE
                    	    {
                    	    lv_weightAssociation_16_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription521); 

                    	    			newLeafNode(lv_weightAssociation_16_0, grammarAccess.getSplittingDescriptionAccess().getWeightAssociationDOUBLETerminalRuleCall_5_2_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"weightAssociation",
                    	            		lv_weightAssociation_16_0, 
                    	            		"DOUBLE");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:273:4: ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:273:4: ({...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:274:5: {...}? => ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3)");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:274:117: ( ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:275:6: ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 3);
                    	    	 				
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:278:6: ({...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:278:7: {...}? => (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "true");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:278:16: (otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:278:18: otherlv_17= 'weight of containment' otherlv_18= '=' ( (lv_weightContainment_19_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleSplittingDescription594); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getSplittingDescriptionAccess().getWeightOfContainmentKeyword_5_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleSplittingDescription606); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_3_1());
                    	        
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:286:1: ( (lv_weightContainment_19_0= RULE_DOUBLE ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:287:1: (lv_weightContainment_19_0= RULE_DOUBLE )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:287:1: (lv_weightContainment_19_0= RULE_DOUBLE )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:288:3: lv_weightContainment_19_0= RULE_DOUBLE
                    	    {
                    	    lv_weightContainment_19_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription623); 

                    	    			newLeafNode(lv_weightContainment_19_0, grammarAccess.getSplittingDescriptionAccess().getWeightContainmentDOUBLETerminalRuleCall_5_3_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"weightContainment",
                    	            		lv_weightContainment_19_0, 
                    	            		"DOUBLE");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:311:4: ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:311:4: ({...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:312:5: {...}? => ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4)");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:312:117: ( ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:313:6: ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 4);
                    	    	 				
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:316:6: ({...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:316:7: {...}? => (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "true");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:316:16: (otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:316:18: otherlv_20= 'weight of interface realization' otherlv_21= '=' ( (lv_weightInterface_22_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleSplittingDescription696); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getSplittingDescriptionAccess().getWeightOfInterfaceRealizationKeyword_5_4_0());
                    	        
                    	    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleSplittingDescription708); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_4_1());
                    	        
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:324:1: ( (lv_weightInterface_22_0= RULE_DOUBLE ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:325:1: (lv_weightInterface_22_0= RULE_DOUBLE )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:325:1: (lv_weightInterface_22_0= RULE_DOUBLE )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:326:3: lv_weightInterface_22_0= RULE_DOUBLE
                    	    {
                    	    lv_weightInterface_22_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription725); 

                    	    			newLeafNode(lv_weightInterface_22_0, grammarAccess.getSplittingDescriptionAccess().getWeightInterfaceDOUBLETerminalRuleCall_5_4_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"weightInterface",
                    	            		lv_weightInterface_22_0, 
                    	            		"DOUBLE");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:349:4: ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:349:4: ({...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:350:5: {...}? => ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5)");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:350:117: ( ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:351:6: ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 5);
                    	    	 				
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:354:6: ({...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:354:7: {...}? => (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "true");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:354:16: (otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:354:18: otherlv_23= 'weight of enum instantiation' otherlv_24= '=' ( (lv_weightEnum_25_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_23=(Token)match(input,22,FOLLOW_22_in_ruleSplittingDescription798); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getSplittingDescriptionAccess().getWeightOfEnumInstantiationKeyword_5_5_0());
                    	        
                    	    otherlv_24=(Token)match(input,17,FOLLOW_17_in_ruleSplittingDescription810); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getSplittingDescriptionAccess().getEqualsSignKeyword_5_5_1());
                    	        
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:362:1: ( (lv_weightEnum_25_0= RULE_DOUBLE ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:363:1: (lv_weightEnum_25_0= RULE_DOUBLE )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:363:1: (lv_weightEnum_25_0= RULE_DOUBLE )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:364:3: lv_weightEnum_25_0= RULE_DOUBLE
                    	    {
                    	    lv_weightEnum_25_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription827); 

                    	    			newLeafNode(lv_weightEnum_25_0, grammarAccess.getSplittingDescriptionAccess().getWeightEnumDOUBLETerminalRuleCall_5_5_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"weightEnum",
                    	            		lv_weightEnum_25_0, 
                    	            		"DOUBLE");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:387:4: ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:387:4: ({...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:388:5: {...}? => ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6)");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:388:117: ( ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:389:6: ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5(), 6);
                    	    	 				
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:392:6: ({...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:392:7: {...}? => (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSplittingDescription", "true");
                    	    }
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:392:16: (otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:392:18: otherlv_26= 'alpha = ' ( (lv_alpha_27_0= RULE_DOUBLE ) )
                    	    {
                    	    otherlv_26=(Token)match(input,23,FOLLOW_23_in_ruleSplittingDescription900); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getSplittingDescriptionAccess().getAlphaKeyword_5_6_0());
                    	        
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:396:1: ( (lv_alpha_27_0= RULE_DOUBLE ) )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:397:1: (lv_alpha_27_0= RULE_DOUBLE )
                    	    {
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:397:1: (lv_alpha_27_0= RULE_DOUBLE )
                    	    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:398:3: lv_alpha_27_0= RULE_DOUBLE
                    	    {
                    	    lv_alpha_27_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription917); 

                    	    			newLeafNode(lv_alpha_27_0, grammarAccess.getSplittingDescriptionAccess().getAlphaDOUBLETerminalRuleCall_5_6_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSplittingDescriptionRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"alpha",
                    	            		lv_alpha_27_0, 
                    	            		"DOUBLE");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5()) ) {
                        throw new FailedPredicateException(input, "ruleSplittingDescription", "getUnorderedGroupHelper().canLeave(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5())");
                    }

                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getSplittingDescriptionAccess().getUnorderedGroup_5());
                    	

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
    // $ANTLR end "ruleSplittingDescription"


    // $ANTLR start "entryRuleSubModel"
    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:437:1: entryRuleSubModel returns [EObject current=null] : iv_ruleSubModel= ruleSubModel EOF ;
    public final EObject entryRuleSubModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubModel = null;


        try {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:438:2: (iv_ruleSubModel= ruleSubModel EOF )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:439:2: iv_ruleSubModel= ruleSubModel EOF
            {
             newCompositeNode(grammarAccess.getSubModelRule()); 
            pushFollow(FOLLOW_ruleSubModel_in_entryRuleSubModel1006);
            iv_ruleSubModel=ruleSubModel();

            state._fsp--;

             current =iv_ruleSubModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubModel1016); 

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
    // $ANTLR end "entryRuleSubModel"


    // $ANTLR start "ruleSubModel"
    // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:446:1: ruleSubModel returns [EObject current=null] : (otherlv_0= 'sub-model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleSubModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:449:28: ( (otherlv_0= 'sub-model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:450:1: (otherlv_0= 'sub-model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:450:1: (otherlv_0= 'sub-model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:450:3: otherlv_0= 'sub-model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSubModel1053); 

                	newLeafNode(otherlv_0, grammarAccess.getSubModelAccess().getSubModelKeyword_0());
                
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:454:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:455:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:455:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:456:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubModel1070); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSubModel1087); 

                	newLeafNode(otherlv_2, grammarAccess.getSubModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:476:1: ( (lv_description_3_0= RULE_STRING ) )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:477:1: (lv_description_3_0= RULE_STRING )
            {
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:477:1: (lv_description_3_0= RULE_STRING )
            // ../de.uni_marburg.splittr.description/src-gen/de/uni_marburg/splittr/description/parser/antlr/internal/InternalSplittingDescription.g:478:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSubModel1104); 

            			newLeafNode(lv_description_3_0, grammarAccess.getSubModelAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleSubModel1121); 

                	newLeafNode(otherlv_4, grammarAccess.getSubModelAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSubModel"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSplittingDescription_in_entryRuleSplittingDescription75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplittingDescription85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSplittingDescription122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSplittingDescription139 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSplittingDescription157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSplittingDescription193 = new BitSet(new long[]{0x0000000001FC8002L});
    public static final BitSet FOLLOW_ruleSubModel_in_ruleSplittingDescription214 = new BitSet(new long[]{0x0000000001FC8002L});
    public static final BitSet FOLLOW_15_in_ruleSplittingDescription273 = new BitSet(new long[]{0x0000000000FD8002L});
    public static final BitSet FOLLOW_16_in_ruleSplittingDescription286 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSplittingDescription298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription315 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_18_in_ruleSplittingDescription390 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSplittingDescription402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription419 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_19_in_ruleSplittingDescription492 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSplittingDescription504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription521 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_20_in_ruleSplittingDescription594 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSplittingDescription606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription623 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_21_in_ruleSplittingDescription696 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSplittingDescription708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription725 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_22_in_ruleSplittingDescription798 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSplittingDescription810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription827 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_23_in_ruleSplittingDescription900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSplittingDescription917 = new BitSet(new long[]{0x0000000000FC8002L});
    public static final BitSet FOLLOW_ruleSubModel_in_entryRuleSubModel1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubModel1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSubModel1053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubModel1070 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSubModel1087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSubModel1104 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSubModel1121 = new BitSet(new long[]{0x0000000000000002L});

}
