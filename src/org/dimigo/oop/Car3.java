package org.dimigo.oop;

/**
 * Created by seungsunoh on 2017. 3. 28..
 */
public class Car3 {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public Car3(String Company, String Model, String Color, int MaxSpeed, int Price){
        this.company=Company;
        this.model=Model;
        this.color=Color;
        this.maxSpeed=MaxSpeed;
        this.price=Price;
    }
    public Car3(String Company, String Model, String Color, int MaxSpeed){
        this(Company,Model,Color,MaxSpeed,0);
    }

    public Car3(String Company, String Model, String Color){
        this(Company,Model,Color,0,0);
    }

    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public int getPrice(){
        return price;
    }
}