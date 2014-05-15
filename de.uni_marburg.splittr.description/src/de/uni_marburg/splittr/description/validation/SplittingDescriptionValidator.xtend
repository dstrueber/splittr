/*
 * generated by Xtext
 */
package de.uni_marburg.splittr.description.validation

import de.uni_marburg.splittr.description.splittr.SubModel
import de.uni_marburg.splittr.description.splittr.SplittrPackage
import org.eclipse.xtext.validation.Check
import de.uni_marburg.splittr.description.splittr.SplittingDescription

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class SplittingDescriptionValidator extends AbstractSplittingDescriptionValidator {

	public static val EMPTY_DESCRIPTION = 'emptyDescription'

	public static val SUBMODEL_NAME_NOTUNIQUE = 'subModelNameNotUnique'
	
	public static val CONTAINS_ILLEGAL_CHARACTERS = 'containsIllegalCharacters'

	@Check
	def checkDescriptionIsNotEmpty(SubModel subModel) {
		if (subModel.description.trim.nullOrEmpty) {
			error('Sub-model descriptions may not be empty.', SplittrPackage.Literals.SUB_MODEL__DESCRIPTION,
				EMPTY_DESCRIPTION)
		}
	}
	
	@Check
	def checkSubModelNameNonUnique(SubModel subModel) {
		if ((subModel.eContainer()  as SplittingDescription).submodels.filter[name == subModel.name].size != 1)
			error('Sub-model names must be unique.', SplittrPackage.Literals.SUB_MODEL__NAME,
				SUBMODEL_NAME_NOTUNIQUE)
	}
	
	@Check
	def checkContainsIllegalCharacters(SubModel subModel) {
		if (subModel.description.contains('*') ||
			subModel.description.contains('?') ) {
			error('Sub-model descriptions must not contain the following characters: * ? ', SplittrPackage.Literals.SUB_MODEL__DESCRIPTION,
				CONTAINS_ILLEGAL_CHARACTERS)
		}
	}
}
