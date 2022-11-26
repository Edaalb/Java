package bootcamp.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Day21_AddingElementsString {
    public static void main(String[] args) {

        List<String> capitals = new ArrayList<>();

        String [] arr = {"a","e","i","o","u"};

        for (int i = 0; i < arr.length; i++) {

            capitals.add(arr[i]);

        }

        System.out.println(capitals); // [a, e, i, o, u]

    }
}
