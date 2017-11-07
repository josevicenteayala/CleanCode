package com.intergrupo.cleancode.errorhandling;

public class ErrorHandling {

	public int getNaturalLogarithm(String number) {
		int finalNumber = 0;
		try {
			double parseDouble = Double.parseDouble(number);
			double log = Math.log10(parseDouble);
			double ceil = Math.ceil(log);
			String valueOf = String.valueOf(ceil);		
			finalNumber = Integer.parseInt(valueOf);	
		}catch(NumberFormatException e) {
		}
		return finalNumber;
	}
	
}
