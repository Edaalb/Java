package Java.day08_nestedTernary;

import java.util.Scanner;

public class Day08_Ternary1 {
    public static void main(String[] args) {

        // take a whole number from the user
        // if the number is positive, print twice of the number
        // if the number is not positive print number by adding 10

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        double number= scan.nextDouble();
        if (number>0){
            System.out.println(number*2);
        }else {
            System.out.println(number+10);
        }
        //with ternary
        System.out.println(number>0 ? 2*number : number+10);
    }
}
