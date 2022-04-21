package jUnitTestJNPD;

public class Driver {
	SpellChecker.setUserDictionaryProvider(new FileUserDictionary());      
    SpellChecker.registerDictionaries(this.getClass().getResource("/dictionary"), "en");
    SpellChecker.register(messageWriter);
    SpellCheckerOptions sco = new SpellCheckerOptions();
    sco.setCaseSensitive(true);
    sco.setSuggestionsLimitMenu(10);
    JPopupMenu popup = SpellChecker.createCheckerPopup(sco);
    messageWriter.addMouseListener(new PopupListener(popup));
    
}
