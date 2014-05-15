package de.uni_marburg.splittr.analysis.crawl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.analysis.IStructuralAnalyzer;
import de.uni_marburg.splittr.analysis.graph.EdgeKind;
import de.uni_marburg.splittr.analysis.graph.GraphBuilder;

public class ModifiedReinforcementSpecificityWeightedAnalyzer extends
ModifiedReinforcementSpecificityAnalyzer implements IStructuralAnalyzer {

	public ModifiedReinforcementSpecificityWeightedAnalyzer(double alpha,
			int iterations, GraphBuilder graphBuilder) {
		super(alpha, iterations, graphBuilder);
	}
	
	protected double calculcateMembership(Map<EObject, Double> setOfInterest,
			EObject o, List<EObject> related, List<EObject> tranposedRelated, EdgeKind edgeKind) {
		double oMembership = setOfInterest.get(o);
		double enumi = intersection(tranposedRelated, setOfInterest).size();
		double nomi = related.size() * tranposedRelated.size();
		double specificityreinforcedness = enumi / nomi;
		double edgeWeightFactor = edgeKind.getWeight() / (double) edgeKind.getMaximumWeight();
		double membership = Math.pow(
				oMembership * specificityreinforcedness * edgeWeightFactor, alpha);
		return membership;
	}
	

	protected LinkedHashSet<EObject> intersection(Collection<EObject> setU,
			Map<EObject, Double> setV) {
		LinkedHashSet<EObject> intersectionUV = new LinkedHashSet<EObject>();
		intersectionUV.addAll(setU);
		intersectionUV.retainAll(setV.keySet());
		return intersectionUV;
	}

}
