package Java.day04_incremets_decrements;

import java.util.Scanner;

public class Day03_IncrementDecrement1 {
    public static void main(String[] args) {

        // Write a code that gives the digit total of a 4 digits number the user printed

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 4 digits number");

        int input = scan.nextInt();
        int onesDigit;
        int digitsTotal = 0;

        // 1- take ones digit
        onesDigit = input % 10; // 3
        // 2- add the digits total in ones digit
        digitsTotal = digitsTotal + onesDigit; // 3
        // 3- get rid off ones digit
        input = input / 10; // 145
        onesDigit = input % 10; // 5
        digitsTotal = digitsTotal + onesDigit; // 8
        input = input / 10; // 14
        onesDigit = input % 10; // 4
        digitsTotal = digitsTotal + onesDigit; // 12
        input = input / 10; // 1
        onesDigit = input % 10; // 1
        digitsTotal = digitsTotal + onesDigit; // 13
        input = input / 10; // 0
        System.out.println("The digit total of the given numbers : " + digitsTotal);
    }
}

