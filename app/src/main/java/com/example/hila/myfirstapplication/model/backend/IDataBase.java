package com.example.hila.myfirstapplication.model.backend;
import com.example.hila.myfirstapplication.model.entities.Drive;
import com.example.hila.myfirstapplication.model.entities.Driver;

public interface IDataBase {
    //region Inner InterFaces
    public interface Action{
        void onSuccess();
        void onFailure(Exception exception);
        void onProgress(String status, double percent);
    }

    public interface NotifyDataChange<T> {
        void OnDataChanged(T obj);
        void onFailure(Exception exception);
    }
    //endregion
    //region Methods
    void addDrive(Drive driveToAdd, Action action);
    void addDriver(Driver driverToAdd, Action action);
    void isValidDriverAuthentication(String emailForCheck, String passwordForCheck, Action action);
    //endregion
}
