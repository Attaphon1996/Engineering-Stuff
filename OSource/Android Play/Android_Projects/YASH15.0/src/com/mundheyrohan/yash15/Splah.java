package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splah extends Activity{
	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
	    ourSong=MediaPlayer.create(Splah.this, R.raw.music);
		ourSong.start();
		
		Thread timer=new Thread(){
		public void run(){
			try{
				
				sleep(4000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				
			}
			finally
			{	Intent startingpoint=new Intent("com.mundheyrohan.yash15.MainActivity");
				startActivity(startingpoint);
				
				
			}
			
		}
	};
	timer.start();

}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
}