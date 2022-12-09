package Java_Education.day02_dataTypes_scanner;

import java.util.Scanner;

public class Day02_Scanner3 {

    public static void main(String[] args) {

        // Question 4- Get 2 sides' length of a rectangle
        // and print the area of the rectangle.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 2 sides' length of the rectangle " +
                "\n"+"click enter between the lenght of the two sides");

        double side1= scan.nextDouble();
        double side2= scan.nextDouble();

        System.out.println("dikdortgenin alani : " + (side1*side2));

    }
}
