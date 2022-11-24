package bootcamp.day_13;

public class Day13_CreatingMethod {

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
