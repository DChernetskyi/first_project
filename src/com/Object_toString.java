package com;

public class Object_toString {
    public static void main(String[] args){
        Audi avto1 = new Audi("A4", 50000);
        avto1.toString();
        System.out.println(avto1.toString());
    }
}

class Audi{
    private String model;
    private int price;

    public Audi(String model, int price){
        this.model = model;
        this.price = price;
    }

    public String toString(){
        return model+", "+price;
    }
}