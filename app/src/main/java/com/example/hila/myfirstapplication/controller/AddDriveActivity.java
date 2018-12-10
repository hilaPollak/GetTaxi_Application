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


import com.example.hila.myfirstapplication.R;
import com.example.hila.myfirstapplication.model.backend.FactoryDataBase;
import com.example.hila.myfirstapplication.model.backend.IDataBase;
import com.example.hila.myfirstapplication.model.entities.Drive;
import com.example.hila.myfirstapplication.model.entities.DriveStatus;

import java.util.Calendar;
import java.util.Date;

/**
 * this class rpresent the activity of add drives.
 */
public class AddDriveActivity extends Activity  implements  AdapterView.OnItemSelectedListener {

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
    String[] country = {"AVAILABLE", "TREATMENT", "ENDING"};//status of drive that will show in spinner


    /**
     * this func connect the objects by their id
     */
    private void findViews() {
        name = (EditText) findViewById(R.id.editText);
        email = (EditText) findViewById(R.id.editText2);
        phone = (EditText) findViewById(R.id.editText8);
        statusSpinner = (Spinner) findViewById(R.id.spinner);
        startTimePicker = (TimePicker) findViewById(R.id.startTimePicker);
        startAddress = (EditText) findViewById(R.id.editText4);
        endAddress = (EditText) findViewById(R.id.editText5);
        buttonInvite = (Button) findViewById(R.id.button2);


    }


    /**
     * this func make the view of the object in the activity when he called
     *
     * @param savedInstanceState represent the jump of activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drive);
        findViews();
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        statusSpinner.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the status list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        statusSpinner.setAdapter(aa);

        TimePicker startTimePicker = (TimePicker)findViewById(R.id.startTimePicker); // initiate a time picker
        startTimePicker.setIs24HourView(true); // set 24 hours mode for the time picker

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


    public String toString(DriveStatus s){
        switch(s){
            case AVAILABLE :
                return "AVAILABLE";
            case TREATMENT :
                return "TREATMENT";
            case ENDING :
                return "ENDING";
        }
        return null;
    }

    public DriveStatus toEnum(String s) {
        if (s== "AVAILABLE")
            return DriveStatus.AVAILABLE;
        else if (s== "TREATMENT")
            return DriveStatus.TREATMENT;
        else if (s== "ENDING")
            return DriveStatus.ENDING;
        else
            return null;
    }



    /**
     * this func jump a message of successfull when the invite well done
     *
     * @param view the event that start the active
     */

    public void inviteButtonClicked(View view) {
        Drive drive=getDrive();
        addDrive(drive);
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


    private Drive getDrive() {
        final Drive d = new Drive();
        try {
            String status = statusSpinner.getSelectedItem().toString();
            DriveStatus driveStatus;
            driveStatus = toEnum(status);
            d.setStatusOfRide(driveStatus);

            String NameText = name.getText().toString();
            d.setName(NameText);

            String phoneText = phone.getText().toString();
            d.setPhoneNumber(Long.parseLong(phoneText));

            String emailText = email.getText().toString();
            d.setEmail(emailText);

            String startAddress1 = startAddress.getText().toString();
            d.setStartAddress(startAddress1);

            String endAddress1 = endAddress.getText().toString();
            d.setEndAddress(endAddress1);

            int hours = startTimePicker.getCurrentHour();
            int minutes = startTimePicker.getCurrentMinute();


            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, hours);
            cal.set(Calendar.MINUTE, minutes);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);

            Date c = cal.getTime();
            d.setStartTime(c);
            d.setEndTime(c);



        } catch (Exception e) {
        }
        return d;
    }
    protected void addDrive(Drive drive)
    {
        try {
            buttonInvite.setEnabled(false);
            IDataBase dataBase = FactoryDataBase.getDataBase();
            dataBase.addDrive(drive, new IDataBase.Action() {
                @Override
                public void onSuccess() {
                    Toast.makeText(getBaseContext(), "הנסיעה הוספה בהצלחה", Toast.LENGTH_LONG).show();
                    buttonInvite.setEnabled(true);
                }

                @Override
                public void onFailure(Exception exception) {
                    Toast.makeText(getBaseContext(), "הוספת הנסיעה נכשלה", Toast.LENGTH_LONG).show();
                    buttonInvite.setEnabled(true);
                }

                @Override
                public void onProgress(String status, double percent) {
                    if( percent != 100)
                        buttonInvite.setEnabled(false);
                }
            });
        } catch (Exception e){
            Toast.makeText(getBaseContext(), "Error \n", Toast.LENGTH_LONG).show();
            buttonInvite.setEnabled(true);
        }


    }
}





