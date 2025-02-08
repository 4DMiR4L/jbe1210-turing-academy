package az.turingacademy.module03.lesson25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int count=0;
        int[] arr= {113,2,11,9,3,4,5};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                count++;
                if(arr[i]<arr[j]){
                    System.out.println(Arrays.toString(arr));
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

//        int[] arr = {4, 3, 6, 1, 2, 8, 7, 5};
//        System.out.println(Arrays.toString(selection(arr)));
    }

//    public static int[] selection(int[] arr) {
//
//        int counter = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min_index = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[min_index]) {
//                    min_index = j;
//                }
//                counter++;
//            }
//            int temp = arr[i];
//            arr[i] = arr[min_index];
//            arr[min_index] = temp;
//        }
//        System.out.println(counter);
//        return arr;
//    }
}
