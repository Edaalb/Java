package Java.day02_dataTypes_scanner;

import java.util.Scanner;

public class Day02_Scanner4 {
    public static void main(String[] args) {

        // Question 3- Take the user's name, surname and age, then print it in below format.
        //      Your Name : John
        //      Your Surname : Doe
        //      Your Age : 44
        //      Your record successfully  updated.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");

        // next() takes the part until space
        // nextLine() takes the whole information in the line

        String name= scan.nextLine();
        System.out.println("Please enter your surname");
        String surname= scan.nextLine();
        System.out.println("Please enter your age");
        double age= scan.nextDouble();
        System.out.println("Your name : " + name +"\nyour surname : "+ surname+
                "\nyour age : "+ age + "\nYour record successfully  updated.");
    }
}
