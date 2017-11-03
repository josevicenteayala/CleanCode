package com.intergrupo.cleancode.functions;

public class GoodFunction {
	
	public void badFormat() {
		int firstNumber = 0, secondNumber = 6;
		if (firstNumber < secondNumber) {
			for (boolean stopController = true; stopController;) {
				secondNumber = ++firstNumber % 4;
				System.out.println(firstNumber * secondNumber);
				stopController = (secondNumber >> 4) == firstNumber-4 ? false : true;
			}			
		}
	}
	
	public static void main(String[] args) {
		GoodFunction goodFunction = new GoodFunction();
		goodFunction.badFormat();
	}
	
}
