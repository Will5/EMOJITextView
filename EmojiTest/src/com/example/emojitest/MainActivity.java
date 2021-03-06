package com.example.emojitest;

import may.will.emojitextview.EmojiHandler;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final String TAG = "EmojiTest";

		final EditText editText = (EditText) findViewById(R.id.editText);
		final TextView textView = (TextView) findViewById(R.id.textView);
		final Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String emoji = editText.getText().toString();

				//	emoji = "Hello World! \ud83d\ude03";
				emoji = "Hello World! \ud83d\ude0A :-)";

				Log.i(TAG, ""+emoji);

				/*  NSNonLossyASCIIStringEncoding  */
				/// Emoji encoding
				/// NSString * uniText = [NSString stringWithUTF8String:orgMsg UTF8String];
				/// NSData * msgData   = [uniText dataUsingEncoding:NSNonLossyASCIIStringEncoding];
				/// NSString * goodMsg = [[NSString alloc] initWithData:msgData encoding:NSUTF8StringEncoding];

				/* Method 1 */
				Log.i(TAG, "Method1");

				String string1 = "";
				string1 = EmojiHandler.encodeJava(emoji);
				Log.i(TAG, ""+string1);

				string1 = EmojiHandler.decodeJava(string1);
				Log.i(TAG, ""+string1);

				textView.setText(string1);

				/* Method 2 */
				Log.i(TAG, "Method2");

				String string2 = "";
				for (char c : emoji.toCharArray()) {
					string2 += EmojiHandler.toUnicode(c);
				}
				Log.i(TAG, ""+string2);

				string2 = EmojiHandler.decodeJava(string2);
				Log.i(TAG, ""+string2);

				textView.setText(string2);

			}

		});

	}

}
