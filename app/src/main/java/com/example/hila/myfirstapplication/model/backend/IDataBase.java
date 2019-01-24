package com.example.hila.myfirstapplication.model.backend;

import com.example.hila.myfirstapplication.model.entities.Drive;
import com.example.hila.myfirstapplication.model.entities.Driver;

/***
 * This interface represent the function of data manager
 */
public interface IDataBase {
    /***
     * this interface implement how to act success or fail or in progress
     */
    public interface Action {
        void onSuccess();//what to do when the action success

        void onFailure(Exception exception);//what to do if its fail

        void onProgress(String status, double percent);//what to do when thus in progress
    }

    /***
     * this interface implement how to act if data changed
     * @param <T> the class that notify about the change
     */
    public interface NotifyDataChange<T> {
        void OnDataChanged(T obj);

        void onFailure(Exception exception);
    }

    /***
     * this function get drive and add to firebase store
     * @param driveToAdd the drive we want to add
     * @param action the action of method
     */
    void addDrive(Drive driveToAdd, Action action);//add drive to database
}
