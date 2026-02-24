package Ejercicios2025010519;

import java.util.Scanner;

/*AÑO 2022
Leer el numero de dias transcurridos en un año e imprimir a que mes pertenece,
Por ejemplo, si se captura el numero 32 se imprimira el mes es FEBRERO*/

public class EjercicioParcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nombresMes = {
                "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO",
                "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE","DICIEMBRE"
        };
        System.out.print("Ingrese un numero: ");
        int dia = sc.nextInt();

        if (dia < 1 || dia > 365) {
            System.out.println("El numero ingresado no es valido");
        } else {
            int acumulado = 0;
            int mes = 0;

            for(int i = 0; i < diasMes.length; i++) {
                acumulado += diasMes[i];
                if (dia <= acumulado) {
                    mes = i;
                    break;
                }
            }
            System.out.println("El mes es" + nombresMes[mes]);
        }
    }
}
