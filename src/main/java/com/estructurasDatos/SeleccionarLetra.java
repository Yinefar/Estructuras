package com.estructurasDatos;

public class SeleccionarLetra {
    public static void main(String[] args) {
        String palabra = "COMPUTADORCITA";
        char letraBuscar = 'D';
            //para siguiente metodo implementado
        String texto = "bailemos";
        char   letra = 'o';

        System.out.println("Palabra: " + palabra);
        System.out.println("Letra a buscar: " + letraBuscar);

        // palabra.lenght() devuelve la longitud de la palabra. La longitud quiere decir la cantidad de caracteres
        // que tiene la palabra y en este caso la palabra tiene 14 caracteres
        // i < palabra.length() se encarga de recorrer la palabra desde la posición 0 hasta la longitud de la palabra
        // palabra.toLowerCase().charAt(i) convierte la palabra a minúsculas y obtiene el caracter en la
        // posición i, es opcional conertir a minusculas


        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.toLowerCase().charAt(i) == Character.toLowerCase(letraBuscar)) {
                System.out.println("La letra '" + letraBuscar + "' se encuentra en la posición " + (i +1));
                break; // Salir del bucle si se encuentra la letra
            }
        }


        // este programa busca la letra en la palabra y muestra la posición
        // el for sirve para recorrer la palabra y el if para comparar si la letra es igual a la letra buscada
        // se recorre la palabra y se compara si la letra es igual a la letra buscada
        // empezamos con i=0 porque la posición 0 será la primera letra de la palabra y se va incrementando en 1
        // luego de esto se compara si la letra en la posición i es igual a la letra buscada, de no ser así seguimos
        //recorriendo la palabra hasta encontrar la letra buscada. Cuando se encuentra la letra buscada
        // se imprime la posición

        System.out.println("La palabra es: " + texto);
        System.out.println("La letra es: " + letra);

        for (int i = 0 ; i< texto.length(); i++) {

            if(texto.charAt(i)== letra) {
                System.out.println("La posición de la letra buscada es : " + (i +1));
                break;
            }

        }





    }



}
