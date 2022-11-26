package bootcamp.day_09;

import java.util.Locale;

public class Day09_SM_toUpperCase {
    public static void main(String[] args) {

        String str = "Java is Happiness";
        System.out.println(str.toUpperCase()); // JAVA IS HAPPINESS
        System.out.println(str); // Java is Happiness
        str= str.toUpperCase();
        System.out.println(str); //JAVA IS HAPPINESS
        str= "elif and ali";
        str= str.toUpperCase();
        System.out.println(str); // ELİF AND ALİ
        // str=str.toLowerCase();
        // System.out.println(str); // elif and ali
        System.out.println(str.toLowerCase(Locale.CHINA)); // elif and ali
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // elif and ali
    }
}
