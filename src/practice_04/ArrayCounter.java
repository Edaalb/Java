package practice_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_01_ArrayCounter {

        public static void main(String[] args) {

            /*Write a Java program to find a number that appears only once in a given array of
            integers, all numbers occur twice. */

            List<Integer> arrayElements= createList();
            System.out.println(arrayElements);

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the number you want to find in the array");
            int desiredNumber = scan.nextInt();
            int arr[]= {};

            findElement(arr,desiredNumber);
        }
        public static void findElement(List<Integer> arrayElements) {

            // print how many times the desired element occurs in the list
        }
        public static void findElement(int[] arr, int desiredNumber){

            int count=0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i]==desiredNumber){

                    count++;
                }
            }
            if (count==0){
                System.out.println("Desired number cannot be found in the array");
            }else{
                System.out.println("Desired number " + desiredNumber + " has been found " + count + " times in the array.");
            }
        }
        public static List<Integer> createList(){

            List<Integer> arrayElements= new ArrayList<>(); // Create a list to add elements
            Scanner scan= new Scanner(System.in); // Take elements from the user

            int enteredNumber=5;

            while (enteredNumber > 0){ // as long as the user not press 0, loop will continue
                System.out.println("Please enter a a number to add the list" +
                        "\nPress 0 to finish adding number"); // required information for the user
                enteredNumber= scan.nextInt(); // takes the numbers to be added from the user

                if (enteredNumber > 0){ // checks again if the value is 0 or not
                    arrayElements.add(enteredNumber); // if the entered number is not "0", Java adds the number to the list
                }
            }

            return arrayElements;
        }
    }



