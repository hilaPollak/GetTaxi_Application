package com.example.hila.myfirstapplication.model.datasource;

import com.example.hila.myfirstapplication.model.backend.IDataBase;
import com.example.hila.myfirstapplication.model.entities.Drive;
import com.example.hila.myfirstapplication.model.entities.Driver;

import java.util.ArrayList;
import java.util.List;

/***
 * This class implement the interface to manager the database by list
 */
public class List_IDataBase implements IDataBase {
    static List<Drive> drives= new ArrayList<>();//list of drive


    @Override
    public void addDrive(Drive driveToAdd, Action action) {

    }

    //@Override
    //public void addDriver(Driver driverToAdd, Action action) {

    //}

   // @Override
   // public void isValidDriverAuthentication(String emailForCheck, String passwordForCheck, Action action) {

   // }
}
