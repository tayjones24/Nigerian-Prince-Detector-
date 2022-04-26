package jUnitTestJNPD;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Display extends JPanel {

	PopUp popup = new PopUp();
	Email email = new Email();
	String emailRecievedContent = "Hèllö, My ñæme is Mûhæmmed Bèllö!";
	AsciiManager manager = new AsciiManager();
	Object[] selections;
	Object val;
	String emailSendingContent = "";

	// Creates a new display
	public Display(int width, int height, Color c) {
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(c);
		email.content = emailRecievedContent;

		manager.isOnlyAscii(emailRecievedContent);

		if (manager.c.equals(Color.RED)) {
			// Creating a pop up window
			selections = new Object[] { "Delete Email", "Mark as Read", "Move to Spam", "Reply", "Ignore" };
			val = JOptionPane.showInputDialog(null, "Please select action:", "Action", JOptionPane.INFORMATION_MESSAGE,
					null, selections, selections[0]);

			// Checking what item on the menu is selected and calls the appropriate function
			if (val.equals("Delete Email")) {
				popup.deleteEmail(email);
			}

			if (val.equals("Mark as Read")) {
				popup.markAsRead();
			}

			if (val.equals("Move to Spam")) {
				popup.moveToSpam(email);
			}

			if (val.equals("Reply")) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Reply: ");
				emailSendingContent = scan.nextLine();
				popup.reply(emailSendingContent);
			}

			if (val.equals("Ignore")) {
				popup.ignore();
			}
		}
	}
}
