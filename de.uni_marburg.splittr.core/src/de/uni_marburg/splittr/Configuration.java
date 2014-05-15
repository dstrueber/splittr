package de.uni_marburg.splittr;

public class Configuration {

	// control workflow

	public boolean IR_RESULT_TRUNCATE = true;
	
	public boolean ANALYSIS_CRAWL = true;

	public int POSTPROCESSING_PARTITION = 1; // 0 = off, 1 = clean, 2 = threshold

	public boolean POSTPROCESSING_CREATE_REST_SUBMODEL = true;
	
	public boolean IR_SUB_MODELS_AS_DOCUMENTS = true;

	public boolean TRUNCATE_FOR_PARTIAL_SPLIT = false;

	public float POSTPROCESSING_TRUNCATION_THRESHOLD = (float) 0.0008;  
	
	public boolean IR_RESULT_NORMALIZE = true;

	// constants for analysis
	
	public int ANALYSIS_METHOD = 2; // 0 = plain, 1 = undirected, 2 = undirected+weighted
	
	public int ANALYSIS_ITERATIONS = 100;
	
	//	 post processing truncation
	
	//   post processing includance (for mode = 1)
	
	public float POSTPROCESSING_OVERLAP_ADDITION_THRESHOLD = (float) 0.55;  
	
	// edge weightings
	public double ANALYSIS_ALPHA = 0.86;
	
	public double WEIGHT_GENERALIZATION = 10.0;
	
	public double WEIGHT_ENUM_INSTANTIATION = 10.0;
	
	public double WEIGHT_COMPOSITION = 6.0;

	public double WEIGHT_AGGREGATION = 3.0;

	public double WEIGHT_ASSOCIATION = 1.0;
	
	public double WEIGHT_INTERFACE_REALIZATION = 3.0;
	
	
}
