package org.dimigo.inheritance;

/**
 * Created by seungsunoh on 2017. 5. 8..
 */
public class PersonTest2 {
    public static void main(String[] args){
        Person[] persons={
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };
        for(int i=0;i<persons.length;i++){
            greeting(persons[i]);
        }
    }
    private static void greeting(Person p){
        System.out.println(p.toString());
        p.sayHello();
        p.sayBye();
        System.out.println("");
    }
}