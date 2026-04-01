package sv.uees;

import java.util.Scanner;


public class CondicionalandLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speedLimit = 30;
        int drivingSpeed = 25;
        boolean schoolZone = false;

        if ( drivingSpeed < speedLimit && schoolZone) {
            System.out.println("You are being a safe driver!");
        } else if (drivingSpeed > speedLimit || schoolZone) {
            System.out.println("Slow down!");
        } else {
            System.out.println("Careful driving!");
        }

    }
}
