package com.ironhack.customerException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.LoggingPermission;

public class Main {
    public  static void main( String f []) throws Exceptiones { // EL MÈTODO MAIN ES EL QUE IMPLEMENTA LA EXCEPCION DE LA CUSTOM EXCEPTIONS
        verificaExcepcion();
    }

    public static void verificaExcepcion() throws Exceptiones { // MÈTODO QUE IMPLEMENTA LA EXCEPCCIÓN CON EL ARGUMENTO A EVALUAR
        throw new Exceptiones(12);
    }
}
