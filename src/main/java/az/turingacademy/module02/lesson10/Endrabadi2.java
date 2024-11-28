package az.turingacademy.module02.lesson10;

import java.util.Scanner;

public class Endrabadi2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double y = ((2 * x - 1)/(x*x)  ) + (Math.sqrt(x * x + 1)/2);

        System.out.printf("%.3f\n", y);
    }
}

