package com;

public class Matches1 {
    public static void main(String[] args){
        String input = "380639651043";
        boolean result = input.matches("\\+380(.*)");
        if(result){
            System.out.println("It is a phone number");
        }
        else{
            System.out.println("It is not a phone number!");
        }
    }
}
