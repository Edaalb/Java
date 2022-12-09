package Java.day19_arrays;

import java.util.Arrays;

public class EN_SmallestLargestElements {

    //Create a method that prints the smallest and largest numbers in a given int array

    // Verilen bir int array'de en kucuk ve en buyuk sayilari yazdiran bir method olusturun

        public static void main(String[] args) {

        int[] arr={3,8,1,5,2,9};
        printSmallestLargestElements(arr);
    }
    public static void printSmallestLargestElements(int[] arr){
        Arrays.sort(arr); // [1, 2, 3, 5, 8, 9]
        System.out.println("Largest Element : " + arr[arr.length-1]);
        System.out.println("Smallest Element : " + arr[0]);
    }
}
