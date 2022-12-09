package Java_Education.day14_methodCreating;

public class Day14_StringConcate {

    // Accept two given Strings as parameters
    // create a method that returns these two Strings to the main method
    // as a single String with a space between them.

    public static void main(String[] args) {
        String str1= "Java_Education";
        String str2="is Everything";
        System.out.println(concateMethod(str1, str2));
        System.out.println(concateMethod("These too","happens"));
        System.out.println(concateMethod("Got","it?"));
    }
    public static String concateMethod(String str1, String str2){
        return str1+" "+str2;
    }
}
