package com.zenokhunwna.demo;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class SqliteHelper extends SQLiteOpenHelper {

	private static final String LOGTAG = "SqliteHelper";
	/**
	 * @param args
	 */
	static final String Dba_NAME = "myDB";
	static final String TAB_NAME = "rekord";
	static final String columan = "id";
	static final String columan2 = "name";
	static final String columan3 = "phone";
	static final String columan4 = "email";
	static final String columan5 = "serial_number";
	static final String columan6 = "WarrantyDue";
	
	static final int DBA_VERSION = 1;
	static final String DATAbase_create = "create table rekord" +
			"(id INTEGER PRIMARY KEY autoincrement," +
			" name 	text," +
			" phone 	text," +
			" email 	text," +
			" serial_number 	text," +
			"WarrantyDue 	text)";
	private static final String TAG = null;
	
	
	SqliteHelper(Context context){
		super(context, Dba_NAME,
				null, DBA_VERSION);
		Log.d(LOGTAG, "database created");
		
	} 
	public void onCreate(SQLiteDatabase db){
		db.execSQL(DATAbase_create);
	}
	
	 
	
	

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXIST rekord");
		onCreate(db);
	}

	///insert data from fill-in
	public void insertPersonal(String name,String phone,String email,String serial_number ){
		SQLiteDatabase db2 = this.getWritableDatabase();
		ContentValues cv1 = new ContentValues();
		cv1.put(columan2, name);
		cv1.put(columan3, phone);
		cv1.put(columan4, email);
		cv1.put(columan5, serial_number);
		db2.insert(TAB_NAME, null, cv1);
		
		
	}

	
	
	Personna newSN = new Personna();
	EditText box = Personna.sn;
	String nwSn = box.getText().toString();
		
	

		///update fill in method
	public void insertData(String WarrantyDue ){
		SQLiteDatabase db1 = this.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put(columan6, WarrantyDue);
		db1.update(TAB_NAME, cv, "serial_number = ?", new String[]{nwSn});
		
		
	}
	///search method
	public void search(String SN){
		SQLiteDatabase db1 = this.getWritableDatabase();
		Cursor c = db1.rawQuery("select * from " + TAB_NAME + " WHERE " + columan5 + " = ?", 
				new String[]{SN});
		 Log.d(TAG,"values" +SN);
		while(c.moveToNext()){
			
			StringBuffer buffer = new StringBuffer();
			buffer.append("id "+c.getString(0)+ "\n");
			 buffer.append("name "+c.getString(1)+ "\n");
			buffer.append( "phone "+c.getString(2)+ "\n");
			buffer.append("email " +c.getString(3)+ "\n");
			 buffer.append("serial_number " +c.getString(4)+ "\n");
			 buffer.append("WarrantyDue" +c.getString(5)+"\n");
			 Log.d(TAG,"values" +SN);
			
			
		}
		
	}

}
	
