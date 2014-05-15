package de.uni_marburg.splittr.indexing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * A registry responsible for maintaining a mapping from model elements to
 * documents and back.
 * 
 * @author strueber
 * 
 */
public class ModelElementRegistry {

	private Map<EObject, String> modelElement2document;
	private Map<String, Set<EObject>> document2modelElement;

	private static ModelElementRegistry INSTANCE = new ModelElementRegistry();

	private ModelElementRegistry() {
		modelElement2document = new HashMap<EObject, String>();
		document2modelElement = new HashMap<String, Set<EObject>>();
	}

	public static ModelElementRegistry getInstance() {
		return INSTANCE;
	}

	public void registerPair(EObject modelElement, String document) {
		modelElement2document.put(modelElement, document);
		if (document2modelElement.containsKey(document)) {
			document2modelElement.get(document).add(modelElement);
		} else {
			Set<EObject> newSet = new HashSet<EObject>();
			newSet.add(modelElement);
			document2modelElement.put(document, newSet);
		}
	}

	public String query(EObject modelElement) {
		return modelElement2document.get(modelElement);
	}

	public Set<EObject> query(String document) {
		return document2modelElement.get(document);
	}
	
	public void clear() {
		modelElement2document.clear();
		document2modelElement.clear();
	}

}
