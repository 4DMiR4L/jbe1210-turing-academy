package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class taskM14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 1 && n <= 10000) {
            if (n > 1 && n % 2 == 0) {
                int m = n / 2;
                System.out.println(m);
            } else {
                int m = (n - 1) / 2;
                System.out.println(m);
            }
            if (n == 0 && n == 1) {
                System.out.println("0");
            }
        }
    }
}
