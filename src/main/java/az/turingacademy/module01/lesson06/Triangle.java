package az.turingacademy.module01.lesson06;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a*a+b*b == c*c || b*b+c*c == a*a || c*c+a*a == b*b ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}