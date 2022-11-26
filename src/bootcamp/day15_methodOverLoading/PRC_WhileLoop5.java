package bootcamp.day15_methodOverLoading;

import java.util.Scanner;

public class Day15_WhileLoop5 {
    public static void main(String[] args) {

        // Ask the user for a number and the power he wants to calculate. Create a method that
        // calculates and prints the desired power of the given number using the while loop.

        // Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number and its power to be calculated");
        int number= scan.nextInt();
        int power= scan.nextInt();

        calculatePower(number,power);
    }
    public static void calculatePower(int number, int power){
        int result=1;
        while (power>0){
            result *=number;
            power--;
        }
        System.out.println(result);
    }
}
