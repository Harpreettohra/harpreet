package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Posesdetails extends AppCompatActivity {
ImageView backd;
TextView posename,chakra,duration;
ImageView imago;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_posesdetails );
        backd=findViewById( R.id.backd );
        posename=findViewById( R.id.posename );
        chakra=findViewById( R.id.chakra );
        duration=findViewById( R.id.duration);
        imago=findViewById( R.id.imago );
        backd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( Posesdetails.this,poses.class );
                startActivity( in );
                finish();

            }
        } );
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("", 0);
        if(intValue == 0){
            Toast.makeText( this, "something went wrong", Toast.LENGTH_SHORT ).show();
        }

        else if(intValue == R.id.tree) {
                posename.setText( "Vrikasana" );
                chakra.setText( "Root" );
                duration.setText( " 1 min" );
                imago.setImageResource( R.drawable.yoga3 );
            }
        else if (intValue == 2) {
                    posename.setText( "Vasisthasana" );
                    chakra.setText( "Heart" );
                    duration.setText( " 2 min" );
                    imago.setImageResource( R.drawable.yoga21 );
        }
        else if (intValue == R.id.tri) {
            posename.setText( "Trikoasana" );
            chakra.setText( "Sacral" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga14 );
        }
        else if (intValue == R.id.half) {
            posename.setText( "Ardha Chandrasna" );
            chakra.setText( "Sacral" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga15 );
        }
        else if(intValue == R.id.war1) {
            posename.setText( "Virabhandrasana 1" );
            chakra.setText( "Solar Root" );
            duration.setText( " 2 min" );
            imago.setImageResource( R.drawable.yoga11 );
        }
        else if (intValue == R.id.war3) {
            posename.setText( "Virabhandrasana 3" );
            chakra.setText( "Solar Root" );
            duration.setText( " 2 min" );
            imago.setImageResource( R.drawable.yoga17 );
        }
        else if(intValue == R.id.wide) {
            posename.setText( "Prasarita Padottanasana" );
            chakra.setText( "Sacral" );
            duration.setText( " 2 min" );
            imago.setImageResource( R.drawable.yoga24 );
        }
        else if (intValue == R.id.staff) {
            posename.setText( "Chaturanga" );
            chakra.setText( "Solar" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga32 );
        }
        else if(intValue == R.id.cobra) {
            posename.setText( "Bhujangasana" );
            chakra.setText( "Heart" );
            duration.setText( " 2 min" );
            imago.setImageResource( R.drawable.yoga35 );
        }
        else if (intValue == R.id.corp) {
            posename.setText( "Savasana" );
            chakra.setText( "Crown" );
            duration.setText( " 10 min" );
            imago.setImageResource( R.drawable.yoga41 );
        }
        else if(intValue == R.id.hero) {
            posename.setText( "Virasana" );
            chakra.setText( "Brow" );
            duration.setText( " 2 min" );
            imago.setImageResource( R.drawable.yoga49 );
        }
        else if (intValue == R.id.child) {
            posename.setText( "Balasana" );
            chakra.setText( "Root Brow" );
            duration.setText( " 3 min" );
            imago.setImageResource( R.drawable.yoga50 );
        }
        else if(intValue == R.id.cow) {
            posename.setText( " Bitilasana" );
            chakra.setText( "Heart" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga55 );
        }
        else if (intValue == R.id.cat) {
            posename.setText( " Marjariasana" );
            chakra.setText( "All chakras" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga56 );
        }
        else if(intValue == R.id.dog) {
            posename.setText( "Adho Mukha Svasana" );
            chakra.setText( "Solar" );
            duration.setText( " 3 min" );
            imago.setImageResource( R.drawable.yoga61 );
        }
        else if (intValue == R.id.forfold) {
            posename.setText( "Uttanasana" );
            chakra.setText( "Root Heart Solar" );
            duration.setText( " 2 min" );
            imago.setImageResource( R.drawable.yoga67);
        }
        else if(intValue == R.id.eagle) {
            posename.setText( " garudasana" );
            chakra.setText( "Heart" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga72 );
        }
        else if (intValue == R.id.fwheel) {
            posename.setText( " Urdhva Dhanurasana" );
            chakra.setText( "All chakras" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga75 );
        }
        else if(intValue == R.id.bridge) {
            posename.setText( "Setu Bandha Sarvangasana" );
            chakra.setText( "Heart Throat" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga76 );
        }
        else if (intValue == R.id.boat) {
            posename.setText( "Navasana" );
            chakra.setText( "Solar" );
            duration.setText( " 1 min" );
            imago.setImageResource( R.drawable.yoga86);
        }
        else{
            Toast.makeText( this, "something gone wrong", Toast.LENGTH_SHORT ).show();
        }

6

    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
    }
}
