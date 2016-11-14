package com.zenokhunwna.demo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class Personna extends Activity{
	

	

	private static final String TAG = null;
	
	public static  EditText sn;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.persona);
		Log.d(TAG,"runing personna");
		
		
	
		final EditText name = (EditText)findViewById(R.id.editTextName);
		final EditText phone = (EditText)findViewById(R.id.editTextPhone);
		final EditText email = (EditText)findViewById(R.id.editTextEmail);
		sn = (EditText)findViewById(R.id.editTextSN);
	
	
		
		
		 
		final SqliteHelper db2 = new SqliteHelper(this);
		
		
		
		Button btnSave = (Button)findViewById(R.id.btnSave);
		
		
		
		
		btnSave.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
						
				
				db2.insertPersonal(name.getText().toString(), phone.getText().toString(),
						email.getText().toString(), sn.getText().toString());
				Toast.makeText(getBaseContext(), "saved", Toast.LENGTH_SHORT).show();
				
				startActivity(new Intent(Personna.this,MainActivity.class));
			}

		
		});
				
	}
	

}
