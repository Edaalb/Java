package bootcamp.day_13;

public class Day13_NestedForLoop1 {

    public static void main(String[] args) {

        // Let's create a multiplication table for numbers 1-4

        // outer loop checks rows
        for (int i = 1; i <=5 ; i++) {
            // inner loop checks for values in each row
            for (int j = 1; j <=5 ; j++) {
                System.out.print(i*j + " " );
            }
            // when the inner loop is finished, we have to lower the java to the bottom line
            System.out.println("");
        }
    }
}
