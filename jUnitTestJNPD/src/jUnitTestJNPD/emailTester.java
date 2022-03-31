package jUnitTestJNPD;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestUtilities {
    emailTesterMethod mangage;
    Boolean emails;
	@Test
	public void happyPath() {
		String email = "bahahaha@yahoo.com";
		emails = mangage.isRealEmail(email);
		assertEquals(emails,true);
	}
	@Test
	public void unhappyPath() {
		String s = "baheeeeee@yahoommmm";
		emails = mangage.isRealEmail(s);
		assertEquals(emails,false);
	}
	@Test
	public void unhappyPath1() {
		String s = "djeiufhre9igju3pwiougj9pwhdgupgh89pgweh";
		emails = mangage.isRealEmail(s);
		assertEquals(emails,false);
	}
}
