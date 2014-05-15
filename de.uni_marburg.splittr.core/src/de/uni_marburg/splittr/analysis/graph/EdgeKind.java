package de.uni_marburg.splittr.analysis.graph;

import java.util.List;

public interface EdgeKind {
	public double getWeight();

	public void setWeight(double weight);

	public List<EdgeKind> getEdgeKinds();

	public double getMaximumWeight();
	

}
