package com.example.hila.myfirstapplication.model.entities;
import java.io.Serializable;

/**
 This enum represent the status of ride
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

    /***
     * This function does casting from string to enum
     * @param s The string of status
     * @return
     */
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
