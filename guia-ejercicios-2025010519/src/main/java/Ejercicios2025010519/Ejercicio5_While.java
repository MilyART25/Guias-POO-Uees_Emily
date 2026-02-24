package Ejercicios2025010519;

import java.util.Scanner;

public class Ejercicio5_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero [menor]: ");
        int menor = sc.nextInt();
        System.out.print("Ingrese el primer numero [mayor]: ");
        int mayor = sc.nextInt();

        int i = menor + 1;
        while (i < mayor) {
            System.out.print(i + " ");
            i++;
        }

    }
}
