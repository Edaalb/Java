package bootcamp.day_14;

public class Day14_StringReverse {

             // Accept a String as parameter
             // Write a method that reverses String

    public static void main(String[] args) {

        String input= "you can learn Java by writing codes";
        System.out.println(reverseString(input));
    }
    public static String reverseString(String input){

        String reversedStr="";
        for (int i = input.length()-1; i >=0 ; i--) {
            reversedStr= reversedStr+input.charAt(i);
        }
        return reversedStr;
    }
}
