package az.turingacademy.module02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        System.out.println("ədəd yaz");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 0 ) {
            System.out.println("null-dur");
        } else if (answer%2 == 1) {
            System.out.println("tekdir");
        } else if (answer%2 == 0) {
            System.out.println("cutdur");
        }
        if (answer <= 0) {
            System.out.println("menfidi");
        } else if (answer >= 0) {
            System.out.println("musbetdi");
        }
    }
}
