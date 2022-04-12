
	import java.util.List;
	import com.swabunga.spell.event.SpellCheckEvent;
	import com.swabunga.spell.event.SpellCheckListener;
	public class Third implements SpellCheckListener {
		
	private List<String> misspelledWords;
	public Third(List<String> misspelledWords) {
	this.misspelledWords = misspelledWords;
	} 
	@Override
	public void spellingError(SpellCheckEvent event) {
	event.ignoreWord(true);
	misspelledWords.add(event.getInvalidWord());
	}
}
