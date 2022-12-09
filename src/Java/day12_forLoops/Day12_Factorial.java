package Java.day12_forLoops;

public class Day12_Factorial {
    public static void main(String[] args) {
        // Let's find the factorial of the number entered by the user
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120
        int number = 10;
        int factorial= 1;
        for (int i = number; i >=1; i--) {
            factorial= factorial*i ;
        }
        System.out.println(factorial);
        // Add numbers from 1 to 100 (including borders)
        int total=0;
        for (int i = 1; i <=100 ; i++) {
            total=total+i;
        }
        System.out.println(total);
    }
}
