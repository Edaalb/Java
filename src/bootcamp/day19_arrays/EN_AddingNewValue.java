package bootcamp.day19_arrays;

import java.util.Arrays;

public class Day19_AddingNewValue {
    public static void main(String[] args) {

        int[] arr= {2,4,6};

        // Add 8 to this arr as the 4th element

        /*
          We cannot add a new element to current array but we can assign new value to it.
          First create a new array like int[] arr2= [2, 4, 6, 8]
          then assign arr2's value to arr
         */

        // yeni array olusturalim Create a new arr
        // data types to be added to arr2
        // length is +1 of the old array

        int[] arr2= new int[arr.length+1]; // [0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 0]
        arr2[arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 8]

        // We assign the value of arr2 to arr
        arr=arr2;
        System.out.println("Last version of arr : "+Arrays.toString(arr)); //[2, 4, 6, 8]
    }
}
