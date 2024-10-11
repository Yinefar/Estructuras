package com.estructurasDatos;

import java.util.ArrayList;

public class Arreglo2 {

    public static void main(String[] args) {
        // Declaración y inicialización del arreglo
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Llamada al método que suma el primer y último elemento
        int suma = sumarPrimerUltimo(arreglo);

        // Impresión del resultado
        System.out.println("La suma del primer y último elemento es: " + suma);
    }

    /**
     * Método que suma el primer y último elemento de un arreglo.
     *
     * @param arreglo Arreglo de enteros.
     * @return Suma del primer y último elemento.
     */
    public static int sumarPrimerUltimo(int[] arreglo) {
        // Validación para evitar IndexOutOfBoundsException
        if (arreglo.length == 0) {
            return 0;
        }

        // Suma del primer y último elemento
        return arreglo[0] + arreglo[arreglo.length - 1];
    }
}
