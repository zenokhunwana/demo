package com.zenokhunwna.demo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public  class DBAdapter extends SQLiteOpenHelper{
	

	


		
	
	static final String KEY_ID = "id";
	static final String WARRANTY_ID = "warrantydate";
	String KEY_NME = "NAME";
	static final String DATABASE_NAME = "myDB";
	static String DATABASE_TABLE = "patients";
	static final int DATABASE_VERSION = 1;
	
	//final Context context;
	
	
	static final String DATABSE_CREATE = "create table patients(id integer primary key autoincrement, " + "warrantydate text);";
	

		
		 DBAdapter(Context context) {
			super (context,DATABASE_NAME,
			null, DATABASE_VERSION);
			
			
		}
	

		@Override
		public void onCreate(SQLiteDatabase db) {
			
			db.execSQL(DATABSE_CREATE);
			
		}
		
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS PATIENTS");
			onCreate(db);
		}


		
		
	}







