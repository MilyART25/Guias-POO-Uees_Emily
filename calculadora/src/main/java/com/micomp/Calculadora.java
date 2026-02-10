import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe 2 numeros:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("ESelecciona la operacion que deseas realizar (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error no es posible dividir entre 0");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error");
                return;
        }

        System.out.println("Resultado: " + result);
    }
}