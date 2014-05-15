package de.uni_marburg.splittr.analysis.crawl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.DirectedMultigraph;

import de.uni_marburg.splittr.analysis.IStructuralAnalyzer;
import de.uni_marburg.splittr.analysis.graph.ColouredEdge;
import de.uni_marburg.splittr.analysis.graph.EdgeKind;
import de.uni_marburg.splittr.analysis.graph.GraphBuilder;

public abstract class BaseReinforcementSpecificityAnalyzer implements
		IStructuralAnalyzer {
	protected double alpha;
	protected int iterations;
	protected Set<EObject> initialSet;
	protected GraphBuilder graphBuilder;
	protected DirectedMultigraph<EObject, ColouredEdge> graph;

	public BaseReinforcementSpecificityAnalyzer(double alpha, int iterations,
			GraphBuilder graphBuilder) {
		this.alpha = alpha;
		this.iterations = iterations;
		this.graphBuilder = graphBuilder;
	}

	@Override
	public Map<EObject, Double> findRelatedElements(EObject modelRoot,
			Map<EObject, Double> setOfInterest, Map<EObject, Double> irScores) {
		graph = graphBuilder.createDirectedMultigraph(modelRoot);
		Map<EObject, Double> relatedElements = new LinkedHashMap<EObject, Double>();
		relatedElements.putAll(setOfInterest);
		initialSet = new LinkedHashSet<EObject>();
		initialSet.addAll(setOfInterest.keySet());
		for (int i = 0; i < iterations; i++) {
			Map<EObject, Double> foundRelatedElements = findRelatedElementsIteration(
					modelRoot, relatedElements, irScores);
			if (foundRelatedElements.isEmpty()) { // fixpoint reached => end
				i = iterations;
			} else {
				relatedElements.putAll(foundRelatedElements);
			}
		}
		return relatedElements;
	}

	protected abstract Map<EObject, Double> findRelatedElementsIteration(
			EObject modelRoot, Map<EObject, Double> relatedElements,
			Map<EObject, Double> irScores);

	protected double calculcateDegree(double t, Collection<EObject> setU,
			Map<EObject, Double> setV) {
		Set<EObject> intersectionUV = new LinkedHashSet<EObject>();
		intersectionUV.addAll(setU);
		intersectionUV.retainAll(setV.keySet());

		return (t + intersectionUV.size()) / setU.size();
	}

	protected double calculcateMembership(Map<EObject, Double> setOfInterest,
			EObject o, List<EObject> related, List<EObject> tranposedRelated,
			EdgeKind edgeKind) {
		double oMembership = setOfInterest.get(o);
		double range1 = calculcateDegree(1, related, setOfInterest);
		double range2 = calculcateDegree(0, tranposedRelated, setOfInterest);
		double membership = Math.pow(oMembership * range1 * range2, alpha);
		return membership;
	}

	protected HashMap<EObject, Double> merge(Map<EObject, Double> setA,
			Map<EObject, Double> setB, boolean weightedMerge) {
		Set<EObject> elements = new LinkedHashSet<EObject>();
		elements.addAll(setA.keySet());
		elements.addAll(setB.keySet());

		HashMap<EObject, Double> result = new LinkedHashMap<EObject, Double>();
		for (EObject e : elements) {
			double membershipA = 0;
			double membershipB = 0;
			if (setA.containsKey(e))
				membershipA = setA.get(e);
			if (setB.containsKey(e))
				membershipB = setB.get(e);

			double membership = Math.max(membershipA, membershipB);
			// if (weightedMerge)
			// membership *= (1 / (1 + Math.min(membershipA, membershipB)));
			result.put(e, membership);
		}
		return result;
	}

	protected List<EdgeKind> getEdgeKinds() {
		if (graph != null && !graph.edgeSet().isEmpty()) {
			return graph.edgeSet().iterator().next().getEdgeKind().getEdgeKinds();
		} else {
			return new ArrayList<EdgeKind>(0);
		}
	}

}
