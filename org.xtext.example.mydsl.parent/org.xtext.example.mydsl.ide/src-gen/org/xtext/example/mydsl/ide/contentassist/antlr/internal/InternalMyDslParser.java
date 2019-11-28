package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSchoolModel"
    // InternalMyDsl.g:53:1: entryRuleSchoolModel : ruleSchoolModel EOF ;
    public final void entryRuleSchoolModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleSchoolModel EOF )
            // InternalMyDsl.g:55:1: ruleSchoolModel EOF
            {
             before(grammarAccess.getSchoolModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSchoolModel();

            state._fsp--;

             after(grammarAccess.getSchoolModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchoolModel"


    // $ANTLR start "ruleSchoolModel"
    // InternalMyDsl.g:62:1: ruleSchoolModel : ( ( rule__SchoolModel__SchoolsAssignment )* ) ;
    public final void ruleSchoolModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__SchoolModel__SchoolsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__SchoolModel__SchoolsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__SchoolModel__SchoolsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__SchoolModel__SchoolsAssignment )*
            {
             before(grammarAccess.getSchoolModelAccess().getSchoolsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__SchoolModel__SchoolsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__SchoolModel__SchoolsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SchoolModel__SchoolsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSchoolModelAccess().getSchoolsAssignment()); 

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
    // $ANTLR end "ruleSchoolModel"


    // $ANTLR start "entryRuleSchool"
    // InternalMyDsl.g:78:1: entryRuleSchool : ruleSchool EOF ;
    public final void entryRuleSchool() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleSchool EOF )
            // InternalMyDsl.g:80:1: ruleSchool EOF
            {
             before(grammarAccess.getSchoolRule()); 
            pushFollow(FOLLOW_1);
            ruleSchool();

            state._fsp--;

             after(grammarAccess.getSchoolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSchool"


    // $ANTLR start "ruleSchool"
    // InternalMyDsl.g:87:1: ruleSchool : ( ( rule__School__Group__0 ) ) ;
    public final void ruleSchool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__School__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__School__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__School__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__School__Group__0 )
            {
             before(grammarAccess.getSchoolAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__School__Group__0 )
            // InternalMyDsl.g:94:4: rule__School__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__School__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getGroup()); 

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
    // $ANTLR end "ruleSchool"


    // $ANTLR start "entryRulePerson"
    // InternalMyDsl.g:103:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePerson EOF )
            // InternalMyDsl.g:105:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalMyDsl.g:112:1: rulePerson : ( ( rule__Person__Alternatives ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Person__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Person__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Person__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Person__Alternatives )
            {
             before(grammarAccess.getPersonAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Person__Alternatives )
            // InternalMyDsl.g:119:4: rule__Person__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleStudent"
    // InternalMyDsl.g:128:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleStudent EOF )
            // InternalMyDsl.g:130:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalMyDsl.g:137:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Student__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Student__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Student__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Student__Group__0 )
            // InternalMyDsl.g:144:4: rule__Student__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleTeacher"
    // InternalMyDsl.g:153:1: entryRuleTeacher : ruleTeacher EOF ;
    public final void entryRuleTeacher() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTeacher EOF )
            // InternalMyDsl.g:155:1: ruleTeacher EOF
            {
             before(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getTeacherRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalMyDsl.g:162:1: ruleTeacher : ( ( rule__Teacher__Group__0 ) ) ;
    public final void ruleTeacher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Teacher__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Teacher__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Teacher__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Teacher__Group__0 )
            {
             before(grammarAccess.getTeacherAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Teacher__Group__0 )
            // InternalMyDsl.g:169:4: rule__Teacher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getGroup()); 

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
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "rule__Person__Alternatives"
    // InternalMyDsl.g:177:1: rule__Person__Alternatives : ( ( ruleStudent ) | ( ruleTeacher ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( ruleStudent ) | ( ruleTeacher ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:182:2: ( ruleStudent )
                    {
                    // InternalMyDsl.g:182:2: ( ruleStudent )
                    // InternalMyDsl.g:183:3: ruleStudent
                    {
                     before(grammarAccess.getPersonAccess().getStudentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStudent();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getStudentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( ruleTeacher )
                    {
                    // InternalMyDsl.g:188:2: ( ruleTeacher )
                    // InternalMyDsl.g:189:3: ruleTeacher
                    {
                     before(grammarAccess.getPersonAccess().getTeacherParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTeacher();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getTeacherParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives"


    // $ANTLR start "rule__School__Group__0"
    // InternalMyDsl.g:198:1: rule__School__Group__0 : rule__School__Group__0__Impl rule__School__Group__1 ;
    public final void rule__School__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( rule__School__Group__0__Impl rule__School__Group__1 )
            // InternalMyDsl.g:203:2: rule__School__Group__0__Impl rule__School__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__School__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__1();

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
    // $ANTLR end "rule__School__Group__0"


    // $ANTLR start "rule__School__Group__0__Impl"
    // InternalMyDsl.g:210:1: rule__School__Group__0__Impl : ( 'school' ) ;
    public final void rule__School__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( 'school' ) )
            // InternalMyDsl.g:215:1: ( 'school' )
            {
            // InternalMyDsl.g:215:1: ( 'school' )
            // InternalMyDsl.g:216:2: 'school'
            {
             before(grammarAccess.getSchoolAccess().getSchoolKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getSchoolKeyword_0()); 

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
    // $ANTLR end "rule__School__Group__0__Impl"


    // $ANTLR start "rule__School__Group__1"
    // InternalMyDsl.g:225:1: rule__School__Group__1 : rule__School__Group__1__Impl rule__School__Group__2 ;
    public final void rule__School__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:229:1: ( rule__School__Group__1__Impl rule__School__Group__2 )
            // InternalMyDsl.g:230:2: rule__School__Group__1__Impl rule__School__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__School__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__2();

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
    // $ANTLR end "rule__School__Group__1"


    // $ANTLR start "rule__School__Group__1__Impl"
    // InternalMyDsl.g:237:1: rule__School__Group__1__Impl : ( ( rule__School__NameAssignment_1 ) ) ;
    public final void rule__School__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:1: ( ( ( rule__School__NameAssignment_1 ) ) )
            // InternalMyDsl.g:242:1: ( ( rule__School__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:242:1: ( ( rule__School__NameAssignment_1 ) )
            // InternalMyDsl.g:243:2: ( rule__School__NameAssignment_1 )
            {
             before(grammarAccess.getSchoolAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:244:2: ( rule__School__NameAssignment_1 )
            // InternalMyDsl.g:244:3: rule__School__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__School__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSchoolAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__School__Group__1__Impl"


    // $ANTLR start "rule__School__Group__2"
    // InternalMyDsl.g:252:1: rule__School__Group__2 : rule__School__Group__2__Impl rule__School__Group__3 ;
    public final void rule__School__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( rule__School__Group__2__Impl rule__School__Group__3 )
            // InternalMyDsl.g:257:2: rule__School__Group__2__Impl rule__School__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__School__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__3();

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
    // $ANTLR end "rule__School__Group__2"


    // $ANTLR start "rule__School__Group__2__Impl"
    // InternalMyDsl.g:264:1: rule__School__Group__2__Impl : ( '{' ) ;
    public final void rule__School__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:268:1: ( ( '{' ) )
            // InternalMyDsl.g:269:1: ( '{' )
            {
            // InternalMyDsl.g:269:1: ( '{' )
            // InternalMyDsl.g:270:2: '{'
            {
             before(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__School__Group__2__Impl"


    // $ANTLR start "rule__School__Group__3"
    // InternalMyDsl.g:279:1: rule__School__Group__3 : rule__School__Group__3__Impl rule__School__Group__4 ;
    public final void rule__School__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( rule__School__Group__3__Impl rule__School__Group__4 )
            // InternalMyDsl.g:284:2: rule__School__Group__3__Impl rule__School__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__School__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__School__Group__4();

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
    // $ANTLR end "rule__School__Group__3"


    // $ANTLR start "rule__School__Group__3__Impl"
    // InternalMyDsl.g:291:1: rule__School__Group__3__Impl : ( ( rule__School__PersonsAssignment_3 )* ) ;
    public final void rule__School__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( ( ( rule__School__PersonsAssignment_3 )* ) )
            // InternalMyDsl.g:296:1: ( ( rule__School__PersonsAssignment_3 )* )
            {
            // InternalMyDsl.g:296:1: ( ( rule__School__PersonsAssignment_3 )* )
            // InternalMyDsl.g:297:2: ( rule__School__PersonsAssignment_3 )*
            {
             before(grammarAccess.getSchoolAccess().getPersonsAssignment_3()); 
            // InternalMyDsl.g:298:2: ( rule__School__PersonsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:298:3: rule__School__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__School__PersonsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSchoolAccess().getPersonsAssignment_3()); 

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
    // $ANTLR end "rule__School__Group__3__Impl"


    // $ANTLR start "rule__School__Group__4"
    // InternalMyDsl.g:306:1: rule__School__Group__4 : rule__School__Group__4__Impl ;
    public final void rule__School__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( rule__School__Group__4__Impl )
            // InternalMyDsl.g:311:2: rule__School__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__School__Group__4__Impl();

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
    // $ANTLR end "rule__School__Group__4"


    // $ANTLR start "rule__School__Group__4__Impl"
    // InternalMyDsl.g:317:1: rule__School__Group__4__Impl : ( '}' ) ;
    public final void rule__School__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:321:1: ( ( '}' ) )
            // InternalMyDsl.g:322:1: ( '}' )
            {
            // InternalMyDsl.g:322:1: ( '}' )
            // InternalMyDsl.g:323:2: '}'
            {
             before(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__School__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__0"
    // InternalMyDsl.g:333:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // InternalMyDsl.g:338:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__1();

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
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // InternalMyDsl.g:345:1: rule__Student__Group__0__Impl : ( 'student' ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( 'student' ) )
            // InternalMyDsl.g:350:1: ( 'student' )
            {
            // InternalMyDsl.g:350:1: ( 'student' )
            // InternalMyDsl.g:351:2: 'student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_0()); 

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
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // InternalMyDsl.g:360:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // InternalMyDsl.g:365:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__2();

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
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // InternalMyDsl.g:372:1: rule__Student__Group__1__Impl : ( ( rule__Student__NameAssignment_1 ) ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:376:1: ( ( ( rule__Student__NameAssignment_1 ) ) )
            // InternalMyDsl.g:377:1: ( ( rule__Student__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:377:1: ( ( rule__Student__NameAssignment_1 ) )
            // InternalMyDsl.g:378:2: ( rule__Student__NameAssignment_1 )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:379:2: ( rule__Student__NameAssignment_1 )
            // InternalMyDsl.g:379:3: rule__Student__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // InternalMyDsl.g:387:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // InternalMyDsl.g:392:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__3();

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
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // InternalMyDsl.g:399:1: rule__Student__Group__2__Impl : ( 'registrationNum' ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( 'registrationNum' ) )
            // InternalMyDsl.g:404:1: ( 'registrationNum' )
            {
            // InternalMyDsl.g:404:1: ( 'registrationNum' )
            // InternalMyDsl.g:405:2: 'registrationNum'
            {
             before(grammarAccess.getStudentAccess().getRegistrationNumKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRegistrationNumKeyword_2()); 

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
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // InternalMyDsl.g:414:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // InternalMyDsl.g:419:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__4();

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
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // InternalMyDsl.g:426:1: rule__Student__Group__3__Impl : ( ( rule__Student__RegistrationNumAssignment_3 ) ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:430:1: ( ( ( rule__Student__RegistrationNumAssignment_3 ) ) )
            // InternalMyDsl.g:431:1: ( ( rule__Student__RegistrationNumAssignment_3 ) )
            {
            // InternalMyDsl.g:431:1: ( ( rule__Student__RegistrationNumAssignment_3 ) )
            // InternalMyDsl.g:432:2: ( rule__Student__RegistrationNumAssignment_3 )
            {
             before(grammarAccess.getStudentAccess().getRegistrationNumAssignment_3()); 
            // InternalMyDsl.g:433:2: ( rule__Student__RegistrationNumAssignment_3 )
            // InternalMyDsl.g:433:3: rule__Student__RegistrationNumAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Student__RegistrationNumAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getRegistrationNumAssignment_3()); 

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
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // InternalMyDsl.g:441:1: rule__Student__Group__4 : rule__Student__Group__4__Impl ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( rule__Student__Group__4__Impl )
            // InternalMyDsl.g:446:2: rule__Student__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__4__Impl();

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
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // InternalMyDsl.g:452:1: rule__Student__Group__4__Impl : ( ( rule__Student__Group_4__0 )? ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:456:1: ( ( ( rule__Student__Group_4__0 )? ) )
            // InternalMyDsl.g:457:1: ( ( rule__Student__Group_4__0 )? )
            {
            // InternalMyDsl.g:457:1: ( ( rule__Student__Group_4__0 )? )
            // InternalMyDsl.g:458:2: ( rule__Student__Group_4__0 )?
            {
             before(grammarAccess.getStudentAccess().getGroup_4()); 
            // InternalMyDsl.g:459:2: ( rule__Student__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:459:3: rule__Student__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Student__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStudentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group_4__0"
    // InternalMyDsl.g:468:1: rule__Student__Group_4__0 : rule__Student__Group_4__0__Impl rule__Student__Group_4__1 ;
    public final void rule__Student__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( rule__Student__Group_4__0__Impl rule__Student__Group_4__1 )
            // InternalMyDsl.g:473:2: rule__Student__Group_4__0__Impl rule__Student__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__1();

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
    // $ANTLR end "rule__Student__Group_4__0"


    // $ANTLR start "rule__Student__Group_4__0__Impl"
    // InternalMyDsl.g:480:1: rule__Student__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Student__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:484:1: ( ( '{' ) )
            // InternalMyDsl.g:485:1: ( '{' )
            {
            // InternalMyDsl.g:485:1: ( '{' )
            // InternalMyDsl.g:486:2: '{'
            {
             before(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Student__Group_4__0__Impl"


    // $ANTLR start "rule__Student__Group_4__1"
    // InternalMyDsl.g:495:1: rule__Student__Group_4__1 : rule__Student__Group_4__1__Impl rule__Student__Group_4__2 ;
    public final void rule__Student__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__Student__Group_4__1__Impl rule__Student__Group_4__2 )
            // InternalMyDsl.g:500:2: rule__Student__Group_4__1__Impl rule__Student__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Student__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__2();

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
    // $ANTLR end "rule__Student__Group_4__1"


    // $ANTLR start "rule__Student__Group_4__1__Impl"
    // InternalMyDsl.g:507:1: rule__Student__Group_4__1__Impl : ( ( rule__Student__TeachersAssignment_4_1 ) ) ;
    public final void rule__Student__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( ( rule__Student__TeachersAssignment_4_1 ) ) )
            // InternalMyDsl.g:512:1: ( ( rule__Student__TeachersAssignment_4_1 ) )
            {
            // InternalMyDsl.g:512:1: ( ( rule__Student__TeachersAssignment_4_1 ) )
            // InternalMyDsl.g:513:2: ( rule__Student__TeachersAssignment_4_1 )
            {
             before(grammarAccess.getStudentAccess().getTeachersAssignment_4_1()); 
            // InternalMyDsl.g:514:2: ( rule__Student__TeachersAssignment_4_1 )
            // InternalMyDsl.g:514:3: rule__Student__TeachersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__TeachersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getTeachersAssignment_4_1()); 

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
    // $ANTLR end "rule__Student__Group_4__1__Impl"


    // $ANTLR start "rule__Student__Group_4__2"
    // InternalMyDsl.g:522:1: rule__Student__Group_4__2 : rule__Student__Group_4__2__Impl rule__Student__Group_4__3 ;
    public final void rule__Student__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( rule__Student__Group_4__2__Impl rule__Student__Group_4__3 )
            // InternalMyDsl.g:527:2: rule__Student__Group_4__2__Impl rule__Student__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Student__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4__3();

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
    // $ANTLR end "rule__Student__Group_4__2"


    // $ANTLR start "rule__Student__Group_4__2__Impl"
    // InternalMyDsl.g:534:1: rule__Student__Group_4__2__Impl : ( ( rule__Student__Group_4_2__0 )* ) ;
    public final void rule__Student__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:538:1: ( ( ( rule__Student__Group_4_2__0 )* ) )
            // InternalMyDsl.g:539:1: ( ( rule__Student__Group_4_2__0 )* )
            {
            // InternalMyDsl.g:539:1: ( ( rule__Student__Group_4_2__0 )* )
            // InternalMyDsl.g:540:2: ( rule__Student__Group_4_2__0 )*
            {
             before(grammarAccess.getStudentAccess().getGroup_4_2()); 
            // InternalMyDsl.g:541:2: ( rule__Student__Group_4_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:541:3: rule__Student__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Student__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStudentAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Student__Group_4__2__Impl"


    // $ANTLR start "rule__Student__Group_4__3"
    // InternalMyDsl.g:549:1: rule__Student__Group_4__3 : rule__Student__Group_4__3__Impl ;
    public final void rule__Student__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( rule__Student__Group_4__3__Impl )
            // InternalMyDsl.g:554:2: rule__Student__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_4__3__Impl();

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
    // $ANTLR end "rule__Student__Group_4__3"


    // $ANTLR start "rule__Student__Group_4__3__Impl"
    // InternalMyDsl.g:560:1: rule__Student__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Student__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:564:1: ( ( '}' ) )
            // InternalMyDsl.g:565:1: ( '}' )
            {
            // InternalMyDsl.g:565:1: ( '}' )
            // InternalMyDsl.g:566:2: '}'
            {
             before(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__Student__Group_4__3__Impl"


    // $ANTLR start "rule__Student__Group_4_2__0"
    // InternalMyDsl.g:576:1: rule__Student__Group_4_2__0 : rule__Student__Group_4_2__0__Impl rule__Student__Group_4_2__1 ;
    public final void rule__Student__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( rule__Student__Group_4_2__0__Impl rule__Student__Group_4_2__1 )
            // InternalMyDsl.g:581:2: rule__Student__Group_4_2__0__Impl rule__Student__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group_4_2__1();

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
    // $ANTLR end "rule__Student__Group_4_2__0"


    // $ANTLR start "rule__Student__Group_4_2__0__Impl"
    // InternalMyDsl.g:588:1: rule__Student__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Student__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:592:1: ( ( ',' ) )
            // InternalMyDsl.g:593:1: ( ',' )
            {
            // InternalMyDsl.g:593:1: ( ',' )
            // InternalMyDsl.g:594:2: ','
            {
             before(grammarAccess.getStudentAccess().getCommaKeyword_4_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Student__Group_4_2__0__Impl"


    // $ANTLR start "rule__Student__Group_4_2__1"
    // InternalMyDsl.g:603:1: rule__Student__Group_4_2__1 : rule__Student__Group_4_2__1__Impl ;
    public final void rule__Student__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( rule__Student__Group_4_2__1__Impl )
            // InternalMyDsl.g:608:2: rule__Student__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Student__Group_4_2__1"


    // $ANTLR start "rule__Student__Group_4_2__1__Impl"
    // InternalMyDsl.g:614:1: rule__Student__Group_4_2__1__Impl : ( ( rule__Student__TeachersAssignment_4_2_1 ) ) ;
    public final void rule__Student__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:618:1: ( ( ( rule__Student__TeachersAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:619:1: ( ( rule__Student__TeachersAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:619:1: ( ( rule__Student__TeachersAssignment_4_2_1 ) )
            // InternalMyDsl.g:620:2: ( rule__Student__TeachersAssignment_4_2_1 )
            {
             before(grammarAccess.getStudentAccess().getTeachersAssignment_4_2_1()); 
            // InternalMyDsl.g:621:2: ( rule__Student__TeachersAssignment_4_2_1 )
            // InternalMyDsl.g:621:3: rule__Student__TeachersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__TeachersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getTeachersAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Student__Group_4_2__1__Impl"


    // $ANTLR start "rule__Teacher__Group__0"
    // InternalMyDsl.g:630:1: rule__Teacher__Group__0 : rule__Teacher__Group__0__Impl rule__Teacher__Group__1 ;
    public final void rule__Teacher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( rule__Teacher__Group__0__Impl rule__Teacher__Group__1 )
            // InternalMyDsl.g:635:2: rule__Teacher__Group__0__Impl rule__Teacher__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Teacher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__1();

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
    // $ANTLR end "rule__Teacher__Group__0"


    // $ANTLR start "rule__Teacher__Group__0__Impl"
    // InternalMyDsl.g:642:1: rule__Teacher__Group__0__Impl : ( 'teacher' ) ;
    public final void rule__Teacher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( 'teacher' ) )
            // InternalMyDsl.g:647:1: ( 'teacher' )
            {
            // InternalMyDsl.g:647:1: ( 'teacher' )
            // InternalMyDsl.g:648:2: 'teacher'
            {
             before(grammarAccess.getTeacherAccess().getTeacherKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeacherKeyword_0()); 

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
    // $ANTLR end "rule__Teacher__Group__0__Impl"


    // $ANTLR start "rule__Teacher__Group__1"
    // InternalMyDsl.g:657:1: rule__Teacher__Group__1 : rule__Teacher__Group__1__Impl ;
    public final void rule__Teacher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( rule__Teacher__Group__1__Impl )
            // InternalMyDsl.g:662:2: rule__Teacher__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__1__Impl();

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
    // $ANTLR end "rule__Teacher__Group__1"


    // $ANTLR start "rule__Teacher__Group__1__Impl"
    // InternalMyDsl.g:668:1: rule__Teacher__Group__1__Impl : ( ( rule__Teacher__NameAssignment_1 ) ) ;
    public final void rule__Teacher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:672:1: ( ( ( rule__Teacher__NameAssignment_1 ) ) )
            // InternalMyDsl.g:673:1: ( ( rule__Teacher__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:673:1: ( ( rule__Teacher__NameAssignment_1 ) )
            // InternalMyDsl.g:674:2: ( rule__Teacher__NameAssignment_1 )
            {
             before(grammarAccess.getTeacherAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:675:2: ( rule__Teacher__NameAssignment_1 )
            // InternalMyDsl.g:675:3: rule__Teacher__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Teacher__Group__1__Impl"


    // $ANTLR start "rule__SchoolModel__SchoolsAssignment"
    // InternalMyDsl.g:684:1: rule__SchoolModel__SchoolsAssignment : ( ruleSchool ) ;
    public final void rule__SchoolModel__SchoolsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( ( ruleSchool ) )
            // InternalMyDsl.g:689:2: ( ruleSchool )
            {
            // InternalMyDsl.g:689:2: ( ruleSchool )
            // InternalMyDsl.g:690:3: ruleSchool
            {
             before(grammarAccess.getSchoolModelAccess().getSchoolsSchoolParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSchool();

            state._fsp--;

             after(grammarAccess.getSchoolModelAccess().getSchoolsSchoolParserRuleCall_0()); 

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
    // $ANTLR end "rule__SchoolModel__SchoolsAssignment"


    // $ANTLR start "rule__School__NameAssignment_1"
    // InternalMyDsl.g:699:1: rule__School__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__School__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:704:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:704:2: ( RULE_STRING )
            // InternalMyDsl.g:705:3: RULE_STRING
            {
             before(grammarAccess.getSchoolAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSchoolAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__School__NameAssignment_1"


    // $ANTLR start "rule__School__PersonsAssignment_3"
    // InternalMyDsl.g:714:1: rule__School__PersonsAssignment_3 : ( rulePerson ) ;
    public final void rule__School__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( ( rulePerson ) )
            // InternalMyDsl.g:719:2: ( rulePerson )
            {
            // InternalMyDsl.g:719:2: ( rulePerson )
            // InternalMyDsl.g:720:3: rulePerson
            {
             before(grammarAccess.getSchoolAccess().getPersonsPersonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getSchoolAccess().getPersonsPersonParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__School__PersonsAssignment_3"


    // $ANTLR start "rule__Student__NameAssignment_1"
    // InternalMyDsl.g:729:1: rule__Student__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Student__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:734:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:734:2: ( RULE_STRING )
            // InternalMyDsl.g:735:3: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Student__NameAssignment_1"


    // $ANTLR start "rule__Student__RegistrationNumAssignment_3"
    // InternalMyDsl.g:744:1: rule__Student__RegistrationNumAssignment_3 : ( RULE_INT ) ;
    public final void rule__Student__RegistrationNumAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:749:2: ( RULE_INT )
            {
            // InternalMyDsl.g:749:2: ( RULE_INT )
            // InternalMyDsl.g:750:3: RULE_INT
            {
             before(grammarAccess.getStudentAccess().getRegistrationNumINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getRegistrationNumINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Student__RegistrationNumAssignment_3"


    // $ANTLR start "rule__Student__TeachersAssignment_4_1"
    // InternalMyDsl.g:759:1: rule__Student__TeachersAssignment_4_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Student__TeachersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( ( ( RULE_STRING ) ) )
            // InternalMyDsl.g:764:2: ( ( RULE_STRING ) )
            {
            // InternalMyDsl.g:764:2: ( ( RULE_STRING ) )
            // InternalMyDsl.g:765:3: ( RULE_STRING )
            {
             before(grammarAccess.getStudentAccess().getTeachersTeacherCrossReference_4_1_0()); 
            // InternalMyDsl.g:766:3: ( RULE_STRING )
            // InternalMyDsl.g:767:4: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getTeachersTeacherSTRINGTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getTeachersTeacherSTRINGTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getTeachersTeacherCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Student__TeachersAssignment_4_1"


    // $ANTLR start "rule__Student__TeachersAssignment_4_2_1"
    // InternalMyDsl.g:778:1: rule__Student__TeachersAssignment_4_2_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Student__TeachersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ( RULE_STRING ) ) )
            // InternalMyDsl.g:783:2: ( ( RULE_STRING ) )
            {
            // InternalMyDsl.g:783:2: ( ( RULE_STRING ) )
            // InternalMyDsl.g:784:3: ( RULE_STRING )
            {
             before(grammarAccess.getStudentAccess().getTeachersTeacherCrossReference_4_2_1_0()); 
            // InternalMyDsl.g:785:3: ( RULE_STRING )
            // InternalMyDsl.g:786:4: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getTeachersTeacherSTRINGTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getTeachersTeacherSTRINGTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getStudentAccess().getTeachersTeacherCrossReference_4_2_1_0()); 

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
    // $ANTLR end "rule__Student__TeachersAssignment_4_2_1"


    // $ANTLR start "rule__Teacher__NameAssignment_1"
    // InternalMyDsl.g:797:1: rule__Teacher__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Teacher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:802:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:802:2: ( RULE_STRING )
            // InternalMyDsl.g:803:3: RULE_STRING
            {
             before(grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Teacher__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});

}