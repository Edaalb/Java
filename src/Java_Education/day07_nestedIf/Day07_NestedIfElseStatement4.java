package Java_Education.day07_nestedIf;

import java.util.Scanner;

public class Day07_NestedIfElseStatement4 {

        public static void main(String[] args) {

            // Question 2
            //Get the number and list price of the product purchased from the user, and ask the
            //user if they have a customer card. If there is a customer card, give a 20% discount if he
            //buys more than 10 products, 15% if he does not have a customer card, if he does not
            //have a customer card, give a 15% discount if he buys more than 10 products, and if he
            //does not have a customer card, give a 10% discount

            Scanner scan= new Scanner(System.in);
            System.out.println("Please enter the number of products you purchased");
            int productNumber = scan.nextInt();
            System.out.println("Do you have card? True/False");
            boolean hasACard = scan.nextBoolean();
            System.out.println("Please enter the list number of the products");
            double listPrice = scan.nextDouble();
            double totalPrice = 0;
            // main variable is card

            if (hasACard){
                // with card
                if (productNumber<0){
                    System.out.println("Invalid product number entrance");
                } else if (productNumber<10) {
                    totalPrice= productNumber*listPrice*0.85;
                    System.out.println("Total price with 15% off : $" + totalPrice);
                }else{
                    totalPrice= productNumber*listPrice*0.80;
                    System.out.println("Total price with 15% off : $" + totalPrice);
                }
            } else {
                // without card
                if (productNumber<0){
                    System.out.println("Invalid product number entrance");
                } else if (productNumber<10) {
                    totalPrice= productNumber*listPrice*0.90;
                    System.out.println("Total price with 15% off : $" + totalPrice);
                }else{
                    totalPrice= productNumber*listPrice*0.85;
                    System.out.println("Total price with 15% off : $" + totalPrice);
                }

            }
        }
    }


