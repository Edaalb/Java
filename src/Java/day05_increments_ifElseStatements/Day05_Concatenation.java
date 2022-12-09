package Java.day05_increments_ifElseStatements;

public class Day05_Concatenation {
    public static void main(String[] args) {

        // Print the asked value by only using the variables given below

        String s1= "Java";
        String s2= "is Nice";
        String s3= ""; // null / hiclik
        String s4= " "; // space, bosluk
        int sayi1= 4;
        int sayi2= 3;
        // Java7 is Nice43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);
        // 34 Java
        System.out.println(sayi2+s3+sayi1+s4+s1); // 34 Java
        // 7Java is Nice
        System.out.println(sayi1+sayi2+s1+s4+s2); // 7Java is Nice
        // Java is Nice7
        System.out.println(s1+s4+s2+sayi1+sayi2); // Java is Nice7
        // Java is Nice 12
        System.out.println(s1+s4+s2+s4+sayi1*sayi2); // Java is Nice 12
    }
}
