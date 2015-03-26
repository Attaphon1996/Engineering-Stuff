package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day6_Cultural extends Activity implements OnClickListener{
Button fashionista;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day6_cultural);
		fashionista=(Button)findViewById(R.id.fashionista);
		
		
		fashionista.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
			case R.id.fashionista:
				Intent fashionista=new Intent("com.mundheyrohan.yash15.Fashionista");
				startActivity(fashionista);
				
				break;
			
		
		}
		
	}

}
