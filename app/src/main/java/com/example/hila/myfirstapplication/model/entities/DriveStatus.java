package com.example.hila.myfirstapplication.model.entities;
import java.io.Serializable;

/**
 this enum represent the status of ride
 */
public enum DriveStatus implements Serializable {
    AVAILABLE, TREATMENT, ENDING;
    public String toString(){
        switch(this){
            case AVAILABLE :
                return "AVAILABLE";
            case TREATMENT :
                return "TREATMENT";
            case ENDING :
                return "ENDING";
        }
        return null;
    }

    public DriveStatus toEnum(String s) {
        if (s.equalsIgnoreCase(AVAILABLE.toString()))
            return DriveStatus.AVAILABLE;
        else if (s.equalsIgnoreCase(TREATMENT.toString()))
            return DriveStatus.TREATMENT;
        else if (s.equalsIgnoreCase(ENDING.toString()))
            return DriveStatus.ENDING;
        else
            return null;
    }

}
