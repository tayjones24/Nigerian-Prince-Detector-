package jUnitTestJNPD;

import org.junit.jupiter.api.Test;

public class commaTester {
	@Test
	boolean testPunct(String tests) {
		int passCount = 0;
		int punctCount = 0;
		for (int i = 0; i < tests.length(); i++) {
			if ((tests.charAt(i) == '.' || tests.charAt(i) == '!' || tests.charAt(i) == '?')
					&& i + 2 != tests.length()) {
				punctCount++;
				if (Character.isUpperCase(tests.charAt(i + 2)) && tests.charAt(i + 1) == ' '
						&& i + 2 != tests.length()) {
					passCount++;
					return false;
				}
			}
		}
		return false;
	}
}
