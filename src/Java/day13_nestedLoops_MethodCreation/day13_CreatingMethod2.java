package Java.day13_nestedLoops_MethodCreation;

import java.util.Scanner;

public class day13_CreatingMethod2 {
    public static void main(String[] args) {
        /*
          Create a method that takes 2 numbers from the user and prints their sum
         */
        takeAddPrint();
        takeAddPrint();
    }
    public static void takeAddPrint(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double number1= scan.nextDouble();
        double number2= scan.nextDouble();
        System.out.println("Sum of the entered numbers : " + (number1+number2));
    }

}
