package Java.day19_arrays;

import java.util.Arrays;

public class EN_StringSplitMethod {
    public static void main(String[] args) {


        String str = "Java is very very very beautiful";

        // let's find how many "e" it has

        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [J, a, v, a,  , i, s,  , v, e, r, y,  , v, e, r, y,  , v, e, r, y,  , b, e, a, u, t, i, f, u, l]

        int counter =0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals("e")){
                counter++;
            }

        }
        if (counter==0){
            System.out.println(" no e in the array");
        } else if (counter>0) {
            System.out.println("array has e "+counter+" times"); //array has e 4 times

        }

        System.out.println("--------------------------------");

        //"Java is very very very beautiful"
        arr = str.split("e");
        System.out.println(Arrays.toString(arr)); // [Java is v, ry v, ry v, ry b, autiful]
        System.out.println("There are "+(arr.length-1) + " e in the array");  //there are 4 e in the array



    }
}
