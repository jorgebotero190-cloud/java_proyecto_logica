package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIONES ===");

        System.out.println("\nCLASE: Variables y Constantes");
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostracionDeclaracionAsignacion();
        VariablesYConstantes.demostracionConstantes();

        System.out.println("\nCLASE: Tipos de Datos Primitivos");
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();

        System.out.println("\nCLASE: Conversión de Tipos");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();

        System.out.println("\nCLASE: Operadores");
        Operadores.demostrarOperadoresAritmeticos();
        Operadores.demostracionIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarOperadoresLogicos();
        Operadores.demostrarAsignacionesCompuestas();
        Operadores.demostrarOperadoresTernarios();

        System.out.println("\nCLASE: Arreglos Unidimensionales");
        ArreglosUnidimensionales.declararCrearInicializar();

        System.out.println("\nCLASE: Entrada de Datos");
        // EntradaDeDatos.leerVariosTipos();
        // EntradaDeDatos.manejarSaltoDeLineaPendiente();

        System.out.println("\nCLASE: Estructuras Condicionales");
        EstructurasCondicionales.ejemplosIF();
        EstructurasCondicionales.ejemplosIfElse();
        EstructurasCondicionales.ejemplosIfElseIf();
        EstructurasCondicionales.ejemplosSwitch();

        System.out.println("\nCLASE: Estructuras de Repetición");
        EstructurasDeRepeticion.ejemplosWhile();
        EstructurasDeRepeticion.ejemplosDoWhile();
        EstructurasDeRepeticion.ejemplosForClasico(); // corregido
        EstructurasDeRepeticion.ejemplosForAnidado();
        EstructurasDeRepeticion.ejemplosBreakContinue();
        EstructurasDeRepeticion.ejemplosEtiquetas();

        System.out.println("\nCLASE: Métodos Estáticos Simples");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoDeParametros("Carlos");
        int suma = MetodosEstaticosSimples.ejemploRetornoValores(5, 3);
        System.out.println("Suma int: " + suma);
        int suma2 = MetodosEstaticosSimples.ejemploRetornoValores(4, 6);
        System.out.println("Suma int 2: " + suma2);
        double multiplicacion = MetodosEstaticosSimples.ejemploRetornoValores(4.0, 6.0);
        System.out.println("Multiplicación double: " + multiplicacion);

        System.out.println("\nCLASE: Arreglos Bidimensionales");
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.ejemploUsosTipicos();

        System.out.println("\nCLASE: Manipulación de Cadenas");
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarLongitud();
        ManipulacionCadenas.demostrarSubstring();
        ManipulacionCadenas.demostrarIndexOf();
        ManipulacionCadenas.demostrarReplace();
        ManipulacionCadenas.demostrarMayusculasMinusculas();
        ManipulacionCadenas.demostrarSplit();
        ManipulacionCadenas.demostrarTrim();
        ManipulacionCadenas.demostrarStartsWithEndsWith();
        ManipulacionCadenas.demostrarCompareTo();
        ManipulacionCadenas.demostrarContains();
        ManipulacionCadenas.demostrarCharAt();

        System.out.println("\nCLASE: Manejo de Excepciones");
        ManejoBasicoExcepciones.ejemploTryCatchDivision(); // corregido
        ManejoBasicoExcepciones.ejemploTryCatchInput();    // corregido
        ManejoBasicoExcepciones.evitarCierrePrograma();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
    }
}