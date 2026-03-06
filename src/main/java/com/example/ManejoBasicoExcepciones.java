package com.example;

import java.util.Scanner;

public class ManejoBasicoExcepciones {
    public static void ejemploTryCatchDivicion() {
        try {
            int num = 10 / 0;
            System.out.println("el resultado de la division! :" + num);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
    }

    public static void ejemploTryCatchImput() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.err.println("Ingresa un numero mayor a ** 0 ** :");
            int num = scanner.nextInt();
            System.out.println("El numero ingresado es : " + num);
        } catch (Exception e) {
            System.out.println("Error: Ingresa un numero valido");
        }
    }

    public static void evitarCierrePrograma() {
        Scanner _scanner = new Scanner(System.in);
        try {
            System.err.println("Ingresa un numero mayor a ** 0 ** :");
            int num = _scanner.nextInt();

            System.out.println("El numero ingresado es : " + num);
        } catch (Exception e) {
            System.out.println("Error: Ingresa un numero valido");
        } finally {
            System.out.println("Programa finalizado, gracias por usarlo!");
        }
        System.err.println("\nEn este bloque se ejecuta siempre, incluso si ocurre una excepción o no . Evitando el cierre del programa\n");

    }

    public static void ejemploBloqueFinally() {
        try {
            int[] num = { 10 , 14 ,19};
            System.err.println("Accediendo al indice 5 del arreglo: " + num[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Indice fuera de rango");
            } finally {
                System.out.println("Este bloque se ejecuta siempre, incluso si ocurre una excepción o no.\n"+
                "\nEs útil para liberar recursos o realizar acciones de limpieza\n" +
                "\nEvitando el cierre del programa\n"+
                        "\n Aqui estamos usando  --finally--\n");
            }
        
    }
}

