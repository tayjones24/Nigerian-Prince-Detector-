package jUnitTestJNPD;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;

public class Driver {
	public static void main(String[] args) {
		// useful change a;sldkfjapoifjoiwekflkjh
		// Creating a new connection to the database
		connectionDB connection = new connectionDB();
		Connection connect = null;
		PreparedStatement p = null;
		ResultSet rs = null;

		// Connecting to the database
		connect = connection.connectDB();

		Display panel = new Display(400, 400, Color.WHITE);

		SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
		SpellChecker.registerDictionaries(this.getClass().getResource("/dictionary"), "en");
		SpellChecker.register(messageWriter);
		SpellCheckerOptions sco = new SpellCheckerOptions();
		sco.setCaseSensitive(true);
		sco.setSuggestionsLimitMenu(10);
		JPopupMenu popup = SpellChecker.createCheckerPopup(sco);
		messageWriter.addMouseListener(new PopupListener(popup));
	}

}
