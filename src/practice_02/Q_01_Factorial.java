package Practice_02;

import java.util.Scanner;

public class Q_1_Factorial {
    //Question 1
    //Factorial
    //In mathematics a **factorial** of a positive integer _n_, denoted by _n_!,
    // is the product of all positive integers less than or equal to _n_.
    // Calculate factorial and output result to the console.
    //Example:
    //```
    //input: 5
    //output: 120
    //5 * 4 * 3 * 2 * 1

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please write a number");

        int number= scan.nextInt();
        int factorial= 1; // Don't use 0 here for not to affect multiplication result.

        for (int i = number; i >= 1; i-- ) {

            factorial= factorial*i;
        }

        System.out.println("The factorial of the number you entered is : " + factorial);

    }
}
