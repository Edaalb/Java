package bootcamp.day_18;

import java.util.Arrays;
import java.util.Scanner;

public class Day18_CreatingArrayToUser {
    public static void main(String[] args) {

        //Create a method that takes the size and elements of the array from the user
        // and creates the array and returns it to us.

        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.

        int[] userArray= createArray();
        System.out.println("The array is : " +Arrays.toString(userArray));
    }
    public static int[] createArray(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lenght of the array to be created");

        int length= scan.nextInt();
        int[] userArray= new int[length];

        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number to add the array");
            userArray[i]= scan.nextInt();
        }
        return  userArray;
    }
}
