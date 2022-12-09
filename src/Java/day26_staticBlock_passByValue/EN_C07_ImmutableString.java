package Java.day26_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class EN_C07_ImmutableString {
    public static void main(String[] args) {

        String str = " Java is Funny";

        System.out.println(str.toLowerCase());

        System.out.println(str);

        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        str= str.toUpperCase();
        System.out.println(str);

        List<String> list =new ArrayList<>();

        list.add("A");
        list.add("D");

        System.out.println(list);

    }
}
