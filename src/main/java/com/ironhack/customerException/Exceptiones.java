package com.ironhack.customerException;

public class Exceptiones extends Exception {

    public static final String errores = "No es admitido"; // ERROR
    public Exceptiones(String error) { // CONSTRUCTOR A PADRE
        super( errores + " == " + error);//lanza la excepción desde el constructor e imprime el error desde el mismo
    }

    public Exceptiones(){
        super();
    }

    public Exceptiones(int code){ // EXCEPCIÓN DISPARADA POR UN INTEGER
        super("error código " + code);
    }
}
