import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPennyCalculator {
	/*
	 * Dollars: 4
	Quarters: 2
	Dimes: 0
	Nickels: 1
	Pennies: 3
	Total coins: 6
	 */
	@Test
	void test() {
		String[] expected = new String[] {"4","2","0","1","3","6"};
		String[] results = AbstractMainTests.executeMain("PennyCalculator", new String [] {});
		for(int i = 0; i<results.length; i++) {
			results[i] = results[i].replaceAll("[^0-9]", "");
		}
		assertArrayEquals(expected,results);
		
	}

}
