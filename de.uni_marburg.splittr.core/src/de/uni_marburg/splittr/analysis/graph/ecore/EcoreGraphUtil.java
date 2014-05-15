package de.uni_marburg.splittr.analysis.graph.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class EcoreGraphUtil {

	public static EObject findNamedElement(WeightedGraph<EObject, DefaultWeightedEdge> graph, String name) {
		for (EObject o : graph.vertexSet()) {
			if (o instanceof NamedElement) {
				if (name.equals(((NamedElement) o).getName()))
					return o;
			}
		}
		return null;
	}
}
