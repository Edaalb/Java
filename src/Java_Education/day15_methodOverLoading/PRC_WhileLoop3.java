package Java_Education.day15_methodOverLoading;

import java.util.Scanner;

public class PRC_WhileLoop3 {
        public static void main(String[] args) {
        /*
          Ask the user for numbers to be collected , if the total is 500 or exceeds ,
          print the numbers and totals of the numbers and print "it's enough" .
         */
            Scanner scan = new Scanner(System.in);
            double enteredNumber = 0;
            double total = 0;
            int count = 0;
            while (total < 500) {

                System.out.println("Enter numbers to be added");
                enteredNumber = scan.nextDouble();
                total += enteredNumber;
                count++;
            }
            System.out.println("Entered " + count + " numbers sum exceeds : " + total + ". It's enough");

        }
}
