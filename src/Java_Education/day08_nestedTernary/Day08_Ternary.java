package Java_Education.day08_nestedTernary;

import java.util.Scanner;

public class Day08_Ternary {
    public static void main(String[] args) {
        // Question 2
        //Get 3 side lengths of triangle from the user, print “Equilateral triangle” if the triangle is
        //equilateral, otherwise print “Not equilateral”.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter three lengths of the triangle");

        int side1=scan.nextInt();
        int side2=scan.nextInt();
        int side3=scan.nextInt();

        System.out.println(side1>0 && side2>0 && side3>0 && side1==side2 && side2==side3
                ? "Equilateral triangle"  : "Not equilateral");

        // Question 5 - Get two numbers from the user and print the smaller number

        System.out.println("Please enter two numbers");
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        System.out.println("The smaller number is : " + (number1>number2 ? number2 : number1));
    }
}
