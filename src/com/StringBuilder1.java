package com;

public class StringBuilder1 {
    public static void main(String[] args){
        String x = "hello";
        x.toUpperCase();
        System.out.println(x);

        x = x.toUpperCase();
        System.out.println(x);

        StringBuilder a = new StringBuilder("Hello");
        System.out.println(a.toString());
        a.append(" my").append(" friend").append("!");
        System.out.println(a.toString());
    }
}
