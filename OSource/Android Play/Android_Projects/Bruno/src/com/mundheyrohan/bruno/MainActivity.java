package com.mundheyrohan.bruno;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements OnClickListener {

	WebView brow;
	EditText url;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        
        brow=(WebView) findViewById(R.id.wvBrowser);
        brow.getSettings().setJavaScriptEnabled(true);
        brow.getSettings().setLoadWithOverviewMode(true);
        brow.getSettings().setUseWideViewPort(true);
        brow.setWebViewClient(new ourViewClient());
        try{
        brow.loadUrl("http://www.google.com");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        url =(EditText) findViewById(R.id.etURL);
        Button go = (Button) findViewById(R.id.bGo);
        ImageButton back = (ImageButton) findViewById(R.id.bBack);
        ImageButton forward = (ImageButton) findViewById(R.id.bForward);
        ImageButton refresh = (ImageButton) findViewById(R.id.bRefresh);
        go.setOnClickListener(this);
        back.setOnClickListener(this);
        forward.setOnClickListener(this);
        refresh.setOnClickListener(this);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.bGo:
			String web = url.getEditableText().toString();
			String constant = new String("http://");
			web =constant + web ;
			
			brow.loadUrl(web);
			InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(url.getWindowToken(), 0);
			break;
		case R.id.bBack:
			if(brow.canGoBack())
				brow.goBack();
			break;
		case R.id.bForward:
			if(brow.canGoForward())
				brow.goForward();
			break;
		case R.id.bRefresh:
			brow.reload();
			break;
		
		
		}
	}
}
