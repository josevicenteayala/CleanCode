package com.intergrupo.cleancode.meaningfulnames;

import java.util.ArrayList;
import java.util.List;

public class MeaningLessNames {

	private int[] numbers = new int[] {1,2,3,4,5,6};

	public List<String> getIt(){
		List<String> l = new ArrayList<>();
		for(int i: numbers) {
			if(numbers[i] == 3) {
				l.add("8");
				l.add("-");
			}
		}
		return l;
	}
	
	public List<String> getIt(int a){
		List<String> l = new ArrayList<>();
		for(int i: numbers) {
			if(numbers[i] == a) {
				l.add("8");
				l.add("-");
			}
		}
		return l;
	}	
	
}
