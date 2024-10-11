package com.estructurasControl;

public class MetodoReturnParam {
    public static void main(String[] args) {
    int valor =  suma ( 2, 9, 11 );
    System.out.println("El resultado de la suma es: " + valor);
    }

    public static  int suma (int a, int b, int c){
        return a + b + c;
    }

}
