import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDistanceFormula {

	@Test
	void testCalculation() {
		String[] expectedValues = {"12.72", "12.73"};
		
		String[] results = AbstractMainTests.executeMain("DistanceFormula", new String [] {});
		boolean valueFound = false;
		
		for(int i = 0; i<results.length; i++) {
			for (String exV : expectedValues) {
				if (results[i].contains(exV)){
					valueFound = true;
				}
			}
		}
		assertTrue(valueFound);
	}
	
	@Test
	void testRounding() {
		String[] expectedValues = {"12.73"};
		
		String[] results = AbstractMainTests.executeMain("DistanceFormula", new String [] {});
		boolean valueFound = false;
		
		for(int i = 0; i<results.length; i++) {
			for (String exV : expectedValues) {
				if (results[i].contains(exV)){
					valueFound = true;
				}
			}
		}
		assertTrue(valueFound);
	}

}
