package com.example.hila.myfirstapplication.model.datasource;

import android.support.annotation.NonNull;

import com.example.hila.myfirstapplication.model.backend.IDataBase;
import com.example.hila.myfirstapplication.model.entities.Drive;
import com.example.hila.myfirstapplication.model.entities.Driver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/***
 * This class implement the data manager by firebase
 */
public class Firebase_DBManager implements IDataBase {
    //region Fields
    static DatabaseReference drivesRef;//.ref of drives
    static DatabaseReference driverRef;//ref of drivers
    static List<Drive> driveList;//list of drives

    static {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        drivesRef = database.getReference("Drives");//root to drives on firebase
        driverRef = database.getReference("Drivers");//root to drivers on firebase
        driveList = new ArrayList<>();
    }

    /***
     * this class add drive to database
     * @param driveToAdd the drive we need to add
     * @param action the action of method
     */
    @Override
    public void addDrive(Drive driveToAdd, final Action action) {
        Task<Void> task = drivesRef.push().setValue(driveToAdd);//push- had spacial key

        task.addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {//add to database success
                action.onSuccess();
            }
        });

        task.addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {//add to database fail
                action.onFailure(e);
            }
        });
    }
}
