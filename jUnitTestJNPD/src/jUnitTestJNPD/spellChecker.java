
public class spellChecker {
	SpellChecker.setUserDictionaryProvider(new FileUserDictionary());      
    SpellChecker.registerDictionaries(this.getClass().getResource("/dictionary"), "en");
    SpellChecker.register(messageWriter);
    SpellCheckerOptions sco=new SpellCheckerOptions();
    sco.setCaseSensitive(true);
    sco.setSuggestionsLimitMenu(10);
    JPopupMenu popup = SpellChecker.createCheckerPopup(sco);
    messageWriter.addMouseListener(new PopupListener(popup));
    @Test
    public void happySpell(){
    	String email = "I am a prince.I want to give you all the money."; //i am struggling to get this dictionary set up the rest of the way. have spent a few hrs researching dictionaries
    	
    	
         assertEquals(emails,0);
    }
}
