package com.example.yogaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText email,pass;

    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        login=findViewById( R.id.login);

        email=findViewById( R.id.email );
        pass=findViewById( R.id.pass );
        signup=findViewById( R.id.signUp );



        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((email.getText().toString().equals("yoga") &&(pass.getText().toString().equals("yoga")))){
                    Intent in= new Intent( MainActivity.this,Home.class );
                    startActivity( in );
                    finish();


                    Toast.makeText( MainActivity.this, "login successfull", Toast.LENGTH_SHORT ).show();

                }
                else {
                    Toast.makeText( MainActivity.this, "wrong credentials", Toast.LENGTH_SHORT ).show();
                }
            }
        } );
        signup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent( MainActivity.this,signup.class );
                startActivity( in );
                finish();
            }
        } );

    }

    @Override
    public void onBackPressed() {

        this.finish();
    }
}
