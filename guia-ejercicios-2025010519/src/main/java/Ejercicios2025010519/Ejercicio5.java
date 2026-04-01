package Ejercicios2025010519;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digitar el número mayor: ");
        int mayor = sc.nextInt();
        System.out.println("Digitar el número menor: ");
        int menor = sc.nextInt();

        // Mostrar los números entre menor y mayor
        System.out.println("Los números desde " + menor + " hasta " + mayor + " son:");

        if (menor <= mayor) {
            // Recorre en orden ascendente
            for (int i = menor; i <= mayor; i++) {
                System.out.print(i + " ");
            }
        } else {
            // Recorre en orden descendente (por si el usuario se equivoca)
            for (int i = menor; i >= mayor; i--) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}