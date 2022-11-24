package bootcamp.day_08;

import java.util.Scanner;

public class Day08_TernarySwitchCase2 {
    public static void main(String[] args) {
        // J : Java
        // D : Devolepment
        // K : Kit
        // Take a letter from the user
        // if the taken letter is one of J, D, K, print the words above
        // it is not one of these numbers, print "Invalid letter"

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter=scan.next().charAt(0);
        switch (letter){
            case 'J' :
            case 'j' :
                System.out.println("Java");
                break;
            case 'D' :
            case 'd' :
                System.out.println("Devolepment");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Invalid letter");
        }
    }
}
