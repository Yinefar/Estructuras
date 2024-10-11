package com.estructurasControl;

public class PracWhile {

public static void main (String[] args) {
    int valor = 5;
    int suma = 0;

    while ( valor < 50) {
        System.out.println ("El valor ahora es "  + valor); //5, 15,
        suma += valor; //1 : 5; 2 : 20 ; 3 :
        valor = valor + 10; // guardar  1: 15 , 2:30,
        System.out.println("La suma de los números es: " + suma);  //1:5, 2:20
        }
    }

}
