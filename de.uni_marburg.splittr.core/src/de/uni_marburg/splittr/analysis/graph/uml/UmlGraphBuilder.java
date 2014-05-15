package de.uni_marburg.splittr.analysis.graph.uml;		

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
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
public class UmlGraphBuilder extends GraphBuilder {

	public UmlGraphBuilder() {
	}

	public DirectedMultigraph<EObject, ColouredEdge> createDirectedMultigraph(
			EObject root)  {
		Package thePackage = (Package) root;
		List<EObject> allModelElements = new ArrayList<EObject>();
		for (TreeIterator<EObject> it = thePackage.eAllContents(); it.hasNext();) {
			EObject o = it.next();
			if (isVertex(o) || isEdge(o)) {
				allModelElements.add(o);
			}
		}

		return createDirectedMultigraph(allModelElements);
		// Todo: Nested Packages, models etc.
	}

	@Override
	public boolean isVertex(EObject o) {
		return (o instanceof Class) || (o instanceof Interface) || (o instanceof Enumeration);
	}

	@Override
	public boolean isEdge(EObject o) {
		return (o instanceof Association)
				|| (o instanceof InterfaceRealization);
	}
	@Override
	public DirectedMultigraph<EObject, ColouredEdge> createDirectedMultigraph(
			List<EObject> modelElements) {

		DirectedMultigraph<EObject, ColouredEdge> g = new DirectedMultigraph<EObject, ColouredEdge>(
				ColouredEdge.class);

		for (EObject object : modelElements) {
			if (!isNestedElement(object)
					&& (object instanceof Class || object instanceof Interface || object instanceof Enumeration)) {

//				 if (SubsetRegistry.subset.isEmpty()
//				 || SubsetRegistry.subset.contains(NamingUtil
//				 .retreiveName(object))) {
				g.addVertex(object);

//				 }
			}
		}

		for (EObject object : modelElements) {
			if (object instanceof Class) {
				createEdgesForSuperTypes((Class) object, g);
				createEdgesForEnumInstantiation((Class) object, g);
			} else if (object instanceof Association) {
				createEdgeForAssociation(object, g);
			} else if (object instanceof InterfaceRealization) {
				createEdgeForInterfaceRealization(
						(InterfaceRealization) object, g);
			}
		}

		return g;
	}

	private void createEdgesForEnumInstantiation(Class theClass,
			DirectedMultigraph<EObject, ColouredEdge> graph) {
		for (Property at : theClass.getAllAttributes()) { 
			if (at.getType() instanceof Enumeration) {
				Enumeration target = (Enumeration) at.getType();
				if (graph.containsVertex(target)) {
					EdgeKind kind = UmlEdgeKind.ENUM_INSTANTIATION;
					ColouredEdge edge = new ColouredEdge(kind);
					graph.addEdge(theClass, target, edge);	
				}
			}
		}		
	}

	private boolean isNestedElement(EObject object) {
		return (object.eContainer() instanceof ClassifierTemplateParameter)
				|| (object.eContainer() instanceof Class);
	}

	private ColouredEdge createEdgeForInterfaceRealization(
			InterfaceRealization realization,
			DirectedMultigraph<EObject, ColouredEdge> directedGraph) {

		EObject interf = realization.getContract();
		EObject impl = realization.getImplementingClassifier();
		EdgeKind kind = UmlEdgeKind.INTERFACE_REALIZATION;

		if (directedGraph.containsVertex(interf)
				&& directedGraph.containsVertex(impl)) {
			ColouredEdge edge = new ColouredEdge(kind);
			directedGraph.addEdge(impl, interf, edge);
			return edge;
		}
		return null;

	}

	private void createEdgesForSuperTypes(Class theClass,
			DirectedGraph<EObject, ColouredEdge> directedGraph) {
		for (Class superClass : theClass.getSuperClasses()) {
			if (directedGraph.containsVertex(superClass)
					&& directedGraph.containsVertex(theClass))
				directedGraph.addEdge(theClass, superClass, new ColouredEdge(
						UmlEdgeKind.GENERALIZATION));
		}
	}

	private void createEdgeForAssociation(EObject object,
			DirectedGraph<EObject, ColouredEdge> directedGraph) {
		Association association = (Association) object;

		ColouredEdge edge = createEdgeForAnAggregation(association,
				directedGraph);
		if (edge == null)
			edge = createEdgeForNonAggregation(association, directedGraph);

	}

	private ColouredEdge createEdgeForAnAggregation(Association association,
			DirectedGraph<EObject, ColouredEdge> directedGraph) {
		if (association.getMemberEnds().size() != 2)
			return null;

		Property aggregativeEnd = null;
		Property partEnd = null;
		EdgeKind kind = UmlEdgeKind.ASSOCIATION;

		for (Property end : association.getMemberEnds()) {
			EdgeKind foundKind = UmlEdgeKind.findForAssociationEnd(end);
			if (foundKind != UmlEdgeKind.ASSOCIATION) {
				kind = foundKind;
				aggregativeEnd = end;
			} else {
				partEnd = end;
			}
		}

		if (aggregativeEnd != null && partEnd != null) {
			EObject source = aggregativeEnd.getType();
			EObject target = partEnd.getType();

			if (directedGraph.containsVertex(source)
					&& directedGraph.containsVertex(target)) {
				ColouredEdge edge = new ColouredEdge(kind);
				directedGraph.addEdge(source, target, edge);
				return edge;
			}
		}
		return null;
	}

	private ColouredEdge createEdgeForNonAggregation(Association association,
			DirectedGraph<EObject, ColouredEdge> directedGraph) {
		ColouredEdge edge = null;
		List<Property> navigableEnds = getNavigableEnds(association);
		List<Property> unnavigableEnds = getUnNavigableEnds(association);
		EObject source = null;
		EObject target = null;
		if (navigableEnds.size() == 2 || navigableEnds.size() == 0) {
			source = association.getMemberEnds().get(0).getType();
			target = association.getMemberEnds().get(1).getType();

		}

		if (navigableEnds.size() == 1 && unnavigableEnds.size() == 1) {
			source = unnavigableEnds.get(0).getType();
			target = navigableEnds.get(0).getType();
		}

		if (directedGraph.containsVertex(source)
				&& directedGraph.containsVertex(target)) {
			edge = new ColouredEdge(UmlEdgeKind.ASSOCIATION);
			directedGraph.addEdge(source, target, edge);
		}

		return edge;
		// Todo: Treatment for n-ary associations
	}

	private List<Property> getNavigableEnds(Association association) {
		ArrayList<Property> result = new ArrayList<Property>();
		for (Property p : association.getMemberEnds()) {
			if (p.isNavigable())
				result.add(p);
		}
		return result;
	}

	private List<Property> getUnNavigableEnds(Association association) {
		ArrayList<Property> result = new ArrayList<Property>();
		for (Property p : association.getMemberEnds()) {
			if (!p.isNavigable())
				result.add(p);
		}
		return result;
	}

}
