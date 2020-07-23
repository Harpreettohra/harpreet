package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class poses extends AppCompatActivity {
    ImageView backp;
    LinearLayout tree,side,tri,half,war1,war3,wide,staff,cobra,corp,hero,child,cow,cat,dog,forfold,eagle,fwheel,bridge,boat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_poses );
        backp=findViewById( R.id.backp );
        tree=findViewById( R.id.tree );
        side=findViewById( R.id.side );
        tri=findViewById( R.id.tri );
        half=findViewById( R.id.half );
        war1=findViewById( R.id.war1 );
        war3=findViewById( R.id.war3 );
        wide=findViewById( R.id.wide );
        staff=findViewById( R.id.staff );
        cobra=findViewById( R.id.cobra );
        corp=findViewById( R.id.corp);
        hero=findViewById( R.id.hero );
        child=findViewById( R.id.child );
        cow=findViewById( R.id.cow );
        cat=findViewById( R.id.cat );
        dog=findViewById( R.id.dog );
        forfold=findViewById( R.id.forfold );
        eagle=findViewById( R.id.eagle );
        fwheel=findViewById( R.id.fwheel );
        bridge=findViewById( R.id.bridge );
        boat=findViewById( R.id.boat );



        backp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Home.class );
                startActivity( in );
                finish();
            }
        } );
        tree.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,1 );


            }
        } );
        side.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,2 );

            }
        } );
        tri.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,3 );

            }
        } );
        half.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,4 );


            }
        } );
        war1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,5 );

            }
        } );
        war3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,6 );

            }
        } );


        wide.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,7 );


            }
        } );
        staff.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,8 );

            }
        } );
        cobra.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,9 );

            }
        } );
        corp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,10 );


            }
        } );
        hero.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,11 );
            }
        } );
        child.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,12);

            }
        } );
        cow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,13 );

            }
        } );
        cat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,14 );


            }
        } );
        dog.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,15 );

            }
        } );

        forfold.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,16 );

            }
        } );
        eagle.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,17 );


            }
        } );
        fwheel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,18 );

            }
        } );
        bridge.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,19 );

            }
        } );
        boat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent( poses.this,Posesdetails.class );
                in.putExtra( "",view.getId() );
                startActivityForResult( in,20 );


            }
        } );

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
