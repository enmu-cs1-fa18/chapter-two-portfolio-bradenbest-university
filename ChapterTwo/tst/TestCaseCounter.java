import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseCounter {

	@Test
	void testMain() {
		String[] expected = new String[] {"38","1"};
		String[] results = AbstractMainTests.executeMain("CaseCounter", new String [] {});
		for(int i = 0; i<results.length; i++) {
			results[i] = results[i].replaceAll("[^0-9]", "");
		}
		assertArrayEquals(expected,results);
	}
}
