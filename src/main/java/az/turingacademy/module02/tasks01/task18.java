package az.turingacademy.module02.tasks01;

import java.util.Scanner;

public class task18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String str = Integer.toBinaryString(num);
        int length = str.length();
        for (int i = 1; i < length; i++) {
            str = str.substring(1) + str.charAt(0);
            int eded = Integer.parseInt(str, 2);
            if (eded > num){
                num = eded;
            }
        }
        System.out.println(num);
    }
}