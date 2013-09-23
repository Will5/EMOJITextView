package may.will.emojitextview;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Simple Library for escaping and unescaping of emoji characters
 * 
 * @author Will5
 */

public class EmojiHandler {
	
	public static String decode(String text) {
		return StringEscapeUtils.unescapeJava(text);
	}

	public static String encode(String text) {
		return StringEscapeUtils.escapeJava(text);
	}

}
