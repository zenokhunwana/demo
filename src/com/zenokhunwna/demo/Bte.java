package com.zenokhunwna.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.ActionBar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
public class Bte extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bte);
		final SqliteHelper db = new SqliteHelper(this);
		
		
		
		final DatePicker	datePicker1 = (DatePicker)findViewById(R.id.datePicker1);
		final TextView  result = (TextView)findViewById(R.id.result);
		Button btnCal = (Button)findViewById(R.id.btnCal);
		final ImageButton btnBack = (ImageButton)findViewById(R.id.imageBtn1);
		
		btnCal.setOnClickListener (new OnClickListener() {
			public void onClick(View v) {
				int year =  datePicker1.getYear() - 1900;
						int month = (datePicker1.getMonth());
				int day =  datePicker1.getDayOfMonth();
				Calendar curDate = Calendar.getInstance();
				
			
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String dt = sdf.format(new Date(year,month,day));
				try {
					curDate.setTime(sdf.parse(dt));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				curDate.add(Calendar.MONTH,30);
				dt =sdf.format(curDate.getTime());
				Date Vandag = new Date();
				String nowValue = sdf.format(Vandag);
				Personna newSN = new Personna();
			
				//call insert method
					db.insertData(dt);
				
		         int i = dt.compareTo(nowValue);
		            
		            if(i > 0){
		            	result.setText(" still in warranty "+dt);
		                 
		            }else if(i<0){
		            	result.setText(" out of warranty " +dt);
		            }else{
		            	result.setText(dt);
		        
		    }
				
				
				btnBack.setOnClickListener(new OnClickListener(){
					public void onClick(View v){
						startActivity(new Intent(Bte.this,MainActivity.class));
					}
				});
				
				
				
			}
			
			});
		}
		
		
					
						
					
				
	}

