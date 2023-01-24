package com.Exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exceptions 1 2 3");;
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("fsdf");
        Scanner scanner = new Scanner(file);


    }
}
