package com.example.hila.myfirstapplication.controller;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import android.app.AlertDialog;


import com.example.hila.myfirstapplication.R;
import com.example.hila.myfirstapplication.model.entities.GetTaxiContract;

/**
 * this class rpresent the activity of add drives.
 */
public class AddDriveActivity extends Activity  implements  AdapterView.OnItemSelectedListener {

    String[] country = {"AVAILABLE", "TREATMENT", "ENDING"};//status of drive that will show in spinner

    /**
     * this func make the view of the object in the activity when he called
     * @param savedInstanceState represent the jump of activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_drive);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);//find the object by id
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the status list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }

    /**
     * this func performing action onItemSelected and onNothing selected
     */
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_LONG).show();// when you make the choise toast will jump
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * this func jump a message of successfull when the invite well done
     * @param view the event that start the active
     */
    public void showAlertDialogButtonClicked(View view) {

        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("successful");
        builder.setMessage("Your order has been successfully.");

        // add a button
        builder.setPositiveButton("OK", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    //the objects of the screen
    private EditText name;
    private EditText email;
    private EditText phone;
    private Spinner statusSpinner;
    private TimePicker startTimePicker;
    private TimePicker endTimePicker;
    private EditText startAddress;
    private EditText endAddress;
    private Button buttonInvite;

    /**
     * this func connect the objects by their id
     */
    private void findViews() {
        name = (EditText)findViewById( R.id.editText );
        email = (EditText)findViewById( R.id.editText2 );
        phone = (EditText)findViewById( R.id.editText8 );
        statusSpinner = (Spinner)findViewById( R.id.spinner );
        startTimePicker = (TimePicker)findViewById( R.id.startTimePicker );
        endTimePicker = (TimePicker)findViewById( R.id.endTimePicker );
        startAddress = (EditText)findViewById( R.id.editText4 );
        endAddress = (EditText)findViewById( R.id.editText5 );
        buttonInvite = (Button)findViewById( R.id.button2 );


    }


    }


