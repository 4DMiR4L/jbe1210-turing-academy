package az.turingacademy.module02.TaskMentor;

import java.util.Scanner;

public class NeighborApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Neighbor count: ");
        int a = scanner.nextInt();
        double[] b = new double[a];
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextDouble();
        }

            for (int i = 1; i < b.length-1; i++) {
                int count = 0;
                if (b[i +1 ] > b[i]) {
                    count++;
                    System.out.println(count);
                }

            }

    }
}
