package Java.day16_doWhile;

public class PRC_WhileLoop {
    public static void main(String[] args) {

        // Create a while loop adding numbers 7, 8, 9

        int number = 7;
        int total = 0;
        while (number <= 9) {
            total += number;
            number++;

            System.out.println(total);
        }
        // In while loop control comes first and operation next

        /*
          There can occur two kinds of problem in while loop
          1- As we control first, then do the operation, we may need to make another control in body

          2- While ending condtion is checked one more time than number of operation

          3- If we create a variable to check the values before while loop,
             we need to make that assignment carefully.
             Incorrect assignment may cause while loop broke.
         */
    }
}
