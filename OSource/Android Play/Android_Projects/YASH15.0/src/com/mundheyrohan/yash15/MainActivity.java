package com.mundheyrohan.yash15;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button day0,day1,day2,day3,day4,day5,day6,day7;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 day0=(Button)findViewById(R.id.day0);
		 day1=(Button)findViewById(R.id.day1);
		 day2=(Button)findViewById(R.id.day2);
		 day3=(Button)findViewById(R.id.day3);
		 day4=(Button)findViewById(R.id.day4);
		 day5=(Button)findViewById(R.id.day5);
		 day6=(Button)findViewById(R.id.day6);
		 day7=(Button)findViewById(R.id.day7);
		
		
		
		 day0.setOnClickListener(this);
		 day1.setOnClickListener(this);
		 day2.setOnClickListener(this);
		 day3.setOnClickListener(this);
		 day4.setOnClickListener(this);
		 day5.setOnClickListener(this);
		 day6.setOnClickListener(this);
		 day7.setOnClickListener(this);
		 
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		MenuInflater blowup=getMenuInflater();
		blowup.inflate(R.menu.cool_menu, menu);
		
		return true;
		
		
		
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		
		switch(item.getItemId())
		{
		case R.id.developer:
			Intent developer=new Intent("com.mundheyrohan.yash15.Developer");
			startActivity(developer);
			
			
			break;
			
		case R.id.designer:
			Intent designer=new Intent("com.mundheyrohan.yash15.Designer");
			startActivity(designer);
			
			break;
			
		case R.id.codeveloper:
			Intent codeveloper=new Intent("com.mundheyrohan.yash15.Codeveloper");
			startActivity(codeveloper);
			
			break;
			
		case R.id.content:
			Intent content=new Intent("com.mundheyrohan.yash15.Contentwriter");
			startActivity(content);
			
			break;
		
		
		}
		return false;
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		switch(v.getId())
		{
		
		
		
		case R.id.day0:
			Intent Day0=new Intent("com.mundheyrohan.yash15.Day0");
			startActivity(Day0);
			break;
		case R.id.day1:
			Intent Day1=new Intent("com.mundheyrohan.yash15.Day1");
			startActivity(Day1);
			break;
			
		case R.id.day2:
			Intent Day2=new Intent("com.mundheyrohan.yash15.Day2");
			startActivity(Day2);
			
			break;
			
		case R.id.day3:
			Intent Day3=new Intent("com.mundheyrohan.yash15.Day3");
			startActivity(Day3);
			
			
			break;
			
		case R.id.day4:
			Intent Day4=new Intent("com.mundheyrohan.yash15.Day4");
			startActivity(Day4);
			
			
			break;
			
		case R.id.day5:
			Intent Day5=new Intent("com.mundheyrohan.yash15.Day5");
			startActivity(Day5);
			
			
			break;
			
		case R.id.day6:
			Intent Day6=new Intent("com.mundheyrohan.yash15.Day6");
			startActivity(Day6);
			
			
			break;
			
		case R.id.day7:
			Intent day7=new Intent("com.mundheyrohan.yash15.Day7");
			startActivity(day7);
			
			break;
		
		}
		
	}
}
