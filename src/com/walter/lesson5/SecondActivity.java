package com.walter.lesson5;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//getActionBar().setTitle("Second");
		String names = getIntent().getExtras().getString("abc");
		//int age =getIntent().getExtras().getInt("age");
		//double w = getIntent().getExtras().getDouble("weight");
		Toast.makeText(this, names, Toast.LENGTH_SHORT).show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
//create a new project (Assign1)
//Registration form
//(Names,Email,Age,Gender,Course(Spinner))
//Create a second page to display the elements
//on TextView










