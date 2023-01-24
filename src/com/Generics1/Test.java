package com.Generics1;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        //до 5 джавы

        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        Animal ourAnimal = new Animal();
        animals.add(ourAnimal);
        String animal =(String) animals.get(2);
        System.out.println(animal);

        //после 5 джавы появились дженерики

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat2");
        animals2.add("dog2");
        animals2.add("frog2");
        String animal2 = animals2.get(2);
        System.out.println(animal2);

        //после 7 джавы

        List<String> animal3 = new ArrayList<>();



    }
}

class Animal{

}
