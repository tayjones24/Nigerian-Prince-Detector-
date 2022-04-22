package jUnitTestJNPD;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Tests {

	testQuestion question;
	capsCheck capsCheck;
	commaTester comma;

	/**
	 * Gives a test question to the user and asks the user to answer If the user
	 * answers correctly, returns true. else, false.
	 */
	@Test
	public void testQuestionsMethod() {
		// Prompt user to answer question randomly provided
		boolean isNigerian = question.getQandA();
		assertEquals(isNigerian, true);
		fail("not yet implemented");
	}

	/**
	 * Tests manually what the method in testQuestion does
	 */
	@Test
	public void testQuestionsManual() {
		System.out.println("Please answer the following question: Who is the leader of Nigeria?");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		boolean isNigerian = true;
		if (answer != "Muha mmadu Buha ri") {
			isNigerian = false;
		}
		assertEquals(isNigerian, true);
		fail("not yet impleme nted");
	}

	/**
	 * Testing if a paragraph has proper capitalization at the beginning of
	 * sentences.
	 * 
	 * In this instance it should be true.
	 */
	@Test
	public void happyCheckCapitalization() {
		String para = "Hello my name is Muhammadu Buhari and I am the president of Nigeria. I have been president for 13 years now. I like to stream fortnite on discord.";
		boolean isProperPara = capsCheck.properCaps(para);
		assertEquals(isProperPara, true);
	}

	/**
	 * Testing if a paragraph has proper capitalization at the beginning of
	 * sentences.
	 * 
	 * In this instance it should be false.
	 */
	@Test
	public void sadCheckCapitalization() {
		String para = "Hello my name is Muhammadu Buhari and i am the president of Nigeria. I have been president for 13 years now. my favorite thing to do is to stream fortnite on discord.";
		boolean isProperPara = capsCheck.properCaps(para);
		assertEquals(isProperPara, false);
	}

	/**
	 * Testing the testPunctuation method that checks if there a good punctuation
	 * through out the email
	 */
	@Test
	public void happyCommaTest() {
		String[] tests = new String[3];
		tests[0] = "The quick brown fox jumped over the lazy dog. This is the correct one.";
		tests[1] = "The mIdochrondia iS th3 pppppppower house of the cell bro!!!!1!!";
		tests[2] = "I am a Nig3r1an Pr1NC3! i Am here to gIv mOneys!!!!";
		boolean isWorking;
		isWorking = comma.testPunct(tests[0]);
		assertEquals(isWorking, true);
		isWorking = comma.testPunct(tests[1]);
		assertEquals(isWorking, false);
		isWorking = comma.testPunct(tests[2]);
		assertEquals(isWorking, false);
	}

	/**
	 * Testing the connection to the database and if it functions correctly by
	 * checking if the url and the user belongs to the right database and also
	 * checking if going through the database creates correct results
	 */
	@Test
	public void connectionDBTest() {
		connectionDB connection = new connectionDB();
		assertEquals(connection.DB_URL, "jdbc:mysql://localhost:3306/Nigerian Princes");
		assertEquals(connection.USER, "root");
		Connection connect = connection.connectDB();

		PreparedStatement p = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM `Nigerian Royalty Names` WHERE ID = 1";

			p = connect.prepareStatement(sql);
			rs = p.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				assertEquals(id, 1);
				assertEquals(name, "Abdullahi Ahmed Sumaila");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	/**
	 * Tests the print database function to make sure the database content is
	 * equivalent to the content that is printed
	 * 
	 * @throws Exception
	 */
	@Test
	public void printDBTest() throws Exception {
		connectionDB connection = new connectionDB();
		OutputStream os = new ByteArrayOutputStream();
		String databaseString = connection.database;
		byte[] bytes = databaseString.getBytes();
		os.write(bytes);
		String actualOutput = os.toString();
		String expectedOutput = databaseString;
		assertEquals(actualOutput, expectedOutput);
	}

	/**
	 * Tests the isLegit function to verify that the given name correctly compared
	 * to the names in the database and the correct message is displayed after
	 * comparing database names with the given name.
	 */
	@Test
	public void isLegitTest() {
		connectionDB connection = new connectionDB();
		String legitResponse = "Yes, it is a real Nigerian Royalty";
		String notLegitResponse = "Name not found. Not a real Nigerian Royalty!";

		assertEquals(connection.isLegit("Muhammed Bello"), legitResponse);
		assertEquals(connection.isLegit("Josiah Kantiyok"), legitResponse);
		assertEquals(connection.isLegit("muhammed bello"), notLegitResponse);
		assertEquals(connection.isLegit(""), notLegitResponse);
		assertEquals(connection.isLegit("Mike Smith"), notLegitResponse);
	}

	
	/**
	 * Tests if the function outputs the correct boolean statement based on the
	 * given string. The string may or may not contain Non-ASCII characters.
	 */
	@Test
	public void onlyASCIITest() {
		AsciiManager m = new AsciiManager();

		assertEquals(m.isOnlyAscii("Hello, My name is Muhammed Bello!"), true);
		assertEquals(m.isOnlyAscii("Hèllö, My ñæme is Mûhæmmed Bèllö!"), false);
		assertEquals(m.isOnlyAscii(""), true);
		assertEquals(m.isOnlyAscii("♫"), false);
		assertEquals(m.isOnlyAscii("€"), false);
		assertEquals(m.isOnlyAscii(null), true);
	}

	
	/**
	 * Tests if the function outputs the correct boolean statement based on the
	 * given name and if it contains non ASCII characters
	 */
	@Test
	public void nameASCIITes() {
		AsciiManager m = new AsciiManager();
		
		assertEquals(m.nameIsOnlyAscii("Abdullahi Ahmed Sumaila"), true);
		assertEquals(m.nameIsOnlyAscii("Abdullàhi Sumaila"), false);
		assertEquals(m.nameIsOnlyAscii(""), true);
		assertEquals(m.nameIsOnlyAscii("Ahëbi ūgbabë"), false);
		assertEquals(m.nameIsOnlyAscii("€"), false);
		assertEquals(m.isOnlyAscii(null), true);
	}
}
