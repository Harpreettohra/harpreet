package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Home extends AppCompatActivity {
    LinearLayout yogain;
    LinearLayout yogabl;
    LinearLayout yogama;
    LinearLayout yogapo;
   // private Boolean exit = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );

        yogain=findViewById( R.id.yogain );
        yogabl=findViewById( R.id.yogabl );
        yogama=findViewById( R.id.yogama );
        yogapo=findViewById( R.id.yogapo );
        yogain.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent( Home.this, history.class);
                startActivity( in );
                finish();
            }
        } );
        yogabl.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent( Home.this, blog.class);
                startActivity( in );
                finish();

            }
        } );
        yogama.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent( Home.this, mantras.class);
                startActivity( in );
                finish();
            }
        } );
        yogapo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent( Home.this, poses.class);
                startActivity( in );
                finish();
            }
        } );
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        //finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
        finish();

        }

}
