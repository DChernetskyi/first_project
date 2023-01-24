package com;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        int c = a+b;
        System.out.println("result = " + c);

    }
}
