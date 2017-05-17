package org.dimigo.abstractclass;


/**
 * Created by seungsunoh on 2017. 5. 12..
 */
public class SmartPhoneTest {
    public static void main(String[] args){
        SmartPhone sms[]={
                new IPhone("iPhone 7", "애플", 900000),
                new Galaxy("갤럭시 S8", "삼성", 800000)
        };
        for(SmartPhone s : sms){
            System.out.println(s.toString());
            s.turnOn();
            s.pay();
            s.useSpecialFunction();
            s.turnOff();
        }
    }
}