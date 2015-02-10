package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day2_Sports extends Activity implements OnClickListener{
Button futsal,armwrestling;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day2_sports);
		
		futsal=(Button)findViewById(R.id.futsal);
		armwrestling=(Button)findViewById(R.id.armwrestling);
		
		futsal.setOnClickListener(this);
		armwrestling.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.futsal:
			Intent futsal=new Intent("com.mundheyrohan.yash15.Futsal");
			startActivity(futsal);
			
			break;
			
		case R.id.armwrestling:
			Intent arm=new Intent("com.mundheyrohan.yash15.Armwrestling");
			startActivity(arm);
			break;
		
		
		}
	}

}