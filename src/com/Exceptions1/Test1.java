package com.Exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("jdjd");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After scanner");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        }
        System.out.println("After exception");
    }
}
