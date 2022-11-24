package bootcamp.day_14;

public class Day14_Question1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //write the multiplication result of these two numbers on console by not writing a new code
        System.out.println(Day14_Multiplication.multiplicationMethod(a, b)); // 200.0
        String c="How";
        String d="so?";

        // Bu iki String'i aralarinda bir bosluk birakarak yazdirin Print these two Strings by adding spaces
        System.out.println(Day14_StringConcate.concateMethod(c, d)); // ?neppah ti diD
        String e= "Did it happen?";

        // Print e String in reverse
        System.out.println(Day14_StringReverse.reverseString(e));

        // "Reverse this sentence"
        System.out.println(Day14_StringReverse.reverseString("Reverse this sentence")); //ecnetnes siht esreveR
        String str="Java is fine";

        // Print str uppercase
        System.out.println(str.toUpperCase());
    }
}
