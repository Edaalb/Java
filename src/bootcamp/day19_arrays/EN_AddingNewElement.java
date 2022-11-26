package bootcamp.day19_arrays;

import java.util.Arrays;

public class Day19_AddingNewElement {
    public static void main(String[] args) {

        // Create a method that adds element to a given int array and returns the new version
        // verilen bir int array'e istenen bir elementi ekleyip yeni halini bize donduren bir method olusturun

        int[] abc= {3,5,8,9,6,7,3,4};
        int addedNumber=10;
        abc=addElementToArray(abc,addedNumber);
        System.out.println(Arrays.toString(abc)); // [3, 5, 8, 9, 6, 7, 3, 4, 10]
    }
    public static int[] addElementToArray(int[] addedArr , int addedNumber){
        int[] newArr= new int[addedArr.length+1];
        for (int i = 0; i <addedArr.length ; i++) {
            newArr[i]= addedArr[i];
        }
        newArr[newArr.length-1]= addedNumber;
        return newArr;
    }
}
