package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class blog extends AppCompatActivity {
    WebView blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_blog );
        blog= (WebView) findViewById( R.id.blog );
        WebSettings webSettings = blog.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);



        final Activity activity = this;


        blog.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }


        });

        blog .loadUrl("https://dailycup.yoga/");

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent in= new Intent( blog.this,Home.class );
        startActivity( in );
        finish();
    }
}
