package com;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args){
        Scanner sss = new Scanner(System.in);
        int value;
        do{
            System.out.println("Enter 5!");
            value = sss.nextInt();
        }while (value != 5);
        System.out.println("You entered 5");
    }
}
