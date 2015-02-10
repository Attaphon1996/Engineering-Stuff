package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day4_Technical extends Activity implements OnClickListener{
Button assemblytycoon,codemaster,dalalstreet,smackdown;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day4_technical);
		
		assemblytycoon=(Button)findViewById(R.id.assemblytycoon);
		codemaster=(Button)findViewById(R.id.codemaster);
		dalalstreet=(Button)findViewById(R.id.dalalstreet);
		smackdown=(Button)findViewById(R.id.smackdown);
		
		assemblytycoon.setOnClickListener(this);
		codemaster.setOnClickListener(this);
		dalalstreet.setOnClickListener(this);
		smackdown.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		
		case R.id.assemblytycoon:
			Intent assembly=new Intent("com.mundheyrohan.yash15.Assemblytycoon");
			startActivity(assembly);
			break;
			
		case R.id.codemaster:
			Intent codemaster=new Intent("com.mundheyrohan.yash15.Codemaster");
			startActivity(codemaster);
			
			break;
			
		case R.id.dalalstreet:
			Intent dalalstreet=new Intent("com.mundheyrohan.yash15.Dalalstreet");
			startActivity(dalalstreet);
			
			break;
			
		case R.id.smackdown:
			Intent smackdown=new Intent("com.mundheyrohan.yash15.Smackdown");
			startActivity(smackdown);
			
			break;
	
		}
		
	}

	
}
