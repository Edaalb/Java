package bootcamp;

import java.util.Scanner;

public class Day02_Scanner1 {
    public static void main(String[] args) {

        // Take the user's name and print it with uppercase

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName= scan.next();
        System.out.println(userName.toUpperCase());
    }
}
