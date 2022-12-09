package Java_Education.day19_arrays;

import Java_Education.day18_arrays.EN_AddAllPositiveValues;
import Java_Education.day18_arrays.EN_CreatingArrayToUser;
import Java_Education.day18_arrays.PRC_IncreasingArrayElements;
import Java_Education.day18_arrays.EN_FindDesiredNumberInArray;

import java.util.Arrays;

public class EN_UsingMethods {
    public static void main(String[] args) {

        //Increase the value by two of a given int array's elements

        int[] arr= {2,3,4};

        arr= PRC_IncreasingArrayElements.increaseElementsBy2(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        //Add the arr array's elements and print the result
        System.out.println(EN_AddAllPositiveValues.addPositiveElements(arr)); // 15

        //Does the array include 10 as an element
        EN_FindDesiredNumberInArray.searchElement(arr,10); // Searched element not found in the array

        //Create an array by getting a value from the user
        int[] newArr= EN_CreatingArrayToUser.createingMethod();
        System.out.println(Arrays.toString(newArr)); // Enter the lenght of the array to be created
    }
}
