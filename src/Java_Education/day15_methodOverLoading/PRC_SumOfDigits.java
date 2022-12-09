package Java_Education.day15_methodOverLoading;

import java.util.Scanner;

public class PRC_SumOfDigits {

    // Find the sum of digits of the number received from the user using the while loop.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter numbers");
        int number= scan.nextInt();
        int onesDigit=0;
        int sumOfDigits=0;
        while(number!=0){
            onesDigit=number%10;
            sumOfDigits += onesDigit;
            number /= 10 ;
        }
        System.out.println("Sum of Digits: " + sumOfDigits);
    }


}
