package Java.day10_stringManipulations;

public class Day10_SM_startsWith {
    public static void main(String[] args) {
        String str = "you cannot learn java while cooking pasta";
        System.out.println(str.startsWith("pasta")); // false
        System.out.println(str.startsWith("you cannot learn java while cooking pasta")); // true
        System.out.println(str.startsWith("")); // true
        System.out.println(str.startsWith("cooking", 28)); // true
        System.out.println(str.startsWith("you",0)); // true
        System.out.println(str.startsWith("java",16)); // false
    }
}
