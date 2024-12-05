package az.turingacademy.module02.TaskMentor;

import java.util.Scanner;

public class Task06V1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        int count = numbers.length;
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        System.out.println(count + " " + sum);

        scanner.close();
    }
}
