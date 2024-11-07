package az.turingacademy.module01.lesson06;

import java.util.Scanner;

public class AyinNomresi {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        if (1 <= a && a <= 2) {
            System.out.println("Qış");
        } else if (2 <= a && a <= 5) {
            System.out.println("Yaz");
        } else if (5 <= a && a <= 8) {
            System.out.println("Yay");
        } else if (8 <= a && a <= 11) {
            System.out.println("Payız");
        } else if (11 <= a && a <= 12) {
            System.out.println("Qış");
        }
    }
}
