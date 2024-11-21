package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value = value1;
        String str = String.valueOf(value);
        int counter = 0;

        for (int i = 0; i <= String.valueOf(value1).length(); i++) {
            int numberLength = str.length();
            int num1 = (int) (value / (Math.pow(10, numberLength - 1)));
            int num2 = value % 10;
            if (num1 == num2) {
                counter++;
            }
            if (str.length() <= 2) {
                break;
            }
            value = (int) (value % (Math.pow(10, numberLength - 1)));
            value = value / 10;
            str = String.valueOf(value);
        }
        System.out.println(counter);
    }
}
