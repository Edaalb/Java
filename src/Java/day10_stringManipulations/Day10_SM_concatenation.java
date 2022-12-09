package Java.day10_stringManipulations;

public class Day10_SM_concatenation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "is Fine";
        boolean bl= true;
        int number= 20;
        double dbl= 3.54;
        System.out.println(str1+bl+number); // Javatrue20
        // System.out.println(bl+number);
        // It may not give permission to make addition except from String data types

        System.out.println(number + dbl); // 23.54
        // System.out.println(str1.concat(bl));
        // concat() can only be used to concat String variables
        System.out.println(str1.concat(" ").concat(str2)); // Java is Fine
    }

}
