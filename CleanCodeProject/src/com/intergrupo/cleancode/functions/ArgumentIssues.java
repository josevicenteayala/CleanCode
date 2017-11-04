package com.intergrupo.cleancode.functions;

public class ArgumentIssues {
	
	//if the argument modify the system, it's betther choose the right name to named
	public void reallyWantToChangeTheSystem(int number) {		
	}
	
	//avoid parameters that change its status or its internal data
	public void doNothingOrMaybeYes(StringBuilder out) {		
	}
	
	//avoid flag arguments, in this example its better have to methods
	public void doYouReallyWantToDoThat(boolean yesOrNot) {
		
	}
	
	//args let send a lot of armuments
	public static void main(String[] args) {	
	}
	
	//The name of the parameters should be named like toward explaining the intent of the function
	public void writeField(String firstName) {		
	}
	
}
