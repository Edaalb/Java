package bootcamp.day_11;

public class Day11_SM_replaceAll1 {
    public static void main(String[] args) {
        String str= "J1ava2 is9 n5i8ce";

        // delete the digits in str and make the sentence Java Guzeldir
        // str.replaceAll() not only changes a letter or a char sequence
        // it changes all characters that can be defined with generilazation

        System.out.println(str.replaceAll("\\d","")); // Java is nice
        System.out.println(str.replaceAll("\\D",""));// 12958

        String s1= "Price of the first product : €1250";
        String s2= "Price of the second product : €1500";

        // summit the price of two products
        s1=s1.replaceAll("\\D",""); // "1250"
        s2= s2.replaceAll("\\D",""); // "1500"
        System.out.println(s1+s2); // 12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 2750
    }
}
