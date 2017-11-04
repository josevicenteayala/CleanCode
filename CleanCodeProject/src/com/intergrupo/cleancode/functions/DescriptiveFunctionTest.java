package com.intergrupo.cleancode.functions;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class DescriptiveFunctionTest {

	@Test
	void testShowTheMostBiggerNumberInTheList() {
		DescriptiveFunction descriptiveFunction = new DescriptiveFunction();
		assertTrue("The most bigger number should be 2000 ",descriptiveFunction.getTheMostBiggerNumberInTheList() == 2000);
	}

}
