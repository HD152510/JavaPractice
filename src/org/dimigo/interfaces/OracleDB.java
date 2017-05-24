package org.dimigo.interfaces;

/**
 * Created by seungsunoh on 2017. 5. 24..
 */
public class OracleDB implements IDBManager{
    @Override
    public void insert(){
        System.out.println("SYBASE DB 저장");
    }
    @Override
    public void search(){
        System.out.println("SYBASE DB 조회");
    }
    @Override
    public void update(){
        System.out.println("SYBASE DB 변경");
    }
    @Override
    public void delete(){
        System.out.println("SYBASE DB 삭제");
    }
}