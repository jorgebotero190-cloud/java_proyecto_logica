package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    private static final Scanner scanner = new Scanner(System.in);

    public static void leerVariosTipos() {
        System.out.print("Ingresa el nombre del producto: ");
        String nombre_producto = scanner.nextLine();
        System.out.print("¿Qué cantidad deseas? ");
        int numero = scanner.nextInt();
        System.out.print("Ingresa el valor a abonar para entrega por unidad : " );
        double precio = scanner.nextDouble();
        double total = numero * precio;
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("\n-----Hola Bienvenido!------\n "
                + ";El producto que buscas es: " + nombre_producto + "\n la cantidad deseada es : " + numero + " \nel precio de este producto es : " + precio + "\n el total es : " + total);
        scanner.nextLine(); // Consumir el salto de línea pendiente antes de siguiente método
    }

    
    public static void manejarSaltoDeLineaPendiente() {
    
        System.out.print("Ingrese Tu  clase: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese su edad  : ");
        int numero = scanner.nextInt();
        // double
        System.out.print("Ingrese dia de cumpleaños : ");
        double decimal = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Texto: " + texto);
        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);
    }
}
