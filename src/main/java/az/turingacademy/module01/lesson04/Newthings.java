package az.turingacademy.module01.lesson04;

import java.util.Scanner;

public class Newthings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean answer = (scan.nextInt() % 2 == 0) ? true : false;
        System.out.println("Number is :" + answer);


    }
}
