package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int value = number;
        String str = String.valueOf(value);

        for (int i = 0; i <= String.valueOf(number).length(); i++) {
            int numberLength = str.length();
            int num1 = (int) (value / (Math.pow(10, numberLength - 1)));
            int num2 = value % 10;
            double result = num1 + num2;
            if (result <= 0) {
                break;
            } else {
                System.out.print(result);
            }

            value = (int) (value % (Math.pow(10, numberLength - 1)));
            value = value / 10;
            str = String.valueOf(value);
        }
    }
}