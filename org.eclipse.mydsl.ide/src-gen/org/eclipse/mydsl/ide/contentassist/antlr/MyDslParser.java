/*
 * generated by Xtext 2.19.0
 */
package org.eclipse.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.eclipse.mydsl.services.MyDslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEigenschaftAccess().getGroup(), "rule__Eigenschaft__Group__0");
			builder.put(grammarAccess.getEigenschaftAccess().getGroup_2(), "rule__Eigenschaft__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getModelAccess().getEigenschaftenAssignment(), "rule__Model__EigenschaftenAssignment");
			builder.put(grammarAccess.getEigenschaftAccess().getNameAssignment_1(), "rule__Eigenschaft__NameAssignment_1");
			builder.put(grammarAccess.getEigenschaftAccess().getSuperTypeAssignment_2_1(), "rule__Eigenschaft__SuperTypeAssignment_2_1");
			builder.put(grammarAccess.getEigenschaftAccess().getAttributesAssignment_4(), "rule__Eigenschaft__AttributesAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_0(), "rule__Attribute__TypeAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getArrayAssignment_1(), "rule__Attribute__ArrayAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}