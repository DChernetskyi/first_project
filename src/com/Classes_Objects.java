package com;

public class Classes_Objects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.age = 32;
        person1.name = "Dima";

        Person person2 = new Person();
        person2.age = 25;
        person2.name = "Yula";

        System.out.println("My name is " +person1.name+ ", I am " +person1.age);

        person2.speak();
        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();


        int x = person1.calculate2();
        System.out.println(x);

        Person person3 = new Person();
        person3.setName("Petro",455);
        person3.speak();

    }
}
class Person{
    String name;
    int age;
    void speak() {
        for (int i=0;i<3;i++) {
            System.out.println("My name is " + name + ", I am " + age);
        }
    }

    int calculate2(){
        int years = 100-age;
        return years;
    }

    void calculateYearsToRetirement(){
        int x = 65;
        System.out.println("To retirement "+(x-age)+" years");

    }
    void setName(String username, int age1){
        name = username;
        age = age1;
    }
}