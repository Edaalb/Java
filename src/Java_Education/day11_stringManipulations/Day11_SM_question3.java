package Java_Education.day11_stringManipulations;

import java.util.Scanner;

public class Day11_SM_question3 {
    public static void main(String[] args) {
        // Question 4 :
        //Ask the user for a password,
        // check the following terms and tell the user any missing terms that need to be corrected,
        // if it satisfies all conditions, print "password saved successfully"
        //the first letter must be lowercase
        //the last character must be a number
        //the password must not contain spaces
        //the length must be at least 10 characters

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a password");
        String password= scan.nextLine();
        int flag=0;

        if (!(password.charAt(0)>='a' && password.charAt(0)<='z')){
            System.out.println("the first letter must be lowercase");
            flag++;
        }
        if (!(password.charAt(password.length()-1)>='0' && password.charAt(password.length()-1)<='9')){
            System.out.println("the last character must be a number");
            flag++;
        }
        if (password.contains(" ")){
            System.out.println("the password must not contain spaces");
            flag++;
        }
        if (!(password.length()>=10)){
            System.out.println("the length must be at least 10 characters");
            flag++;
        }
        if (flag==0){
            System.out.println("Your password successfully recorded");
        }
    }
}
