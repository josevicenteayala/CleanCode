package com.intergrupo.cleancode.functions;

public class SwitchFunctionSolve {
	public double projectCost(Project1 project) throws ProjectCostException1{
		return project.calculateProjectCost();
	}
}

interface Project1{
	double calculateProjectCost();
}

class EngineeringProjectImpl implements Project1{

	@Override
	public double calculateProjectCost() {
		return 20;
	}	
}

class SocialProjectImpl implements Project1{

	@Override
	public double calculateProjectCost() {
		return 50;
	}
	
}

class MarryProjectImpl implements Project1{

	@Override
	public double calculateProjectCost() {
		return 100;
	}
	
}


class ProjectCostException1 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6925630166696930259L;

}