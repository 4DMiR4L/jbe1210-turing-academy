package az.turingacademy.module01.lesson06;

import java.util.Scanner;

import java.util.Scanner;

public class OrtaEded {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int A = number.nextInt();
        int B = number.nextInt();
        int C = number.nextInt();

        if ((A > B && A < C) || (A < B && A > C))  {
            System.out.println("A");
        } else if ((B > A && B < C) || (B < A && B > C)) {
            System.out.println("B");
        } else if ((C > A && C < B) || (C < A && C > B)) {
            System.out.println("C");

        }
    }
}