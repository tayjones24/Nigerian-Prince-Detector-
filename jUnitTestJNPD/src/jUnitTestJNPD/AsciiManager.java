package jUnitTestJNPD;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharacterCodingException;

/**
 * ASCII Manager class takes care of all the interaction and code relating to
 * ASCII characters
 * 
 * @author veronikakermoshchuk
 *
 */
public class AsciiManager {
	Color c;

	public AsciiManager() {

	}

	/**
	 * Checks if the string (email content) contains only ASCII characters. If no
	 * non ASCII characters found, returns true. If at least one non-ASCII character
	 * is found returns false
	 * 
	 * @param string
	 * @return
	 */
	public boolean isOnlyAscii(String string) {
		// If the string is null returns true because there are no non ASCII characters
		// in a
		// null string
		if (string == null) {
			return true;
		}

		byte bytearray[] = string.getBytes();
		CharsetDecoder d = Charset.forName("US-ASCII").newDecoder();

		try {
			CharBuffer r = d.decode(ByteBuffer.wrap(bytearray));
			r.toString();
		}

		// Handles the case when Non ASCII character is found
		catch (CharacterCodingException e) {
			c = Color.RED;
			return false;
		}

		// If there is no non ASCII characters in a string, then string contains all the
		// allowed characters
		return true;
	}

	/**
	 * Checks if the name of the Nigerian Royalty contains only ASCII characters
	 * 
	 * @param name
	 * @return
	 */
	public boolean nameIsOnlyAscii(String name) {
		if (isOnlyAscii(name)) {
			return true;
		}
		return false;
	}

}
