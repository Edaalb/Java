package Java_Education.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class EN_Set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> numbers= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            numbers.add(arr[i]);
        }
        // set() is used for update in Java
        // add() and set() are different from each other

        System.out.println(numbers.set(0, 8)); //1
        int oldValue= numbers.set(1,9);
        System.out.println(oldValue); //2
        System.out.println(numbers); // [8, 9, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]
    }
}
