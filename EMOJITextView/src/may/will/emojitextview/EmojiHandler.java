package may.will.emojitextview;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.StringEscapeUtils;

import android.util.Base64;
import android.util.Log;

/**
 * Simple Library for escaping and unescaping of emoji characters
 * 
 * @author Will5
 */

public class EmojiHandler {

	public static String decodeJava(String text) {
		return StringEscapeUtils.unescapeJava(text);
	}

	public static String encodeJava(String text) {
		return StringEscapeUtils.escapeJava(text);
	}

	public String decodeHtml(String emoji) {
		return StringEscapeUtils.unescapeHtml(emoji);
	}

	public String encodeHtml(String emoji) {
		return StringEscapeUtils.escapeHtml(emoji);
	}

	public String base64Encode(String text) {
		try {
			byte[] data = text.getBytes("UTF-8");
			return Base64.encodeToString(data, Base64.DEFAULT);
		} catch (UnsupportedEncodingException e) {
			return text;
		}
	}

	public String base64Decode(String text) {
		try {
			byte[] data = Base64.decode(text, Base64.DEFAULT);
			return new String(data, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return text;
		}
	}

	public String encodeToUNICODE(String text) {
		String encoding = "UNICODE";
		try {
			byte[] bytes = (text).getBytes();
			return new String(bytes, encoding);
		} catch (UnsupportedEncodingException e) {
			Log.i("UE", encoding);
			return text;
		}
	}

	public String encodeToUSASCII(String text) {
		String encoding = "US-ASCII";
		try {
			byte[] bytes = (text).getBytes();
			return new String(bytes, encoding);
		} catch (UnsupportedEncodingException e) {
			Log.i("UE", encoding);
			return text;
		}
	}

	public String encodeToUTF8(String text) {
		String encoding = "UTF-8";
		try {
			byte[] bytes = (text).getBytes();
			return new String(bytes, encoding);
		} catch (UnsupportedEncodingException e) {
			Log.i("UE", encoding);
			return text;
		}
	}

	public String encodeToUTF16(String text) {
		String encoding = "UTF-16";
		try {
			byte[] bytes = (text).getBytes();
			return new String(bytes, encoding);
		} catch (UnsupportedEncodingException e) {
			Log.i("UE", encoding);
			return text;
		}
	}

	public static String toUnicode(char c) {
		return String.format("\\u%04x", (int) c);
	}

}
