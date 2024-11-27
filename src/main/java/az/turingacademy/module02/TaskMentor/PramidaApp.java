package az.turingacademy.module02.TaskMentor;

import java.util.Scanner;

public class PramidaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] b = new int[a][];
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
        }
    }
}
