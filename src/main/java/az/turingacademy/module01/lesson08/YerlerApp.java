package az.turingacademy.module01.lesson08;

import java.util.Random;
import java.util.Scanner;

public class YerlerApp {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[][][] adlar = new String[2][3][7];

        System.out.println("Adlar; daxil et(bitirende entere bas)");

        while (true) {

            String ad = scanner.nextLine();
            if (ad.trim().equals(""))
                break;


            boolean oturdu = false;
            int i = random.nextInt(2);
            int j = random.nextInt(3);
            int k = random.nextInt(7);

            if (adlar[i][j][k] == null) {
                adlar[i][j][k] = ad;
                oturdu = true;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.print((adlar[i][j][k] != null ? adlar[i][j][k] : "null") + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
