package Java_Education.day07_nestedIf;

import java.util.Scanner;

public class Day07_NestedIfElseStatement2 {
    public static void main(String[] args) {
        //Question 3
        //Get the number of products purchased from the user and the list price, and ask the
        //user if they have a customer card. If the customer has a card and buys more than 10 items,
        //20% off, otherwise 15% off.
        //If the costumer does not have a card, 15% off if he buys more than 10 products,
        // 10% off if he does not

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the numbers of products you purchased");
        int numberOfProducts= scan.nextInt();
        System.out.println("Please enter the list price");
        double listPrice= scan.nextDouble();
        System.out.println("Do you have a card? If yes write 'True', if not write 'false'");
        boolean hasACard= scan.nextBoolean();

        double totalPrice=0;

        if (hasACard && listPrice>=10){
            totalPrice= numberOfProducts*listPrice* (0.8);
            System.out.println("Total price with 20% off : " + totalPrice);
        } else if (hasACard && numberOfProducts<10 && numberOfProducts>0) {
            totalPrice=numberOfProducts*listPrice*(0.85);
            System.out.println("Total price with 15% off: " + totalPrice);
        } else if (!hasACard && numberOfProducts>=10) {
            totalPrice=numberOfProducts*listPrice*(0.85);
            System.out.println("Total price with 15% off: : " + totalPrice);
        } else if (!hasACard && numberOfProducts<10 && numberOfProducts>0) {
            totalPrice=numberOfProducts*listPrice*(0.9);
            System.out.println("%Total price with 10% off : " + totalPrice);
        }else {
            System.out.println("Invalid Entrance");
        }
    }
}
