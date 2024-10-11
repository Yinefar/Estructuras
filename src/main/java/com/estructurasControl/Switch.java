package com.estructurasControl;
//ejemplo de estructura de selección múltiple
public class Switch {
    public static void main(String[] args) {

        String saludo = "Hola,";
        String name = "Jenni";

        switch (saludo) {
            case "Hola,":
                System.out.println(saludo + " " + name);
                break;
            case "Chaucillo,":
                System.out.println("Chaucillo, " + name);
                break;
            case "Buenos días,":
                System.out.println("Buenos días, " + name);
                break;
            default:
                System.out.println("No se reconoce el saludo");
        }






//        int numero = 1;
//        switch (numero) {
//            case 1:
//                System.out.println(saludo + " " + name);
//                break;
//            case 2:
//                System.out.println("Chaucillo, " + name);
//                break;
//            case 3:
//                System.out.println("Buenos días, " + name);
//                break;
//            default:
//                System.out.println("No se reconoce el número");
//        }

    }
}
