package Java.day18_arrays;

import java.util.Arrays;

public class PRC_Arrays2 {
    public static void main(String[] args) {

        String [] arr= {"Ali", "Elif","Eda"};

        // Print all elements of this array by putting space between each of them.

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        // Print this array as an array

        System.out.println(arr); //[Ljava.lang.String;@566776ad

        // As array is an object / non-primitive data, Java prints its reference
        // If you want to print array as an Array, you need to get help from Array class

        System.out.println(Arrays.toString(arr)); // [Ali, Elif, Eda]
    }
}
