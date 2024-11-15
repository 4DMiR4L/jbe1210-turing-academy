package az.turingacademy.module01.lesson08;

import java.util.Random;
import java.util.Scanner;

public class NumberGameApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number between 1 and 100: ");

        int numbers = random.nextInt(101);
        int TexminiEded = 0;
        System.out.println("Adını de");
        String name = scanner.nextLine();

        int[] enteredNumbers = new int[100];
        int attempts = 0;

        while (true) {
            System.out.println("Enter the number between 1 and 100: ");
            while (!scanner.hasNextInt()) {
                System.out.println("wrong number try again");
                scanner.next();
            }
            int UserGuess = scanner.nextInt();

            if (UserGuess < 0 || UserGuess > 100) {
                System.out.println("Please enter a number between 0 and 100.");
                continue;
            }
            enteredNumbers[UserGuess]=UserGuess;
            attempts++;
            if (UserGuess < numbers) {
                System.out.println("it's small number");
            } else if (UserGuess > numbers)
                System.out.println("it's large number");
            else {
                System.out.println("righ number" +name+ "!");

                System.out.println("Your numbers");

                for (int i = 0; i < attempts -1; i++) {
                    for (int j = i+1; j < attempts; j++) {
                        if (enteredNumbers[i] < enteredNumbers[j]) {
                            int temp = enteredNumbers[i];
                            enteredNumbers[i] = enteredNumbers[j];
                            enteredNumbers[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < attempts; i++) {
                    System.out.println(enteredNumbers[i] + " ");
                }
                System.out.println();
                break;
            }
        }

        scanner.close();
    }
}
