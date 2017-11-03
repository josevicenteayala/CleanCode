package com.intergrupo.cleancode.functions;

public class BadFunction {

public void badFormat() {		int firstNumber = 0, secondNumber = 6;
if (firstNumber < secondNumber) for (boolean stopController = true; stopController;) {
secondNumber = ++firstNumber % 4;				System.out.println(firstNumber * secondNumber);
stopController = (secondNumber >> 4) == firstNumber-4 ? false : true;
}	}
	
}
