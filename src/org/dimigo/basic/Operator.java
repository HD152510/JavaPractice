package org.dimigo.basic;

/**
 * Created by seungsunoh on 2017. 3. 15..
 */
public class Operator {
    public static void main(String[] args){
        int avgpay = 1700000;
        int empnum = 3;
        int store = 1500;
        long yearpay = (long)avgpay*12*empnum*store;
        System.out.println("<< 디미베네 연간 인건비 >>");
        System.out.println("월 평균 급여 : " + String.format("%,d",avgpay) + "원");
        System.out.println("점포 내 직원 수 : " + empnum + "명");
        System.out.println("점포 수 : " + String.format("%,d",store) + "개");
        System.out.print("연간 인건비 : " + String.format("%,d", yearpay) + "원");
    }
}