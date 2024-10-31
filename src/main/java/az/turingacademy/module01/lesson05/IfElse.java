package az.turingacademy.module01.lesson05;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result = "";

        //proses
        if(value%3==0){
            result="Eded 3e qalıqsız bölünür";
        }else if (value%3==1){
            result="eded 3e tam bölünmür qalıq 1";
        } else if (value%3==2) {
            result="eded 3e tam bölünmür qalıq 2";

            System.out.println(result);

        }
    }
}
