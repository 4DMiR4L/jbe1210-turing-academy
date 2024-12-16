package az.turingacademy.module02.lesson16;

public class Metod {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        printarr(arr);

    }
    public static void printarr(int[] arr){
        for(int i : arr){
          int sum = arr[i] + arr[i +1];
            System.out.println(sum);
        }
    }
}
