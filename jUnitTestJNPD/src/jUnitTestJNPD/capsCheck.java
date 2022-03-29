package jUnitTestJNPD;

public class capsCheck {

	/**
	 * Checks if a String(supposed to be an input paragraph) has proper
	 * capitalization at the beginning of sentences. Currently does not work for
	 * abbreviations(Dr., Sr., etc), to be fixed though.
	 * 
	 * Also checks if the letter I is capitalized when it is alone.
	 * 
	 * @param s
	 * @return
	 */
	public boolean properCaps(String s) {
		if (!Character.isUpperCase(s.charAt(0))) { // if the first character is not uppercase, false is returned.
			return false;
		}

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '.') { // if a period is detected, move to next if.
				if (Character.isWhitespace(s.charAt(i))) {// if a white space is found, go to the next if statement.
					if (Character.isUpperCase(s.charAt(i + 1))) { // if the character after the whitespace is not
																	// uppercase, return false.
						return false;
					}
				}
			}
			if (s.charAt(i) == 'i') {
				if (Character.isWhitespace(s.charAt(i - 1)) && Character.isWhitespace(s.charAt(i + 1))) {
					return false; // checks if an i is detected. If the characters before and after are both white
									// spaces, false is returned.
				}
			}
		}
		return true; // if nothing triggers a false return, true is returned.
	}
}
