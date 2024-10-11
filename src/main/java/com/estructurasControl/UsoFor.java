package com.estructurasControl;

public class UsoFor {
    public static void main(String[] args) {
        // Imprimir números del 1 al 10
        System.out.println("Números del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Imprimir la suma de los números del 1 al 10
        int suma = 0;
        System.out.println("\n\nSuma de números del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println(suma);

        // Imprimir los números pares del 1 al 20
        System.out.println("\nNúmeros pares del 1 al 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}