package az.turingacademy.module01.lesson06;

import java.util.Scanner;

public class ÜçReqemli {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number/100 > number%10) {
            System.out.println(number/100);
        } else if (number/100 < number%10) {
            System.out.println(number%10);
        } else {
            System.out.println("=");
        }
    }
}
