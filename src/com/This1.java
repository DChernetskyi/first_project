package com;

public class This1 {
    public static void main(String[] args){
        Human i_am = new Human();
        i_am.setAge(32);
        i_am.setName("Dima");
        i_am.getInfo();
    }
}

class Human{
    String name;
    int age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+", "+age);
    }
}