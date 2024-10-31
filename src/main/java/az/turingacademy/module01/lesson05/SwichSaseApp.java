package az.turingacademy.module01.lesson05;

import java.util.Scanner;

public class SwichSaseApp {
    public static void main(String[] args) {

        //input
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result ="";

        //prosses
        switch (value) {
            case 0:
                result = "ədəd 3-ə tam bölünür";
                break;
            case 1:
                result = "ədəd 3ə tam bölünmür və qalıq 1dir";
                break;
                case 2:
                    result = "ədəd 3ə tam bölünmür və qalıq 2dir";
                    break;
                    default:
                        result = "ədəd 3ə tam bölünmür və qalıq "+value % 3;

        }
        System.out.println(result);
    }
}
