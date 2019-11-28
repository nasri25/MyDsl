package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'school'", "'{'", "'}'", "'student'", "'registrationNum'", "','", "'teacher'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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
        	return "SchoolModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchoolModel"
    // InternalMyDsl.g:64:1: entryRuleSchoolModel returns [EObject current=null] : iv_ruleSchoolModel= ruleSchoolModel EOF ;
    public final EObject entryRuleSchoolModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchoolModel = null;


        try {
            // InternalMyDsl.g:64:52: (iv_ruleSchoolModel= ruleSchoolModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleSchoolModel= ruleSchoolModel EOF
            {
             newCompositeNode(grammarAccess.getSchoolModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchoolModel=ruleSchoolModel();

            state._fsp--;

             current =iv_ruleSchoolModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchoolModel"


    // $ANTLR start "ruleSchoolModel"
    // InternalMyDsl.g:71:1: ruleSchoolModel returns [EObject current=null] : ( (lv_schools_0_0= ruleSchool ) )* ;
    public final EObject ruleSchoolModel() throws RecognitionException {
        EObject current = null;

        EObject lv_schools_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_schools_0_0= ruleSchool ) )* )
            // InternalMyDsl.g:78:2: ( (lv_schools_0_0= ruleSchool ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_schools_0_0= ruleSchool ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_schools_0_0= ruleSchool )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_schools_0_0= ruleSchool )
            	    // InternalMyDsl.g:80:4: lv_schools_0_0= ruleSchool
            	    {

            	    				newCompositeNode(grammarAccess.getSchoolModelAccess().getSchoolsSchoolParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_schools_0_0=ruleSchool();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSchoolModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"schools",
            	    					lv_schools_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.School");
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
    // $ANTLR end "ruleSchoolModel"


    // $ANTLR start "entryRuleSchool"
    // InternalMyDsl.g:100:1: entryRuleSchool returns [EObject current=null] : iv_ruleSchool= ruleSchool EOF ;
    public final EObject entryRuleSchool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchool = null;


        try {
            // InternalMyDsl.g:100:47: (iv_ruleSchool= ruleSchool EOF )
            // InternalMyDsl.g:101:2: iv_ruleSchool= ruleSchool EOF
            {
             newCompositeNode(grammarAccess.getSchoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchool=ruleSchool();

            state._fsp--;

             current =iv_ruleSchool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchool"


    // $ANTLR start "ruleSchool"
    // InternalMyDsl.g:107:1: ruleSchool returns [EObject current=null] : (otherlv_0= 'school' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* otherlv_4= '}' ) ;
    public final EObject ruleSchool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_persons_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'school' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'school' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'school' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* otherlv_4= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'school' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchoolAccess().getSchoolKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSchoolAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchoolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:141:3: ( (lv_persons_3_0= rulePerson ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:142:4: (lv_persons_3_0= rulePerson )
            	    {
            	    // InternalMyDsl.g:142:4: (lv_persons_3_0= rulePerson )
            	    // InternalMyDsl.g:143:5: lv_persons_3_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getSchoolAccess().getPersonsPersonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_persons_3_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchoolRule());
            	    					}
            	    					add(
            	    						current,
            	    						"persons",
            	    						lv_persons_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSchool"


    // $ANTLR start "entryRulePerson"
    // InternalMyDsl.g:168:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalMyDsl.g:168:47: (iv_rulePerson= rulePerson EOF )
            // InternalMyDsl.g:169:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalMyDsl.g:175:1: rulePerson returns [EObject current=null] : (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Student_0 = null;

        EObject this_Teacher_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:181:2: ( (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher ) )
            // InternalMyDsl.g:182:2: (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher )
            {
            // InternalMyDsl.g:182:2: (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:183:3: this_Student_0= ruleStudent
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getStudentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Student_0=ruleStudent();

                    state._fsp--;


                    			current = this_Student_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:192:3: this_Teacher_1= ruleTeacher
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getTeacherParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teacher_1=ruleTeacher();

                    state._fsp--;


                    			current = this_Teacher_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleStudent"
    // InternalMyDsl.g:204:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalMyDsl.g:204:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalMyDsl.g:205:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalMyDsl.g:211:1: ruleStudent returns [EObject current=null] : (otherlv_0= 'student' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'registrationNum' ( (lv_registrationNum_3_0= RULE_INT ) ) (otherlv_4= '{' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_registrationNum_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:217:2: ( (otherlv_0= 'student' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'registrationNum' ( (lv_registrationNum_3_0= RULE_INT ) ) (otherlv_4= '{' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* otherlv_8= '}' )? ) )
            // InternalMyDsl.g:218:2: (otherlv_0= 'student' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'registrationNum' ( (lv_registrationNum_3_0= RULE_INT ) ) (otherlv_4= '{' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* otherlv_8= '}' )? )
            {
            // InternalMyDsl.g:218:2: (otherlv_0= 'student' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'registrationNum' ( (lv_registrationNum_3_0= RULE_INT ) ) (otherlv_4= '{' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* otherlv_8= '}' )? )
            // InternalMyDsl.g:219:3: otherlv_0= 'student' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'registrationNum' ( (lv_registrationNum_3_0= RULE_INT ) ) (otherlv_4= '{' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStudentAccess().getStudentKeyword_0());
            		
            // InternalMyDsl.g:223:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:224:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:224:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:225:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getStudentAccess().getRegistrationNumKeyword_2());
            		
            // InternalMyDsl.g:245:3: ( (lv_registrationNum_3_0= RULE_INT ) )
            // InternalMyDsl.g:246:4: (lv_registrationNum_3_0= RULE_INT )
            {
            // InternalMyDsl.g:246:4: (lv_registrationNum_3_0= RULE_INT )
            // InternalMyDsl.g:247:5: lv_registrationNum_3_0= RULE_INT
            {
            lv_registrationNum_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_registrationNum_3_0, grammarAccess.getStudentAccess().getRegistrationNumINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStudentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"registrationNum",
            						lv_registrationNum_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:263:3: (otherlv_4= '{' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:264:4: otherlv_4= '{' ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalMyDsl.g:268:4: ( (otherlv_5= RULE_STRING ) )
                    // InternalMyDsl.g:269:5: (otherlv_5= RULE_STRING )
                    {
                    // InternalMyDsl.g:269:5: (otherlv_5= RULE_STRING )
                    // InternalMyDsl.g:270:6: otherlv_5= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStudentRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getTeachersTeacherCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:281:4: (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:282:5: otherlv_6= ',' ( (otherlv_7= RULE_STRING ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getStudentAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:286:5: ( (otherlv_7= RULE_STRING ) )
                    	    // InternalMyDsl.g:287:6: (otherlv_7= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:287:6: (otherlv_7= RULE_STRING )
                    	    // InternalMyDsl.g:288:7: otherlv_7= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStudentRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getTeachersTeacherCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleTeacher"
    // InternalMyDsl.g:309:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalMyDsl.g:309:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalMyDsl.g:310:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalMyDsl.g:316:1: ruleTeacher returns [EObject current=null] : (otherlv_0= 'teacher' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:322:2: ( (otherlv_0= 'teacher' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:323:2: (otherlv_0= 'teacher' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:323:2: (otherlv_0= 'teacher' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:324:3: otherlv_0= 'teacher' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTeacherAccess().getTeacherKeyword_0());
            		
            // InternalMyDsl.g:328:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:329:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:329:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:330:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeacherRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTeacher"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000012000L});

}