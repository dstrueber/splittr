package de.uni_marburg.splittr.analysis.graph.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DirectedMultigraph;

import de.uni_marburg.splittr.analysis.graph.ColouredEdge;
import de.uni_marburg.splittr.analysis.graph.EdgeKind;
import de.uni_marburg.splittr.analysis.graph.GraphBuilder;

/**
 * 
 * @author Daniel Strüber
 * 
 */
public class EcoreGraphBuilder extends GraphBuilder {

	public EcoreGraphBuilder() {
	}
	
	@Override
	public DirectedMultigraph<EObject, ColouredEdge> createDirectedMultigraph(
			EObject root) {
		EPackage thePackage = (EPackage) root;
		List<EObject> allModelElements = new ArrayList<EObject>();
		for (TreeIterator<EObject> it = thePackage.eAllContents(); it.hasNext();) {
			EObject o = it.next();
			if (isVertex(o) || isEdge(o)) {
				allModelElements.add(o);
			}
		}

		return createDirectedMultigraph(allModelElements);
	}


	@Override
	public boolean isVertex(EObject o) {
		return (o instanceof EClass) || (o instanceof EEnum);
	}
	


	@Override
	public boolean isEdge(EObject o) {
		return (o instanceof EReference);
	}

	@Override
	public DirectedMultigraph<EObject, ColouredEdge> createDirectedMultigraph(
			List<EObject> modelElements) {
		DirectedMultigraph<EObject, ColouredEdge> g = new DirectedMultigraph<EObject, ColouredEdge>(
				ColouredEdge.class);

		for (EObject object : modelElements) {
			if (object instanceof EClass || object instanceof EEnum) {
				g.addVertex(object);
			}
		}

		for (EObject object : modelElements) {
			if (object instanceof EClass) {
				createEdgesForSupertypes((EClass) object, g);
				createEdgesForEnumInstantiation((EClass) object, g);
			} else if (object instanceof EReference) {
				createEdgeForReference(object, g);
			}
		}
		
		return g;
	}

	private void createEdgesForSupertypes(EClass theClass,
			DirectedGraph<EObject, ColouredEdge> graph) {
		for (EClass superClass : theClass.getESuperTypes()) {
			if (graph.containsVertex(superClass)
					&& graph.containsVertex(theClass)) {
				EdgeKind kind = superClass.isInterface() ? EcoreEdgeKind.INTERFACE_REALIZATION
						: EcoreEdgeKind.GENERALIZATION;
				ColouredEdge edge = new ColouredEdge(kind);
				graph.addEdge(theClass, superClass, edge);
			}
		}
	}
	

	private void createEdgesForEnumInstantiation(EClass theClass,
			DirectedMultigraph<EObject, ColouredEdge> graph) {
		for (EAttribute at : theClass.getEAllAttributes()) { 
			if (at.getEType() instanceof EEnum) {
				EEnum target = (EEnum) at.getEType();
				if (graph.containsVertex(target)) {
					EdgeKind kind = EcoreEdgeKind.ENUM_INSTANTIATION;
					ColouredEdge edge = new ColouredEdge(kind);
					graph.addEdge(theClass, target, edge);	
				}
			}
		}
	}


	private void createEdgeForReference(EObject theReference,
			DirectedGraph<EObject, ColouredEdge> graph) {
		EReference reference = (EReference) theReference;

		EObject source = reference.eContainer();
		EObject target = reference.getEType();

		if (graph.containsVertex(source)
				&& graph.containsVertex(target)) {
			EdgeKind kind = reference.isContainment() ? EcoreEdgeKind.CONTAINMENT
					: EcoreEdgeKind.REFERENCE;
			ColouredEdge edge = new ColouredEdge(kind);
			graph.addEdge(source, target, edge);
		}
	}

}
