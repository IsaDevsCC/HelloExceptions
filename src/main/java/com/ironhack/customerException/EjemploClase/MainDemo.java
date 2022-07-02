package com.ironhack.customerException.EjemploClase;

import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) throws InvalidPostalCodeException {


        var cycles = 5;
        int i = 0;
        while (i < 5){
            try {
                soberAssistant();
            } catch (Exception e){
//            System.err.println(e.getMessage());
                if (e instanceof InvalidNumberException){
                    System.err.println("Error, exceptions:  " + e.getMessage());
                    e.printStackTrace();
                } else if (e instanceof IllegalArgumentException) {
                    System.out.println("Error, exceptions:  " + e.getMessage());
                    e.printStackTrace();
                    callATaxi();
                } else {
                    throw new RuntimeException(e);
                }
            }
            i++;
        }



    }

    private static void callATaxi() {
        System.out.println("A taxi is being called and it is on his way! Stay where u you are");
    }

    private static void soberAssistant() throws Exception {
        System.out.println("Sober Assistant v0.0.1");
//        try {
//            drinkChecker();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        drinkChecker();
    }

    private static void drinkChecker() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello friend, how many drinks did u had tonight?");
        int numbersOfDrinks = scanner.nextInt();

        processNumberOfDrinks(numbersOfDrinks);
    }

    public static void processNumberOfDrinks(int numbersOfDrinks) throws InvalidNumberException {
        if (numbersOfDrinks > 3) {
            System.out.println("mmmm not good, call a taxi");
            throw new IllegalArgumentException("TOO many drinks!");
        } else if (numbersOfDrinks < 0) {
//            LOCAL
//            try {
//                throw new Exception("Number can't be negative");
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//
//            }
//            DELEGATED
            throw new InvalidNumberException("Number can't be negative");
        } else {
            System.out.println("Thanks, here are your keys");
        }
    }
}
