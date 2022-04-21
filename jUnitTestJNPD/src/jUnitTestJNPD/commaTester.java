package jUnitTestJNPD;

public class commaTester {

	/**
	 * Checks if the punctuation and the capitalization is correct
	 */
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
