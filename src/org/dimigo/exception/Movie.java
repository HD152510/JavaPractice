package org.dimigo.exception;

/**
 * Created by seungsunoh on 2017. 5. 29..
 */
public class Movie {
    private String title;
    private int limitAge;

    public Movie(String title, int limitAge){
        this.title=title;
        this.limitAge=limitAge;
    }

    public String getTitle(){
        return title;
    }

    public int getLimitAge(){
        return limitAge;
    }

    public void buyTicket(int age)throws Exception{
        if(age<this.limitAge){
            throw new Exception(this.getTitle() + "은/는 " + this.getLimitAge() + "세 이상 관람가입니다.");
        }
        else{
            System.out.println(this.getTitle() + " 즐감하세요.");
        }
    }
}