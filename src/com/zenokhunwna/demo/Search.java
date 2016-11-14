package com.zenokhunwna.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Search extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);
		final SqliteHelper db2 = new SqliteHelper(this);
		
		
		/// declare text
		final EditText searchNo = (EditText)findViewById(R.id.editText1);
		Button Run = (Button)findViewById(R.id.buttonFind);
		
		
		
		
		/// call search method
		Run.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				String searchValue = searchNo.getText().toString();
				db2.search(searchValue);
			}
		});
		
		
	}

}
