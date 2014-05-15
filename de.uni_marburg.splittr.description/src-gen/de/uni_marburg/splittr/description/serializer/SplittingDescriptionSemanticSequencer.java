package de.uni_marburg.splittr.description.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

import com.google.inject.Inject;

import de.uni_marburg.splittr.description.services.SplittingDescriptionGrammarAccess;
import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.description.splittr.SplittrPackage;
import de.uni_marburg.splittr.description.splittr.SubModel;

@SuppressWarnings("all")
public class SplittingDescriptionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SplittingDescriptionGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SplittrPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SplittrPackage.SPLITTING_DESCRIPTION:
				if(context == grammarAccess.getSplittingDescriptionRule()) {
					sequence_SplittingDescription(context, (SplittingDescription) semanticObject); 
					return; 
				}
				else break;
			case SplittrPackage.SUB_MODEL:
				if(context == grammarAccess.getSubModelRule()) {
					sequence_SubModel(context, (SubModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         modelLocation=STRING 
	 *         threshold=DOUBLE? 
	 *         submodels+=SubModel* 
	 *         (
	 *             weightGeneralization=DOUBLE? 
	 *             weightAggregation=DOUBLE? 
	 *             weightAssociation=DOUBLE? 
	 *             weightContainment=DOUBLE? 
	 *             weightInterface=DOUBLE? 
	 *             weightEnum=DOUBLE? 
	 *             alpha=DOUBLE?
	 *         )?
	 *     )
	 */
	protected void sequence_SplittingDescription(EObject context, SplittingDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_SubModel(EObject context, SubModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SplittrPackage.Literals.SUB_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SplittrPackage.Literals.SUB_MODEL__NAME));
			if(transientValues.isValueTransient(semanticObject, SplittrPackage.Literals.SUB_MODEL__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SplittrPackage.Literals.SUB_MODEL__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubModelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSubModelAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
}
