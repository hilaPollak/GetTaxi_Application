package com.example.hila.myfirstapplication.model.entities;

import android.content.ContentValues;

/**
 this class represent the driver's characteristics
 */
public class Driver {
    private String FirstName;//first name of driver
    private String LastName;//last name of driver
    private long _Id;//id of driver
    private long PhoneNumber;// phone number of driver
    private String Email;// email of driver
    private long CreditCard;// credit card for commission

    /**
     this func build defult constructor
     */
    public Driver(){}

    /**
     this func build constructor
     */
    public Driver(String firstName, String lastName, long id, long phoneNumber, String email, long creditCard) {
        FirstName = firstName;
        LastName = lastName;
        _Id = id;
        PhoneNumber = phoneNumber;
        Email = email;
        CreditCard = creditCard;
    }

    /**
     this func return the first name of driver
     * @return   the driver's first name
     */
    public String getFirstName() {
        return FirstName;
    }
    /**
     this func input the driver's first name
     @param  firstName  the first name of driver
     @return   null
     */
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    /**
     this func return the last name of driver
     * @return   the driver's last name
     */
    public String getLastName() {
        return LastName;
    }
    /**
     this func input the driver's last name
     @param  lastName  the last name of driver
     @return   null
     */
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    /**
     this func return the id of driver
     * @return   the driver's id
     */
    public long get_Id() {
        return _Id;
    }
    /**
     this func input the driver's id
     @param  id  the id driver
     @return   null
     */
    public void set_Id(long id) {
        _Id = id;
    }
    /**
     this func return the phone number of driver
     * @return   the driver's phone number
     */
    public long getPhoneNumber() {
        return PhoneNumber;
    }
    /**
     this func input the driver's phone number
     @param  phoneNumber  the phone number of driver
     @return   null
     */
    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    /**
     this func return the email of driver
     * @return   the driver's email
     */
    public String getEmail() {
        return Email;
    }
    /**
     this func input the driver's email
     @param  email  the email of driver
     @return   null
     */
    public void setEmail(String email) {
        Email = email;
    }
    /**
     this func return the credit card of driver
     * @return   the driver's credit card
     */
    public long getCreditCard() {
        return CreditCard;
    }
    /**
     this func input the credit card of driver
     @param  creditCard  the credit card of driver
     @return   null
     */
    public void setCreditCard(long creditCard) {
        CreditCard = creditCard;
    }

    public static ContentValues DriverToContentValues(Driver driver) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(GetTaxiConst.DriverConst.FIRST_NAME, driver.getFirstName());
        contentValues.put(GetTaxiConst.DriverConst.LAST_NAME, driver.getLastName());
        contentValues.put(GetTaxiConst.DriverConst._ID, driver.get_Id());
        contentValues.put(GetTaxiConst.DriverConst.PHONE_NUMBER, driver.getPhoneNumber());
        contentValues.put(GetTaxiConst.DriverConst.EMAIL, driver.getEmail());
        contentValues.put(GetTaxiConst.DriverConst.CREDIT_CARD, driver.getCreditCard());

        return contentValues;
    }

    public static Driver ContentValuesToDriver(ContentValues contentValues) {
        Driver driver = new Driver();
        driver.setFirstName(contentValues.getAsString(GetTaxiConst.DriverConst.FIRST_NAME));
        driver.setLastName(contentValues.getAsString(GetTaxiConst.DriverConst.LAST_NAME));
        driver.set_Id(contentValues.getAsLong(GetTaxiConst.DriverConst._ID));
        driver.setPhoneNumber(contentValues.getAsLong(GetTaxiConst.DriverConst.PHONE_NUMBER));
        driver.setEmail(contentValues.getAsString(GetTaxiConst.DriverConst.EMAIL));
        driver.setCreditCard(contentValues.getAsLong(GetTaxiConst.DriverConst.CREDIT_CARD));

        return driver;
    }
    }
