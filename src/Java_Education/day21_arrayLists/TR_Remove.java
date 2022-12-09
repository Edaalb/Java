package Java_Education.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class TR_Remove {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> numbers= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            numbers.add(arr[i]);
        }
        numbers.remove(2);
        System.out.println(numbers);
        numbers.remove(5);
        System.out.println(numbers); // [1, 2, 3, 5, 3, 2, 5, 1, 2, 4, 5, 3, 4, 5]
        /*
         Listemiz integer'lardan olusuyorsa
         biz int bir deger yazdigiizda hep index kabul ettiginden
         istedigimiz elementi obje olarak girip sildirmek icin
         onceden tanimlamamiz gerekir
         */
        Integer deletedObject= 4;
        numbers.remove(deletedObject);
        System.out.println(numbers);
        // tum 3'leri sildirin
        deletedObject=3;
        while(numbers.contains(deletedObject)){
            numbers.remove(deletedObject);
        }
        System.out.println(numbers); // [1, 2, 5, 2, 5, 1, 2, 5, 4, 5]
        deletedObject=10;
        System.out.println(numbers.remove(deletedObject)); // false
        numbers.remove(20); // IndexOutOfBoundsException
    }
}
