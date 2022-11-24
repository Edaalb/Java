package practice_02;

import java.util.Scanner;

public class Q_02_CatsAndDogs {
    //Question 2
    //Cats and Dogs
    //Print true if the string _"cat"_ and _"dog"_
    // appear the same number of times in the given string _word_.
    //Example:
    //```
    //input: catdog
    //output: true
    //```
    //Example:
    //```
    //input: catcat
    //output: false

    public static void main(String[] args) {

        String[] arr= {"Cat", "Dog"};

        System.out.println("Please write a sentence ");
        Scanner scan= new Scanner(System.in);
        String sentence= scan.nextLine();

        String wantedItem1="Cat";
        String wantedItem2="Dog";

        findItem(arr,wantedItem1 + wantedItem2);

        }

    private static void findItem(String[] arr, String wantedItem) {
       int count=0;

       for (int i = 0; i < arr.length ; i++){

           if (arr[i]==wantedItem ) {

               count++;
           }
       }

       if (count==0){

           System.out.println("False");
       }else {
           System.out.println("Wanted item " + wantedItem + " is used " + count + " time");
       }

           }
       }

