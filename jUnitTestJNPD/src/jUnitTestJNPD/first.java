
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Dictionary;

import com.swabunga.spell.engine.SpellDictionaryHashMap;
	public class first {
	private static first dictionary;
	private File file;
	private SpellDictionaryHashMap dictionaryHashMap;
	private first(File file) {
	this.file = file;
	}
	public static first getInstance(String filePath) {
	if (filePath != null && !filePath.isEmpty()) {
	if (dictionary == null) {
	File file = new File(filePath);
	dictionary = new first(file);
	} else {
	return dictionary;
	}
	}
	return dictionary;
	}
	public SpellDictionaryHashMap getDictionaryMap() {
	if (file != null) {
	try {
	dictionaryHashMap = new SpellDictionaryHashMap(file);
	} catch (FileNotFoundException e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
	} catch (IOException e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
				}
			}
	return dictionaryHashMap;
		}
	}
