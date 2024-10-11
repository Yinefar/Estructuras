package com.estructurasControl;

public class PractSwitch {
    public static void main(String[] args) {
        int res = 5;
        int holi = 4;
        int x = 10;
        int resultado = x > 5 ? 5 : 1;
        switch (holi) {
            case 1: System.out.println("Hola");
            break;
            case 2: System.out.println("Adiós");
            break;
            case 3: System.out.println("Buenos días");
            break;
            case 4: System.out.println("Buenas noches");
            break;
            default: System.out.println("No se reconoce el número");
        }

        switch (resultado) {
            case 5 -> System.out.println("Resultado es 5");
            default -> System.out.println("Resultado no es 5");
        }

        switch (res) {
            case 1 -> {
                System.out.println("Resultado es 1");
                System.out.println("Este es el primer caso");
                int suma = 10 + 5;
                System.out.println("La suma es: " + suma);
            }
            case 5 -> {
                System.out.println("Resultado es 5");
                System.out.println("Este es el segundo caso");
                String mensaje = "Hola, mundo!";
                System.out.println(mensaje);
                System.out.println("Fin del caso 5");
            }
            default -> {
                System.out.println("Resultado no es 1 ni 5");
                System.out.println("Este es el caso por defecto");
                int resta = 20 - 5;
                System.out.println("La resta es: " + resta);
            }
        }

    }
}
