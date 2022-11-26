package bootcamp.day_10;

public class Day10_SM_contains {
    public static void main(String[] args) {
        String str = "Coding with Java is so enjoyable";
        System.out.println(str.contains("so")); // true
        System.out.println(str.contains("oding")); // true
        System.out.println(str.contains("a")); // true
        // System.out.println(str.contains('s')); // doesn't accept char as parameters
        // CharSequence : char sequence
        System.out.println(str.contains("java")); // false
        String str2= "Java";
        System.out.println(str.contains(str2)); // true
        String str3= "234 Ali Can ";
        // str3.contains(2);
        str3.contains("2");
    }
}
