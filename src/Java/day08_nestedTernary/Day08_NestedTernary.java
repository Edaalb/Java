package Java.day08_nestedTernary;

import java.util.Scanner;

public class Day08_NestedTernary {
    public static void main(String[] args) {

        // Example : Get an integer from the user.
        //If the number is positive, print an even number or not an even number, as appropriate
        //If the number is not positive, print the appropriate 3
        //digit or not 3 digit option

        Scanner scan= new Scanner(System.in);
        System.out.println("Please write an Integer");
        int number=scan.nextInt();

        if (number>0){
            //write the appropriate options of even number or not

            System.out.println(number%2==0 ? "Even number" : "Not an even number");
        }else {

            // write the appropriate options of digit or not 3 digit option
            System.out.println(number<-99 && number>-1000 ? "Three digits" : "Not three digits");
        }
        String result = number>0
                ?
                number%2==0 ? "Even number" : "Not an even number"
                :
                number<-99 && number>-1000 ? "Three digits" : "Not three digits";
    }
}
