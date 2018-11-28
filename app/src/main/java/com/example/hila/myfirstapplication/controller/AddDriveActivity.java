package com.example.hila.myfirstapplication.controller;

import android.app.Activity;
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
import android.content.DialogInterface;



import com.example.hila.myfirstapplication.R;

public class AddDriveActivity extends Activity  implements  AdapterView.OnItemSelectedListener {
    String[] country = {"AVAILABLE", "TREATMENT", "ENDING"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drive);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

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

    private EditText editText;
    private EditText editText2;
    private EditText editText8;
    private Spinner spinner;
    private TimePicker startTimePicker;
    private TimePicker endTimePicker;
    private EditText editText4;
    private EditText editText5;
    private Button button2;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2018-11-28 19:28:36 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        editText = (EditText)findViewById( R.id.editText );
        editText2 = (EditText)findViewById( R.id.editText2 );
        editText8 = (EditText)findViewById( R.id.editText8 );
        spinner = (Spinner)findViewById( R.id.spinner );
        startTimePicker = (TimePicker)findViewById( R.id.startTimePicker );
        endTimePicker = (TimePicker)findViewById( R.id.endTimePicker );
        editText4 = (EditText)findViewById( R.id.editText4 );
        editText5 = (EditText)findViewById( R.id.editText5 );
        button2 = (Button)findViewById( R.id.button2 );


    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2018-11-28 19:28:36 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */

    }


