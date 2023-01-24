package com;

public class Final1 {
    public static void main(String[] args){
        Test test = new Test();
        final int X = 55;
        System.out.println(test.CONSTANT+X);
    }
}

class Test{
    public final int CONSTANT = 10;


}