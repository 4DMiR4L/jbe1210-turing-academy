package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class TaskH14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String str = String.valueOf(x);
        StringBuilder reverse = new StringBuilder(str).reverse();
        System.out.println(reverse);
    }
}
