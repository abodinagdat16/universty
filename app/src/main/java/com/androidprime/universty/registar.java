package com.androidprime.universty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_registar );






    }

    public void registar(View view) {
        Intent in = new Intent(this,Login_Activity.class);
        startActivity( in );
    }
}