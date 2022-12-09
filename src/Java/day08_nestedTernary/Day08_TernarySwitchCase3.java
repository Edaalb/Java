package Java.day08_nestedTernary;

import java.util.Scanner;

public class Day08_TernarySwitchCase3 {
    public static void main(String[] args) {

        // Question: Get the month number from the user and print the season.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a month number");
        int monthNo= scan.nextInt();
        switch (monthNo){
            case 12 :
            case 1  :
            case 2  :
                System.out.println("Winter");
                break;
            case 3 :
            case 4  :
            case 5  :
                System.out.println("Spring");
                break;
            case 6 :
            case 7  :
            case 8  :
                System.out.println("Summer");
                break;
            case 9  :
            case 10 :
            case 11 :
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
