package az.turingacademy.module01.lesson08;

import java.util.Random;
import java.util.Scanner;

public class ShootingSquareApp {

    public static void main(String[] args) {

        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = ' ';
            }
        }

        Random random = new Random();
        int row = random.nextInt(5);
        int col = random.nextInt(5);

        System.out.println(field[row][col]);
        Scanner scanner = new Scanner(System.in);
        boolean targetDefeated = false;

        while (!targetDefeated) {
            printField(field);

            int firerow = getValidInput(scanner, "Enter a row(1-5):") - 1;

            int firecol = getValidInput(scanner, "Enter a cloum(1-5):") - 1;

            if (field[firerow][firecol] == '*') {
                System.out.println("You've already shot here. Try again!");
            } else if (firerow == row && firecol == col) {
                field[firerow][firecol] = 'x';
                printField(field);
                System.out.println("You have won!");
                targetDefeated = true;
            } else {
                field[firerow][firecol] = '*';
                System.out.println("Missed! Try again.");
            }
        }
        scanner.close();
        }

        public static void printField ( char[][] field){
            System.out.println("  1   2   3   4   5");
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(field[i][j] + "   ");
                }
                System.out.println();
            }
        }
        public static int getValidInput (Scanner scanner, String prompt){
            int input = 0;
            while (true) {
                System.out.print(prompt);
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    if (input >= 1 && input <= 5) {
                        break;
                    }else {
                        System.out.println("Invalid input. Try again.");
                    }
                }else {
                    System.out.println("Invalid input. Try again.");
                    scanner.nextLine();
                }

            }
            return input;
        }

}
