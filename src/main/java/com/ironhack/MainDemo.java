package com.ironhack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainDemo {

    private static void indexOutofBoundedDemo() {
        int [] numbers = new int [3];
        Integer [] integers = new Integer[3];
        System.out.println(Arrays.toString(integers));
        System.out.println(numbers[5]);
    }

    //unchecked exception
    private static void errorFromImput()  {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are u");
        int nextInt = scan.nextInt();
        System.out.println("Adeu");
        scan.close();
    }

    //checked exception
    private static void writeToFile() throws IOException {
        FileWriter f = new FileWriter("hello.txt");
        f.write("hello there");
        f.close();
    }
}
