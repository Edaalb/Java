package Java_Education.day08_nestedTernary;

public class Day08_Ternary2 {
    public static void main(String[] args) {
        String str1= "Ali";
        String str2= "ALI";

        // if the given two text is same with each other print "texts are same"
        // if not print "texts are not same"

        if (str1.equals(str2)){
            System.out.println("Texts are same with each other");
        }else {
            System.out.println("Texts are not same with each other");
        }
        //with ternary
        System.out.println(str1.equals(str2) ? "Texts are same" : "Texts are not same with each other");
    }
}
