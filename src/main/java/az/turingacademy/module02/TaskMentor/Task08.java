package az.turingacademy.module02.TaskMentor;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = 1 + x + x*x;
        System.out.println(y);
    }
}
