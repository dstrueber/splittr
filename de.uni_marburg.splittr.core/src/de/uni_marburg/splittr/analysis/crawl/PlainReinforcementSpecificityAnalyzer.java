package de.uni_marburg.splittr.analysis.crawl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.DirectedMultigraph;

import de.uni_marburg.splittr.analysis.IStructuralAnalyzer;
import de.uni_marburg.splittr.analysis.graph.ColouredEdge;
import de.uni_marburg.splittr.analysis.graph.EdgeKind;
import de.uni_marburg.splittr.analysis.graph.GraphBuilder;

public class PlainReinforcementSpecificityAnalyzer extends
		BaseReinforcementSpecificityAnalyzer implements IStructuralAnalyzer {

	public PlainReinforcementSpecificityAnalyzer(double alpha, int iterations, GraphBuilder graphBuilder) {
		super(alpha, iterations, graphBuilder);
	}

	protected Map<EObject, Double> findRelatedElementsIteration(
			EObject modelRoot, Map<EObject, Double> setOfInterest, Map<EObject, Double> irScores) {
		List<EdgeKind> edgeKinds = getEdgeKinds();

		HashMap<EObject, Double> suggestionSet = new HashMap<EObject, Double>();
		for (EdgeKind e : edgeKinds) {
			HashMap<EObject, Double> temporarySet = analyze(graph, e,
					setOfInterest);
			suggestionSet = merge(temporarySet, suggestionSet, true);
		}

		return suggestionSet;
	}

	private HashMap<EObject, Double> analyze(
			DirectedMultigraph<EObject, ColouredEdge> graph, EdgeKind edgeKind,
			Map<EObject, Double> setOfInterest) {
		HashMap<EObject, Double> result = new HashMap<EObject, Double>();

		for (EObject o : setOfInterest.keySet()) {
			List<EObject> related = getRelatedElementsForKind(graph, edgeKind,
					o);

			for (EObject o2 : related) {
				if (!setOfInterest.containsKey(o2)) {
					List<EObject> tranposedRelated = getTransposedRelatedElementsForKind(
							graph, edgeKind, o2);
					double membership = calculcateMembership(setOfInterest, o,
							related, tranposedRelated, edgeKind);
					result.put(o2, membership);
				}
			}
		}

		return result;
	}


	private List<EObject> getRelatedElementsForKind(
			DirectedMultigraph<EObject, ColouredEdge> graph, EdgeKind edgeKind,
			EObject o) {
		List<EObject> relatedElementsForKind = new ArrayList<EObject>();

		for (ColouredEdge e : graph.outgoingEdgesOf(o)) {
			if (e.getEdgeKind() == edgeKind) {
				relatedElementsForKind.add(graph.getEdgeTarget(e));
			}
		}
		return relatedElementsForKind;
	}

	private List<EObject> getTransposedRelatedElementsForKind(
			DirectedMultigraph<EObject, ColouredEdge> graph, EdgeKind edgeKind,
			EObject o) {
		List<EObject> relatedElementsForKind = new ArrayList<EObject>();
		for (ColouredEdge e : graph.incomingEdgesOf(o)) {
			if (e.getEdgeKind() == edgeKind) {
				relatedElementsForKind.add(graph.getEdgeSource(e));
			}
		}
		return relatedElementsForKind;
	}


	protected double calculcateMembership(Map<EObject, Double> setOfInterest,
			EObject o, List<EObject> related, List<EObject> tranposedRelated, EdgeKind edgeKind) {
		double oMembership = setOfInterest.get(o);
		double specificity = calculcateDegree(1, related, setOfInterest);
//		double specificity = 1.0;
		double reinforcedness = calculcateDegree(0, tranposedRelated,
				setOfInterest);
		double membership = Math.pow(
				oMembership * specificity * reinforcedness, alpha);
		return membership;
	}
}
