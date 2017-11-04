package com.intergrupo.cleancode.comments;

public class NoiseComments {

	/**
	 * Default constructor
	 */
	public NoiseComments() {
		
	}
	
	/**
	 * The process
	 */
	private int process;
	
	/**
	 * @return the identification of process
	 */
	public int getTheIdentificationOfProcess() {
		return process;
	}
	
	/////////////////////// rest of the methods /////////////////////////////
	
	
	/**
	 * added by jayala -
	 * TODO: Who is jayala?
	 */
	public void shortMethod() {
		if(process % 2 == 0) {
			try {
				process++;
			}//end try
			finally {
				process--;
			}//end finally
		}//end if
		
	}//end method
	
	
	/*public void methodThatDontWantToUsedAnymore() {
		System.out.println("DELETE ME PLEASE, DELET ME...");
	}*/
}
