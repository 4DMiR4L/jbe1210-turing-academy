package az.turingacademy.module02.TaskByAli;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0 && number % 3 == 0 &&  number >= 10 && number <= 100 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
