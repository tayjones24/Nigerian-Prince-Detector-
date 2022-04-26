package jUnitTestJNPD;

/**
 * Creates an email class that can be used to do anything email related
 * 
 * @author veronikakermoshchuk
 *
 */
public class Email {
	String content;
	String emailAddress;

	// Creates an email and initializes the variables
	public Email() {
		content = "";
		emailAddress = "";
	}

	// Sets the content of the email
	public void setContent(String newContent) {
		content = newContent;
	}

	// Gets the content of the email
	public String getContent() {
		return content;
	}
}
