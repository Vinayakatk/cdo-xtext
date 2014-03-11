/*
* generated by Xtext
*/
package net.winklerweb.cdoxtext.example.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import net.winklerweb.cdoxtext.example.services.GraphixGrammarAccess;

public class GraphixParser extends AbstractContentAssistParser {
	
	@Inject
	private GraphixGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected net.winklerweb.cdoxtext.example.ui.contentassist.antlr.internal.InternalGraphixParser createParser() {
		net.winklerweb.cdoxtext.example.ui.contentassist.antlr.internal.InternalGraphixParser result = new net.winklerweb.cdoxtext.example.ui.contentassist.antlr.internal.InternalGraphixParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGraphixElementAccess().getAlternatives(), "rule__GraphixElement__Alternatives");
					put(grammarAccess.getCircleAccess().getAlternatives_5(), "rule__Circle__Alternatives_5");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getGraphixCanvasAccess().getGroup(), "rule__GraphixCanvas__Group__0");
					put(grammarAccess.getGraphixCanvasAccess().getGroup_7(), "rule__GraphixCanvas__Group_7__0");
					put(grammarAccess.getGraphixCanvasAccess().getGroup_7_1(), "rule__GraphixCanvas__Group_7_1__0");
					put(grammarAccess.getPointAccess().getGroup(), "rule__Point__Group__0");
					put(grammarAccess.getCircleAccess().getGroup(), "rule__Circle__Group__0");
					put(grammarAccess.getCircleAccess().getGroup_5_0(), "rule__Circle__Group_5_0__0");
					put(grammarAccess.getCircleAccess().getGroup_5_1(), "rule__Circle__Group_5_1__0");
					put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
					put(grammarAccess.getColorAccess().getGroup_3(), "rule__Color__Group_3__0");
					put(grammarAccess.getColorAccess().getGroup_3_6(), "rule__Color__Group_3_6__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getGraphixCanvasAccess().getLowerLeftBoundsAssignment_2(), "rule__GraphixCanvas__LowerLeftBoundsAssignment_2");
					put(grammarAccess.getGraphixCanvasAccess().getUpperRightBoundsAssignment_4(), "rule__GraphixCanvas__UpperRightBoundsAssignment_4");
					put(grammarAccess.getGraphixCanvasAccess().getContentAssignment_7_0(), "rule__GraphixCanvas__ContentAssignment_7_0");
					put(grammarAccess.getGraphixCanvasAccess().getContentAssignment_7_1_1(), "rule__GraphixCanvas__ContentAssignment_7_1_1");
					put(grammarAccess.getPointAccess().getXAssignment_2(), "rule__Point__XAssignment_2");
					put(grammarAccess.getPointAccess().getYAssignment_4(), "rule__Point__YAssignment_4");
					put(grammarAccess.getCircleAccess().getCenterAssignment_2(), "rule__Circle__CenterAssignment_2");
					put(grammarAccess.getCircleAccess().getRadiusAssignment_4(), "rule__Circle__RadiusAssignment_4");
					put(grammarAccess.getCircleAccess().getLineColorAssignment_5_0_1(), "rule__Circle__LineColorAssignment_5_0_1");
					put(grammarAccess.getCircleAccess().getFillColorAssignment_5_1_1(), "rule__Circle__FillColorAssignment_5_1_1");
					put(grammarAccess.getColorAccess().getNameAssignment_2(), "rule__Color__NameAssignment_2");
					put(grammarAccess.getColorAccess().getRedAssignment_3_1(), "rule__Color__RedAssignment_3_1");
					put(grammarAccess.getColorAccess().getGreenAssignment_3_3(), "rule__Color__GreenAssignment_3_3");
					put(grammarAccess.getColorAccess().getBlueAssignment_3_5(), "rule__Color__BlueAssignment_3_5");
					put(grammarAccess.getColorAccess().getAlphaAssignment_3_6_1(), "rule__Color__AlphaAssignment_3_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			net.winklerweb.cdoxtext.example.ui.contentassist.antlr.internal.InternalGraphixParser typedParser = (net.winklerweb.cdoxtext.example.ui.contentassist.antlr.internal.InternalGraphixParser) parser;
			typedParser.entryRuleGraphixCanvas();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GraphixGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GraphixGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
