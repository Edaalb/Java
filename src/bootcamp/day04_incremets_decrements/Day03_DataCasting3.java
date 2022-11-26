package bootcamp.day_04;

import java.util.Scanner;

public class Day03_DataCasting3 {
    public static void main(String[] args) {

        // Take two int values from the user
        // divide them to each other and print the result as double.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two whole numbers");

        int number1= scan.nextInt(); // 20
        int number2= scan.nextInt(); // 6
        System.out.println(number1/number2); //  3
        double decimalResult= (double)(number1/number2) ; //  (double)(3) ==> 3.0
        System.out.println(decimalResult); // 3.0
        double correctResult = (double)number1 / number2; // double / int ==> it gives result according to the larger one.
        System.out.println(correctResult); // 3.3333333333333335
    }
}
