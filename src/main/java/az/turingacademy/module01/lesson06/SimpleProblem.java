package az.turingacademy.module01.lesson06;

import java.util.Scanner;

public class SimpleProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.printf("%d %d\n", number/10,number%10);
    }
}
