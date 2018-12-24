package com.example.hila.myfirstapplication.model.entities;
import java.io.Serializable;

/**
 this enum represent the status of ride
 */
public enum DriveStatus implements Serializable {
    AVAILABLE, PROCESSING, FINISH;
    public String toString(){
        switch(this){
            case AVAILABLE :
                return "AVAILABLE";
            case PROCESSING :
                return "PROCESSING";
            case FINISH :
                return "FINISH";
        }
        return null;
    }

    public DriveStatus toEnum(String s) {
        if (s.equalsIgnoreCase(AVAILABLE.toString()))
            return DriveStatus.AVAILABLE;
        else if (s.equalsIgnoreCase(PROCESSING.toString()))
            return DriveStatus.PROCESSING;
        else if (s.equalsIgnoreCase(FINISH.toString()))
            return DriveStatus.FINISH;
        else
            return null;
    }

}
