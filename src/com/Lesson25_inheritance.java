package com;

public class Lesson25_inheritance {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.name = "Bobik";
        dog.showName();
    }
}
