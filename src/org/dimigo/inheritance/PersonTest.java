package org.dimigo.inheritance;

/**
 * Created by seungsunoh on 2017. 5. 8..
 */
public class PersonTest {
    public static void main(){
        Person p=new Person("Tom");
        Korean k=new Korean("홍길동");
        Japanese j=new Japanese("다나카");
        Chinese c=new Chinese("왕밍");

        /*p.setName();
        k.setName("홍길동");
        j.setName("다나카");
        c.setName("왕밍");*/

        System.out.println(p.toString());
        System.out.println(k.toString());
        System.out.println(j.toString());
        System.out.println(c.toString());

        p.sayHello();
        k.sayHello();
        j.sayHello();
        c.sayHello();

        p.sayBye();
        k.sayBye();
        j.sayBye();
        c.sayBye();
    }
}