package org.dimigo.interfaces;

/**
 * Created by seungsunoh on 2017. 5. 24..
 */
public interface IDBManager {
    String ORACLE_DATABASE="ORACLE";
    String SYBASE_DATABASE="SYBASE";

    void insert();
    void search();
    void update();
    void delete();

    static IDBManager getDBObject(String database){
        if(ORACLE_DATABASE.equals(database)){
            return new OracleDB();
        }
        else if(SYBASE_DATABASE.equals(database)){
            return new SybaseDB();
        }
        else return null;
    }
}