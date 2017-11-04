package com.intergrupo.cleancode.functions;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

class SwitchFunctionTest {

	private SwitchFunction switchFunction = new SwitchFunction();
	
	@Test
	void testEngineeringProjectCost() {
		long milliseconds1 = System.currentTimeMillis();
		Project engineeringProject = new Project(Project.ENGINEERING_PROJECT);	
		try {
		System.out.println(switchFunction.projectCost(engineeringProject));
		assertTrue("The project cost must be 20", switchFunction.projectCost(engineeringProject) == 20.0);
		} catch (ProjectCostException e) {
			e.printStackTrace();
		}
		long milliseconds2 = System.currentTimeMillis();
		System.out.println("Milliseconds "+ (milliseconds2 - milliseconds1));
	}

	@Test
	void testSocialProjectCost() {		
		Project socialProject = new Project(Project.SOCIAL_PROJECT);		
		try {
		System.out.println(switchFunction.projectCost(socialProject));
		assertTrue("The project cost must be 50", switchFunction.projectCost(socialProject) == 50.0);
		} catch (ProjectCostException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testMarryProjectCost() {
		Project marryProject = new Project(Project.MARRY_PROJECT);		
		try {
		System.out.println(switchFunction.projectCost(marryProject));
		assertTrue("The project cost must be 100", switchFunction.projectCost(marryProject) == 100.0);
		} catch (ProjectCostException e) {
			e.printStackTrace();
		}
	}	
	
}
