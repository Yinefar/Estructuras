package com.estructurasControl;

public class PractParamReturn {

    public static void main (String [] args) {
        int number = suma ( 2, 3, 6);
        System.out.println("La suma de tus valores es: " + number);
    }

    public static int suma(int a,int  b, int c) {
        return a + b + c;
    }
}
