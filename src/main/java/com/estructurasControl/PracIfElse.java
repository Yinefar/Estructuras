package com.estructurasControl;

public class PracIfElse {

    //doble encadenada
    public static void main(String[] args) {
        int r = 4, s = 7, m =5;
        if(r==5) {
            System.out.print("r es igual a 5");
        } else if (m==s) {
            System.out.print("m es igual a s");
        }else if (s<m) {
            System.out.print("s es mayor que m");
        } else if (s<r) {
            System.out.print("s es menor que r");
        } else if (s==r){
            System.out.print("s es mayor que r");
        } else {
            System.out.print("No se cumplió ninguna condición");
        }

    }
    }

