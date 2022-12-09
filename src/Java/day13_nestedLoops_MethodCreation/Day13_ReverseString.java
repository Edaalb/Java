package Java.day13_nestedLoops_MethodCreation;

import java.util.Scanner;

public class Day13_ReverseString {

    public static void main(String[] args) {

        //Question 10 (interview)
        //Ask the user for a String and reverse the String and save it.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please write a sentence");
        String input= scan.nextLine();

            String reverseInput="";
            for (int i = input.length()-1; i >=0 ; i--) {
                reverseInput += input.substring(i , i+1);
            }
            System.out.println("The reverse version of the sentence : " + reverseInput); // reisae gnitteg si avaJ
        }
    }
