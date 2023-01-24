package com.Polymorphism;

public class Lesson29 {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        animal1.eat();
        dog1.eat();
        dog1.bark();

        Animal animal2 = new Dog();
        animal2.eat();
        System.out.println("-------------");
        Cat cat = new Cat();
        test(animal1);
        test(animal2);
        test(dog1);
        test(cat);



    }
    public static void test(Animal animal){
        animal.eat();
    }
}
