package Java.day05_increments_ifElseStatements;

import java.util.Scanner;

public class Day05_IfStatements1 {
    public static void main(String[] args) {

        // take two numbers from the user
        // if the first number is greater than 100, print "the first number is greater than "100"
        // if the second number is an even number, print "second number is an even number"
        // if the first number is greater than the first number, print "the first number is greater"

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter two whole numbers");

        int s1= scan.nextInt();
        int s2= scan.nextInt();

        // if the first number is greater than 100, print "the first number is greater than "100"

        if (s1>100) {
            System.out.println("the first number is greater than 100");
        }
            //  if the second number is an even number, print "second number is an even number"
         if (s2%2==0){
            System.out.println("second number is an even number");
        }
        // if the first number is greater than the first number, print "the first number is greater"
        if (s1>s2){
            System.out.println("the first number is greater");
        }
    }
}
