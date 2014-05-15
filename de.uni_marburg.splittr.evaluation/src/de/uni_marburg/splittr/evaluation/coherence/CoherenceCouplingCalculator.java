package de.uni_marburg.splittr.evaluation.coherence;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.DirectedMultigraph;

import de.uni_marburg.splittr.analysis.graph.ColouredEdge;
import de.uni_marburg.splittr.analysis.graph.GraphBuilder;
import de.uni_marburg.splittr.evaluation.OverallAverageRegistry;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;
import de.uni_marburg.splittr.util.FileIOUtil;
import de.uni_marburg.splittr.util.NamingUtil;

public class CoherenceCouplingCalculator {

	private static GraphBuilder gb;

	public static Map<SubModel, CoherenceCouplingEntry> performCalculation(
			EObject modelRoot, SubModelAssignmentResult fltResult) {
		Map<SubModel, CoherenceCouplingEntry> result = new LinkedHashMap<SubModel, CoherenceCouplingEntry>();

		gb = FileIOUtil.createGraphBuilder(modelRoot);
		DirectedMultigraph<EObject, ColouredEdge> graph = gb
				.createDirectedMultigraph(modelRoot);
		OverallAverageRegistry.graphs.add(graph);

		Map<SubModel, Collection<EObject>> decompositionUnits = collectDecompositionUnits(fltResult);

		for (SubModel f : decompositionUnits.keySet()) {
			CoherenceCouplingEntry m = calculateSubgraphMetrics(graph,
					decompositionUnits.get(f));
			result.put(f, m);
		}

		return result;
	}

	// public Map<Feature,MetricsResultEntry> calculateSubgraphMetrics(
	// EObject modelRoot,
	// Map<Feature,Collection<EObject>> subgraphs) {
	// Map<Feature,MetricsResultEntry> result = new
	// LinkedHashMap<Feature,MetricsResultEntry>();
	//
	// UmlGraphBuilder gb = new UmlGraphBuilder();
	// gb.createDissimilarityGraph(modelRoot);
	//
	// return result;
	// }

	private static Map<SubModel, Collection<EObject>> collectDecompositionUnits(
			SubModelAssignmentResult fltResult) {
		LinkedHashMap<SubModel, Collection<EObject>> result = new LinkedHashMap<SubModel, Collection<EObject>>();
		for (SubModel s : fltResult.getSubModels()) {
			result.put(s, new HashSet<EObject>());
		}
		for (SubModel s : fltResult.getSubModels()) {
			for (SubModelAssignmentResultEntry e : fltResult
					.findResultEntriesBySubModel(s)) {
				result.get(s).add(e.getRelevantElement());
			}
		}
		return result;
	}

	private static CoherenceCouplingEntry calculateSubgraphMetrics(
			DirectedMultigraph<EObject, ColouredEdge> graph,
			Collection<EObject> subgraph) {
		int interEdges = 0;
		int intraEdges = 0;

		for (EObject node : subgraph) {
			if (graph.containsVertex(node)) {
				for (ColouredEdge e : graph.outgoingEdgesOf(node)) {
					if (subgraph.contains(graph.getEdgeTarget(e)))
						intraEdges++;
					// intraEdges+=e.getEdgeKind().getWeight()/(double)e.getEdgeKind().getMaximumWeight();
					else
						interEdges++;
					// interEdges+=e.getEdgeKind().getWeight()/(double)e.getEdgeKind().getMaximumWeight();
				}
				for (ColouredEdge e : graph.incomingEdgesOf(node)) {
					if (subgraph.contains(graph.getEdgeSource(e)))
						intraEdges++;
					// intraEdges+=e.getEdgeKind().getWeight()/(double)e.getEdgeKind().getMaximumWeight();
					else
						interEdges++;
					// interEdges+=e.getEdgeKind().getWeight()/(double)e.getEdgeKind().getMaximumWeight();
				}
			}
		}
		return new CoherenceCouplingEntry(intraEdges / 2, interEdges / 2);
	}

	public static Map<SubModel, CoherenceCouplingEntry> performCalculcationForRefereeData(
			EObject modelRoot, Map<String, Set<String>> refereeData,
			SubModelAssignmentResult fltResult) {
		Map<SubModel, CoherenceCouplingEntry> result = new LinkedHashMap<SubModel, CoherenceCouplingEntry>();

		GraphBuilder gb = FileIOUtil.createGraphBuilder(modelRoot);
		DirectedMultigraph<EObject, ColouredEdge> graph = gb
				.createDirectedMultigraph(modelRoot);
		Map<SubModel, Collection<EObject>> decompositionUnits = collectDecompositionUnitsForRefereeData(
				modelRoot, refereeData, fltResult);

		for (SubModel f : decompositionUnits.keySet()) {
			CoherenceCouplingEntry m = calculateSubgraphMetrics(graph,
					decompositionUnits.get(f));
			result.put(f, m);
		}

		return result;
	}

	private static Map<SubModel, Collection<EObject>> collectDecompositionUnitsForRefereeData(
			EObject modelRoot, Map<String, Set<String>> refereeData,
			SubModelAssignmentResult fltResult) {
		LinkedHashMap<SubModel, Collection<EObject>> result = new LinkedHashMap<SubModel, Collection<EObject>>();
		for (String featureName : refereeData.keySet()) {
			result.put(fltResult.findSubModelByName(featureName),
					new HashSet<EObject>());
		}
		for (String subModel : refereeData.keySet()) {
			SubModel f = fltResult.findSubModelByName(subModel);
			for (String objectName : refereeData.get(subModel)) {
				EObject object = findElementInModel(modelRoot, objectName);
				if (object == null)
					throw new RuntimeException("Object " + objectName
							+ " expected in " + subModel
							+ " not found in model.");
				result.get(f).add(object);
			}
		}
		return result;
	}

	private static EObject findElementInModel(EObject modelRoot,
			String objectName) {
		objectName = nameTreatment(objectName);
		for (TreeIterator<EObject> it = modelRoot.eAllContents(); it.hasNext();) {
			EObject o = it.next();
			if (gb.isVertex(o)) {
				String elemName = nameTreatment(NamingUtil.retreiveName(o));
				if (elemName != null && elemName.equals(objectName))
					return o;
			}
		}
		return null;
	}

	private static String nameTreatment(String name) {
		if (name.matches("[A-Z][A-Z][a-z].*")) {
			return name.substring(1);
		} else
			return name;
	}
}
