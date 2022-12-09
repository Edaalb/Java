package Java.day22_arraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EN_DivideTheInteger {
    public static void main(String[] args) {

        // Question 6- Create a method that takes a positive integer from the user
        // and returns all positive integers that can divide the integer entered by user to us as a list.

        // Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        System.out.println("divisorsOfNumber() = " + divisorsOfNumber());
    }
    public static List<Integer> divisorsOfNumber (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value");
        int enteredValue = scan.nextInt();
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <=enteredValue ; i++) {

            if(enteredValue%i==0){

                divisors.add(i);
            }

        }
        return divisors;

    }
}
