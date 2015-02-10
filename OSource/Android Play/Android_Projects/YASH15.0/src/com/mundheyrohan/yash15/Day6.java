package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day6 extends Activity implements OnClickListener{
	Button cultural,technical;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day6);
		
		cultural=(Button)findViewById(R.id.day6_cultural);
		technical=(Button)findViewById(R.id.day6_technical);
		
		
		cultural.setOnClickListener(this);
		technical.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.day6_cultural:
			Intent cultural=new Intent("com.mundheyrohan.yash15.Day6_Cultural");
			startActivity(cultural);
			
			break;
			
		case R.id.day6_technical:
			Intent technical=new Intent("com.mundheyrohan.yash15.Day6_Technical");
			startActivity(technical);
			
			break;
		}
		
	}

}