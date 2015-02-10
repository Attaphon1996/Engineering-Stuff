package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day3_Cultural extends Activity implements OnClickListener{
Button bulyme,symphonica,ragarocker,rodies;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day3_cultural);
		bulyme=(Button)findViewById(R.id.bulyme);
		symphonica=(Button)findViewById(R.id.symphonica);
		ragarocker=(Button)findViewById(R.id.ragarocker);
		rodies=(Button)findViewById(R.id.rodies);
		
		bulyme.setOnClickListener(this);
		symphonica.setOnClickListener(this);
		ragarocker.setOnClickListener(this);
		rodies.setOnClickListener(this);
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.bulyme:
			Intent bullyme=new Intent("com.mundheyrohan.yash15.Bulyme");
			startActivity(bullyme);
			
			break;
			
		case R.id.symphonica:
			Intent symphonica=new Intent("com.mundheyrohan.yash15.Symphonica");
			startActivity(symphonica);
			
			break;
			
		case R.id.ragarocker:
			Intent ragarocker=new Intent("com.mundheyrohan.yash15.Ragarockers");
			startActivity(ragarocker);
			
			break;
			
		case R.id.rodies:
			Intent rodies=new Intent("com.mundheyrohan.yash15.Rodies");
			startActivity(rodies);
			
			break;
		
		}
		
		
		
		
	}
	
	

}