package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day1_Sports extends Activity implements OnClickListener{
Button chess,carrom;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day1_sports);
		chess=(Button)findViewById(R.id.chess);
		carrom=(Button)findViewById(R.id.carrom);
		
		chess.setOnClickListener(this);
		carrom.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.chess:
			Intent chess=new Intent("com.mundheyrohan.yash15.Chess");
			startActivity(chess);
			break;
			
		case R.id.carrom:
			Intent carrom=new Intent("com.mundheyrohan.yash15.Carrom");
			startActivity(carrom);
			
			break;
		}
		
	}

}
