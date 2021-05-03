package com.androidprime.universty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Select_Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_select__test );
    }

    public void btn_1(View view) {
        Intent intent = new Intent(this,quiz_test_Activity.class);
        startActivity( intent );
    }
}