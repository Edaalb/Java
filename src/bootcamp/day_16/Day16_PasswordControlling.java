package bootcamp.day_16;

import java.util.Scanner;

public class Day16_PasswordControlling {
    public static void main(String[] args) {
        /*
        Ask the user to enter a password. Check the entered password according to the following
        conditions and print the errors in the password.
        Repeat this process until the user enters a valid password and print “Your Password Accepted” when
        the valid password is entered.
           -Password must contain lowercase letter
           -Password must contain capital letter
           -Password must contain special character
           -Password must have at least 8 characters.
         */

        Scanner scan = new Scanner(System.in);
        String password;
        int flag;
        boolean isPasswordCorrect;
        do{
            System.out.println("Please enter your password");
            password= scan.nextLine();
            // if we want to get all errors
            // we need to use independent if clauses
            flag=0;
            int result = lowercaseControl(password);
            // create a method controlling lowercase
            // it prints 1 it there is lowercase, if not 0
            flag = flag+result;
            // - Password must have uppercase
            result= uppercaseControl(password);
            // create a method controlling uppercase
            // it prints 1 it there is uppercase, if not 0
            flag=flag+result;
            // - Password must contain speacial character
            result=speacialCharControl(password);
            flag=flag+result;
            // - Password must contain at keast 8 charachters
            if (password.length()<8){
                System.out.println("Password must contain at least 8 characters");
            } else {
                flag++;
            }
            // if the flag is 4, password is okay, if not there is a problem
        }while(flag != 4);
             System.out.println("Your Password Accepted");
    }
    public static int speacialCharControl(String password) {
        int flag=0;
        String specialChars = "§±@!$%^&*()_-+=?/>.<,`~#";

        // password must contain speacial characters
        // create a loop that controls all these special characters
        // if the password characters don't contain one of speacialChars String, it is enough for us

        for (int i = 0; i < password.length(); i++) {
            if (specialChars.contains(password.substring(i,i+1))){
                flag++;
                break;
            }
        }
        // if flag==0 there is no special character, so there occurs a problem. Print it.
        if (flag==0){
            System.out.println("Password must contain special character");
            return 0;
        }else return 1;
    }
    public static int uppercaseControl(String password) {
        int flag=0;
        // Password must contain lowercase
        // Create a for loop controls all these characters
        // It will be okay when we find at least one lowercase char

        for (int i = 0; i <password.length() ; i++) {
            if (password.charAt(i)>='A' && password.charAt(i)<='Z'){
                flag++;
                break;
            }
        }
        // if flag==0 there is no lowercase, so there occurs a problem. Print it.
        if (flag==0){
            System.out.println("Password must contain uppercase");
            return 0;
        }else return 1;
    }
    public static int lowercaseControl(String password) {
        int flag=0;
        // Password must contain lowercase
        // Create a loop checking all the chars
        // Finding at leasr one lowercase will be okay
        for (int i = 0; i <password.length() ; i++) {
            if (password.charAt(i)>='a' && password.charAt(i)<='z'){
                flag++;
                break;
            }
        }
        // if flag==0 there is no lowercase, so there occurs a problem. Print it.
        if (flag==0){
            System.out.println("Password must contain lowercase");
            return 0;
        }else return 1;
    }
}
