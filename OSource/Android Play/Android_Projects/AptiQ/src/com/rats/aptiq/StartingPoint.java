package com.rats.aptiq;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class StartingPoint extends ActionBarActivity {
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_point);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater blowup = getMenuInflater();
        blowup.inflate(R.menu.menu_cool, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId())
        {
        case R.id.aboutus :
        	Intent abt =new Intent("android.intent.action.ABOUTUS");
        	startActivity(abt);
        	
        	break;
        	
        case R.id.contactus :
        	Intent cnt=new Intent("android.intent.action.CONTACT");
        	startActivity(cnt);
        	
        	break;
        
        }
        return true;
    }
}
