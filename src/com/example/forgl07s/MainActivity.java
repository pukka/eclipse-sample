package com.example.forgl07s;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends Activity {

	 private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews(); // Viewの読み込み
		webView.loadUrl("192.168.1.37:9000"); // サイトの読み込み
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "SkeletonActivity", "onResume" );
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d( "SkeletonActivity", "onPause" );
    }

    public void findViews() {

  	  webView = (WebView)findViewById(R.id.webview);
  	}
  }
