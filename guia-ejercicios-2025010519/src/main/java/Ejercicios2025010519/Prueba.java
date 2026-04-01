package Ejercicios2025010519;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = 0.0;
        double altura = 0.0; //Buena practica inicializar
        double generatriz = 0.0;
        double area = 0.0;
        // Sin 0.0 solo para datos primarios
        // en este caso se puede utilizar con o sin inicializar (simpre  0.0)

        System.out.println("Ingrese el radio el cono en cm");
        radio = sc.nextDouble();
        System.out.println("Ingrese la altura del cono en cm");
        altura = sc.nextDouble();
        double radioAlCuadrado = Math.pow(radio, 2);
        double alturaAlCuadrado = Math.pow(altura, 2);
        // generatriz
        generatriz = Math.sqrt(radioAlCuadrado + alturaAlCuadrado);


    }
}
