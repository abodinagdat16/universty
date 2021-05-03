package com.androidprime.universty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login_ );



    }

    public void login(View view) {
        Intent intent2 = new Intent(this,Select_Test.class);
        startActivity( intent2 );
    }
}