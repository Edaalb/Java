package bootcamp.day_11;

import java.util.Scanner;

public class Day11_SM_question1 {
    //Question 1 :
    //Get a sentence from the user
    //if the sentence includes home, print "home home sweet home"
    //if the sentence includes work, "good to work"
    //if it includes both "You have home and work"
    //if it contains neither, print "you need to work hard"

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please write a sentence");

        String sentence= scan.nextLine();
        String copySentence=sentence.toLowerCase();

        if (copySentence.contains("home") && copySentence.contains("work")){
            System.out.println("You have home and work");
        } else if (copySentence.contains("home")) {
            System.out.println("home home sweet home");
        } else if (copySentence.contains("work")) {
            System.out.println("good to work");
        }else {
            System.out.println("you need to work hard");
        }

    }
}
