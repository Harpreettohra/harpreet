package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mantras extends AppCompatActivity {
    ImageView backm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mantras );
        backm=findViewById( R.id.backm );
        backm.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( mantras.this,Home.class );
                startActivity( in );
                finish();

            }
        } );

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed()

    }
}
