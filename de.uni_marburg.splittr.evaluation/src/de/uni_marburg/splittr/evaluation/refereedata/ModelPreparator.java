package de.uni_marburg.splittr.evaluation.refereedata;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;

import de.uni_marburg.splittr.util.FileIOUtil;

/**
 * Automates two elementary steps of preparing the input UML class model for evaluation:
 * Generates the referee data (one list of class names per sub-package) and moves the
 * classes from the sub-packages to the main package.
 * 
 * @author strueber
 *
 */
public class ModelPreparator {
	
	public static void main(String[] args) {
		ResourceSet rs = new ResourceSetImpl();
		String inputModelPath = "fuml.uml";
		Model m = (Model) FileIOUtil.loadUmlModel(inputModelPath, rs);
		
		writeRefereeDataToFiles(m, "input/fuml/referee");
		moveClasses(m);
		FileIOUtil.saveResource(m, "fuml-2.uml");
	}
	
	public static void writeRefereeDataToFiles(Model model, String outputPath) {
		for (NamedElement p : model.getMembers()) {
			if (p instanceof Package) {
				StringBuilder sb = new StringBuilder();
				for (NamedElement c : ((Package) p).getMembers()) {
					if (c instanceof Class) {
						sb.append(c.getName());
						sb.append(System.lineSeparator());
					}
				}
				String filePath = outputPath + File.separator + p.getName();
				FileIOUtil.simpleWriteToFile(filePath, sb.toString().trim());
			}
		}
	}
	
	public static void moveClasses(Model model) {
		List<PackageableElement> moveThose = new ArrayList<PackageableElement>();
		for (NamedElement n : model.getMembers()) {
			if (n instanceof Package) {
				for (NamedElement packageable : ((Package) n).getMembers()) {
					if (packageable instanceof PackageableElement ) 
					moveThose.add((PackageableElement) packageable);
				}
			}
		}

		model.getPackagedElements().addAll(moveThose);
	}
}
