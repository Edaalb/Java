package bootcamp.day_02;

import java.util.Scanner;

public class Day02_Scanner5 {
    public static void main(String[] args) {

        //Question 7 - (Interview) - Take two numbers from the user and change their values (swap).

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first whole number");
        int number1= scan.nextInt();
        System.out.println("Please enter the second whole number");
        int number2 = scan.nextInt();
        int empty;

        empty= number2;
        number2=number1;
        number1=empty;

        System.out.println("value of the number1 : " + number1);
        System.out.println("value of the number2 : " + number2);
            }
        }

