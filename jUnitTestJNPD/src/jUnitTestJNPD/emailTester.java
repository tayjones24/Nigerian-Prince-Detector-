package jUnitTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
class TestUtilities {
    Manager mangage;
    Boolean emails;
	@Test
	public void happyPath() {
		String email = "bahahaha@yahoo.com"; //h
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
	@Test
	public void unhappyPath2() {
		String s = "djeiufhre9igju3pwiou@@@gj9pwhdgupgh89pgweh";
		emails = mangage.isRealEmail(s);
		assertEquals(emails,false);
	}
	