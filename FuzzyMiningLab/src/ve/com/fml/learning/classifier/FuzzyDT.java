package ve.com.fml.learning.classifier;

import weka.classifiers.trees.J48;
import weka.core.Instances;

/**
 * Un �rbol de decisi�n difuso basado en C4.5
 * */
public class FuzzyDT extends J48{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Override
	public String getRevision() {
		// TODO Auto-generated method stub
		return "Test revision";
	}

	@Override
	public void buildClassifier(Instances arg0) throws Exception {
		super.buildClassifier(arg0);
	}

}