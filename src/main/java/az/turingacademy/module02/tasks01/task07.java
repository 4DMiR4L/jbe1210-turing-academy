package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class task07 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int N = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            if (isPrime(N + i)) {
                System.out.println(i - 1);
                return;
            }
        }
        System.out.println("-1");
    }
}
