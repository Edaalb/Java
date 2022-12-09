package Java_Education.day03_mathCalculations;

import java.util.Scanner;

public class Day03_CharDataCasting {
    public static void main(String[] args) {

        //System.out.println('a' + 'b'); // 97 + 98 = 195

        // take a char character from the user
        // print the last 3 character comes from that character
        // example input : a , output : bcd

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character");

        char enteredChr= scan.next().charAt(0);
        System.out.println(""+(char)(enteredChr+1) + (char)(enteredChr+2) + (char)(enteredChr+3));
    }
}
