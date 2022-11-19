package bootcamp.day_08;

import java.util.Scanner;

public class Day08_SwitchCase1 {
    public static void main(String[] args) {

        // Question 3
        //Get the day number from the user and print the day name

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a day number");
        int dayNo= scan.nextInt();

        /*
        if (dayNo==1){
            System.out.println("Monday");
        } else if (dayNo==2){
            System.out.println("Tuesday");
        }else if (dayNo==3){
            System.out.println("Wednesday");
        }else if (dayNo==4){
            System.out.println("Thursday");
        }else if (dayNo==5){
            System.out.println("Friday");
        }else if (dayNo==6){
            System.out.println("Saturday");
        }else if (dayNo==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid day number");
        }
         */
        switch (dayNo){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid day number");
        }
    }
}
