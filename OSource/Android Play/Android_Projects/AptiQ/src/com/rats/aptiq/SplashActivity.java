package com.rats.aptiq;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class SplashActivity extends Activity {
	
	MediaPlayer song;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		song = MediaPlayer.create(SplashActivity.this, R.raw.music);
		song.start();
		
		Thread timer = new Thread(){
			
			public void run(){
				try
				{
					
					sleep(5000);
					
				}
				catch(InterruptedException e)
				{
					
					e.printStackTrace();
					
				}
				finally
				{
			
					Intent StartingPoint = new Intent("android.intent.action.STARTINGPOINT");
					startActivity(StartingPoint);
				}
			
			}
			
		};
		
		timer.start();
	}

	
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		finish();
	}
	
	
	
}
