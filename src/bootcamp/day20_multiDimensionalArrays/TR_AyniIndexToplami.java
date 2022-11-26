package bootcamp.day20_multiDimensionalArrays;

import java.util.Arrays;

public class Day20_SumOfSameIndex {
    // Question 2- calculate summation of the elements with the same index in a given 2 dimensional array and
    // assign these sums to a single-layered array that we will create.

    //  Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
    //  yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.

    //	input : int[][] arr = {{3,4,5}, {2,3,6,7}};
    //	output: [5, 7, 11]

    public static void main(String[] args) {

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
        // inner 2 array olacagini ama bunlarin uzunluklarinin degisebilecegini kabul ettik

        int shorLength = (arr[0].length < arr[1].length) ? (arr[0].length) : (arr[1].length);

        int[] totalValueOfIndexes = new int[shorLength];

        for (int i = 0; i < totalValueOfIndexes.length; i++) {

            totalValueOfIndexes[i] = arr[0][i] + arr[1][i];
        }
        System.out.println(Arrays.toString(totalValueOfIndexes));
    }
}
