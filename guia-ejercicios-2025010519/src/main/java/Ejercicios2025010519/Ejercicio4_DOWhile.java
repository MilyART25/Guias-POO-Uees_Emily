package Ejercicios2025010519;

import java.util.Scanner;

public class Ejercicio4_DOWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digitar el nombre del estudiante: ");
        String nombre = sc.nextLine();

        int i = 1;
        double suma = 0;

        do  {
            System.out.print("Digitar la nota [" + i + "]: ");
            double nota = sc.nextDouble();
            suma += nota;
            i++;
        } while (i <= 5);

        double promedio = suma / 5;
        System.out.println("El promedio de " + nombre + " es: " + promedio);

    }
}
