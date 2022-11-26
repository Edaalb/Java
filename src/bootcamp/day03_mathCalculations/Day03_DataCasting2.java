package bootcamp.day_03;

import java.util.Scanner;

public class Day03_DataCasting2 {
    public static void main(String[] args) {

        // Take a whole number from the user
        // The result on the console will be printed between -128 and +127
        // whatever the users enters

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number");

        int enteredNumber = scan.nextInt();
        byte convertedNumber = (byte) enteredNumber;

        System.out.println("The number " + "'" + enteredNumber + "'" + " you entered" + " has been converted to this number :" + convertedNumber);
    }
}

