package de.uni_marburg.splittr.evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.DirectedMultigraph;

import de.uni_marburg.splittr.analysis.graph.ColouredEdge;
import de.uni_marburg.splittr.analysis.graph.EdgeKind;
import de.uni_marburg.splittr.analysis.graph.ecore.EcoreEdgeKind;

public class OverallAverageRegistry {
	public static List<Double> entries = new ArrayList<Double>();
	public static Set<DirectedMultigraph<EObject, ColouredEdge>> graphs = new HashSet<DirectedMultigraph<EObject, ColouredEdge>>();
	public OverallAverageRegistry() {
		 
	}
	
	public static String average() {
		double sum = 0;
		for (Double e : entries)
			sum+=e;
		return "Durchschnitt F-measure: "+(sum / entries.size());
	} 
	
	public static void printGraphs() {
		for (DirectedMultigraph<EObject, ColouredEdge> g : graphs) {
			System.out.println(g.vertexSet());
			Map<EdgeKind,Integer> count = new HashMap<EdgeKind,Integer>();
			for (EcoreEdgeKind v : EcoreEdgeKind.values()) {
				count.put(v, 0);
			}
			int classes = 0;
			int enums = 0;
			for ( EObject v : g.vertexSet()) {
				if ( v instanceof EClass)
					classes++;
				else if ( v instanceof EEnum)
					enums++;
				
				for ( EObject w : g.vertexSet()) {
					for (ColouredEdge e : g.getAllEdges(v, w)) {
						count.put(e.getEdgeKind(), count.get(e.getEdgeKind())+1);
					}
				}
			}
			

			String result1 = "Classes & Enums & ";
			String result2 = classes+ " & " +enums + " & " ;
			

			for (EcoreEdgeKind v : EcoreEdgeKind.values()) {
				result1 += v + " & ";
				result2 += count.get(v) + " & ";
			}
			
			System.out.println(result1);
			System.out.println(result2);
		}
	}
	
}


