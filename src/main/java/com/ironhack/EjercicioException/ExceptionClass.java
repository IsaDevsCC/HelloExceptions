package com.ironhack.EjercicioException;
/*Create a method called convertToInt. This method takes in a String like "4" or "16" and converts it to an integer and returns the integer value. You may need to Google "converting Strings to ints in Java".
Call the function with an improperly formed String like "abc". Add a try/catch to handle the exception that is thrown.
10:39
and after
10:39
Refactor your previous code to use the throws keyword.*/
public class ExceptionClass {

    public int convertToInt(String value) {
        return Integer.parseInt(value);
    }

    public int converToInt2(String value) throws Exception {

        boolean isNumeric = value.chars().allMatch( Character::isDigit );

        if(isNumeric) {
            return Integer.parseInt(value);
        } else {
            throw new Exception("Only number format");
        }
    }
}
