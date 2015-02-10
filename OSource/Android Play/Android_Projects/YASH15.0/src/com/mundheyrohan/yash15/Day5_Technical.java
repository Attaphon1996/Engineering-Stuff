package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day5_Technical extends Activity implements OnClickListener{
Button trussted,counterstrike,nfs,contraption;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day5_technical);
		trussted=(Button)findViewById(R.id.trussted);
		counterstrike=(Button)findViewById(R.id.counterstrike);
		nfs=(Button)findViewById(R.id.nfs);
		contraption=(Button)findViewById(R.id.contraption);
		
		trussted.setOnClickListener(this);
		counterstrike.setOnClickListener(this);
		nfs.setOnClickListener(this);
		contraption.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.trussted:
			Intent trussted=new Intent("com.mundheyrohan.yash15.Trussted");
			startActivity(trussted);
			
			break;
			
		case R.id.counterstrike:
			Intent counterstrike=new Intent("com.mundheyrohan.yash15.Counterstrike");
			startActivity(counterstrike);
			
			break;
			
		case R.id.nfs:
			Intent nfs=new Intent("com.mundheyrohan.yash15.Nfs");
			startActivity(nfs);
			
			break;
			
		case R.id.contraption:
			Intent contraption=new Intent("com.mundheyrohan.yash15.Contraption");
			startActivity(contraption);
			
			break;

		}
		
	}

}