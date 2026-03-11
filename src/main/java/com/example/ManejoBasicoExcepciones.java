package com.example;

import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int num = 10 / 0; // División por cero
            System.out.println("El resultado de la división es: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
    }

    public static void ejemploTryCatchInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un número mayor a 0: ");
            int num = scanner.nextInt();
            System.out.println("El número ingresado es: " + num);
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número válido");
        }
    }

    public static void evitarCierrePrograma() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un número mayor a 0: ");
            int num = scanner.nextInt();
            System.out.println("El número ingresado es: " + num);
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número válido");
        } finally {
            System.out.println("Programa finalizado, gracias por usarlo!");
        }
        System.out.println("Este bloque se ejecuta siempre, incluso si ocurre una excepción o no.");
    }

    public static void ejemploBloqueFinally() {
        try {
            int[] num = {10, 14, 19};
            System.out.println("Accediendo al índice 5 del arreglo: " + num[5]); // Error real
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } finally {
            System.out.println("""
                Este bloque se ejecuta siempre, incluso si ocurre una excepción o no.
                Es útil para liberar recursos o realizar acciones de limpieza.
                Aquí estamos usando --finally--.
                """);
        }
    }
}