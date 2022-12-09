package Java.day16_doWhile;

public class PRC_DoWhileLoop {
    public static void main(String[] args) {
        // Create a while loop adding numbers 7, 8, 9

        int number=7;
        int total=0;

        do {
            total= total+number;
            number++;
        }while(number<=9);

        System.out.println(total);
        /*
        Do while loop has 2 advantages

        1- Loop body runs at least one time
            (if the starting value of while loop is not suitable, loop body may never run)

        2- While ending control runs as many as loop
          (it runs one more time in while loop)
         */
    }
}
