package az.turingacademy.module01.lesson07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
//        String[] names = new String[5];
//        names[0] = "Turing";
//        names[1] = "Turing";
//        names[2] = "Turing";
//        names[3] = "Turing";
//        names[4] = "Turing";
//        String[] names2 = new String[6];
//        for (String name : names) {
//            System.out.println(name);
//
//        }

        int [][] numbers = new int[2][4];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;
        numbers[1][0] = 5;
        numbers[1][1] = 6;
        numbers[1][2] = 7;
        numbers[1][3] = 8;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + " ");
            }
        }
    }

}
