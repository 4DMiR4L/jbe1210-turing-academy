package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class taskM10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            scanner.close();
        }
        int i = 1;

        while (n % i == 0) {
            n /= i;
            i++;
        }
        if (n == 1) {
            System.out.println(i - 1);
        } else {
            System.out.println();
        }

    }
}