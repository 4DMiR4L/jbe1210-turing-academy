package az.turingacademy.module02.TaskMentor;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter personel count: ");
        double[] b = new double[]{scanner.nextDouble()};
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextDouble();
            double max = 0;
            if (max > b[i]) {
                max = b[i];
                System.out.print(max);
            }
        }

    }
}
