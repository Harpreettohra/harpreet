package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_signup );
        log=findViewById( R.id.logIn );
        log.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent( signup.this,MainActivity.class );
                startActivity( in );
                finish();

            }
        } );
    }

    @Override
    public void onBackPressed() {

    }
}
