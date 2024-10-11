package com.estructurasControl;

import java.util.Scanner;

//obtenemos el IMC de un paciente
public class Secuencia {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso al usuario
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Solicitar la altura al usuario
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el resultado
        System.out.println("Tu índice de masa corporal (IMC) es: " + imc);

        // Cerrar el escáner
        scanner.close();











//        double peso = 0;
//        double estatura = 0;
//        double imc = 0;
//
//        //calcular
//
//        //solicitamos datos al usuario para calcular el IMC
//    System.out.println("Ingrese el peso del paciente en kg: " + getPeso());
//        //ask about the weight
//
//     System.out.println("Ingrese el peso del paciente en kg: ");
//
//        imc = peso / (estatura* estatura);
//
//        //resultado
//
//        System.out.println("El IMC del paciente es: " + imc);





    }
}
