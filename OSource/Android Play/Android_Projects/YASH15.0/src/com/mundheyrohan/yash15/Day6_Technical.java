package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day6_Technical extends Activity implements OnClickListener{
Button roborace,robowar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day6_technical);
		roborace=(Button)findViewById(R.id.roborace);
		robowar=(Button)findViewById(R.id.robowar);
		
		roborace.setOnClickListener(this);
		robowar.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.roborace:
			Intent roborace=new Intent("com.mundheyrohan.yash15.Roborace");
			startActivity(roborace);
			break;
		case R.id.robowar:
			Intent robowar=new Intent("com.mundheyrohan.yash15.Robowar");
			startActivity(robowar);
			
			break;
	
		}
		
	}
	
	

}
