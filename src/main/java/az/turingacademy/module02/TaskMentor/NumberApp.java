package az.turingacademy.module02.TaskMentor;

import java.util.Scanner;

public class NumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a =new int[] {scanner.nextInt()};
        int max =0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max + " " +a[max]);
    }
}
