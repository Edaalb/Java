package Java_Education.day09_stringManipulations;

public class Day09_SM_equals {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3= new String("Ali");
        String str4= "Ali";
        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // true
        /*
          == may not give the wanted result while comparing Strings
          In Strings to compare if the texts are same
          equals() is used insteas of ==
         */
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
    }
}
