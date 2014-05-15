package de.uni_marburg.splittr.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import de.uni_marburg.splittr.analysis.graph.GraphBuilder;
import de.uni_marburg.splittr.analysis.graph.ecore.EcoreGraphBuilder;
import de.uni_marburg.splittr.analysis.graph.uml.UmlGraphBuilder;
import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;

/**
 * Basic operations for file input and output.
 * 
 * @author strueber
 * 
 */
public class FileIOUtil {

	/**
	 * Loads the UML model from the given path.
	 * 
	 * @param modelPath
	 * @return
	 */
	public static Package loadUmlModel(final String modelPath) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		return loadUmlModel(modelPath, resourceSet);
	}

	/**
	 * Loads the UML model from the given path into the given resource set.
	 * 
	 * @param modelPath
	 * @param resourceSet
	 * @return
	 */
	public static Package loadUmlModel(final String modelPath,
			final ResourceSet resourceSet) {

		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI,
				UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		final Resource resource = resourceSet.getResource(
				URI.createFileURI(new File(modelPath).getAbsolutePath()), true);

		final Package result = (Package) resource.getContents().get(0);
		return result;
	}

	/**
	 * Writes a file with the given content to the given path.
	 * 
	 * @param path
	 * @param content
	 */
	public static void simpleWriteToFile(String path, String content) {
		PrintWriter pw = null;
		try {
			Writer fw = new FileWriter(path);
			Writer bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			pw.print(content);
		} catch (IOException e) {
			System.err.println("Error creating file!");
		} finally {
			if (pw != null)
				pw.close();
		}
	}

	/**
	 * Loads and returns the content from the file at the given path.
	 * 
	 * @param path
	 * @return
	 */
	public static String simpleReadFromFile(String path) {
		File file = new File(path);
		return simpleReadFromFile(file);
	}

	/**
	 * Loads and returns the content from the given file.
	 * 
	 * @param file
	 * @return
	 */
	public static String simpleReadFromFile(File file) {
		String result = new String();
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			fis.read(data);
			fis.close();
			result = new String(data, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * Remove characters from the input String that may break Lucene's indexing
	 * engine
	 * 
	 * @param input
	 * @return
	 */
	public static String removeBadCharacters(String input) {
		input = input.replace('*', ' ');
		input = input.replace('?', ' ');
		input = input.replace('/', ' ');
		input = input.replace('(', ' ');
		input = input.replace('[', ' ');
		input = input.replace(']', ' ');
		input = input.replace(')', ' ');
		return input;
	}

	/**
	 * Empties the given input folder.
	 * 
	 * @param folder
	 */
	public static void purgeFolder(File folder) {
		File[] files = folder.listFiles();
		if (files != null) {
			for (File f : files) {
				f.delete();
			}
		}
	}

	public static EPackage loadEcoreModel(String inputModelPath) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		return loadEcoreModel(inputModelPath, resourceSet);
	}

	public static EPackage loadEcoreModel(String string, ResourceSet rs) {
		rs.getPackageRegistry().put(EcorePackage.eNS_URI,
				EcorePackage.eINSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new XMIResourceFactoryImpl());

		final Resource resource = rs.getResource(
				URI.createFileURI(new File(string).getAbsolutePath()), true);

		final EPackage result = (EPackage) resource.getContents().get(0);
		return result;
	}

	public static EObject loadModel(String string, ResourceSet rs) {
		if (string.endsWith("ecore"))
			return loadEcoreModel(string, rs);
		if (string.endsWith("uml"))
			return loadUmlModel(string, rs);
		return null;
	}

	public static SplittingDescription readDescriptionFile(String uri) {
		XtextResourceSet rs = new XtextResourceSet();
		Resource resource = rs.getResource(URI.createURI(uri), true);
		SplittingDescription d = (SplittingDescription) resource.getContents()
				.get(0);
		return d;
	}

	public static void saveResource(EObject root, String path) {
		ResourceSet resSet = new ResourceSetImpl();
		saveResource(root, path, resSet);
	}


	public static void saveResource(EObject root, String path, ResourceSet resourceSet) {
//		URI uri = URI.createFileURI(new File(path).getAbsolutePath());
		URI uri = URI.createURI(path);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(root);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Resource saveXtextResource(EObject root, String path) {
		XtextResourceSet resSet = new XtextResourceSet();
		Resource resource = resSet.createResource(URI.createFileURI(path));

		resource.getContents().add(root);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource;
	}

	public static EObject loadResource(final String path) {
		ResourceSet resSet = new ResourceSetImpl();
		return loadResource(path, resSet);
	}

	public static EObject loadResource(final String path, ResourceSet resSet) {
		return loadResource(path, resSet, false);
	}


	public static EObject loadResource(final String path, ResourceSet resSet, boolean forceReload) {
		URI uri = null;
		if (path.startsWith("platform"))
			uri = URI.createURI(path);
		else
			uri = URI.createFileURI(new File(path).getAbsolutePath());
		Resource resource = resSet.getResource(uri, true);
		
		if (forceReload) {
			resource.unload();
			try {
				resource.load(new HashMap<Object, Object>());
			} catch (IOException e) {
			}
		}
		
		EcoreUtil.resolveAll(resource);
		if (resource != null && !resource.getContents().isEmpty())
			return resource.getContents().get(0);
		else
			return null;
	}

	
	public static SubModelAssignmentResult loadSubModelAssignmentResult(
			String path, ResourceSet rs) {
		SubModelAssignmentResult fltResult = (SubModelAssignmentResult) loadResource(
				path, rs);
		return fltResult;
	}


	public static SubModelAssignmentResult loadSubModelAssignmentResult(
			String path, ResourceSet rs, boolean forceReload) {
		SubModelAssignmentResult fltResult = (SubModelAssignmentResult) loadResource(
				path, rs, true);
		return fltResult;
	}
	
	public static GraphBuilder createGraphBuilder(EObject modelRoot) {
		if (modelRoot instanceof EPackage)
			return new EcoreGraphBuilder();
		if (modelRoot instanceof Package)
			return new UmlGraphBuilder();
		return null;
	}

}
