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
    private String password;//password for driver


    /**
     this func build defult constructor
     */
    public Driver(){}

    /**
     this func build constructor
     */
    public Driver(String firstName, String lastName, long id, long phoneNumber, String email, long creditCard,String password1) {
        FirstName = firstName;
        LastName = lastName;
        _Id = id;
        PhoneNumber = phoneNumber;
        Email = email;
        CreditCard = creditCard;
        password=password1;
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


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * this func get driver  value object and change it to content value object
     * @param driver the object by type driver
     * @return object by type content value
     */
    public static ContentValues DriverToContentValues(Driver driver) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(GetTaxiContract.DriverConst.FIRST_NAME, driver.getFirstName());
        contentValues.put(GetTaxiContract.DriverConst.LAST_NAME, driver.getLastName());
        contentValues.put(GetTaxiContract.DriverConst._ID, driver.get_Id());
        contentValues.put(GetTaxiContract.DriverConst.PHONE_NUMBER, driver.getPhoneNumber());
        contentValues.put(GetTaxiContract.DriverConst.EMAIL, driver.getEmail());
        contentValues.put(GetTaxiContract.DriverConst.CREDIT_CARD, driver.getCreditCard());

        return contentValues;
    }

    /**
     * this func get content value object and change it to driver value
     * @param contentValues the object by type content value
     * @return object by type driver
     */
    public static Driver ContentValuesToDriver(ContentValues contentValues) {
        Driver driver = new Driver();
        driver.setFirstName(contentValues.getAsString(GetTaxiContract.DriverConst.FIRST_NAME));
        driver.setLastName(contentValues.getAsString(GetTaxiContract.DriverConst.LAST_NAME));
        driver.set_Id(contentValues.getAsLong(GetTaxiContract.DriverConst._ID));
        driver.setPhoneNumber(contentValues.getAsLong(GetTaxiContract.DriverConst.PHONE_NUMBER));
        driver.setEmail(contentValues.getAsString(GetTaxiContract.DriverConst.EMAIL));
        driver.setCreditCard(contentValues.getAsLong(GetTaxiContract.DriverConst.CREDIT_CARD));

        return driver;
    }
    }
