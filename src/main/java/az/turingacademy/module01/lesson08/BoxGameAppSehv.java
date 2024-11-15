package az.turingacademy.module01.lesson08;

import java.util.Random;
import java.util.Scanner;

public class BoxGameAppSehv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '_';
            }
        }
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(3);

        int orientation = random.nextInt(2);

        if (orientation == 0) {
            for (int i = 0; i < 3; i++) {
                field[targetRow][targetCol + i] = 'x';
            }
        }else  {
            for (int i = 0; i < 3; i++) {
                field[targetRow + i][targetCol] = 'x';
            }
        }
        System.out.println("All set. Get ready to rumble!");

        boolean targetFound = false;
        while (!targetFound) {
            printField(field);
            int fireRow = getValidInput(scanner, "Enter the row (1-5) to fire: ", 1, 5) - 1;
            int fireCol = getValidInput(scanner, "Enter the column (1-5) to fire: ", 1, 5) - 1;
            if (field[fireRow][fireCol] == 'x') {
                System.out.println("You fired!");
                field[fireRow][fireCol] = '*';
                targetFound = true;
            }else {
                if (field[fireRow][fireCol] == '-') {
                    field[fireRow][fireCol] = '*';
                    System.out.println("Miss! Try again.");
                } else {
                    System.out.println("You've already shot here. Try a different spot.");
                }
            }
        }
        System.out.println("YOu are won:");
        scanner.close();
    }
    private static void printField(char[][] field) {
        System.out.println("0 | 1 | 2 | 3 | 4 ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
        }
    }
    private static int getValidInput(Scanner scanner, String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    break;
                }else {
                    System.out.println("Invalid input. Try again.");
                }
            }else {
                System.out.println("Invalid input. Try again.");
                scanner.next();
            }
        }
        return input;
    }
}
