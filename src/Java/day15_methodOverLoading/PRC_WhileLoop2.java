package Java.day15_methodOverLoading;

import java.util.Scanner;

public class PRC_WhileLoop2 {
    public static void main(String[] args) {
        /*
        Ask the user for positive integers to be added.
        Ask the user to press 0 when he wants to finish.
        Print the total number of positive integers entered and their sum.

        Kullanicidan toplanmak uzere tamsayilar alin, kullanici 0'a basarsa sayi alma islemini bitirin
        kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin
         */
        Scanner scan= new Scanner(System.in);

        int enteredNumber=5;  // given number for this question cannot be 0 as it will be used to finish the loop

        int count=0;
        int total=0;
        while(enteredNumber != 0){
            System.out.println("Please enter number to be added" +
                    "\nPress 0 to finish");
            enteredNumber= scan.nextInt();
            if (enteredNumber != 0){
                count++;
                total=total+enteredNumber;
            }
        }
        System.out.println("Entered "+ count +" numbers total are : " + total);
    }
}
