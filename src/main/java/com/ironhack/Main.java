package com.ironhack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //errorFromImput();
       //indexOutofBoundedDemo();
      // writeToFile();
        Scanner ask = new Scanner(System.in);

        System.out.println("how many driks u had");
        int drink =  ask.nextInt();
        //System.out.println((drink < 0 ) ? throw new Exception("Is negative") : (drink > 3 ? "Sorry, take a UBER" : "Thanks, here are your keys"));

        if(drink < 0) {
            throw new Exception("Is negative");
        } if (drink > 3) {
            System.out.println("Sorry, take a UBER");
        } else {
            System.out.println("Thanks, here are your keys");
        }
    }


}