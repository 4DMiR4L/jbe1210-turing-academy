package az.turingacademy.module01.lesson08;

import java.util.Random;

public class Yerler2_0App {

    public static void main(String[] args) {
        Random random = new Random();

        String[] adlar = {"Rəvan Agayev", "Gülər Əbilova", "Yetər Nəbiyeva", "Mirzəyeva Dilbər",
                "Ruslan Çərkəzov", "Sənubər Abbasova", "Fəxri Babayev", "Lalə Həmidova", "Günay İskəndərova",
                "Ramina Səlimova", "Tural Nəzərov", "Rəvan Əliyev", "İbrahim Ələkbərov", "Ella Piriyeva",
                "Aynur Məmmədova", "Ömər Ələkbərov", "Famil Məmmədov",
                "Rena Mehdiyeva", "ƏliMurad", "Seyran Xəlilzadə",
                "Hüseynov Məhəmməd", "Pərvin Bədəlova", "Nicat Məcidov"};
        System.out.println("adlar ve yerler");

        for (int i = 0; i < adlar.length; i++) {
            System.out.println(adlar[i] + " " + random.nextInt(23));
        }

    }
}
