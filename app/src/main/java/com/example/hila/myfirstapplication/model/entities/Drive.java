package com.example.hila.myfirstapplication.model.entities;

import android.content.ContentValues;

import java.time.Clock;
import java.util.Date;

/**
 * this class represent the drive's characteristics
 */
public class Drive {
    private DriveStatus StatusOfRide;//available/ treatment/ ending
    private String StartAddress;//the address to pick up client
    private String EndAddress;//Destination address
    private String StartTime;//start of driving
    private String Name;//client's name
    private String PhoneNumber;//client's phone number
    private String Email;//client's email
    private String DriverName;//driver name


    /**
     * this func build defult constructor

     * @param driveStatus
     * @param startAddress1
     * @param endAddress1
     * @param nameText
     * @param phoneText
     * @param emailText
     */
    public Drive(DriveStatus driveStatus, String startAddress1, String endAddress1, String startTime, String nameText, String phoneText, String emailText, String driverName) {
    }

    /**
     * this func build constructor
     */
    public Drive(DriveStatus statusOfRide, String startAddress, String endAddress, String startTime, String name, String phoneNumber, String email) {
        StatusOfRide = statusOfRide;
        StartAddress = startAddress;
        EndAddress = endAddress;
        StartTime = startTime;
        Name = name;
        PhoneNumber = phoneNumber;
        Email = email;
        DriverName = " a";

    }

    public Drive() {
    }

    /**
     * this func return the status of drive
     *
     * @return the status of drive
     */
    public DriveStatus getStatusOfRide() {
        return StatusOfRide;
    }

    /**
     * this func input the ride's status
     *
     * @param statusOfRide the status of the drive
     * @return null
     */
    public void setStatusOfRide(DriveStatus statusOfRide) {
        StatusOfRide = statusOfRide;
    }

    /**
     * this func return the address of the start
     *
     * @return the start address
     */
    public String getStartAddress() {
        return StartAddress;
    }

    /**
     * this func input the ride's start address
     *
     * @param startAddress the start address of the ride
     * @return null
     */
    public void setStartAddress(String startAddress) {
        StartAddress = startAddress;
    }

    /**
     * this func return the destination address
     *
     * @return the destination address
     */
    public String getEndAddress() {
        return EndAddress;
    }

    /**
     * this func input the ride's end adress
     *
     * @param endAddress the end address of the ride
     * @return null
     */
    public void setEndAddress(String endAddress) {
        EndAddress = endAddress;
    }

    /**
     * this func return start time of driving
     *
     * @return the start time of driving
     */
    public String getStartTime() {
        return StartTime;
    }


    /**
     * this func input the ride's start time
     *
     * @param startTime the start time of the ride
     * @return null
     */
    public void setStartTime(String startTime) {
        StartTime = startTime;
    }


    /**
     * this func return the name of client
     *
     * @return the client's name
     */
    public String getName() {
        return Name;
    }

    /**
     * this func input the client's name
     *
     * @param name the name of client
     * @return null
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * this func return the phone num of client
     *
     * @return the client's phone number
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * this func input the client's phone number
     *
     * @param phoneNumber the phone number of client
     * @return null
     */
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    /**
     * this func return the email of client
     *
     * @return the client's email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * this func input the client's email
     *
     * @param email the email of client
     * @return null
     */
    public void setEmail(String email) {
        Email = email;
    }


    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String d) {
        DriverName = d;
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\n" + "Phone Number: " + PhoneNumber + "\n" + "Start Address: " + StartAddress + "\n"
                + "End Address: " + EndAddress + "\n" + "Email: " + Email + "\n" + "Status of drive: " + StatusOfRide.toString() + "\n";

    }


    ////////////////////the id of request in firebase store//////////////////////////
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;


    /**
     * this func get drive value object and change it to content value object
     * @param drive the object by type drive
     * @return object by type content value
     */
    public static ContentValues DriveToContentValues(Drive drive) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(GetTaxiContract.DriveConst.STATUS_OF_DRIVE, drive.getStatusOfRide().toString());
        contentValues.put(GetTaxiContract.DriveConst.START_ADDRESS, drive.getStartAddress());
        contentValues.put(GetTaxiContract.DriveConst.END_ADDRESS, drive.getEndAddress());
       // contentValues.put(GetTaxiContract.DriveConst.START_TIME, drive.getStartTime().toString());
       // contentValues.put(GetTaxiContract.DriveConst.END_TIME, drive.getEndTime().toString());
        contentValues.put(GetTaxiContract.DriveConst.NAME, drive.getName());
        contentValues.put(GetTaxiContract.DriveConst.PHONE_NUMBER, drive.getPhoneNumber());
        contentValues.put(GetTaxiContract.DriveConst.EMAIL, drive.getEmail());


        return contentValues;}



    /*
    /**
     * this func get content value object and change it to drive value
     * @param contentValues the object by type content value
     * @return object by type drive

    public static Drive ContentValuesToDrive(ContentValues contentValues) {
        Drive drive = new Drive();
        drive.setStatusOfRide(contentValues.getAsString(GetTaxiContract.DriveConst.STATUS_OF_DRIVE));
        drive.setStartAddress(contentValues.getAsString(GetTaxiContract.DriveConst.START_ADDRESS));
        drive.setEndAddress(contentValues.getAsString(GetTaxiContract.DriveConst.END_ADDRESS));
        drive.setStartTime(contentValues.getAsLong(GetTaxiContract.DriveConst.START_TIME));
        drive.setEndTime(contentValues.getAsString(GetTaxiContract.DriveConst.END_TIME));
        drive.setName(contentValues.getAsString(GetTaxiContract.DriveConst.NAME));
        drive.setPhoneNumber(contentValues.getAsLong(GetTaxiContract.DriveConst.PHONE_NUMBER));
        drive.setEmail(contentValues.getAsString(GetTaxiContract.DriveConst.EMAIL));


        return drive;}*/





}
