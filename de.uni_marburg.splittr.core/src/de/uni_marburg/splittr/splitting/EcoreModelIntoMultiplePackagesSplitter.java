package de.uni_marburg.splittr.splitting;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

/**
 * @author Daniel Strüber
 * 
 */
public class EcoreModelIntoMultiplePackagesSplitter {

	private SubModelAssignmentResult assignment;

	/**
	 * Default Constructor
	 */
	public EcoreModelIntoMultiplePackagesSplitter(
			SubModelAssignmentResult assignment) {
		this.assignment = assignment;
	}

	/**
	 * loads a new ResourceSet
	 * 
	 * @return resourceSet
	 */
	private ResourceSet loadResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMLResourceFactoryImpl());
		return resourceSet;
	}

	/**
	 * Saves the model at the provided path under the provided name.
	 * 
	 * @param path
	 * @param name
	 */
	public void save(String path, String name) {
		ResourceSet resourceSet = loadResourceSet();
		EcoreFactory eFactory = EcoreFactory.eINSTANCE;
		EPackage ePackage = eFactory.createEPackage();
		ePackage.setName(name);
		ePackage.setNsPrefix(name);
		ePackage.setNsURI("http://" + name);
		for (SubModel component : assignment.getSubModels()) {
			String subModelName = component.getName();
			EPackage subPackage = eFactory.createEPackage();
			subPackage.setName(subModelName);
			subPackage.setNsPrefix(name + "." +subModelName);
			subPackage.setNsURI("http://" + name + "/" + subModelName);
			for (SubModelAssignmentResultEntry e : assignment
					.findResultEntriesBySubModel(component)) {
				if (e.getRelevantElement() instanceof EClassifier) {
					subPackage.getEClassifiers().add(
							(EClassifier) e.getRelevantElement());
				} else {
					System.err.println(e.getRelevantElement()
							+ " is not a classifier.");
				}
			}
		if (!subPackage.getEClassifiers().isEmpty())
			ePackage.getESubpackages().add(subPackage);
			
		}
		URI uri = URI.createFileURI(new File(path).getAbsolutePath());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(ePackage);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
