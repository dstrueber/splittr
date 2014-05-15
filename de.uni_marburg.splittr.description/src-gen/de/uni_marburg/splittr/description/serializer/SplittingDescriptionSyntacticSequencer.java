package de.uni_marburg.splittr.description.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

import com.google.inject.Inject;

import de.uni_marburg.splittr.description.services.SplittingDescriptionGrammarAccess;

@SuppressWarnings("all")
public class SplittingDescriptionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SplittingDescriptionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SplittingDescription_FineTuneKeyword_5_0_0_a;
	protected AbstractElementAlias match_SplittingDescription_FineTuneKeyword_5_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SplittingDescriptionGrammarAccess) access;
		match_SplittingDescription_FineTuneKeyword_5_0_0_a = new TokenAlias(true, true, grammarAccess.getSplittingDescriptionAccess().getFineTuneKeyword_5_0_0());
		match_SplittingDescription_FineTuneKeyword_5_0_0_p = new TokenAlias(true, false, grammarAccess.getSplittingDescriptionAccess().getFineTuneKeyword_5_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_SplittingDescription_FineTuneKeyword_5_0_0_a.equals(syntax))
				emit_SplittingDescription_FineTuneKeyword_5_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SplittingDescription_FineTuneKeyword_5_0_0_p.equals(syntax))
				emit_SplittingDescription_FineTuneKeyword_5_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'fine-tune'*
	 */
	protected void emit_SplittingDescription_FineTuneKeyword_5_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'fine-tune'+
	 */
	protected void emit_SplittingDescription_FineTuneKeyword_5_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
