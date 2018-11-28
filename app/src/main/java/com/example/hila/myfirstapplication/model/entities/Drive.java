package com.example.hila.myfirstapplication.model.entities;

import android.content.ContentValues;

import java.time.Clock;
/**
 this class represent the drive's characteristics
 */
public class Drive {
    private DriveStatus StatusOfRide;//available/ treatment/ ending
    private String StartAddress;//the address to pick up client
    private String EndAddress;//Destination address
    private Clock StartTime;//start of driving
    private Clock EndTime;//end of driving
    private String Name;//client's name
    private long PhoneNumber;//client's phone number
    private String Email;//client's email

    /**
     this func build defult constructor
     */
    public Drive(){}

    /**
     this func build constructor
     */
    public Drive(DriveStatus statusOfRide, String startAddress, String endAddress, Clock startTime, Clock endTime, String name, long phoneNumber, String email) {
        StatusOfRide = statusOfRide;
        StartAddress = startAddress;
        EndAddress = endAddress;
        StartTime = startTime;
        EndTime = endTime;
        Name = name;
        PhoneNumber = phoneNumber;
        Email = email;
    }

    /**
     this func return the status of drive
     * @return   the status of drive
     */
    public DriveStatus getStatusOfRide() {
        return StatusOfRide;
    }
    /**
     this func input the ride's status
     @param  statusOfRide  the status of the drive
     @return   null
     */
    public void setStatusOfRide(DriveStatus statusOfRide) {
        StatusOfRide = statusOfRide;
    }

    /**
     this func return the address of the start
     * @return   the start address
     */
    public String getStartAddress() {
        return StartAddress;
    }
    /**
     this func input the ride's start address
     @param  startAddress  the start address of the ride
     @return   null
     */
    public void setStartAddress(String startAddress) {
        StartAddress = startAddress;
    }

    /**
     this func return the destination address
     * @return   the destination address
     */
    public String getEndAddress() {
        return EndAddress;
    }
    /**
     this func input the ride's end adress
     @param  endAddress  the end address of the ride
     @return   null
     */
    public void setEndAddress(String endAddress) {
        EndAddress = endAddress;
    }

    /**
     this func return start time of driving
     * @return   the start time of driving
     */
    public Clock getStartTime() {
        return StartTime;
    }
    /**
     this func input the ride's start time
     @param  startTime  the start time of the ride
     @return   null
     */
    public void setStartTime(Clock startTime) {
        StartTime = startTime;
    }

    /**
     this func return end time of driving
     * @return   the end time of driving
     */
    public Clock getEndTime() {
        return EndTime;
    }
    /**
     this func input the ride's end time
     @param  endTime  the end time of the ride
     @return   null
     */
    public void setEndTime(Clock endTime) {
        EndTime = endTime;
    }
    /**
     this func return the name of client
     * @return   the client's name
     */
    public String getName() {
        return Name;
    }
    /**
     this func input the client's name
     @param  name  the name of client
     @return   null
     */
    public void setName(String name) {
        Name = name;
    }
    /**
     this func return the phone num of client
     * @return   the client's phone number
     */
    public long getPhoneNumber() {
        return PhoneNumber;
    }
    /**
     this func input the client's phone number
     @param  phoneNumber  the phone number of client
     @return   null
     */
    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    /**
     this func return the email of client
     * @return   the client's email
     */
    public String getEmail() {
        return Email;
    }
    /**
     this func input the client's email
     @param  email  the email of client
     @return   null
     */
    public void setEmail(String email) {
        Email = email;
    }

    public static ContentValues DriveToContentValues(Drive drive) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(GetTaxiConst.DriveConst.STATUS_OF_DRIVE, drive.getStatusOfRide().toString());
        contentValues.put(GetTaxiConst.DriveConst.START_ADDRESS, drive.getStartAddress());
        contentValues.put(GetTaxiConst.DriveConst.END_ADDRESS, drive.getEndAddress());
        contentValues.put(GetTaxiConst.DriveConst.START_TIME, drive.getStartTime().toString());
        contentValues.put(GetTaxiConst.DriveConst.END_TIME, drive.getEndTime().toString());
        contentValues.put(GetTaxiConst.DriveConst.NAME, drive.getName());
        contentValues.put(GetTaxiConst.DriveConst.PHONE_NUMBER, drive.getPhoneNumber());
        contentValues.put(GetTaxiConst.DriveConst.EMAIL, drive.getEmail());


        return contentValues;}



    public static Drive ContentValuesToDrive(ContentValues contentValues) {
        Drive drive = new Drive();
        drive.setStatusOfRide(contentValues.getAsString(GetTaxiConst.DriveConst.STATUS_OF_DRIVE));
        drive.setStartAddress(contentValues.getAsString(GetTaxiConst.DriveConst.START_ADDRESS));
        drive.setEndAddress(contentValues.getAsString(GetTaxiConst.DriveConst.END_ADDRESS));
        drive.setStartTime(contentValues.getAsLong(GetTaxiConst.DriveConst.START_TIME));
        drive.setEndTime(contentValues.getAsString(GetTaxiConst.DriveConst.END_TIME));
        drive.setName(contentValues.getAsString(GetTaxiConst.DriveConst.NAME));
        drive.setPhoneNumber(contentValues.getAsLong(GetTaxiConst.DriveConst.PHONE_NUMBER));
        drive.setEmail(contentValues.getAsString(GetTaxiConst.DriveConst.EMAIL));


        return drive;}




}
