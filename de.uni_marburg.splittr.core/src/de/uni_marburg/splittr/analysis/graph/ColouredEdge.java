package de.uni_marburg.splittr.analysis.graph;

import org.jgrapht.graph.DefaultEdge;

public class ColouredEdge extends DefaultEdge {
	private static final long serialVersionUID = -7016663655766521488L;

	private EdgeKind edgeKind;
	
	public ColouredEdge(EdgeKind edgeKind) {
		this.edgeKind = edgeKind;
	}
	
	public EdgeKind getEdgeKind() {
		return edgeKind;
	}

	public void setEdgeKind(EdgeKind edgeKind) {
		this.edgeKind = edgeKind;
	}
	
	
}
