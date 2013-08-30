package may.will.emojitextview;

import org.apache.commons.lang.StringEscapeUtils;

public class EmojiHandler {
	
	public static String decode(String text) {
		return StringEscapeUtils.unescapeJava(text);
	}

	public static String encode(String text) {
		return StringEscapeUtils.escapeJava(text);
	}

}
