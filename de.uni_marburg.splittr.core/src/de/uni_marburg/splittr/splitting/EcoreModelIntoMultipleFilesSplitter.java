package de.uni_marburg.splittr.splitting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * @author Selterm, Daniel Strüber
 * 
 */
public class EcoreModelIntoMultipleFilesSplitter {

	private SubModelAssignmentResult assignment;
	/**
	 * Default Constructor
	 */
	public EcoreModelIntoMultipleFilesSplitter(SubModelAssignmentResult assignment) {
		this.assignment = assignment;
	}

	/**
	 * loads a new ResourceSet
	 * @return resourceSet
	 */
	private ResourceSet loadResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMLResourceFactoryImpl());
		return resourceSet;
	}

	/**
	 * builds a new EPackage for each Component and creates a new Resource for
	 * each EPackage
	 * 
	 * @param components
	 *            List of all Components which will be saved to the given path
	 * @param path
	 *            where the components will be saved
	 */
	public void saveAll(String path) {
		List<Resource> resourceList = new ArrayList<Resource>();
		ResourceSet resourceSet = loadResourceSet();
		for (SubModel component : assignment.getSubModels()) {
			EcoreFactory eFactory = EcoreFactory.eINSTANCE;
			EPackage ePackage = eFactory.createEPackage();
			String name = component.getName();
			ePackage.setName(name);
			ePackage.setNsPrefix(name);
			ePackage.setNsURI("http://" + name);
			for (SubModelAssignmentResultEntry e : assignment.findResultEntriesBySubModel(component)) {
				if (e.getRelevantElement() instanceof EClassifier) {
					ePackage.getEClassifiers().add((EClassifier) e.getRelevantElement());				
				} else {
					System.err.println(e.getRelevantElement() + " is not a classifier.");
				}
			}
			URI uri = URI.createFileURI(new File(path + component.getName()
					+ ".ecore").getAbsolutePath());
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(ePackage);
			resourceList.add(resource);
		}
		for (Resource resource : resourceList) {
			try {
				resource.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}



}
