package com.example.yogaandroid;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash_screen );




        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep( 1000 );
                    Intent i = new Intent( SplashScreen.this, MainActivity.class );
                    startActivity( i );
                } catch (Exception e) {
                    System.out.print( e );
                }
            }
        };
        thread.start();
    }

}
