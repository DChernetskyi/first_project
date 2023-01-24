package com.Interfaces;

public class Lesson26 {
    public static void main(String[] args){
        Animal animal1 = new Animal(123);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();

        Info info1 = new Animal(555);
        info1.showInfo();
        Info info2 = new Person("Rob");
        info2.showInfo();
        outputInfo(animal1);

    }
    public static void outputInfo(Info a){
        a.showInfo();
    }
}
