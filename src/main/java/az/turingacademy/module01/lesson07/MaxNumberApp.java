package az.turingacademy.module01.lesson07;

import java.util.Arrays;

public class MaxNumberApp {
    public static void main(String[] args) {

        int [] numbers = {9,2,36,7,8,3,9,6,878};
        int max=0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
        }
    }
        System.out.println(max);
    }
}
