package org.dimigo.oop;

/**
 * Created by seungsunoh on 2017. 4. 18..
 */
public class PiggyBank {
    private static int balance;

    public static void putMoney(FamilyMember member, int amount){
        System.out.println(member.getMemberName() + " : " + amount + "원 넣음");
        balance+=amount;
    }

    public static void printBalance(){
        System.out.println("돼지저금통 총 금액 : " + balance + "원");
    }
}