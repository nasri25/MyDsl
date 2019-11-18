package org.eclipse.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eigenschaft'", "'extends'", "'{'", "'}'", "'[]'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_eigenschaften_0_0= ruleEigenschaft ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_eigenschaften_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_eigenschaften_0_0= ruleEigenschaft ) )* )
            // InternalMyDsl.g:78:2: ( (lv_eigenschaften_0_0= ruleEigenschaft ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_eigenschaften_0_0= ruleEigenschaft ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_eigenschaften_0_0= ruleEigenschaft )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_eigenschaften_0_0= ruleEigenschaft )
            	    // InternalMyDsl.g:80:4: lv_eigenschaften_0_0= ruleEigenschaft
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEigenschaftenEigenschaftParserRuleCall_0());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_eigenschaften_0_0=ruleEigenschaft();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"eigenschaften",
            	    					lv_eigenschaften_0_0,
            	    					"org.eclipse.mydsl.MyDsl.Eigenschaft");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleEigenschaft"
    // InternalMyDsl.g:100:1: entryRuleEigenschaft returns [EObject current=null] : iv_ruleEigenschaft= ruleEigenschaft EOF ;
    public final EObject entryRuleEigenschaft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEigenschaft = null;


        try {
            // InternalMyDsl.g:100:52: (iv_ruleEigenschaft= ruleEigenschaft EOF )
            // InternalMyDsl.g:101:2: iv_ruleEigenschaft= ruleEigenschaft EOF
            {
             newCompositeNode(grammarAccess.getEigenschaftRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEigenschaft=ruleEigenschaft();

            state._fsp--;

             current =iv_ruleEigenschaft; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEigenschaft"


    // $ANTLR start "ruleEigenschaft"
    // InternalMyDsl.g:107:1: ruleEigenschaft returns [EObject current=null] : (otherlv_0= 'eigenschaft' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleEigenschaft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'eigenschaft' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'eigenschaft' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'eigenschaft' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'eigenschaft' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEigenschaftAccess().getEigenschaftKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEigenschaftAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEigenschaftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:137:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:138:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEigenschaftAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMyDsl.g:142:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:143:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:143:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:144:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEigenschaftRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEigenschaftAccess().getSuperTypeEigenschaftCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEigenschaftAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:160:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:161:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:161:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalMyDsl.g:162:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEigenschaftAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEigenschaftRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"org.eclipse.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEigenschaftAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEigenschaft"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:187:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:187:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:188:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:194:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:200:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalMyDsl.g:201:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalMyDsl.g:201:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalMyDsl.g:202:3: ( (otherlv_0= RULE_ID ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalMyDsl.g:202:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:203:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:203:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:204:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getTypeEigenschaftCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:215:3: ( (lv_array_1_0= '[]' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:216:4: (lv_array_1_0= '[]' )
                    {
                    // InternalMyDsl.g:216:4: (lv_array_1_0= '[]' )
                    // InternalMyDsl.g:217:5: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,15,FollowSets000.FOLLOW_4); 

                    					newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "array", true, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:229:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:230:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:230:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:231:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    }


}