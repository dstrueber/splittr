package de.uni_marburg.splittr.analysis;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DirectedMultigraph;

import de.uni_marburg.splittr.analysis.graph.ColouredEdge;
import de.uni_marburg.splittr.util.NamingUtil;

public class OutputUtil {

	public static void printWeightedGraphToConsole(
			WeightedGraph<EObject, DefaultWeightedEdge> graph) {
		for (EObject v : graph.vertexSet()) {
			for (EObject w : graph.vertexSet()) {
				double weight = graph.getEdgeWeight(graph.getEdge(v, w));
				if (weight == Double.MAX_VALUE)
					System.out.print("X");
				else
					System.out.print((int) weight);
				
				System.out.print(" ");
			}
			System.out.println(NamingUtil.retreiveName(v));
			
		}
	}
	

	public static void printDirectedMultigraphToConsole(
			DirectedMultigraph<EObject, ColouredEdge> graph) {
		for (EObject v : graph.vertexSet()) {
			for (EObject w : graph.vertexSet()) {
				System.out.print(graph.getAllEdges(v, w).size());		
				System.out.print(" ");
			}
			System.out.println(NamingUtil.retreiveName(v));
			
		}
	}
	
}
