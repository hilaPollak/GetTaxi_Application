package com.example.hila.myfirstapplication.model.backend;
import com.example.hila.myfirstapplication.model.entities.Drive;
import com.example.hila.myfirstapplication.model.entities.Driver;

/***
 * This interface represent the function of data manager
 */
public interface IDataBase {
    //region Inner InterFaces
    public interface Action{
        void onSuccess();//what to do when the action success
        void onFailure(Exception exception);//what to do if its fail
        void onProgress(String status, double percent);//what to do when thus in progress
    }

    public interface NotifyDataChange<T> {
        void OnDataChanged(T obj);
        void onFailure(Exception exception);
    }
    //endregion
    //region Methods
    void addDrive(Drive driveToAdd, Action action);//add drive to database
  //  void addDriver(Driver driverToAdd, Action action);//add driver to database
   // void isValidDriverAuthentication(String emailForCheck, String passwordForCheck, Action action);//check if the driver valid in data base
    //endregion
}
