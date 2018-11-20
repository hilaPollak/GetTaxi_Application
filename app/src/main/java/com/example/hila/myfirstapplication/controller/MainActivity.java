package com.example.hila.myfirstapplication.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hila.myfirstapplication.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToActivity2 (View view){
        Intent intent = new Intent(this, AddDriveActivity.class);
        startActivity(intent);
    }
}


