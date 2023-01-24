package com.ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Дмитрий\\Desktop\\Test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        String path2 = "C:\\Users\\Дмитрий\\Desktop\\Test2.txt";
        File file2 = new File(path2);

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] numbers = line.split(" ");
        int[] num = new int[5];
        int counter = 0;
        for (String st:numbers) {
            num[counter++] = Integer.parseInt(st);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
