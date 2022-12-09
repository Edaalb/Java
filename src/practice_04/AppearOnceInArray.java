package practice_04;

import java.util.Scanner;

public class Q_01_AppearOnceInArray {
    /*Write a Java program to find a number that appears only once in a given array of
    integers, all numbers occur twice. */

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number you want to find in the array");
        int desiredNumber = scan.nextInt();

        findElement(arr,desiredNumber);

    }
    public static void findElement(int[] arr, int desiredNumber){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==desiredNumber){
                count++;
            }
        }
        if (count==0){
            System.out.println("Desired number is not available in the array");
        }else{
            System.out.println("Desired number " + desiredNumber + " has been found " + count + " times in the array.");
        }
    }
}
