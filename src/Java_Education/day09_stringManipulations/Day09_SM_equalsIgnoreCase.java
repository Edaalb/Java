package Java_Education.day09_stringManipulations;

public class Day09_SM_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1= "Ali";
        String str2= "ali";
        String str3= "ALI";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase("Ali Can")); // false
        /*
         equalsIgnoreCase accepts that the different writings which are created by using lowercase and uppercase are same
         so, ali, ALI, ALi, AlI, aLI, alI are all same for equalsIgnoreCase
         but if the word has differences it does not tolerate it

         a and  ile ali are not equal to each other
         ali and ALI.are not equal to each other
         */
    }
}
