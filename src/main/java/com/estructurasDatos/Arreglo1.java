package com.estructurasDatos;

public class Arreglo1 {

    public static void main(String[] args) {
        // Declaración y inicialización de los arreglos
        String[] arreglo1 = {"Casa", "Edificio", "Carretera", "Puente", "Calle"};
        String[] arreglo2 = {"Lago", "Mar", "Río", "Llanura", "Montaña"};

        // Llamada al método que combina los arreglos
        combinarArreglos(arreglo1, arreglo2);
    }

    /**
     * Método que combina los arreglos y forma textos con elementos que comienzan con "C" y "L".
     *
     * @param arreglo1 Primer arreglo de strings.
     * @param arreglo2 Segundo arreglo de strings.
     */
    public static void combinarArreglos(String[] arreglo1, String[] arreglo2) {
        // Recorre los arreglos y combina los elementos que cumplen con la condición
        for (String elem1 : arreglo1) {
            if (elem1.startsWith("C")) {
                for (String elem2 : arreglo2) {
                    if (elem2.startsWith("L")) {
                        System.out.println("Texto combinado: " + elem1 + " cerca del " + elem2);
                    }
                }
            }
        }
    }

}
