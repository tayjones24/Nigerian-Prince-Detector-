import java.util.ArrayList;
import com.swabunga.spell.event.SpellChecker;
import com.swabunga.spell.event.StringWordTokenizer;
import com.swabunga.spell.event.TeXWordFinder;
public class second {
	
		private SpellChecker spellChecker;
		private ArrayList<String> misspelledWords = new ArrayList<String>();;
		private first dictionaryMap;
		public ArrayList<String>[] detectMisspelledWords;
public second(String filePath) {
			
	if(filePath != null && !filePath.isEmpty()) {
	
		dictionaryMap = first.getInstance(filePath);
		spellChecker = new SpellChecker(dictionaryMap.getDictionaryMap());
		Third listener = new Third(misspelledWords);
		spellChecker.addSpellCheckListener(listener);
	}
}
// Method to Detect Misspelled Words From Given Line
public ArrayList<String> detectMisspelledWords(String text) {
StringWordTokenizer strTokenizer = new StringWordTokenizer(text, new TeXWordFinder());
spellChecker.checkSpelling(strTokenizer);
return misspelledWords;
	}
}