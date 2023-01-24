package com;

public class Arrays2 {
    public static void main(String[] args){
        String[] strings = new String[5];
        for (int i = 0; i<strings.length; i++){
            strings[i] = "arg "+i;
        }
        for (String st:strings) {
            System.out.println(st);
        }
        int[] numbers1 = {5,10,20,25};
        int sum = 0;
        for (int x:numbers1) {
            sum = sum + x;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
