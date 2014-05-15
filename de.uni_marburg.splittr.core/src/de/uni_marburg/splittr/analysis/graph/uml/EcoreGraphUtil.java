package de.uni_marburg.splittr.analysis.graph.uml;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class EcoreGraphUtil {

	public static EObject findNamedElement(WeightedGraph<EObject, DefaultWeightedEdge> graph, String name) {
		for (EObject o : graph.vertexSet()) {
			if (o instanceof ENamedElement) {
				if (name.equals(((ENamedElement) o).getName()))
					return o;
			}
		}
		return null;
	}
}
