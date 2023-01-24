package com;

public class Static1 {
    public static void main(String[] args){
        People123 people5 = new People123("Bob",50);
        People123 people6 = new People123("Tom",60);
        People123.description = "Hello";
        People123.getDescription();

        System.out.println(Math.max(12,50));
    }
}

class People123{
    private String name;
    private int age;

    public static String description;
    public static int x;
    private static int counter;

    public People123(String name, int age){
        this.name = name;
        this.age = age;
        counter++;

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public static void getDescription(){
        System.out.println(description+" counter = "+counter);
    }
}