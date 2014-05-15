package de.uni_marburg.splittr.uml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;

import de.uni_marburg.splittr.indexing.IDocumentFromModelGenerator;
import de.uni_marburg.splittr.indexing.LsaQueryInput;
import de.uni_marburg.splittr.indexing.ModelElementRegistry;
import de.uni_marburg.splittr.util.FileIOUtil;

/**
 * Reads a UML model and creates a set of documents corresponding to the
 * significant model elements of the UML model.
 * 
 * @author strueber
 * 
 */
public class UmlDocumentGenerator implements IDocumentFromModelGenerator {
	/**
	 * Coefficient for weighting the main name, as opposed to all other names
	 * (attributes, relations...) names associated to one class.
	 */
	private static final int BASIC_NAME_COEFFICIENT = 1;

	/**
	 * Reads a model and creates a set of documents corresponding to significant
	 * model elements.
	 * 
	 * @param inputModelPath
	 * @param outputDirectoryPath
	 */
	@Override
	public void writeDocuments(String inputModelPath, String outputDirectoryPath) {
		Package thePackage = FileIOUtil.loadUmlModel(inputModelPath);
		generateDocumentsForModel(thePackage, outputDirectoryPath);
	}

	/**
	 * Reads a model and creates a set of documents corresponding to significant
	 * model elements.
	 * 
	 * @param inputModelPath
	 * @param outputDirectoryPath
	 */
	@Override
	public void writeDocuments(EObject rootObject, String outputDirectoryPath) {
		if (rootObject instanceof Package)
			generateDocumentsForModel((Package) rootObject, outputDirectoryPath);
	}

	/**
	 * Reads a model and creates a set of documents corresponding to significant
	 * model elements.
	 * 
	 * @param inputModelPath
	 * @param outputDirectoryPath
	 */
	private void generateDocumentsForModel(EObject rootObject,
			String outputDirectoryPath) {
		FileIOUtil.purgeFolder(new File(outputDirectoryPath));
		if (!outputDirectoryPath.endsWith(File.separator))
			outputDirectoryPath += File.separator;

		for (LsaQueryInput doc : createLsaQueries(rootObject, outputDirectoryPath)) {
			FileIOUtil.simpleWriteToFile(outputDirectoryPath + "/" + doc.name,
					doc.getContent());
		}

	}

	private static String generateDocumentForClass(Class c) {
		StringBuilder b = new StringBuilder();

		for (int i = 0; i < BASIC_NAME_COEFFICIENT; i++) {
			b.append(nameTreatment(c.getName()));
			b.append(' ');
		}
		// Could add the class's feature and operation names to the document
		// here, but in testing, accuracy decreased when doing so
		return b.toString();
	}

	private static String generateDocumentForInterface(Interface interf) {
		StringBuilder b = new StringBuilder();

		for (int i = 0; i < BASIC_NAME_COEFFICIENT; i++) {
			b.append(nameTreatment(interf.getName()));
			b.append(' ');
		}
		return b.toString();
	}

	private static String nameTreatment(String name) {
		if (name.matches("[A-Z][A-Z][a-z].*")) {
			return name.substring(1);
		} else
			return name;
	}

	@Override
	public List<LsaQueryInput> createLsaQueries(EObject modelRoot,
			String outputDirectoryPath) {
		List<LsaQueryInput> result = new ArrayList<LsaQueryInput>();
		if (modelRoot instanceof Package) {
			for (TreeIterator<EObject> it = modelRoot.eAllContents(); it
					.hasNext();) {
				EObject o = it.next();
				if (o instanceof Class) {
					Class c = (Class) o;
					String doc = generateDocumentForClass(c);
					String name = c.getName();
					ModelElementRegistry.getInstance().registerPair(o, name);
					result.add(new LsaQueryInput(name, doc));
				} else if (o instanceof Interface) {
					Interface i = (Interface) o;
					String doc = generateDocumentForInterface(i);
					String name = i.getName();
					ModelElementRegistry.getInstance().registerPair(o, name);
					result.add(new LsaQueryInput(name, doc));					
				}
			}
		}
		return result;
	}

}
