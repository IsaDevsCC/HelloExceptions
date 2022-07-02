package com.ironhack.EjercicioException;

public class Main {
    public static void main(String [] x) throws Exception {
        ExceptionClass excep = new ExceptionClass();

       /* try {
            System.out.println(excep.convertToInt("ggdfs"));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage() + " Error Number format only");
        }*/

        System.out.println(excep.converToInt2("123"));
    }
}
