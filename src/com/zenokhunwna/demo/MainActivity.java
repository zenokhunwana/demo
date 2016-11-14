package com.zenokhunwna.demo;





import android.support.v7.app.ActionBarActivity;

import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
	
	
	private static final String TAG = null;

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	

				
				//declare buttons
				Button butIte = (Button)findViewById(R.id.btnname);
				Button butBte = (Button)findViewById(R.id.btnname2);
				Button butAss = (Button)findViewById(R.id.btnname3);
				Button butSearch =(Button)findViewById(R.id.btnsearch);
				
			
				
			
				
				butBte.setOnClickListener(new OnClickListener(){
					public void onClick(View v){
						
					startActivity(new Intent(MainActivity.this,ITE.class));
					}
				});
					
				butIte.setOnClickListener(new OnClickListener(){
					public void onClick(View v){
						startActivity(new Intent(MainActivity.this,Bte.class));
					}
				});
					
					butAss.setOnClickListener(new OnClickListener(){
						public void onClick(View v){
							startActivity(new Intent(MainActivity.this,Access.class));
						}
					});
						
						butSearch.setOnClickListener(new OnClickListener(){
							public void onClick(View V){
								startActivity(new Intent(MainActivity.this,Search.class));
								
							}
						
					});
					
					
						Log.d(TAG,"working in order");
					
					
					

						
					
				
					
				
	}
	
	

}
