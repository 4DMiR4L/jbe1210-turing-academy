package az.turingacademy.module01.Test;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Scanner yaradılır
        Scanner scanner = new Scanner(System.in);

        // Çoxölçülü array yaradılır
        String[][][] array = new String[2][3][7];

        // Random obyekt yaradılır
        Random random = new Random();

        System.out.println("Adları daxil edin (bitirmək üçün sadəcə Enter basın):");

        // Adları arraya təsadüfi yerləşdir
        while (true) {
            System.out.print("Ad: ");
            String ad = scanner.nextLine();
            if (ad.trim().isEmpty()) { // İstifadəçi boş string daxil etdikdə loopdan çıx
                break;
            }

            boolean yerləşdi = false;

            while (!yerləşdi) {
                // Təsadüfi indekslər yaradılır
                int i = random.nextInt(2); // 0 və ya 1
                int j = random.nextInt(3); // 0, 1, və ya 2
                int k = random.nextInt(7); // 0-dan 6-ya qədər

                // Əgər seçilmiş mövqe boşdursa, ad yerləşdirilir
                if (array[i][j][k] == null) {
                    array[i][j][k] = ad;
                    yerləşdi = true;
                }
            }
        }

        // Nəticəni ekrana çap et
        System.out.println("Təsadüfi şəkildə yerləşdirilmiş çoxölçülü array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.print((array[i][j][k] != null ? array[i][j][k] : "null") + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
