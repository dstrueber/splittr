package de.uni_marburg.splittr.evaluation.coherence;

public class CoherenceCouplingEntry {
	private double interEdges;
	private double intraEdges;
	
	public CoherenceCouplingEntry(double intraEdges, double interEdges) {
		this.interEdges = interEdges;
		this.intraEdges = intraEdges;
	}
	
	public double getInterEdges() {
		return interEdges;
	}
	public void setInterEdges(double interEdges) {
		this.interEdges = interEdges;
	}
	public double getIntraEdges() {
		return intraEdges;
	}
	public void setIntraEdges(double intraEdges) {
		this.intraEdges = intraEdges;
	}
	
	
	
}
