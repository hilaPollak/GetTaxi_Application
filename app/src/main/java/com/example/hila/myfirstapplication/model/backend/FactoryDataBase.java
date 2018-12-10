package com.example.hila.myfirstapplication.model.backend;

import com.example.hila.myfirstapplication.model.datasource.Firebase_DBManager;

public class FactoryDataBase {
    static IDataBase idb = null;
    public static IDataBase getDataBase()
    {
        if(idb==null)
            idb = new Firebase_DBManager();
        return  idb;
    }
}
