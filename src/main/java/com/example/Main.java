package com.example;

public class Main {


    public static void main(String[] args) {
        System.out.println("CLASE: VariablesYConstantes");
        System.out.println();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostracionDeclaracionAsignacion();
        VariablesYConstantes.demostracionConstantes();

        System.out.println();
        System.out.println("CLASE: TiposDeDatosPrimitivos");
        System.out.println();
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();
 

        System.out.println();
        System.out.println(" Clases: Conversion de tipos");
        System.out.println();
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();

        System.out.println();
        System.out.println(" Clases: Operadores");
        System.out.println();
        Operadores.demostrarOperadoresAritmeticos();
        Operadores.demostracionIncrementoDecremento();
        Operadores.demostrarRelacionales();
        System.out.println();
        Operadores.demostrarOperadoresLogicos();

        System.out.println(" Clases: Arreglos unidimensionales");
        ArreglosUnidimensionales.declararCrearInicializar();
        
        System.out.println();
        System.out.println(" Clases Entrada de datos");
        System.err.println();
       // EntradaDeDatos.leerVariosTipos();
     //   EntradaDeDatos.manejarSaltoDeLineaPendiente();


        System.out.println();
        System.out.println("CLASE: Estructuras Condicionales");
        System.out.println();
        EstructurasCondicionales.ejemplosIF();
        EstructurasCondicionales.ejemplosIfElse();
        EstructurasCondicionales.ejemplosIfElseIf();
        EstructurasCondicionales.ejemplosSwitch();


        System.out.println();
        System.out.println(" clases: Estructuras de repetición");
        System.err.println();
        EstructurasDeRepeticion.ejemplosWhile();
        EstructurasDeRepeticion.ejemplosDoWhile();
        EstructurasDeRepeticion.ejemplosForClásico();
        EstructurasDeRepeticion.ejemplosForAnidado();
        EstructurasDeRepeticion.ejemplosBreakContinue();
        EstructurasDeRepeticion.ejemplosEtiquetas();


        System.out.println();
        System.err.println("CLASE: Métodos Estaticos Simples");
        System.out.println();
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoDeParametros("carlos");
        int suma = MetodosEstaticosSimples.ejemploRetornoValores(5, 3);
        System.out.println("Suma int: " + suma);
        int suma2 = MetodosEstaticosSimples.ejemploRetornoValores(4, 6);
        System.out.println("Suma int 2: " + suma2);
        double multiplicacion = MetodosEstaticosSimples.ejemploRetornoValores(4.0, 6.0);
        System.out.println("Multiplicacion double: " + multiplicacion);

        System.out.println();
        System.out.println("CLASE: Arreglos Bidimensionales");
        System.out.println();
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.ejemploUsosTipicos();


        System.out.println();
        System.out.println("CLASE: Manipulacion de Cadenas");
        System.out.println();
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarLongitud();
        ManipulacionCadenas.demostrarSubstring();
        ManipulacionCadenas.demostrarIndexOf();
        ManipulacionCadenas.demostrarReplace();
        ManipulacionCadenas.demostrarMayusculasMinusculas();
        ManipulacionCadenas.demostrarSplit();
        ManipulacionCadenas.demostrarTrim();


        System.out.println();
        System.out.println("CLASE: Manejo de Excepciones");
        System.out.println();
        ManejoBasicoExcepciones.ejemploTryCatchDivicion();
        ManejoBasicoExcepciones.ejemploTryCatchImput();
        ManejoBasicoExcepciones.evitarCierrePrograma();
        ManejoBasicoExcepciones.ejemploBloqueFinally();

    }

}

