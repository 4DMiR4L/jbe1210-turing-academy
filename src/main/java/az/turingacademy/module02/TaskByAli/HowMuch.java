package az.turingacademy.module02.TaskByAli;

import java.util.Scanner;

public class HowMuch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int counter = 0;
        while (n > 0) {
            String num = String.valueOf(n);
            for (int i = 0; i < num.length(); i++) {
                int num1 = (int) (n / (Math.pow(10, num.length() - 1)));
                int num2 = (int) (n % (Math.pow(10, num.length() - 1)));

                double result = n - (num1 + num2);
                n = (int) result;

                counter++;
                if (result == 0) {
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}
