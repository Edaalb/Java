package bootcamp.day14_methodCreatins;

import java.util.Scanner;

public class Day14_Multiplication {

    // Get two numbers from user in main method
    // Create a method that accepts these two numbers as parameters
    // and returns their multipliers in the main method.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double number1= scan.nextDouble(); // 5
        double number2= scan.nextDouble(); // 3
        System.out.println(multiplicationMethod(number1, number2)); // 15.0
        double multiplicationResult= multiplicationMethod(6,2); // 12.0
    }
    public static double multiplicationMethod(double number1, double number2){
        System.out.println("Multiplication method runs");
        return number1*number2;
    }
}
