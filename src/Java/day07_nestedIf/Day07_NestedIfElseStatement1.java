package Java.day07_nestedIf;

import java.util.Scanner;

public class Day07_NestedIfElseStatement1 {
    public static void main(String[] args) {
        // Question 2
        //Ask for the user's weight (kg) and height (cm) and calculate the body mass index
        //(weight * 10000 / (height * height)) if the body mass index is greater than 30 obese,
        //between 25 30 overweight, between 20 25 normal, if less than 20 print thin

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your weight as kg");
        double weight= scan.nextDouble();
        System.out.println("Please enter your height as cm");
        double height= scan.nextDouble();
        double bmi= (weight*10000 / (height * height));
        System.out.println("Your body mass index : " +bmi);
        if (bmi>30){
            System.out.println("Obese");
        } else if (bmi>25) {
            System.out.println("overweight");
        } else if (bmi>20) {
            System.out.println("normal");
        } else if (bmi>0) {
            System.out.println("thin");
        }else{
            System.out.println("Invalid Entrance");
        }
    }

}
