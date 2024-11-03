package az.turingacademy.module01.lesson05;

import java.util.Scanner;

public class Task05_02 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("1-12 aralığında eded seç: ");
        int month = number.nextInt();

        String season ;
        String monthName ;
        switch (month) {
            case 1:
                monthName = "Yanvar";
                season = "Qış";
                break;
            case 2:
                monthName = "Fevral";
                season = "Qış";
                break;
            case 3:
                monthName = "Mart";
                season = "Yaz";
                break;
            case 4:
                monthName = "Aprel";
                season = "Yaz";
                break;
            case 5:
                monthName = "May";
                season = "Yaz";
                break;
            case 6:
                monthName = "İyun";
                season = "Yay";
                break;
            case 7:
                monthName = "İyul";
                season = "Yay";
                break;
            case 8:
                monthName = "Avqust";
                season = "Yay";
                break;
            case 9:
                monthName = "Sentyabr";
                season = "Payız";
                break;
            case 10:
                monthName = "Oktyabr";
                season = "Payız";
                break;
            case 11:
                    monthName = "Noyabr";
                    season ="Payız";
                    break;
            case 12:
                monthName = "Dekabr";
                season = "Qış";
                break;
            default:
                monthName = "Sehv";
                season ="eded sehvi";
                break;
        }
        if (month >=1 && month <=12) {
            System.out.println( monthName + "\n" + season );
        }else {
            System.out.println("sehv yazmısan");
        }
    }
}
