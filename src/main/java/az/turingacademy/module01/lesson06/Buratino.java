package az.turingacademy.module01.lesson06;

import java.util.Scanner;

public class Buratino {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long S = in.nextLong();
        int N = 0;
        int sumLastYear = 1;
        int sumTotal = 1;
        for (; N <= 100; N++) {
            sumLastYear = sumLastYear * 2 + N;
            sumTotal += sumLastYear;
            if (S <= sumTotal) {
                System.out.println(++N);
                break;
            }
        }
    }
}
