package jUnitTestJNPD;

public class emailTesterMethod {
	/**
	 * This function determines whether the email address has the right format using
	 * the @ sign and also the correct endings like .com, .edu, etc.
	 * 
	 * @param email
	 * @return
	 */
	public boolean isRealEmail(String email) {
		char a;
		int count = 0;

		// Checks how many @ signs are included in the email address, if more then one
		// returns false meaning that the email address id not valid
		for (int i = 0; i < email.length(); i++) {
			a = email.charAt(i);
			if (a == '@') {
				count++;
			}
			if (count > 1) {
				return false;
			}
		}

		/*
		 * Checks if the email address contains the valid endings
		 */
		if (email.contains("@")) {
			if (email.contains(".com") || email.contains(".edu") || email.contains(".org") || email.contains(".net")) {
				int end = email.length() - 4;
				String ending = email.substring(end);
				if (ending.contains(".com") || ending.contains(".edu") || ending.contains(".org")
						|| ending.contains(".net")) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return false;

	}

}
