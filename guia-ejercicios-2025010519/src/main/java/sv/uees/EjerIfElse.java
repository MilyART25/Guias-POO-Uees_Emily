package sv.uees;

import java.util.Scanner;


public class EjerIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp = 90;

        if (temp < 40) {
            System.out.println("It may be snowing! ❄️");
        } else if (temp < 80) {
            System.out.println("Enjoy the weather! 👌");
        } else {
            System.out.println("Okay... It is getting a little hot in here. 🔥");
        }
    }
}
