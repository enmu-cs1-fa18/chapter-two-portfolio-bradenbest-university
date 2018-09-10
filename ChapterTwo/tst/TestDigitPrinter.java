

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestDigitPrinter {

	@Test
	void testMain() {
		String[] expected = new String[] {"3","4","9"};
		String[] results = AbstractMainTests.executeMain("DigitPrinter", new String [] {});
		for(int i = 0; i<results.length; i++) {
			results[i] = results[i].replaceAll("[^0-9]", "");
		}
		assertArrayEquals(expected,results);
	}

}
