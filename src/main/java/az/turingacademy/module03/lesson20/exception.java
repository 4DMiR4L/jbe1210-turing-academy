package az.turingacademy.module03.lesson20;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int j = 5;
            try {
                int i = scanner.nextInt();
                System.out.println(j / i);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
