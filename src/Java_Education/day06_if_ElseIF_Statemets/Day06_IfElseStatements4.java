package Java_Education.day06_if_ElseIF_Statemets;

import java.util.Scanner;

public class Day06_IfElseStatements4 {

    public static void main(String[] args) {

        // Question 3- Ask the user's age, print "You can retire" if he is 65 years or older,
        //otherwise print the number of years he has to work to retire.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");

        double age = scan.nextDouble();

        if (age>=65){
            System.out.println("You age is eligible for retirement ");
        }else{
            System.out.println("to retire you need to work " + (65-age) + " years");
        }
    }

}
