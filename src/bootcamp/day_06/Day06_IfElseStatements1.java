package bootcamp.Day_05;

import java.util.Scanner;

public class Day05_IfElseStatements1 {
    public static void main(String[] args) {

        // Question 4- Get each length of a triangle’s 3 sides from the user,
        // and if the triangle is equilateral, print "Equilateral Triangle".

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 sides of the triangle");
        int side1= scan.nextInt();
        int side2= scan.nextInt();
        int side3= scan.nextInt();

        if (side1==side2  && side2==side3){
            System.out.println("Equilateral Triangle");
        }
    }

}
