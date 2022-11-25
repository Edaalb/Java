package bootcamp.day_19;

import java.util.Arrays;

public class Day19_AssigningNewValue {
    public static void main(String[] args) {

        String str= "java";
        str="hava";

        //We cannot change the array's lenght BUT we can add new value to an array

        // 1- We can assign an available to another array
        String [] arr1={"Ali","Veli"};
        String [] arr2={"A","B","C"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1)); // [A, B, C]

        // 2- We can assign a new empty array in any length
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1)); //  [null, null, null, null, null, null]

        // 3- We can assign to a newly created array by writing {} value in it.
        //    But we cannot use {} to assign value to an avaliable array
        // arr1={"g","h"}; is not possible

        int[] arr = {3,4,5};
    }
}
