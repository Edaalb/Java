package bootcamp.day18_arrays;

import java.util.Arrays;

public class Day18_IncreasingArrayElements {
    public static void main(String[] args) {

        //Create a method that increments all the elements of a given int array by 2 and returns it.
        //Save the old array as it is new.

        // Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {2,4,6,8};
        for (int i = 0; i < arr.length ; i++) {
            arr[i] =arr[i]+2 ;
        }
        System.out.println(Arrays.toString(arr));  // [4, 6, 8, 10]
        arr= increaseElementsBy2(arr);
        System.out.println(Arrays.toString(arr)); // [6, 8, 10, 12]
    }
    public static int[] increaseElementsBy2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+2;
        }
        return arr;
    }
}
