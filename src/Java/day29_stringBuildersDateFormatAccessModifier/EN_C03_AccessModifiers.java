package Java.day29_stringBuildersDateFormatAccessModifier;

public class EN_C03_AccessModifiers {
    static String  name = "Ali"; // default access modifier, because we can not see any modifiers

    private static int number = 12; // If access modifier is private i can only use it inside of the class it is created

    public static void main(String[] args) {

        System.out.println(name);
        System.out.println(number);

    }
}
