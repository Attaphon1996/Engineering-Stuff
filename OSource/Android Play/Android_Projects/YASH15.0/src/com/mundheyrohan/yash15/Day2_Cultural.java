package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day2_Cultural extends Activity implements OnClickListener{
Button dramatica,razzmantaz,quizcontest;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day2_cultural);
		
		dramatica=(Button)findViewById(R.id.dramatica);
		razzmantaz=(Button)findViewById(R.id.razzmantaz);
		quizcontest=(Button)findViewById(R.id.quizcontest);
		
		dramatica.setOnClickListener(this);
		razzmantaz.setOnClickListener(this);
		quizcontest.setOnClickListener(this);
		
		
		
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
			
		case R.id.quizcontest:
			Intent quiz=new Intent("com.mundheyrohan.yash15.Quizcontest");
			startActivity(quiz);
			
			break;
		
		}
	}

	
	
}