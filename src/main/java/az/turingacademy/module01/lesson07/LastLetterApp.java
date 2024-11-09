package az.turingacademy.module01.lesson07;

import java.util.Scanner;

public class LastLetterApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sözü daxil et: ");
        String word = scanner.nextLine();

        char lastLetter = word.charAt(word.length() - 1);
        System.out.println(lastLetter);
    }
}

