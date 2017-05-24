package org.dimigo.interfaces;

/**
 * Created by seungsunoh on 2017. 5. 24..
 */
public class DBTest {
    public static void main(String[] args){
        System.out.println("<< 변경 전 >>");
        IDBManager i=IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
        crud(i);
        System.out.println("<< 변경 후 >>");
        IDBManager o=IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
        crud(o);
    }
    private static void crud(IDBManager db){
        db.insert();
        db.search();
        db.update();
        db.delete();
    }
}