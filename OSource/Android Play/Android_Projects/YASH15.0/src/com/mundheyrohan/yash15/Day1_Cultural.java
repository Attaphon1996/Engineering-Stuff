package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day1_Cultural extends Activity implements OnClickListener{
Button doty,tshirt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day1_cultural);
		
		doty=(Button)findViewById(R.id.doty);
		tshirt=(Button)findViewById(R.id.tshirt);
		
		doty.setOnClickListener(this);
		tshirt.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	switch(v.getId())
	{
	case R.id.doty:
		Intent doty=new Intent("com.mundheyrohan.yash15.DOTY");
		startActivity(doty);
		
		break;
	case R.id.tshirt:
		Intent tshirt=new Intent("com.mundheyrohan.yash15.TSHIRT");
		startActivity(tshirt);
		
	    break;
	}
	}

	
}
