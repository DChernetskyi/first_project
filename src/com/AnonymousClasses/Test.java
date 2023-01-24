package com.AnonymousClasses;


class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

interface Animal5{
    public void eat5();
}


public class Test {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal(){
            public void eat(){
                System.out.println("Eating...");
            }
        };
        animal1.eat();

        Animal5 animal5 = new Animal5() {
            @Override
            public void eat5() {
                System.out.println("Eat55555");
            }
        };
        animal5.eat5();

    }
}


