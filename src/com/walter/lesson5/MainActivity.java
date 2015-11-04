package com.walter.lesson5;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void next(View f) {
		// intent
		// navigating to another activity
		EditText edtNames=(EditText) findViewById(R.id.editTextNames);
		String names = edtNames.getText().toString();
		
		Intent x = new Intent(this, SecondActivity.class);
        x.putExtra("abc", names);
		startActivity(x);
	}

}

















