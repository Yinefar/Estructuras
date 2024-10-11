package com.estructurasControl;
//ejemplo de estuctura de seleccion doble encadenada
//ejecuta la primera accion verdadera que cumpla la condicion, una vez hecho esto omite las demás
// si ninguna condicion es verdadera se ejecuta la ultima accion por defecto
public class Encadenada {
    public static void main(String[] args) {
        int r = 10;
        int s = 20;
        int t = 30;
        int u = 40;
        String saludo = "Hola";
        String nombre = "Jenn";
        String mensaje = saludo + ", " + nombre + "!";

        if(r > s){
            t++;  //empleo de contador para incrementar el valor de t
            System.out.println(t);}
        else if ( r > s && s < t && t < u) System.out.println(nombre);
        else if (r<u) System.out.println(mensaje.toUpperCase());
        //toUpperCase es un métod de la clase String que convierte a mayúsculas
            // el contenido de la cadena
        else System.out.println(saludo);


    }
}
