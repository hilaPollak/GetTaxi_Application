package com.example.hila.myfirstapplication.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    private EditText editText2;
    private EditText editText3;
    private TextView linkSignup;
    private Button button;


    private void findViews() {
        editText2 = (EditText)findViewById( R.id.editText2 );
        editText3 = (EditText)findViewById( R.id.editText3 );
        linkSignup = (TextView)findViewById( R.id.link_signup );
        button = (Button)findViewById( R.id.button );

    }


}


