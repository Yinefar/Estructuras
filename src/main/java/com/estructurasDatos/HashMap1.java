package com.estructurasDatos;
import java.util.HashMap;
public class HashMap1 {

    /*

Un HashMap (también conocido como tabla de hash, diccionario
o mapa de hash) es una
estructura de datos que almacena pares clave-valor de manera eficiente.
    Y es una colección de elementos donde cada elemento se almacena en
    base a una clave y un valor asociado a esa clave.
     */

        public static void main(String[] args) {
            // Crear un HashMap
            HashMap<String, Integer> edadPersona = new HashMap<>();

            // Agregar elementos
            edadPersona.put("Juan", 25);
            edadPersona.put("María", 31);
            edadPersona.put("Pedro", 28);

            // Buscar un elemento
            System.out.println("Edad de Juan: " + edadPersona.get("Juan"));

            // Actualizar un elemento
            edadPersona.put("Juan", 26);

            // Eliminar un elemento
            edadPersona.remove("María");
        }

}
