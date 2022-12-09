package Java.day16_doWhile;

import java.util.Scanner;

public class PRC_DoWhile {
    public static void main(String[] args) {
        // Ask the user for a positive number,
        // find out if the number is a perfect square,
        // if it is a perfect square print true
        // if not print false.
        //  Example :  input : 16, output: 4
        // sayının tam kare olup olmadığını bulunuz,

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int input= scan.nextInt();
        int starting=1;
        int flag=0;
        do{
            if (starting*starting==input){
                System.out.println("true");
                flag++;
                break;
            }
            starting++;
        }while(starting*starting<=input);

        if (flag==0){
            System.out.println("false");
        }
    }
}
