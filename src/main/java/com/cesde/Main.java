package com.cesde;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Ejercicio 1");
        System.out.println(ejercicios.ejercicio1(14, 23));
        System.out.println("-------------------------------------------------");

        System.out.println("Ejercicio 2");
        System.out.println(ejercicios.ejercicio2(3.5));
        System.out.println("-------------------------------------------------");

        System.out.println("Ejercicio 3");
        System.out.println(ejercicios.ejercicio3(7000));
        System.out.println("-------------------------------------------------");

        System.out.println("Ejercicio 4");
        System.out.println(ejercicios.ejercicio4(3, 10, 5, 4, 12));
        System.out.println("-------------------------------------------------");

        System.out.println("Ejercicio 5");
        System.out.println(ejercicios.ejercicio5(4, 6, 8));
        System.out.println("-------------------------------------------------");

    }
}