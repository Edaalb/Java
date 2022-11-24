package practice_01;

import java.util.Scanner;

public class Q_01_FindMidNum {
    /*Question 1:
    FindMidNumberWrite a program that will return mid number out of three numbers.  No need to do any calculations.1. Create an object of Scanner class.2. Declare int 3 variables: num1, num2, num3.Example:```
    Enter first number:
            14
    Enter second number:
            52
    Enter third number:
            25Medium value is: 25 (edited)*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int no1 = scan.nextInt();

        System.out.println("Please enter the 2nd number");
        int no2 = scan.nextInt();

        System.out.println("Please enter the 3rd number");
        int no3 = scan.nextInt();

        if ((no1 > no2 && no1 < no3) || (no1 > no3 && no1 < no2)) {
            System.out.println("Medium Value is No1");

        } else if ((no2 > no1 && no2 < no3) || (no2 > no3 && no2 < no1)) {
            System.out.println("Medium Value is No2");
        } else
            System.out.println("Medium Value is No3");
    }
}
