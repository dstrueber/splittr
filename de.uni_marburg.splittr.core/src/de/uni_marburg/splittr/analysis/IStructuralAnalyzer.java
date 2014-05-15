package de.uni_marburg.splittr.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface IStructuralAnalyzer {

	Map<EObject, Double> findRelatedElements(EObject modelRoot,
			Map<EObject, Double> relevantElements, Map<EObject, Double> irScores);

}
