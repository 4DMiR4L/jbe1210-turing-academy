package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class taskM01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        if (n > 0) {
            double result = 8 * n + 4;
            System.out.println(result);
        }
    }
}