package com.example.hila.myfirstapplication.controller;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.example.hila.myfirstapplication.R;

/**
 * this class represent the login first activity
 */
public class MainActivity extends Activity {

    /**
     * this func make the view of the object in the activity when he called
     * @param savedInstanceState represent the jump of activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Write a message to the database- check
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();//find the object of activity by their id

        VideoView v=(VideoView)findViewById(R.id.videoView2);
       // String path= "android.resource://com.example.hila.myfirstapplication.controller/"+R.raw.mainvideo;
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.mainvideo);
        v.setVideoURI(uri);
        v.start();


    }

    /**
     * this func open new activity of new drive invite
     * @param view object that get the call
     */
    public void goToActivity2 (View view){
        Intent intent = new Intent(this, AddDriveActivity.class);//when the user click the button login the intent call to new activity
        startActivity(intent);//start the activity
    }

    //the objects of the screen

    Button buttonLogin;

    /**
     * this func connect the objects by their id
     */
    private void findViews() {

        buttonLogin = (Button)findViewById( R.id.button );

    }


}


