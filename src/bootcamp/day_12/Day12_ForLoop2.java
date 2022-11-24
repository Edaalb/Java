package bootcamp.day_12;

public class Day12_ForLoops2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // Print the 2-digit numbers divisible by 7 side by side.
        for (int i = 10; i <100 ; i++) {
            if (i%7==0) System.out.print(i +" ");
        }
        System.out.println("");
        // Print the numbers starting at 13 and increasing by 7 by 7 up to 100
        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println("");
        // Print the squares of numbers from 1 to 10 (including borders)
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*i + " ");
        }
    }
}
