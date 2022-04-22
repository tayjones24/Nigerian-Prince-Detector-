package jUnitTestJNPD;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class commaTester {
	boolean testPunct(String tests) {
		int passCount = 0;
		int punctCount = 0;
		for (int i = 0; i < tests.length(); i++) {
			if ((tests.charAt(i) == '.' || tests.charAt(i) == '!' || tests.charAt(i) == '?')
					&& i + 2 != tests.length()) {
				punctCount++;
				if ((i + 2 < tests.length() && Character.isUpperCase(tests.charAt(i + 2))) && tests.charAt(i + 1) == ' '
						&& i + 2 != tests.length()) {
					passCount++;
				}
			}
			if (Character.isLowerCase(tests.charAt(i)) && Character.isUpperCase(tests.charAt(i + 1))) {
				return false;
			}

		}
		return true;
	}
}
