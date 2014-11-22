package com.example.test_anroid;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class MainActivity extends ActionBarActivity {

	private WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   //     Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://qa-java1.mybluemix.net/"));
   //     startActivity(browserIntent);
        mWebview = (WebView) findViewById(R.id.webView1);
        mWebview.loadUrl("http://qa-java1.mybluemix.net/");
   //     setContentView(mWebview);
    }
    
    protected void onResume(Bundle savedInstanceState) {
        super.onResume();

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://qa-java1.mybluemix.net/"));
        startActivity(browserIntent);

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
}
