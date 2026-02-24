package Ejercicios2025010519;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        float suma = 0;
        float promedio;
        System.out.println("Digite el nombre del estudiante: ");
        name = sc.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digitar la nota" + "["+ i +"]:");
            float nota = sc.nextFloat();
            suma += nota;
        }
        promedio = suma / 5;
        System.out.println("El primedio de "+ name + " es de " + promedio);
    }
}
