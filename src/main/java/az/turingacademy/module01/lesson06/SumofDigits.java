package az.turingacademy.module01.lesson06;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int Firstdigit = number / 1000;
        int Lastddigit = number % 10;
        System.out.println(Firstdigit  + Lastddigit  );
    }
}
