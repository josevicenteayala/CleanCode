package com.intergrupo.cleancode.functions;

public class DescriptiveFunction {
	
	double numericList[] = new double[] {1,890.45,3,89.05,66,2000}; 

	public double getTheMostBiggerNumberInTheList() {
		for (int i = 0; i < numericList.length; i++) {
			double  theMostBiggerNumber = numericList[i];
			int positionIndexToDoTheChange = i;
			for (int j = i+1; j < numericList.length; j++) {
				if(theMostBiggerNumber < numericList[j]) {
					theMostBiggerNumber = numericList[j];
					positionIndexToDoTheChange = j;
				}
			}
			
			double temporalNumber = numericList[i];
			numericList[i] = theMostBiggerNumber;
			numericList[positionIndexToDoTheChange] = temporalNumber;
		}
		for (int i = 0; i < numericList.length; i++) {
			System.out.println(numericList[i]);
		}
		
		return numericList[0];
	}
	
}
