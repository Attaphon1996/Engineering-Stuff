package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day3 extends Activity implements OnClickListener{
	Button cultural,technical,sports;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day3);
		
		cultural=(Button)findViewById(R.id.day3_cultural);
		technical=(Button)findViewById(R.id.day3_technical);
		sports=(Button)findViewById(R.id.day3_sports);
		
		cultural.setOnClickListener(this);
		technical.setOnClickListener(this);
		sports.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.day3_cultural:
			Intent cultural=new Intent("com.mundheyrohan.yash15.Day3_Cultural");
			startActivity(cultural);
			
			break;
			
		case R.id.day3_technical:
			Intent technical=new Intent("com.mundheyrohan.yash15.Day3_Technical");
			startActivity(technical);
			
			break;
			
		case R.id.day3_sports:
			Intent sports=new Intent("com.mundheyrohan.yash15.Day3_Sports");
			startActivity(sports);
			
			break;
		}
	}
	

}
