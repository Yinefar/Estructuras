package com.estructurasControl;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que digite su peso y altura
        System.out.print("Digite su peso (en kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite su altura (en metros): ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = calcularIMC(peso, altura);

        // Mostrar el resultado
        System.out.println("Su IMC es: " + imc);
        System.out.println(interpretarIMC(imc));

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular el IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para interpretar el IMC
    public static String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Peso bajo";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}