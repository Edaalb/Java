package practice_02;

import java.util.Scanner;

public class Q_02_CatsAndDogs2 {
    //Question 2
    //Cats and Dogs
    //Print true if the string _"cat"_ and _"dog"_
    // appear the same number of times in the given string _word_.
    //Example:
    //```
    //input: catdog
    //output: true
    //```
    //Example:
    //```
    //input: catcat
    //output: false

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please write a sentence");
        String sentence= scan.nextLine();
        String copySentence=sentence.toLowerCase();

        if (copySentence.contains("cat") && copySentence.contains("dog")){
            System.out.println("True");
        } else if (copySentence.contains("dog") && copySentence.contains("cat")) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }






    }
}
