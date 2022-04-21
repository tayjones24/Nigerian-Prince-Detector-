import java.util.ArrayList;
import java.util.Scanner;
import com.swabunga.spell.event.SpellCheckEvent;
import com.swabunga.spell.event.SpellCheckListener;
public class fourth implements SpellCheckListener {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	second spellChecker = new second("dictionary/words.txt");;
	String line = scanner.nextLine();
	ArrayList<String> missSpelled; 
	
		String lines = line;
		missSpelled = spellChecker.detectMisspelledWords(lines);
		System.out.println(missSpelled);
	}

@Override
public void spellingError(SpellCheckEvent arg0) {
	
	
}
	
}

