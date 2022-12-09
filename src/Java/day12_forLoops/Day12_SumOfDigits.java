package Java.day12_forLoops;

import java.util.Scanner;

public class Day12_SumOfDigits {

        public static void main(String[] args) {

            // find the sum of the digits of the number entered by the user

            Scanner scan= new Scanner(System.in);
            System.out.println("Please enter numbers");
            long number= scan.nextLong();
            String numberStr= ""+number;

            long onesDigit= 0;
            long sumOfDigits=0;
            for (int i = 1; i <=numberStr.length() ; i++) {
                onesDigit=number%10;
                sumOfDigits= sumOfDigits+onesDigit;
                number=number/10;
            }
            System.out.println(sumOfDigits);
        }

    }
