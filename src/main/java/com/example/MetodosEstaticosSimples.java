package com.example;

public class MetodosEstaticosSimples {

    // Un método estático simple sin parámetros ni retorno
    public static void ejemploDeclaracionLlamada() {
        System.out.println("=== MÉTODO SIN PARÁMETROS ===");
        System.out.println("Este es un método estático sin parámetros ni retorno.\n");
    }

    // Un método estático con parámetros
    public static void ejemploPasoDeParametros(String nombre) {
        System.out.println("=== MÉTODO CON PARÁMETROS ===");
        System.out.println("El nombre recibido es: " + nombre + "\n");
    }

    // Métodos estáticos con retorno (sobrecarga)
    public static int ejemploRetornoValores(int a, int b) {
        System.out.println("=== MÉTODO CON RETORNO (int) ===");
        return a + b;
    }

    public static double ejemploRetornoValores(double a, double b) {
        System.out.println("=== MÉTODO CON RETORNO (double) ===");
        return a * b;
    }
}