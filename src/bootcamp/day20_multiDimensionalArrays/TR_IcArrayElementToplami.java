package bootcamp.day20_multiDimensionalArrays;

import java.util.Arrays;

public class Day20_SumOfInnerArray {
    public static void main(String[] args) {

        /* In a given 2 dimensional array, calculate summation of the elements in each inner array and
         assign these sums to a single-layer array that we will create.

        // Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.

        input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
         output: [10, 3, 12, 10, 9]
         */

        int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] output= new int[arr.length];
        int innerArrTotal=0;
        for (int i = 0; i < arr.length; i++) { // controls inner arrays in outer arrays
            innerArrTotal=0;
            for (int j = 0; j < arr[i].length; j++) { // controls each array in an inner array
                innerArrTotal += arr[i][j];
            }
            output[i]=innerArrTotal;
        }
        System.out.println(Arrays.toString(output)); //[10, 3, 12, 10, 9]
    }
}


