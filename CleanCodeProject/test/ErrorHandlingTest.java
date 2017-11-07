import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.intergrupo.cleancode.errorhandling.ErrorHandling;

class ErrorHandlingTest {

	private ErrorHandling errorHandling = new ErrorHandling();
	@Test
	void testGetNaturalLogarithmValue10() {
		int logarithm = errorHandling.getNaturalLogarithm("1");
		assertTrue("Must be 0",logarithm == 0);
	}
	
	@Test
	void testGetNaturalLogarithmValue0() {
		int logarithm = errorHandling.getNaturalLogarithm("100");
		assertEquals("Must be 2, and return",2,logarithm);
	}
}
