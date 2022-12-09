package Java_Education.day07_nestedIf;

import java.util.Scanner;

public class Day07_NestedIfElseStatement3 {
    public static void main(String[] args) {
        // Question 1
        //Get the gender and age from the user. Female, 60 years old and over, Men 65 years
        //and older can retire. Print “You can retire” or “You need to work .. more years to retire”,
        //taking into account gender and age.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your gender F/M");
        char gender= scan.next().charAt(0);
        System.out.println("Please enter your age");
        int age= scan.nextInt();

        // for using nested if-else, we should first choose the main variable
        // and build the main structure
        // gender is the main variable

        if (gender=='f' || gender=='F'){

            if (age<15){
                System.out.println("Invalid age entrance");
            } else if (age<60) {
                System.out.println("You cannot retire. You need to work " +(60-age) +" years for retirement");
            }else {
                System.out.println("You can retire");
            }
        } else if (gender=='m' || gender=='M') {

            if (age<15){
                System.out.println("Invalid age entrance");
            } else if (age<65) {
                System.out.println("You cannot retire. You need to work " +(65-age) +" years for retirement");
            }else {
                System.out.println("You can retire");
            }
        }else{
            System.out.println("Invalid gender entrance");
        }
    }
}
