package com.intergrupo.cleancode.functions;

public class SwitchFunction {

	public double projectCost(Project project) throws ProjectCostException {

		switch (project.getProjectType()) {
			case Project.ENGINEERING_PROJECT: {
				return projectEngineeringCost();
			}
			case Project.SOCIAL_PROJECT: {
				return projectSocialCost();
			}
			case Project.MARRY_PROJECT:{
				return projectMarryCost();
			}
			default:
				throw new ProjectCostException();
		}

	}

	private double projectMarryCost() {
		return 100;
	}

	private double projectSocialCost() {
		return 50;
	}

	private double projectEngineeringCost() {
		return 20;
	}

}

class ProjectCostException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6925630166696930259L;

}

class Project {
	public static final int ENGINEERING_PROJECT = 1;
	public static final int SOCIAL_PROJECT = 2;
	public static final int MARRY_PROJECT = 3;

	private int projectType;

	public Project(int projectType) {
		this.projectType = projectType;
	}

	public int getProjectType() {
		return projectType;
	}
}