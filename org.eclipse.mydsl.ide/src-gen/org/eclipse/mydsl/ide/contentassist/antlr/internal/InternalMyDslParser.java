package org.eclipse.mydsl.ide.contentassist.antlr.internal;

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
import org.eclipse.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eigenschaft'", "'{'", "'}'", "'extends'", "';'", "'[]'"
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__EigenschaftenAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__EigenschaftenAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__EigenschaftenAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__EigenschaftenAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__EigenschaftenAssignment )*
            {
             before(grammarAccess.getModelAccess().getEigenschaftenAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__EigenschaftenAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__EigenschaftenAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__Model__EigenschaftenAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEigenschaftenAssignment()); 

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


    // $ANTLR start "entryRuleEigenschaft"
    // InternalMyDsl.g:78:1: entryRuleEigenschaft : ruleEigenschaft EOF ;
    public final void entryRuleEigenschaft() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEigenschaft EOF )
            // InternalMyDsl.g:80:1: ruleEigenschaft EOF
            {
             before(grammarAccess.getEigenschaftRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEigenschaft();

            state._fsp--;

             after(grammarAccess.getEigenschaftRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEigenschaft"


    // $ANTLR start "ruleEigenschaft"
    // InternalMyDsl.g:87:1: ruleEigenschaft : ( ( rule__Eigenschaft__Group__0 ) ) ;
    public final void ruleEigenschaft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Eigenschaft__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Eigenschaft__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Eigenschaft__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Eigenschaft__Group__0 )
            {
             before(grammarAccess.getEigenschaftAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Eigenschaft__Group__0 )
            // InternalMyDsl.g:94:4: rule__Eigenschaft__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEigenschaftAccess().getGroup()); 

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
    // $ANTLR end "ruleEigenschaft"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__Eigenschaft__Group__0"
    // InternalMyDsl.g:127:1: rule__Eigenschaft__Group__0 : rule__Eigenschaft__Group__0__Impl rule__Eigenschaft__Group__1 ;
    public final void rule__Eigenschaft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( rule__Eigenschaft__Group__0__Impl rule__Eigenschaft__Group__1 )
            // InternalMyDsl.g:132:2: rule__Eigenschaft__Group__0__Impl rule__Eigenschaft__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Eigenschaft__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group__1();

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
    // $ANTLR end "rule__Eigenschaft__Group__0"


    // $ANTLR start "rule__Eigenschaft__Group__0__Impl"
    // InternalMyDsl.g:139:1: rule__Eigenschaft__Group__0__Impl : ( 'eigenschaft' ) ;
    public final void rule__Eigenschaft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:143:1: ( ( 'eigenschaft' ) )
            // InternalMyDsl.g:144:1: ( 'eigenschaft' )
            {
            // InternalMyDsl.g:144:1: ( 'eigenschaft' )
            // InternalMyDsl.g:145:2: 'eigenschaft'
            {
             before(grammarAccess.getEigenschaftAccess().getEigenschaftKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEigenschaftAccess().getEigenschaftKeyword_0()); 

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
    // $ANTLR end "rule__Eigenschaft__Group__0__Impl"


    // $ANTLR start "rule__Eigenschaft__Group__1"
    // InternalMyDsl.g:154:1: rule__Eigenschaft__Group__1 : rule__Eigenschaft__Group__1__Impl rule__Eigenschaft__Group__2 ;
    public final void rule__Eigenschaft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:158:1: ( rule__Eigenschaft__Group__1__Impl rule__Eigenschaft__Group__2 )
            // InternalMyDsl.g:159:2: rule__Eigenschaft__Group__1__Impl rule__Eigenschaft__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Eigenschaft__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group__2();

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
    // $ANTLR end "rule__Eigenschaft__Group__1"


    // $ANTLR start "rule__Eigenschaft__Group__1__Impl"
    // InternalMyDsl.g:166:1: rule__Eigenschaft__Group__1__Impl : ( ( rule__Eigenschaft__NameAssignment_1 ) ) ;
    public final void rule__Eigenschaft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:170:1: ( ( ( rule__Eigenschaft__NameAssignment_1 ) ) )
            // InternalMyDsl.g:171:1: ( ( rule__Eigenschaft__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:171:1: ( ( rule__Eigenschaft__NameAssignment_1 ) )
            // InternalMyDsl.g:172:2: ( rule__Eigenschaft__NameAssignment_1 )
            {
             before(grammarAccess.getEigenschaftAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:173:2: ( rule__Eigenschaft__NameAssignment_1 )
            // InternalMyDsl.g:173:3: rule__Eigenschaft__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEigenschaftAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Eigenschaft__Group__1__Impl"


    // $ANTLR start "rule__Eigenschaft__Group__2"
    // InternalMyDsl.g:181:1: rule__Eigenschaft__Group__2 : rule__Eigenschaft__Group__2__Impl rule__Eigenschaft__Group__3 ;
    public final void rule__Eigenschaft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:185:1: ( rule__Eigenschaft__Group__2__Impl rule__Eigenschaft__Group__3 )
            // InternalMyDsl.g:186:2: rule__Eigenschaft__Group__2__Impl rule__Eigenschaft__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Eigenschaft__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group__3();

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
    // $ANTLR end "rule__Eigenschaft__Group__2"


    // $ANTLR start "rule__Eigenschaft__Group__2__Impl"
    // InternalMyDsl.g:193:1: rule__Eigenschaft__Group__2__Impl : ( ( rule__Eigenschaft__Group_2__0 )? ) ;
    public final void rule__Eigenschaft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:197:1: ( ( ( rule__Eigenschaft__Group_2__0 )? ) )
            // InternalMyDsl.g:198:1: ( ( rule__Eigenschaft__Group_2__0 )? )
            {
            // InternalMyDsl.g:198:1: ( ( rule__Eigenschaft__Group_2__0 )? )
            // InternalMyDsl.g:199:2: ( rule__Eigenschaft__Group_2__0 )?
            {
             before(grammarAccess.getEigenschaftAccess().getGroup_2()); 
            // InternalMyDsl.g:200:2: ( rule__Eigenschaft__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:200:3: rule__Eigenschaft__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Eigenschaft__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEigenschaftAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Eigenschaft__Group__2__Impl"


    // $ANTLR start "rule__Eigenschaft__Group__3"
    // InternalMyDsl.g:208:1: rule__Eigenschaft__Group__3 : rule__Eigenschaft__Group__3__Impl rule__Eigenschaft__Group__4 ;
    public final void rule__Eigenschaft__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:212:1: ( rule__Eigenschaft__Group__3__Impl rule__Eigenschaft__Group__4 )
            // InternalMyDsl.g:213:2: rule__Eigenschaft__Group__3__Impl rule__Eigenschaft__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Eigenschaft__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group__4();

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
    // $ANTLR end "rule__Eigenschaft__Group__3"


    // $ANTLR start "rule__Eigenschaft__Group__3__Impl"
    // InternalMyDsl.g:220:1: rule__Eigenschaft__Group__3__Impl : ( '{' ) ;
    public final void rule__Eigenschaft__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:224:1: ( ( '{' ) )
            // InternalMyDsl.g:225:1: ( '{' )
            {
            // InternalMyDsl.g:225:1: ( '{' )
            // InternalMyDsl.g:226:2: '{'
            {
             before(grammarAccess.getEigenschaftAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEigenschaftAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Eigenschaft__Group__3__Impl"


    // $ANTLR start "rule__Eigenschaft__Group__4"
    // InternalMyDsl.g:235:1: rule__Eigenschaft__Group__4 : rule__Eigenschaft__Group__4__Impl rule__Eigenschaft__Group__5 ;
    public final void rule__Eigenschaft__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( rule__Eigenschaft__Group__4__Impl rule__Eigenschaft__Group__5 )
            // InternalMyDsl.g:240:2: rule__Eigenschaft__Group__4__Impl rule__Eigenschaft__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Eigenschaft__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group__5();

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
    // $ANTLR end "rule__Eigenschaft__Group__4"


    // $ANTLR start "rule__Eigenschaft__Group__4__Impl"
    // InternalMyDsl.g:247:1: rule__Eigenschaft__Group__4__Impl : ( ( rule__Eigenschaft__AttributesAssignment_4 )* ) ;
    public final void rule__Eigenschaft__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( ( ( rule__Eigenschaft__AttributesAssignment_4 )* ) )
            // InternalMyDsl.g:252:1: ( ( rule__Eigenschaft__AttributesAssignment_4 )* )
            {
            // InternalMyDsl.g:252:1: ( ( rule__Eigenschaft__AttributesAssignment_4 )* )
            // InternalMyDsl.g:253:2: ( rule__Eigenschaft__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEigenschaftAccess().getAttributesAssignment_4()); 
            // InternalMyDsl.g:254:2: ( rule__Eigenschaft__AttributesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:254:3: rule__Eigenschaft__AttributesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Eigenschaft__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEigenschaftAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Eigenschaft__Group__4__Impl"


    // $ANTLR start "rule__Eigenschaft__Group__5"
    // InternalMyDsl.g:262:1: rule__Eigenschaft__Group__5 : rule__Eigenschaft__Group__5__Impl ;
    public final void rule__Eigenschaft__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:1: ( rule__Eigenschaft__Group__5__Impl )
            // InternalMyDsl.g:267:2: rule__Eigenschaft__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group__5__Impl();

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
    // $ANTLR end "rule__Eigenschaft__Group__5"


    // $ANTLR start "rule__Eigenschaft__Group__5__Impl"
    // InternalMyDsl.g:273:1: rule__Eigenschaft__Group__5__Impl : ( '}' ) ;
    public final void rule__Eigenschaft__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:277:1: ( ( '}' ) )
            // InternalMyDsl.g:278:1: ( '}' )
            {
            // InternalMyDsl.g:278:1: ( '}' )
            // InternalMyDsl.g:279:2: '}'
            {
             before(grammarAccess.getEigenschaftAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEigenschaftAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Eigenschaft__Group__5__Impl"


    // $ANTLR start "rule__Eigenschaft__Group_2__0"
    // InternalMyDsl.g:289:1: rule__Eigenschaft__Group_2__0 : rule__Eigenschaft__Group_2__0__Impl rule__Eigenschaft__Group_2__1 ;
    public final void rule__Eigenschaft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( rule__Eigenschaft__Group_2__0__Impl rule__Eigenschaft__Group_2__1 )
            // InternalMyDsl.g:294:2: rule__Eigenschaft__Group_2__0__Impl rule__Eigenschaft__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Eigenschaft__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group_2__1();

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
    // $ANTLR end "rule__Eigenschaft__Group_2__0"


    // $ANTLR start "rule__Eigenschaft__Group_2__0__Impl"
    // InternalMyDsl.g:301:1: rule__Eigenschaft__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Eigenschaft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:305:1: ( ( 'extends' ) )
            // InternalMyDsl.g:306:1: ( 'extends' )
            {
            // InternalMyDsl.g:306:1: ( 'extends' )
            // InternalMyDsl.g:307:2: 'extends'
            {
             before(grammarAccess.getEigenschaftAccess().getExtendsKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEigenschaftAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Eigenschaft__Group_2__0__Impl"


    // $ANTLR start "rule__Eigenschaft__Group_2__1"
    // InternalMyDsl.g:316:1: rule__Eigenschaft__Group_2__1 : rule__Eigenschaft__Group_2__1__Impl ;
    public final void rule__Eigenschaft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( rule__Eigenschaft__Group_2__1__Impl )
            // InternalMyDsl.g:321:2: rule__Eigenschaft__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__Group_2__1__Impl();

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
    // $ANTLR end "rule__Eigenschaft__Group_2__1"


    // $ANTLR start "rule__Eigenschaft__Group_2__1__Impl"
    // InternalMyDsl.g:327:1: rule__Eigenschaft__Group_2__1__Impl : ( ( rule__Eigenschaft__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Eigenschaft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__Eigenschaft__SuperTypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:332:1: ( ( rule__Eigenschaft__SuperTypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:332:1: ( ( rule__Eigenschaft__SuperTypeAssignment_2_1 ) )
            // InternalMyDsl.g:333:2: ( rule__Eigenschaft__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEigenschaftAccess().getSuperTypeAssignment_2_1()); 
            // InternalMyDsl.g:334:2: ( rule__Eigenschaft__SuperTypeAssignment_2_1 )
            // InternalMyDsl.g:334:3: rule__Eigenschaft__SuperTypeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Eigenschaft__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEigenschaftAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Eigenschaft__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:343:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:348:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:355:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:360:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:360:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalMyDsl.g:361:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:362:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalMyDsl.g:362:3: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:370:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:375:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:382:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ArrayAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( ( ( rule__Attribute__ArrayAssignment_1 )? ) )
            // InternalMyDsl.g:387:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            {
            // InternalMyDsl.g:387:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            // InternalMyDsl.g:388:2: ( rule__Attribute__ArrayAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 
            // InternalMyDsl.g:389:2: ( rule__Attribute__ArrayAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:389:3: rule__Attribute__ArrayAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:397:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:402:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:409:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalMyDsl.g:414:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:414:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalMyDsl.g:415:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:416:2: ( rule__Attribute__NameAssignment_2 )
            // InternalMyDsl.g:416:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:424:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:429:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:435:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( ';' ) )
            // InternalMyDsl.g:440:1: ( ';' )
            {
            // InternalMyDsl.g:440:1: ( ';' )
            // InternalMyDsl.g:441:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Model__EigenschaftenAssignment"
    // InternalMyDsl.g:451:1: rule__Model__EigenschaftenAssignment : ( ruleEigenschaft ) ;
    public final void rule__Model__EigenschaftenAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( ( ruleEigenschaft ) )
            // InternalMyDsl.g:456:2: ( ruleEigenschaft )
            {
            // InternalMyDsl.g:456:2: ( ruleEigenschaft )
            // InternalMyDsl.g:457:3: ruleEigenschaft
            {
             before(grammarAccess.getModelAccess().getEigenschaftenEigenschaftParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEigenschaft();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEigenschaftenEigenschaftParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__EigenschaftenAssignment"


    // $ANTLR start "rule__Eigenschaft__NameAssignment_1"
    // InternalMyDsl.g:466:1: rule__Eigenschaft__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Eigenschaft__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:471:2: ( RULE_ID )
            {
            // InternalMyDsl.g:471:2: ( RULE_ID )
            // InternalMyDsl.g:472:3: RULE_ID
            {
             before(grammarAccess.getEigenschaftAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEigenschaftAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Eigenschaft__NameAssignment_1"


    // $ANTLR start "rule__Eigenschaft__SuperTypeAssignment_2_1"
    // InternalMyDsl.g:481:1: rule__Eigenschaft__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Eigenschaft__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:486:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:486:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:487:3: ( RULE_ID )
            {
             before(grammarAccess.getEigenschaftAccess().getSuperTypeEigenschaftCrossReference_2_1_0()); 
            // InternalMyDsl.g:488:3: ( RULE_ID )
            // InternalMyDsl.g:489:4: RULE_ID
            {
             before(grammarAccess.getEigenschaftAccess().getSuperTypeEigenschaftIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEigenschaftAccess().getSuperTypeEigenschaftIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEigenschaftAccess().getSuperTypeEigenschaftCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Eigenschaft__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Eigenschaft__AttributesAssignment_4"
    // InternalMyDsl.g:500:1: rule__Eigenschaft__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Eigenschaft__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:505:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:505:2: ( ruleAttribute )
            // InternalMyDsl.g:506:3: ruleAttribute
            {
             before(grammarAccess.getEigenschaftAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEigenschaftAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Eigenschaft__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // InternalMyDsl.g:515:1: rule__Attribute__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:520:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:520:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:521:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeEigenschaftCrossReference_0_0()); 
            // InternalMyDsl.g:522:3: ( RULE_ID )
            // InternalMyDsl.g:523:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeEigenschaftIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeEigenschaftIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeEigenschaftCrossReference_0_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__ArrayAssignment_1"
    // InternalMyDsl.g:534:1: rule__Attribute__ArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:538:1: ( ( ( '[]' ) ) )
            // InternalMyDsl.g:539:2: ( ( '[]' ) )
            {
            // InternalMyDsl.g:539:2: ( ( '[]' ) )
            // InternalMyDsl.g:540:3: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // InternalMyDsl.g:541:3: ( '[]' )
            // InternalMyDsl.g:542:4: '[]'
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Attribute__ArrayAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalMyDsl.g:553:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:558:2: ( RULE_ID )
            {
            // InternalMyDsl.g:558:2: ( RULE_ID )
            // InternalMyDsl.g:559:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    }


}