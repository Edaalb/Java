package Java_Education.day11_stringManipulations;

public class Day11_SM_replace {
    public static void main(String[] args) {
        String str= "Java is life";
        System.out.println(str.replace('a', 'A')); // JAvA is life
        System.out.println(str.replace(' ', '_')); // Java_is_life
        System.out.println(str.replace("life","very good.")); // Java is very good.
        System.out.println(str.replace(" ","")); // Javaislife
        // Delete all a letters in String
        System.out.println(str.replace("a","")); // Jv is life
        // Hava instead of Java, so good instead of life
        System.out.println(str.replace("Java_Education","Hava")
                .replace("life","so good"));// Hava is so good
        System.out.println(str.replace("","_")); // _J_a_v_a_ _i_s_ _l_i_f_e_

        // Just turn the first 'a' to 'A'
        System.out.println(str.replaceFirst("a","A")); // JAva is life
    }
}
