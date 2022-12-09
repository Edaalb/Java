package Java.day21_arrayLists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRC_Fibonacci {
    public static void main(String[] args) {

        // Take a positive whole number from the user,
        // print the smaller Fibonacci numbers of that whole number as a list

        // Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci
        // sayilarini bir liste olarak yazdirin
        //
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 .....

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive whole number");
        int enteredNumber= scan.nextInt();
        if (enteredNumber<0 ){
            System.out.println("You need to enter a whole number greater than 0 for the Fibonacci series");
        }else if(enteredNumber==0) {
            System.out.println("There is no Fibocanni number smaller than 0");
        } else if (enteredNumber==1) {
            System.out.println("There is only one Fibocanni number smaller than 1 : 0");
        }else {
            printFibocanniNumbers(enteredNumber);
        }
    }
    public static void printFibocanniNumbers(int enteredNumber) {
        // buraya geldiyse girilen sayi 1'den buyuktur
        List<Integer> fibonacciList= new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        fibonacciList.add(1);
        int newFibonacciNumber=0;
        int index=3; // ilk 3 eleman 0 1 1 oldugu icin 3.index'e geldik
        while (newFibonacciNumber<enteredNumber){
            newFibonacciNumber= fibonacciList.get(index-2) + fibonacciList.get(index-1);
            if (newFibonacciNumber<enteredNumber){
                fibonacciList.add(newFibonacciNumber);
            }
            index++;
        }
        System.out.println(fibonacciList);
    }
}
