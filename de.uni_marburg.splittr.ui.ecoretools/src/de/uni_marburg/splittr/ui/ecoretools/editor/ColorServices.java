package de.uni_marburg.splittr.ui.ecoretools.editor;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.uni_marburg.splittr.splittrResult.SubModel;

/**
 * A class containing sample services.
 */
public class ColorServices {
	public Integer getColor(EObject object) {
		if (object instanceof EClassifier)
			return getColor((EClassifier) object);
		else
			return getColorEdge(object);
	}

	public Integer getColor(EClassifier object) {
		if (object == null || object.eResource() == null)
			return 0;

		SubModel subModel = AssignmentFileIOUtil.getAssignedSubModel(object);
		if (subModel != null) {
			return AssignmentFileIOUtil.getSubModelIndex(subModel);
		} else {
			return 0;
		}
	}

	public Integer getColorEdge(EObject object) {
		if (object instanceof EReference) {
			EReference ref = (EReference) object;
			SubModel sourceSubModel = AssignmentFileIOUtil
					.getAssignedSubModel(ref.eContainer());
			SubModel targetSubModel = AssignmentFileIOUtil
					.getAssignedSubModel(ref.getEType());

			if (sourceSubModel == targetSubModel) {
				return AssignmentFileIOUtil.getSubModelIndex(sourceSubModel);
			}
		}
		return 50;
	}

	//
	// public int colorService(EClass aClass) {
	// Map<String, Integer> resultMap = getAssignmentResults(aClass
	// .eResource().getURI().segmentsList().get(1), aClass
	// .eContainer().eResource().getURI().lastSegment()
	// .split(".ecore")[0]);
	//
	// if (resultMap.containsKey(aClass.getName())) {
	// return resultMap.get(aClass.getName());
	// } else {
	// return 10;
	// }
	// }
	//
	// public int colorService(EEnum anEnum) {
	// Map<String, Integer> resultMap = getAssignmentResults(anEnum
	// .eResource().getURI().segmentsList().get(1), anEnum
	// .eContainer().eResource().getURI().lastSegment()
	// .split(".ecore")[0]);
	//
	// if (resultMap.containsKey(anEnum.getName())) {
	// return resultMap.get(anEnum.getName());
	// } else {
	// return 10;
	// }
	// }
	//
	// private Map<String, Integer> getAssignmentResults(String projectPath,
	// String modelName) {
	// HashMap<String, Integer> results = new HashMap<String, Integer>();
	//
	// try {
	// String path = ResourcesPlugin.getWorkspace().getRoot()
	// .getLocation().toFile()
	// + File.separator
	// + projectPath
	// + File.separator
	// + "splittingFiles"
	// + File.separator
	// + modelName
	// + File.separator + "output.splittrResult";
	// System.out.println(path);
	//
	// File fXmlFile = new File(path);
	// DocumentBuilderFactory dbFactory = DocumentBuilderFactory
	// .newInstance();
	// DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	// Document doc = dBuilder.parse(fXmlFile);
	//
	// doc.getDocumentElement().normalize();
	//
	// NodeList nList = doc.getElementsByTagName("entries");
	//
	// for (int temp = 0; temp < nList.getLength(); temp++) {
	//
	// Node nNode = nList.item(temp);
	//
	// results.put(nNode.getChildNodes().item(1).getAttributes()
	// .getNamedItem("href").toString().split("#//")[1]
	// .split("\"")[0],
	// Integer.valueOf(nNode.getAttributes()
	// .getNamedItem("feature").toString()
	// .split("@features.")[1].split("\"")[0]));
	// }
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// return results;
	// }
}
