package bootcamp.day19_arrays;

import bootcamp.day18_arrays.Day18_AddArrayElements;
import bootcamp.day18_arrays.Day18_CreatingArrayToUser;
import bootcamp.day18_arrays.Day18_IncreasingArrayElements;
import bootcamp.day18_arrays.Day18_SearchElementsInArray;

import java.util.Arrays;

public class Day19_UsingMethods {
    public static void main(String[] args) {

        //Increase the value by two of a given int array's elements

        int[] arr= {2,3,4};

        arr= Day18_IncreasingArrayElements.increaseElementsBy2(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        //Add the arr array's elements and print the result
        System.out.println(Day18_AddArrayElements.addPositiveElements(arr)); // 15

        //Does the array include 10 as an element
        Day18_SearchElementsInArray.searchElement(arr,10); // Searched element not found in the array

        //Create an array by getting a value from the user
        int[] newArr= Day18_CreatingArrayToUser.createArray();
        System.out.println(Arrays.toString(newArr)); // Enter the lenght of the array to be created
    }
}
