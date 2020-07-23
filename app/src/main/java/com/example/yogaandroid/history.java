package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class history extends AppCompatActivity {
    WebView his;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_history );
        his = (WebView) findViewById( R.id.his );
        WebSettings webSettings = his.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);



        final Activity activity = this;


        his.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }


        });

        his .loadUrl("https://en.wikipedia.org/wiki/Yoga");



    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent in= new Intent( history.this,Home.class );
        startActivity( in );
        finish();
    }
}
