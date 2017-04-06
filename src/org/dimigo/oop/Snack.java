package org.dimigo.oop;

/**
 * Created by seungsunoh on 2017. 4. 6..
 */
public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public String getName(){return name;}
    public String getCompany(){return company;}
    public int getPrice(){return price;}
    public int getNumber(){return number;}

    public void setName(String newName){name=newName;}
    public void setCompany(String newCompany){company=newCompany;}
    public void setPrice(int newPrice){price=newPrice;}
    public void setNumber(int newNumber){number=newNumber;}

    public Snack(String Name,String Company,int Price,int Number){
        this.name=Name;
        this.company=Company;
        this.price=Price;
        this.number=Number;
    }

    public int calcPrice(){
        return price*number;
    }

    public String toString(){
            return "\n이름 : " + name + "\n제조사 : " + company + "\n가격 : " + price + "원" + "\n개수 : " + number + "개";
    }
}