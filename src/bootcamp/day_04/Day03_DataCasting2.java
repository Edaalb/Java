package bootcamp.day_04;

import java.util.Scanner;

public class Day03_DataCasting2 {
    public static void main(String[] args) {

        // Question 4- Take two double numbers from the user,
        // divide the first number to the second number and print the result as a whole number.


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");

        double number1= scan.nextDouble();
        double number2= scan.nextDouble();
        int resultOfTheDivisionWholeNumber= (int)(number1/ number2) ;
        System.out.println(resultOfTheDivisionWholeNumber);
    }
}


