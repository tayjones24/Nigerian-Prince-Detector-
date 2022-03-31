package jUnitTestJNPD;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Tests {

	testQuestion question;
	capsCheck capsCheck; // sara was here
  
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
		if (answer != "Muhammadu Buhari") {
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
	public void sadCheckCapitalization() {
		String para = "Hello my name is Muhammadu Buhari and i am the president of Nigeria. I have been president for 13 years now. my favorite thing to do is to stream fortnite on discord.";
		boolean isProperPara = capsCheck.properCaps(para);
		assertEquals(isProperPara, false);
	}

}
