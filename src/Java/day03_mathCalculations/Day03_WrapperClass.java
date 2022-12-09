package Java.day03_mathCalculations;

public class Day03_WrapperClass {
    public static void main(String[] args) {
        int sayi =10;
        String str= "Java is so beautiful";
        /*
         primitive data types only carry values, they don't have ready methods
         after the compiles made to Java
         it built Wrapper Classes that can be used with primitive data types and ready methods
         Wrapper classes takes the values that are primitive data types
         but they have methods
         */
        char chr= 'b';
        Character chrWrapper= 'c';
        System.out.println(Character.isLetter('5')); // false
        System.out.println(Character.isDigit('7')); // true

        String str1= "123";
        String str2= "12";

        // addition the mathematical values of str1 and str2
        System.out.println(str1 + str2); // 12312
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 135
        // If the str written in Integer.parseInteger(str) is built by the digits, it converts str to the int
        // but if even one of the charachters not a digit, it gives error

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE);// -32768
    }
}


