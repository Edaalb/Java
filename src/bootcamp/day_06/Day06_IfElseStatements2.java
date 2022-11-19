package bootcamp.Day_05;

import java.util.Scanner;

public class Day05_IfElseStatements2 {
    public static void main(String[] args) {

        // Question 1- Get the 3 sided length of a triangle from the user, print “Equilateral triangle”
        // if the triangle is equilateral, otherwise print “Not equilateral”.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 sides of the triangle");
        int side1= scan.nextInt();
        int side2= scan.nextInt();
        int side3= scan.nextInt();
        if (side1==side2 && side2==side3){
            System.out.println("Equilateral triangle");
        } else {
            System.out.println("Not equilateral");
        }
    }

}
