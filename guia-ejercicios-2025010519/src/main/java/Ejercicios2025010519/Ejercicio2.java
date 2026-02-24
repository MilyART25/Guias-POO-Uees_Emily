package Ejercicios2025010519;

/*import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Consulta sobre estado de pension de un empleado");
        System.out.print("Digite la siguiente informacion: ");
        System.out.print("1. Nombre Completo:");
        string nombre_completo = sc.nextLine();
        System.out.print("2. Presione letra f (si es mujer) o m(Si es hombre): ");
         char sexo = sc.nextLine();
        System.out.print("Edad (en años): ");
        int edad = sc.nextInt();

    }

}

 */

import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el sexo del empleado (H/M): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Ingrese la edad del empleado: ");
        int edad = sc.nextInt();

        // Verificar si puede jubilarse
        boolean puedeJubilarse = false;

        if (sexo == 'H' || sexo == 'h') {
            if (edad >= 60) {
                puedeJubilarse = true;
            }
        } else if (sexo == 'M' || sexo == 'm') {
            if (edad > 54) {
                puedeJubilarse = true;
            }
        }

        // Mostrar resultado
        System.out.println("\nEmpleado: " + nombre);
        if (puedeJubilarse) {
            System.out.println("Estado: Puede jubilarse ✅");
        } else {
            System.out.println("Estado: Aún no puede jubilarse ❌");
        }

        sc.close();
    }
}
