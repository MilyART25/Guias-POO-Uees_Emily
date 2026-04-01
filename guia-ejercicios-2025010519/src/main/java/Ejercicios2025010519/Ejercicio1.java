package Ejercicios2025010519;

import java.util.Scanner;
/*Calcule el área total de un cono cualquiera,
 cuyas medidas de altura y radio
 son dadas en centímetros, y la respuesta
 en pantalla se le presenta en centímetros cuadrados.*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los datos para calcular el cono: ");
        System.out.print("\nIntroduce la altura: ");
                double h = sc.nextDouble();
        System.out.print("Introduce la radio: ");
                double r = sc.nextDouble();
        System.out.print("Introduce la generatriz: ");
                double g = sc.nextDouble();

        double AreaBase =  Math.PI * Math.pow(r, 2);
        double AreaLateral = Math.PI * r * g;
        double AreaTotal = AreaBase + AreaLateral;

        System.out.println("El area Total del cono es: " + AreaTotal);

    }
}
