package course.examples.UI.ListLayout;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
	public static final String TAG = "ColorApp";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Bundle extras = getIntent().getExtras();

		// Extract data using passed keys
		Log.i(TAG,"Step 1");
		String value1 = extras.getString("ColorKey");
		Log.i(TAG,"Step 2");
		TextView textView = (TextView) findViewById(R.id.textView1);
		Log.i(TAG,"Step 3");
		textView.setText(value1);
		
		
	}



}
