package bootcamp.day19_arrays;

import java.util.Arrays;

public class Day19_SwapPlaces {
    public static void main(String[] args) {

        //Question 3- (Interview) Create a method that will shift all the elements in a
        // given array to the right and move the last element to the beginning, save the array as new.
        //Ex : input : [4,5,6,7] is the final state of the array. : [7,4,5,6]

        //Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.

        int [] input = {4,5,6,7};

        System.out.println(Arrays.toString(swapElements(input))); // [7, 4, 5, 6]
    }

    public static int[] swapElements(int[] arr){

        int lastChar = arr[arr.length-1]; //we put the last element in the empty bucket lastchar=empty bucket

        for (int i = arr.length-2 ; i >=0 ; i--) {

            arr[i+1]=arr[i];
        }
        arr[0]=lastChar;

        return arr;

    }
}
