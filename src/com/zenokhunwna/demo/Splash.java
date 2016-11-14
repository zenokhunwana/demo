package com.zenokhunwna.demo;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;



	/**
	 * @param args
	 */
public class Splash extends Activity {
    protected static final String TAG = null;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.splash);
         TimerTask task = new TimerTask(){

             @Override
             public void run() {
                  finish();     
                  startActivity(new Intent(Splash.this, Personna.class));  
                  Log.d(TAG,"CALLED person class");
          		
             }

        };//task
        Timer opening = new Timer();
        opening.schedule (task, 2000);
    }

  
   

}

