package az.turingacademy.module01.lesson08;

import java.util.Random;

public class Yerler2_0App {

    public static void main(String[] args) {
        Random random = new Random();

        String[] adlar = {
                "Rəvan Agayev", "Gülər Əbilova", "Yetər Nəbiyeva",
                "Ruslan Çərkəzov", "Sənubər Abbasova", "Fəxri Babayev",
                "Lalə Həmidova", "Günay İskəndərova", "Mirzəyeva Dilbər",
                "Ramina Səlimova", "Tural Nəzərov", "Rəvan Əliyev",
                "Aynur Məmmədova", "Ömər Ələkbərov", "Famil Məmmədov",
                "Rena Mehdiyeva", "ƏliMurad", "Seyran Xəlilzadə", "İbrahim Ələkbərov",
                "Hüseynov Məhəmməd", "Pərvin Bədəlova", "Nicat Məcidov", "Ella Piriyeva",};
        System.out.println("adlar ve yerler");
        boolean[] istifadeolunan = new boolean[adlar.length];

        for (String ad : adlar) {
            int randomNumber;
            while (true) {
                randomNumber = random.nextInt(23) + 1;
                if (!istifadeolunan[randomNumber - 1]) {
                    istifadeolunan[randomNumber - 1] = true;
                    break;
                }
            }
            System.out.println(ad + "- " + randomNumber);
        }


    }
}
