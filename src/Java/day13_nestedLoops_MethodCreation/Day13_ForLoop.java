package Java.day13_nestedLoops_MethodCreation;

public class Day13_ForLoop {

    public static void main(String[] args) {

        //Question 9 (interview)
               // Ask the user for a String and print the String in reverse.

        String input="How beautiful is Java";
        //avaJ si lufituaeb woH

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
