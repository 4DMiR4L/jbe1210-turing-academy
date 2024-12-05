package az.turingacademy.module02.TaskMentor;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int count = split.length;
        double sum = 0;
        for (String num : split) {
            sum += Integer.parseInt(num);
        }
        sum /= count;
        System.out.printf("%.4f",sum);
    }
}
