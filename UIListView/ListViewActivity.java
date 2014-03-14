package course.examples.UI.ListLayout;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//creates a new adapter that loads data from list_item.xml
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				R.layout.list_item,
				getResources().getStringArray(R.array.colors));
		
		//bind to our new adapter
		setListAdapter(arrayAdapter);		
		
		
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				Intent intent = new Intent();
				intent.setClass(ListViewActivity.this, SecondActivity.class);
				intent.putExtra("ColorKey", ((TextView) view).getText().toString());
				
				startActivity(intent);
			}
		});
	}
}



//Toast.makeText(getApplicationContext(),
//((TextView) view).getText(), Toast.LENGTH_SHORT).show();
//setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
//getResources().getStringArray(R.array.colors)));

