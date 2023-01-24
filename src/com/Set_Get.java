package com;

public class Set_Get {
    public static void main(String[] args){

        Person1 personGet = new Person1();
        personGet.setAge(-2);
        personGet.setName("");
        personGet.info();

        System.out.println("Getter "+personGet.getName());


    }
}


class Person1{
    private String name;
    private int age;

    public void setName(String a){
        if (a.isEmpty()){
            System.out.println("Name is empty");
            name="0000";
        }else
        name = a;
    }
    public String getName(){
        return name;
    }

    public void setAge(int b){
        if (b<0){
            System.out.println("Enter correct age");
        }else
        age = b;
    }
    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println("My name is "+ name+" I am " +age);
    }

}