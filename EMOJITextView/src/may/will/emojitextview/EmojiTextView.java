package may.will.emojitextview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class EmojiTextView extends TextView {

	public EmojiTextView(Context context) {
		super(context);
	}

	public EmojiTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public EmojiTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public final String getTextWithEmojis() {
		return EmojiHandler.encodeJava(this.getText().toString());
	}

	public final void setTextWithEmojis(String text) {
		this.setText(EmojiHandler.decodeJava(text));
	}

}
