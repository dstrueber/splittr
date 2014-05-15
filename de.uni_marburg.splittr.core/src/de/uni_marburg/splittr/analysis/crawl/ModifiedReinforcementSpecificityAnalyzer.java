package de.uni_marburg.splittr.analysis.crawl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.DirectedMultigraph;

import de.uni_marburg.splittr.analysis.IStructuralAnalyzer;
import de.uni_marburg.splittr.analysis.graph.ColouredEdge;
import de.uni_marburg.splittr.analysis.graph.EdgeKind;
import de.uni_marburg.splittr.analysis.graph.GraphBuilder;

public class ModifiedReinforcementSpecificityAnalyzer extends
		BaseReinforcementSpecificityAnalyzer implements IStructuralAnalyzer {

	public ModifiedReinforcementSpecificityAnalyzer(double alpha,
			int iterations, GraphBuilder graphBuilder) {
		super(alpha, iterations, graphBuilder);
	}

	protected Map<EObject, Double> findRelatedElementsIteration(
			EObject modelRoot, Map<EObject, Double> setOfInterest,
			Map<EObject, Double> irScores) {

		List<EdgeKind> edgeKinds = getEdgeKinds();

		Map<EObject, Double> suggestionSet = new LinkedHashMap<EObject, Double>();
		for (EdgeKind e : edgeKinds) {
			Map<EObject, Double> temporarySet = analyze(graph, e, setOfInterest);
			for (EObject o : temporarySet.keySet()) {
				if (irScores.containsKey(o))
					temporarySet.put(o,
							merge(irScores.get(o), temporarySet.get(o)));
			}
			suggestionSet = merge(temporarySet, suggestionSet, true);
		}

		return suggestionSet;
	}

	private Map<EObject, Double> analyze(
			DirectedMultigraph<EObject, ColouredEdge> graph, EdgeKind edgeKind,
			Map<EObject, Double> setOfInterest) {
		Map<EObject, Double> result = new LinkedHashMap<EObject, Double>();

		for (EObject o : setOfInterest.keySet()) {
			List<EObject> relatedOfO = getRelatedElementsForKind(graph,
					edgeKind, o);

			for (EObject o2 : relatedOfO) {
				if (!setOfInterest.containsKey(o2)) {
					List<EObject> relatedOfO2 = getRelatedElementsForKind(
							graph, edgeKind, o2);
					double membership = calculcateMembership(setOfInterest, o,
							relatedOfO, relatedOfO2, edgeKind);
					if (result.get(o2) != null) {
						membership = merge(membership, result.get(o2));
					}
					result.put(o2, membership);
				}
			}
		}

		return result;
	}

	private List<EObject> getRelatedElementsForKind(
			DirectedMultigraph<EObject, ColouredEdge> graph, EdgeKind edgeKind,
			EObject o) {
		List<EObject> result = new ArrayList<EObject>();
		if (graph.containsVertex(o)) {
			for (ColouredEdge e : graph.outgoingEdgesOf(o)) {
				if (e.getEdgeKind() == edgeKind) {
					result.add(graph.getEdgeTarget(e));
				}
			}
			for (ColouredEdge e : graph.incomingEdgesOf(o)) {
				if (e.getEdgeKind() == edgeKind) {
					result.add(graph.getEdgeSource(e));
				}
			}
		}
		return result;
	}

	private double merge(double a, double b) {
		double max = Math.max(a, b);
		double rhs = (max - Math.abs(a - b)) * (1 - max);
		return max + rhs;
	}
}
