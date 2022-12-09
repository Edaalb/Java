package Java_Education.day09_stringManipulations;

public class Day09_SM_charAt {
    public static void main(String[] args) {

        String str= "Java is Love";
        System.out.println(str.charAt(0)); // gives the first letter J
        System.out.println(str.charAt(5)); // gives the char on 5th i
        System.out.println(str.charAt(11)); // prints the las charchter e
        /*
          In a text, there is only 1 difference between the chrachter number and last index

          for this text number of charachters are 11
                         last index is 11.
         */
        // System.out.println(str.charAt(12)); // StringIndexOutOfBoundsException
    }
}
