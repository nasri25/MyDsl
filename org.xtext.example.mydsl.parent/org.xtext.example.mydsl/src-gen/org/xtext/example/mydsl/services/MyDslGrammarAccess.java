/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SchoolModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.SchoolModel");
		private final Assignment cSchoolsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSchoolsSchoolParserRuleCall_0 = (RuleCall)cSchoolsAssignment.eContents().get(0);
		
		//SchoolModel:
		//	schools+=School*;
		@Override public ParserRule getRule() { return rule; }
		
		//schools+=School*
		public Assignment getSchoolsAssignment() { return cSchoolsAssignment; }
		
		//School
		public RuleCall getSchoolsSchoolParserRuleCall_0() { return cSchoolsSchoolParserRuleCall_0; }
	}
	public class SchoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.School");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSchoolKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPersonsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPersonsPersonParserRuleCall_3_0 = (RuleCall)cPersonsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//School:
		//	'school' name=STRING
		//	'{'
		//	persons+=Person*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'school' name=STRING '{' persons+=Person* '}'
		public Group getGroup() { return cGroup; }
		
		//'school'
		public Keyword getSchoolKeyword_0() { return cSchoolKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//persons+=Person*
		public Assignment getPersonsAssignment_3() { return cPersonsAssignment_3; }
		
		//Person
		public RuleCall getPersonsPersonParserRuleCall_3_0() { return cPersonsPersonParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Person");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStudentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTeacherParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Person:
		//	Student | Teacher;
		@Override public ParserRule getRule() { return rule; }
		
		//Student | Teacher
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Student
		public RuleCall getStudentParserRuleCall_0() { return cStudentParserRuleCall_0; }
		
		//Teacher
		public RuleCall getTeacherParserRuleCall_1() { return cTeacherParserRuleCall_1; }
	}
	public class StudentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Student");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStudentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cRegistrationNumKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRegistrationNumAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRegistrationNumINTTerminalRuleCall_3_0 = (RuleCall)cRegistrationNumAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTeachersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cTeachersTeacherCrossReference_4_1_0 = (CrossReference)cTeachersAssignment_4_1.eContents().get(0);
		private final RuleCall cTeachersTeacherSTRINGTerminalRuleCall_4_1_0_1 = (RuleCall)cTeachersTeacherCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cTeachersAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cTeachersTeacherCrossReference_4_2_1_0 = (CrossReference)cTeachersAssignment_4_2_1.eContents().get(0);
		private final RuleCall cTeachersTeacherSTRINGTerminalRuleCall_4_2_1_0_1 = (RuleCall)cTeachersTeacherCrossReference_4_2_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		
		//Student:
		//	'student' name=STRING 'registrationNum' registrationNum=INT ('{'
		//	teachers+=[Teacher|STRING] ("," teachers+=[Teacher|STRING])*
		//	'}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'student' name=STRING 'registrationNum' registrationNum=INT ('{' teachers+=[Teacher|STRING] (","
		//teachers+=[Teacher|STRING])* '}')?
		public Group getGroup() { return cGroup; }
		
		//'student'
		public Keyword getStudentKeyword_0() { return cStudentKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'registrationNum'
		public Keyword getRegistrationNumKeyword_2() { return cRegistrationNumKeyword_2; }
		
		//registrationNum=INT
		public Assignment getRegistrationNumAssignment_3() { return cRegistrationNumAssignment_3; }
		
		//INT
		public RuleCall getRegistrationNumINTTerminalRuleCall_3_0() { return cRegistrationNumINTTerminalRuleCall_3_0; }
		
		//('{' teachers+=[Teacher|STRING] ("," teachers+=[Teacher|STRING])* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_0() { return cLeftCurlyBracketKeyword_4_0; }
		
		//teachers+=[Teacher|STRING]
		public Assignment getTeachersAssignment_4_1() { return cTeachersAssignment_4_1; }
		
		//[Teacher|STRING]
		public CrossReference getTeachersTeacherCrossReference_4_1_0() { return cTeachersTeacherCrossReference_4_1_0; }
		
		//STRING
		public RuleCall getTeachersTeacherSTRINGTerminalRuleCall_4_1_0_1() { return cTeachersTeacherSTRINGTerminalRuleCall_4_1_0_1; }
		
		//("," teachers+=[Teacher|STRING])*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//teachers+=[Teacher|STRING]
		public Assignment getTeachersAssignment_4_2_1() { return cTeachersAssignment_4_2_1; }
		
		//[Teacher|STRING]
		public CrossReference getTeachersTeacherCrossReference_4_2_1_0() { return cTeachersTeacherCrossReference_4_2_1_0; }
		
		//STRING
		public RuleCall getTeachersTeacherSTRINGTerminalRuleCall_4_2_1_0_1() { return cTeachersTeacherSTRINGTerminalRuleCall_4_2_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3() { return cRightCurlyBracketKeyword_4_3; }
	}
	public class TeacherElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Teacher");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTeacherKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Teacher:
		//	'teacher' name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'teacher' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'teacher'
		public Keyword getTeacherKeyword_0() { return cTeacherKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final SchoolModelElements pSchoolModel;
	private final SchoolElements pSchool;
	private final PersonElements pPerson;
	private final StudentElements pStudent;
	private final TeacherElements pTeacher;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSchoolModel = new SchoolModelElements();
		this.pSchool = new SchoolElements();
		this.pPerson = new PersonElements();
		this.pStudent = new StudentElements();
		this.pTeacher = new TeacherElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SchoolModel:
	//	schools+=School*;
	public SchoolModelElements getSchoolModelAccess() {
		return pSchoolModel;
	}
	
	public ParserRule getSchoolModelRule() {
		return getSchoolModelAccess().getRule();
	}
	
	//School:
	//	'school' name=STRING
	//	'{'
	//	persons+=Person*
	//	'}';
	public SchoolElements getSchoolAccess() {
		return pSchool;
	}
	
	public ParserRule getSchoolRule() {
		return getSchoolAccess().getRule();
	}
	
	//Person:
	//	Student | Teacher;
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	//Student:
	//	'student' name=STRING 'registrationNum' registrationNum=INT ('{'
	//	teachers+=[Teacher|STRING] ("," teachers+=[Teacher|STRING])*
	//	'}')?;
	public StudentElements getStudentAccess() {
		return pStudent;
	}
	
	public ParserRule getStudentRule() {
		return getStudentAccess().getRule();
	}
	
	//Teacher:
	//	'teacher' name=STRING;
	public TeacherElements getTeacherAccess() {
		return pTeacher;
	}
	
	public ParserRule getTeacherRule() {
		return getTeacherAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
