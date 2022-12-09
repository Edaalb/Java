package Java.day02_dataTypes_scanner;

import java.util.Scanner;

public class Day02_Scanner2 {
    public static void main(String[] args) {

        // Question 2- Take a double and an int number from the user
        // and print their addition and multiplication.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a decimal number");
        double decimalNumber= scan.nextDouble();
        System.out.println("Please enter a whole number");
        int wholeNumber= scan.nextInt();
        System.out.println("Total of the entered numbers : " + (decimalNumber+wholeNumber));
        System.out.println("Multiplication of the entered numbers : "+ (decimalNumber*wholeNumber));
    }
}
