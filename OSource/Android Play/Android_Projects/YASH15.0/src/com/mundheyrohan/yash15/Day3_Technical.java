package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day3_Technical extends Activity implements OnClickListener{

	Button junkyardwars,ccasino,fifamanager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day3_technical);
		junkyardwars=(Button)findViewById(R.id.junkyardwars);
		ccasino=(Button)findViewById(R.id.ccasino);
		fifamanager=(Button)findViewById(R.id.fifamanager);
		
		junkyardwars.setOnClickListener(this);
		ccasino.setOnClickListener(this);
		fifamanager.setOnClickListener(this);
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.junkyardwars:
			Intent junk=new Intent("com.mundheyrohan.yash15.Junkyardwars");
			startActivity(junk);
			
			break;
			
		case R.id.ccasino:
			Intent ccasino=new Intent("com.mundheyrohan.yash15.Ccasino");
			startActivity(ccasino);
			
			break;
			
		case R.id.fifamanager:
			Intent fifamanager=new Intent("com.mundheyrohan.yash15.Fifamanager");
			startActivity(fifamanager);
			
			break;
		
		
		
		}
		
	}

	
}
