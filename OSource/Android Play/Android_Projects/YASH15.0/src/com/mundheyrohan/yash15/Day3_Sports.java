package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day3_Sports extends Activity implements OnClickListener{
Button boxcricket,badminton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day3_sports);
		
		boxcricket=(Button)findViewById(R.id.boxcricket);
		badminton=(Button)findViewById(R.id.badminton);
		
		boxcricket.setOnClickListener(this);
		badminton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.boxcricket:
			Intent boxcricket=new Intent("com.mundheyrohan.yash15.Boxcricket");
			startActivity(boxcricket);
			
			break;
			
		case R.id.badminton:
			Intent badminton=new Intent("com.mundheyrohan.yash15.Badminton");
			startActivity(badminton);
			
			
			break;
		
		}
		
	}

}
