package de.uni_marburg.splittr.analysis.graph.ecore;

import java.util.ArrayList;
import java.util.List;

import de.uni_marburg.splittr.analysis.graph.EdgeKind;

/**
 * Daniel Strüber
 * @author strueber
 *
 */
public enum EcoreEdgeKind implements EdgeKind {

	GENERALIZATION (10), ENUM_INSTANTIATION(10), CONTAINMENT (5),  REFERENCE (1), INTERFACE_REALIZATION(3); 
	
	private double weight;
	
	EcoreEdgeKind(double defaultWeight) {
		this.weight = defaultWeight;
	}
	

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public List<EdgeKind> getEdgeKinds() {
		List<EdgeKind> result = new ArrayList<EdgeKind>(values().length);
		for (int i = 0; i<values().length; i++) {
			result.add(values()[i]);
		}
		return result;
	}

	@Override
	public double getMaximumWeight() {
		double result = 0.0;
		for (int i = 0; i<values().length; i++) {
			result = Math.max(values()[i].getWeight(), result);
		}
		return result;
	}
}
