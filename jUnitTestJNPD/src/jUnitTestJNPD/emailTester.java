package jUnitTestJNPD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class emailTester {
	
	emailTesterMethod mangage = new emailTesterMethod();
	Boolean emails;

	/**
	 * Tests if the email has a right format using the @ sign and also the .com and
	 * other extensions
	 * 
	 * This one tests the email that has the right format
	 */
	@Test
	public void happyPath() {
		String email = "bahahaha@yahoo.com";
		emails = mangage.isRealEmail(email);
		assertEquals(emails, true);
	}

	/**
	 * Tests the format of the email address using the bad formated email address
	 */
	@Test
	public void unhappyPath() {
		String s = "baheeeeee@yahoommmm";
		emails = mangage.isRealEmail(s);
		assertEquals(emails, false);
	}

	/**
	 * Tests the format of the email address using the bad email address
	 */
	@Test
	public void unhappyPath1() {
		String s = "djeiufhre9igju3pwiougj9pwhdgupgh89pgweh";
		emails = mangage.isRealEmail(s);
		assertEquals(emails, false);
	}

	/**
	 * Tests the format of the email address using a non realistic and bad formatted
	 * email address
	 */
	@Test
	public void unhappyPath2() {
		String s = "djeiufhre9igju3pwiou@@@gj9pwhdgupgh89pgweh";
		emails = mangage.isRealEmail(s);
		assertEquals(emails, false);
	}

}
