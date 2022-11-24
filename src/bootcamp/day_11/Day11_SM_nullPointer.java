package bootcamp.day_11;

public class Day11_SM_nullPointer {
    public static void main(String[] args) {

        String str1= "";
        // value is assigned to str1
        System.out.println(str1); // prints nothingless
        System.out.println(str1.concat("Java")); // Java

        String str2;
        // str2 is created but not value assigned
        //System.out.println(str2); // str2 cannot be printed as valueis not assigned, it gives CTE
        // System.out.println(str2.concat("Java")); // cannot be used with methods as value is not assigned

        str2="Java is life";
        System.out.println(str2); // Java is life
        System.out.println(str2.concat(".")); // Java is life.

        String str3=null; // str3 is not assigned value
        // we indicate with null pointer that we assigned value to str3
        System.out.println(str3); // null prints what is assigned
        //System.out.println(str3.concat("Java")); // NullPointerException
        System.out.println(str3 + "Java"); // nullJava
        System.out.println(str3.toUpperCase()); // NullPointerException
    }
}
