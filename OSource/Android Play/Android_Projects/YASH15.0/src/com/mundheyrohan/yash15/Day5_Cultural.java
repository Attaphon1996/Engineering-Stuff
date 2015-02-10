package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day5_Cultural extends Activity implements OnClickListener{
	Button friendsforever;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day5_cultural);
		
friendsforever=(Button)findViewById(R.id.friendsforever);
		
		friendsforever.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.friendsforever:
			Intent friends=new Intent("com.mundheyrohan.yash15.Friendsforever");
			startActivity(friends);
		break;
		
		}
	}

}
