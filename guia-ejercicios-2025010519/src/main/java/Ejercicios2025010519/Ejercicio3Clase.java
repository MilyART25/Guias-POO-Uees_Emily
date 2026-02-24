package Ejercicios2025010519;

import java.util.Scanner;

public class Ejercicio3Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("Programa que calcula el area de las figuras");
        System.out.println("1. Retangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("Seleccione lo que lo desea calcular: ");
        option = sc.nextInt();

        switch(option) {
            case 1:
                double base;
                double high;
                System.out.println("Ingrese la base del rectangulo: ");
                base = sc.nextDouble();
                System.out.println("Ingrese la altura del rectangulo: ");
                high = sc.nextDouble();
                double area = base * high;
                System.out.println("La base del rectangulo es:" + area + "cm");
                break;
            case 2:
                double baseT;
                double highT;
                System.out.println("Ingrese la base del triangulo: ");
                baseT = sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo: ");
                highT = sc.nextDouble();
                double areaT = baseT * highT;
                System.out.println("El area del triangulo es: " + areaT + "cm");
                break;
            case 3:
                double radio;
                System.out.println("Ingrese el radio del circulo: ");
                radio = sc.nextDouble();
                double areaC = Math.PI *(radio * radio);
                System.out.println("El area del circulo es:" + areaC + "cm");
                break;
            default:
                System.out.println("Se ha seleccionado una opcion inexistente");
        }


    }
}
