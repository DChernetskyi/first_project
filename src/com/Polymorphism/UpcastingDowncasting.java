package com.Polymorphism;

public class UpcastingDowncasting {
    public static void main(String[] args){
        Dog dog777 = new Dog();
        Animal animal5 = new Animal();
        Animal animal55 = new Dog(); //Upcast
        Animal animal777 = dog777; //Upcast

        //Dog dog55 = (Dog) animal5; //Downcast

    }
}
