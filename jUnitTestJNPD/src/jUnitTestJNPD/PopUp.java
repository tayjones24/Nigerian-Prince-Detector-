package jUnitTestJNPD;

import java.util.ArrayList;

/**
 * A PopUp class contains all the functions that can be called from a pop up
 * window
 * 
 * @author veronikakermoshchuk
 *
 */
public class PopUp {
	boolean isRead = false; // Email is initially not read
	ArrayList<Email> spam = new ArrayList<Email>();
	Email email = new Email();

	/**
	 * Deletes the email
	 * 
	 * @param email
	 */
	public void deleteEmail(Email email) {
		email = null;
		System.out.println("Email deleted");
	}

	/**
	 * Marks the email as read
	 */
	public void markAsRead() {
		isRead = true;
		System.out.println("Marked as read");
	}

	/**
	 * Moves the email to spam folder
	 */
	public void moveToSpam(Email email) {
		spam.add(email);
		System.out.println("Email has been moved to spam");
	}

	/**
	 * Replies to the email
	 */
	public void reply(String reply) {
		email.setContent(reply);
	}

	/**
	 * Ignores the pop up window by making it disappear and allows you to continue
	 * to the email
	 */
	public void ignore() {
		return;
	}
}
