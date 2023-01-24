package com;

public class Arrays1 {
    public static void main(String[] args){
        int[] numbers = new int[7];
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = 5+i;
        }
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
