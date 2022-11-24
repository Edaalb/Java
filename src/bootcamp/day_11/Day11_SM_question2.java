package bootcamp.day_11;

import java.util.Scanner;

public class Day11_SM_question2 {
    public static void main(String[] args) {
        //Question 5 :
        //Get the user's first and last name separately.
        //-
        //if the name is longer, print the first letters of the name and surname as capitals and the rest
        //should be lowercase
        //if the surname is longer, print the first letter of the name as capital and the rest of the name
        //should be lowercase. And all of surname letters should be in capitals

        Scanner scan= new Scanner(System.in);
        System.out.println("Please write your name and surname");
        String name= scan.nextLine();
        String surname= scan.nextLine();
        String newNameSurname;

        if (name.length()>surname.length()){
            // print the first letters of the name and surname as capitals
            newNameSurname= name.substring(0,1).toUpperCase()+
                    name.substring(1).toLowerCase()+
                    " "+
                    surname.substring(0,1).toUpperCase()+
                    surname.substring(1).toLowerCase();
        }else {
            // print the first letter of the name as capital and the rest of the name
            //        //should be lowercase
            newNameSurname=name.substring(0,1).toUpperCase()+
                    name.substring(1).toLowerCase()+
                    " "+
                    surname.toUpperCase();
        }
        System.out.println(newNameSurname);
    }
}

