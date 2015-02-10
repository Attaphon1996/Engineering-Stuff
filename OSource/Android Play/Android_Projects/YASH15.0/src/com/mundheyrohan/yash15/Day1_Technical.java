package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day1_Technical extends Activity implements OnClickListener{
Button internet_quest,layout_planning;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day1_technical);
		
		internet_quest=(Button)findViewById(R.id.internet_quest);
		layout_planning=(Button)findViewById(R.id.layout_planning);
		
		internet_quest.setOnClickListener(this);
		layout_planning.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.internet_quest:
			Intent internet_quest=new Intent("com.mundheyrohan.yash15.Internet_Quest");
			startActivity(internet_quest);
			
			break;
			
		case R.id.layout_planning:
			Intent layout_planning=new Intent("com.mundheyrohan.yash15.Layout_Planning");
			startActivity(layout_planning);
			
			break;

		}
		
		
		
	}

}
