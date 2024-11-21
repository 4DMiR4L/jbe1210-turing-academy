package az.turingacademy.module01.Test;

import java.util.Random;
import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

     char[][] qutu = new char[3][3];
     for (int i = 0; i < qutu.length; i++) {
         for (int j = 0; j < qutu[i].length; j++) {
             qutu[i][j] = ' ';

         }
     }
     Random random = new Random();
     int row = random.nextInt(3);
     int col = random.nextInt(3);

        Scanner scanner = new Scanner(System.in);
        boolean targetDefeated = false;

        while (!targetDefeated) {

        }


    }
}
