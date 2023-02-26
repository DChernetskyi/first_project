package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Send_Parametr {
    public static void main (String[] args){
        List<String> fruits = new ArrayList<>(Arrays.asList("1","2","3"));
        System.out.println(Arrays.toString(fruits.toArray()));
        processData(fruits);
        System.out.println(Arrays.toString(fruits.toArray()));

    }
    private static void processData(List<String> x){
        x.add("4");
    }
}
