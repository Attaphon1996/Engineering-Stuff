package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day5 extends Activity implements OnClickListener{
	Button cultural,technical,sports;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day5);
		
		cultural=(Button)findViewById(R.id.day5_cultural);
		technical=(Button)findViewById(R.id.day5_technical);
		sports=(Button)findViewById(R.id.day5_sports);
		
		cultural.setOnClickListener(this);
		technical.setOnClickListener(this);
		sports.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.day5_cultural:
			Intent cultural=new Intent("com.mundheyrohan.yash15.Day5_Cultural");
			startActivity(cultural);
			
			break;
			
		case R.id.day5_technical:
			Intent technical=new Intent("com.mundheyrohan.yash15.Day5_Technical");
			startActivity(technical);
			
			break;
			
		case R.id.day5_sports:
			Intent sports=new Intent("com.mundheyrohan.yash15.Day5_Sports");
			startActivity(sports);
			
			break;
		}
	}

}
