package Java_Education.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class EN_AddingElements {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int [] arr = {3,4,6,3,5,3,5,7,8,4,3,5,7,3,6};

        for (int i = 0; i < arr.length; i++) {

            numbers.add(arr[i]);

        }

        System.out.println(numbers);

    }
}
