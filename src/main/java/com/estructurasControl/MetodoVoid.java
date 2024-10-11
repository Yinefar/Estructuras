package com.estructurasControl;

public class MetodoVoid {
    public static void main(String[] args) {
        //creamos un método void sin parámetros
        saludar();
        // creamos un método void con parámetros
        saludo("Juan", 25);
    }

            public static void saludar() {
                System.out.println("Hola, bienvenido!");
            }
            public static void saludo(String nombre, int edad) {
             System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }
        }

//**Explicación:**
//
//        1.  El programa define una clase llamada `EjemploMetodoVoid`.
//        2.  El método `main` es el punto de entrada del programa.
//        3.  En el método `main`, se llama al método `saludar()`.
//        4.  El método `saludar()` es un método void que no recibe parámetros.
//        5.  Dentro del método `saludar()`, se imprime un mensaje de saludo.
//
//
//**Salida del programa:**



