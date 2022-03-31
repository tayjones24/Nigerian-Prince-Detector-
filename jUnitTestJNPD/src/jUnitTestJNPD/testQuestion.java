package jUnitTestJNPD;

import java.util.Scanner;

public class testQuestion {
	String[] questions = { "Oke Oramfe is located in………..", "In Nigeria there are more ____ within ethnic groups",
			"What is the capital of Nigeria?", "Who is the leader of Nigeria?",
			"What is the national anthem of Nigeria?",
			"Which of the following is the most significant cleavage in Nigeria?",
			"_____ carnival is celevrated in Nigeria?",
			"In which of these tribes do young people kneel to greet elderly people? in Nigeria?",
			"In which of these tribes is it forbidden for a sitting traditional ruler to see their parents?" };
	String[] answers = { "Ile-Ife", "Dialects", "Abuja", "Muhammadu Buhari", "Arise, O Compatriots", "Ethnicity",
			"Calabar", "Yoruba", "Bachama" };

	public boolean getQandA() {
		int pick = (int) (Math.random() * answers.length);
		String question = questions[pick];
		String answer = answers[pick];
		System.out.println("Please answer the following question: " + question);
		Scanner scan = new Scanner(System.in);
		if (scan.next() == answer) {
			return true;
		}
		
		System.out.println("Yeehaw");
		
		return false;

	}
}
