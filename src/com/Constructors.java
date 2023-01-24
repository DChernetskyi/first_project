package com;

public class Constructors {
    public static void main(String[] args){
        People people1 = new People();
        People people2 = new People("Bob");
        People people3 = new People("Rob",35);
        people1.getInfo();
        people2.getInfo();
        people3.getInfo();

    }
}

class People{
    private String name;
    private int age;
    public People(){
        System.out.println("Default constructor");
    }
    public People(String name){
        this.name=name;
    }
    public People(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void getInfo(){
        System.out.println(name+", "+age);
    }

}