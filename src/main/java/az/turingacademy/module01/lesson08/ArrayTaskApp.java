package az.turingacademy.module01.lesson08;

import java.util.Scanner;

public class ArrayTaskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = new int[i];
            for (int j = 0; j < i; j++) {
                array[i-1][j] = i;
        }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
