package de.uni_marburg.splittr.analysis.graph;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.DirectedMultigraph;

/**
 * 
 * @author Daniel Strüber
 * 
 */
public abstract class GraphBuilder {
	public GraphBuilder() {
	}

	/**
	 * For the given set of objects (model elements), create a graph that
	 * represents the objects as nodes and their relationships, as predefined by
	 * the modeling language, as edges
	 * 
	 * @param modelElements
	 * @return
	 */
	public abstract DirectedMultigraph<EObject, ColouredEdge> createDirectedMultigraph(
			List<EObject> modelElements);

	/**
	 * For the given root model element, create a graph that represents the
	 * model contained in the root, with objects as nodes and their
	 * relationships, as predefined by the modeling language, as edges
	 * 
	 * @param modelElements
	 * @return
	 */
	public abstract DirectedMultigraph<EObject, ColouredEdge> createDirectedMultigraph(
			EObject root);

	/**
	 * Is the given model element considered a vertex during graph construction?
	 * @param object
	 * @return
	 */
	public abstract boolean isVertex(EObject object);
	

	/**
	 * Is the given model element considered an edge during graph construction?
	 * @param object
	 * @return
	 */
	public abstract boolean isEdge(EObject object);
}
