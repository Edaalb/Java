package bootcamp.day_06;

import java.util.Scanner;

public class Day06_IfElseStatements5 {
    public static void main(String[] args) {
        /*
           if we don't use {} in if else statements, it accepts only 1 line for both if body and else body
           the next lines cannot be related with if-else
           it works in all conditions
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scan.nextInt();

        if (score >= 50) {
            System.out.println("You pass the class");
        } else {
            System.out.println("You failed");
            System.out.println("We wait for the summer school:) ");
        }
    }
}