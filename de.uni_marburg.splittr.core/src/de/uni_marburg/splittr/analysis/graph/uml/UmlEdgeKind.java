package de.uni_marburg.splittr.analysis.graph.uml;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Property;

import de.uni_marburg.splittr.analysis.graph.EdgeKind;

/**
 * Daniel Strüber
 * @author strueber
 *
 */
public enum UmlEdgeKind implements EdgeKind {

	GENERALIZATION (10), ENUM_INSTANTIATION(10), COMPOSITION (5), AGGREGATION (3), ASSOCIATION (1), INTERFACE_REALIZATION(3); 
	
	private double weight;
	
	UmlEdgeKind(double defaultWeight) {
		this.weight = defaultWeight;
	}
	
	public static UmlEdgeKind findForAssociationEnd(Property property)  {
		switch (property.getAggregation()) {
		case COMPOSITE_LITERAL: return COMPOSITION;
		case SHARED_LITERAL: return AGGREGATION;
		case NONE_LITERAL: return ASSOCIATION;
		default: return ASSOCIATION;
		}
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
