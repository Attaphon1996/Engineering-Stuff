package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day2_Cultural extends Activity implements OnClickListener{
Button dramatica,razzmantaz,clickoflix;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day2_cultural);
		
		dramatica=(Button)findViewById(R.id.dramatica);
		razzmantaz=(Button)findViewById(R.id.razzmantaz);
		clickoflix=(Button)findViewById(R.id.clickoflix);
		
		dramatica.setOnClickListener(this);
		razzmantaz.setOnClickListener(this);
		clickoflix.setOnClickListener(this);
		
		
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.dramatica:
			Intent drama=new Intent("com.mundheyrohan.yash15.Dramatica");
			startActivity(drama);
			
			break;
		case R.id.razzmantaz:
			Intent razz=new Intent("com.mundheyrohan.yash15.Razzmantaz");
			startActivity(razz);
			
			break;
		case R.id.clickoflix:
			Intent clickoflix=new Intent("com.mundheyrohan.yash15.Clickoflix");
			startActivity(clickoflix);
		
		
		}
	}

	
	
}
