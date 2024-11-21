package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class taskH03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        String num = String.valueOf(x);
        StringBuilder palindrome = new StringBuilder(num).reverse();
        int num2 = Integer.parseInt(palindrome.toString());
        if (x == num2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
