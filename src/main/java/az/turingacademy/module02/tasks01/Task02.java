package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int number = scanner.nextInt();
        int count = String.valueOf(number).length();
        System.out.println(count);
    }
}