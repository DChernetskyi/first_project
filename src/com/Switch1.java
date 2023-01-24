package com;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int age = s.nextInt();
        switch (age){
            case 0:
                System.out.println("You born");
                break;
            case 32:
                System.out.println("now");
                break;
            case 50:
                System.out.println("50 years");
                break;
            default:
                System.out.println("no age");
        }
    }
}
