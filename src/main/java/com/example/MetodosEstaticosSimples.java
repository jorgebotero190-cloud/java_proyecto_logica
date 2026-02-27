package  com.example;



public class MetodosEstaticosSimples {
//Un método estático simple sin parámetros ni retorno y cómo llamarlo;

public static void ejemploDeclaracionLlamada(){

System.out.println("estes es el metodos sin parametros");
};
//un metodo estatatico con parametros

public static void ejemploPasoDeParametros(String nombre ) {
nombre="jorge";
System.out.println("su nombre : " + nombre);    
};
//metodos estaticos con retorno
public static int ejemploRetornoValores(int a, int b) {
return a +b;
};
public static double ejemploRetornoValores(double a, double b) {
return a*b;
};
}

