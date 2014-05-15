package de.uni_marburg.splittr.evaluation.precision;

public class PrecisionRecallEntry {
	private int relevantDocumentsCount = 0;
	private int retrievedDocumentsCount = 0;
	private int relevantIntersectionCount = 0;

	public PrecisionRecallEntry() {

	}

	public int getRelevantCount() {
		return relevantDocumentsCount;
	}

	public void setRelevantCount(int relevantDocumentsCount) {
		this.relevantDocumentsCount = relevantDocumentsCount;
	}

	public int getRetrievedCount() {
		return retrievedDocumentsCount;
	}

	public void setRetrievedCount(int retrievedDocumentsCount) {
		this.retrievedDocumentsCount = retrievedDocumentsCount;
	}

	public int getIntersectionCount() {
		return relevantIntersectionCount;
	}

	public void setIntersectionCount(
			int intersectionCount) {
		this.relevantIntersectionCount = intersectionCount;
	}

	public void increaseIntersectionCount(int delta) {
		relevantIntersectionCount += delta;
	}
	
	public double calculatePrecision() {
		return relevantIntersectionCount / (double) retrievedDocumentsCount;
	}
	
	public double calculateRecall() {
		return relevantIntersectionCount / (double) relevantDocumentsCount;
	}
	

	public double calculateBalancedF() {
		double prec = calculatePrecision();
		double recall = calculateRecall() ;
		return calculateBalancedF(prec, recall);
	}

	public static double calculateBalancedF(double prec, double recall) {
		double result = (2 * prec * recall) / (prec + recall);
		if (result != Double.NaN)
			return result;
		else 
			return 0;
	}
}
