package practice_03;

import java.util.Scanner;

public class Q_03_Fibonacci {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter a number");

            int number = 0;
            try {
                number = scan.nextInt();
            } catch (Exception e) {
                System.out.println("please enter positive number and do not enter another charter");
            }

            if (number >= 2)
                fibonacciNumber(number);
        }

        public static void fibonacciNumber(int nmbr) {

            int firstNumber = 0;
            int secondNumber = 1;
            int thirdNumber = 0;

            System.out.print("" + firstNumber + " " + secondNumber);

            for (int i = 0; i < nmbr - 1; i++) {
                thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                System.out.print(" " + thirdNumber);
            }
            System.out.println("--> " + thirdNumber);
        }
    }
