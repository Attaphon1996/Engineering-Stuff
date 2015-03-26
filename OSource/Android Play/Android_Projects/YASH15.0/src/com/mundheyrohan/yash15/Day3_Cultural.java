package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day3_Cultural extends Activity implements OnClickListener{
Button symphonica,ragarocker,rodies,beatstreet,autocad,debate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day3_cultural);
		
		symphonica=(Button)findViewById(R.id.symphonica);
		ragarocker=(Button)findViewById(R.id.ragarocker);
		rodies=(Button)findViewById(R.id.rodies);
		beatstreet=(Button)findViewById(R.id.beatstreet);
		autocad=(Button)findViewById(R.id.autocad);
		debate=(Button)findViewById(R.id.debate);
		
		
		symphonica.setOnClickListener(this);
		ragarocker.setOnClickListener(this);
		rodies.setOnClickListener(this);
		beatstreet.setOnClickListener(this);
		autocad.setOnClickListener(this);
		debate.setOnClickListener(this);
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		
			
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
			
			
		case R.id.beatstreet:
			Intent beatstreet=new Intent("com.mundheyrohan.yash15.Beatstreet");
			startActivity(beatstreet);
			
			break;
			
		case R.id.autocad:
			Intent autocad=new Intent("com.mundheyrohan.yash15.Autocad");
			startActivity(autocad);
			
			break;
			
		case R.id.debate:
			Intent debate=new Intent("com.mundheyrohan.yash15.Debate");
			startActivity(debate);
			
			break;
			
		
		}
		
		
		
		
	}
	
	

}
