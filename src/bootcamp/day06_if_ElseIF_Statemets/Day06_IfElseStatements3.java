package bootcamp.day_06;

import java.util.Scanner;

public class Day06_IfElseStatements3 {
    public static void main(String[] args) {

        // Question 4 - Ask the user to enter a character,
        // print whether the entered character is uppercase or not.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character");
        char chr=scan.next().charAt(0);
        if (chr >='A' && chr <='Z'){
            System.out.println("Uppercase");
        }else {
            System.out.println("Not uppercase");
        }
    }

}
