package Java.day13_nestedLoops_MethodCreation;

public class Day13_CreatingMethod1 {

    public static void main(String[] args) {

        String str = "Java is great";
        // convert text to uppercase

        String upperStr = str.toUpperCase();

        System.out.println(str); // Java is great

        System.out.println(upperStr); // JAVA İS GREAT

        //Does the uppercase version of text contains G?
        System.out.println(upperStr.contains("G")); // true
    }
}
