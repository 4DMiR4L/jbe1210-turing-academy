package az.turingacademy.module02.lesson10;

import java.util.Scanner;

public class Endrabadi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double y = x-(x*x +4)/2 + (x*x*x) -3/(x+7);
        System.out.printf("%.3f\n",y);
    }
}
