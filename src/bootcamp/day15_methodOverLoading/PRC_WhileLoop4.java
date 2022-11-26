package bootcamp.day15_methodOverLoading;

import java.util.Scanner;

public class Day15_WhileLoop4 {
    public static void main(String[] args) {
        /*Question : Ask the
           User for a password from the User
           Print the error message for the passwords that do not meet the following conditions
           and ask the user to enter a new password
           Repeat this process until a valid password is typed, print "your password has been successfully saved"
           when a valid password is typed
           Conditions :
           the first character of the password should be a lowercase
           last character of the password should be a number
         */
        Scanner scan= new Scanner(System.in);
        boolean isPasswordValid=false;
        String password="";
        int flag=0;
        while(isPasswordValid!=true){
            System.out.println("Please enter your password");
            password=scan.nextLine();
            flag=0;
            if (!(password.charAt(0)>='a' && password.charAt(0)<='z')){
                System.out.println("Password's first character must be lowercase");
                flag++;
            }
            if (!(password.charAt(password.length()-1)>='0' && password.charAt(password.length()-1)<='9' )){
                System.out.println("Passwords last character must be number");
                flag++;
            }
            if (password.length()<8){
                System.out.println("Password must be at least 8 character");
                flag++;
            }
            if (flag==0){
                isPasswordValid=true;
                System.out.println("Your password successfully recorded");
            }
        }
    }
}
