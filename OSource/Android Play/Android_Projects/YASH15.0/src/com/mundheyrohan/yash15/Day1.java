package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day1 extends Activity implements OnClickListener{

	Button cultural,technical,sports;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day1);
		
		cultural=(Button)findViewById(R.id.day1_cultural);
		technical=(Button)findViewById(R.id.day1_technical);
		sports=(Button)findViewById(R.id.day1_sports);
		
		cultural.setOnClickListener(this);
		technical.setOnClickListener(this);
		sports.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		
		case R.id.day1_cultural:
			Intent cultural=new Intent("com.mundheyrohan.yash15.Day1_Cultural");
			startActivity(cultural);
			
			break;
			
		case R.id.day1_technical:
			Intent technical = new Intent("com.mundheyrohan.yash15.Day1_Technical");
			startActivity(technical);
			break;
			
		case R.id.day1_sports:
			Intent sports = new Intent("com.mundheyrohan.yash15.Day1_Sports");
			startActivity(sports);
			break;
		
		
		
		}
		
		
	}
	
	
}
