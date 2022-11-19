package bootcamp.Day_05;

import java.util.Scanner;

public class Day05_IfStatements2 {
    public static void main(String[] args) {

        //Question 2- Take a letter from the user, print if there is month name starting with this letter
        // NOTE: No importance to uppercase or lowercase
        //When the user prints j or J, output will be January

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the first letter of the month");
        char firstLetter= scan.next().charAt(0);
        if (firstLetter=='j' || firstLetter=='J'){
            System.out.println("January or June or July");
        }
        if (firstLetter=='f' || firstLetter=='F'){
            System.out.println("February");
        }
        if (firstLetter=='m' || firstLetter=='M'){
            System.out.println("March or May");
        }
        if (firstLetter=='a' || firstLetter=='A'){
            System.out.println("April or August");
        }
        if (firstLetter=='s' || firstLetter=='S'){
            System.out.println("September");
        }
        if (firstLetter=='o' || firstLetter=='O'){
            System.out.println("October");
        }
        if (firstLetter=='n' || firstLetter=='N'){
            System.out.println("November");
        }
        if (firstLetter=='d' || firstLetter=='D'){
            System.out.println("December");
        }

    }
}
