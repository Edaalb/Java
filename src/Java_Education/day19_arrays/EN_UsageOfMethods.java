package Java_Education.day19_arrays;

import Java_Education.day18_arrays.EN_AddAllPositiveValues;
import Java_Education.day18_arrays.PRC_IncreasingArrayElements;
import Java_Education.day18_arrays.EN_LongestShortestWord;
import Java_Education.day18_arrays.EN_FindDesiredNumberInArray;

import java.util.Arrays;

public class EN_UsageOfMethods {
    public static void main(String[] args) {

        int [] arr={4,7,6,9,-4,-6};

        arr= PRC_IncreasingArrayElements.increaseElementsBy2(arr);
        System.out.println(Arrays.toString(arr)); // [6, 9, 8, 11, -2, -4]

        int totalValue= EN_AddAllPositiveValues.addPositiveElements(arr);
        System.out.println(totalValue); // 34

        System.out.println("---------------------");
        EN_FindDesiredNumberInArray.searchElement(arr,8); //Searched element 8 is found 1 times in the array.

        //        arr=C06_CreatingArray.createingMethod();
        //        System.out.println(Arrays.toString(arr));

        String [] arrStrint = {"ali","atmaca","fish"};

        EN_LongestShortestWord.printLongestShortestWords(arrStrint); // Longest word : atmaca
                                                                        // Shortest word : ali

    }
}
