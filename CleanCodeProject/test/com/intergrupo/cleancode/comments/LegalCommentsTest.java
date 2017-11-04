package com.intergrupo.cleancode.comments;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class LegalCommentsTest {
	private LegalComments legalComments = new LegalComments();

	@Test
	void testValidateDate() {

		assertTrue("It is a valid expression", legalComments.validateDate("123-45-6789"));
	}

	@Test
	void testSpecificRuleInTheCode() {
		assertTrue("Must be a month of the Family ",legalComments.specificRuleInTheCode());
	}

}
