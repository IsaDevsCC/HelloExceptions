package com.ironhack.customerException.EjemploClase;


public class InvalidPostalCodeException extends Exception {

    private static final String invalidPostalCodeBaseMessage = "Invalid postal code";

    public InvalidPostalCodeException(String message) {
        super(invalidPostalCodeBaseMessage + ": " + message);
    }

    public InvalidPostalCodeException() {
        super();
    }

    public InvalidPostalCodeException(int codeError) {
        super("error code: " + codeError);
    }
}
