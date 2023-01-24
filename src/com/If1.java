package com;

public class If1 {
    public static void main(String[] args){
        int a = 10;
        if (a > 11){
            System.out.println("false1");
        }
            else if(a > 12) {
                System.out.println("false2");
        } else {
                System.out.println("a = " + a);
        }
    }
}
