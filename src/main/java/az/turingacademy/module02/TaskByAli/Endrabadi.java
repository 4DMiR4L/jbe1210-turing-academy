package az.turingacademy.module02.TaskByAli;

import java.util.Scanner;

public class Endrabadi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextInt();

        double y = (x * x + (3 * x) - 4) / (2 * x - 3) - (x + 2) / (x * x - 5 * x + 7);
        System.out.printf("%.3f", y);
    }
}
