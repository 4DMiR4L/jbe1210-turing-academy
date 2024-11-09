package az.turingacademy.module01.lesson07;

import java.util.Scanner;

public class UpperCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        String reverse = new StringBuilder(word).reverse().toString().toUpperCase();
        System.out.println(reverse);
    }
}
