package Java_Education.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class EN_IndexOf {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> numbers= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            numbers.add(arr[i]);
        }
        System.out.println(numbers);

        System.out.println(numbers.indexOf(3)); // 3

        System.out.println(numbers.lastIndexOf(3)); // 13
    }
}
