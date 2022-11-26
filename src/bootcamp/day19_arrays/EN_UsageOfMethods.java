package bootcamp.day19_arrays;

import bootcamp.day18_arrays.Day18_AddArrayElements;
import bootcamp.day18_arrays.Day18_IncreasingArrayElements;
import bootcamp.day18_arrays.Day18_LongestShortestWord;
import bootcamp.day18_arrays.Day18_SearchElementsInArray;

import java.util.Arrays;

public class Day19_UsageOfMethods {
    public static void main(String[] args) {

        int [] arr={4,7,6,9,-4,-6};

        arr= Day18_IncreasingArrayElements.increaseElementsBy2(arr);
        System.out.println(Arrays.toString(arr)); // [6, 9, 8, 11, -2, -4]

        int totalValue= Day18_AddArrayElements.addPositiveElements(arr);
        System.out.println(totalValue); // 34

        System.out.println("---------------------");
        Day18_SearchElementsInArray.searchElement(arr,8); //Searched element 8 is found 1 times in the array.

        //        arr=C06_CreatingArray.createingMethod();
        //        System.out.println(Arrays.toString(arr));

        String [] arrStrint = {"ali","atmaca","fish"};

        Day18_LongestShortestWord.printLongestShortestWords(arrStrint); // Longest word : atmaca
                                                                        // Shortest word : ali

    }
}
