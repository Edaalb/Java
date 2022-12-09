package Java.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class PRC_AddingElements {
    public static void main(String[] args) {

        List<Integer> numbers= new ArrayList<>();
        System.out.println(numbers); // [ ]
        System.out.println(numbers.add(10)); // true
        System.out.println(numbers); // [10]
        numbers.add(20);
        System.out.println(numbers);  // [10, 20] it adds the element to the end / tersi soylenmedikce elementi sona ekler
        numbers.add(1,15);
        System.out.println(numbers); // [10, 15, 20]
        // add 44 to beginnning of list
        numbers.add(0,44);
        System.out.println(numbers); //  [44, 10, 15, 20]
        List<Integer> addedList=new ArrayList<>();
        addedList.add(3);
        addedList.add(5);
        // add addedList to end of numbers list / sayilar listesinin sonuna eklenecekListeyi ekleyin
        numbers.addAll(addedList);
        System.out.println(numbers); // [44, 10, 15, 20, 3, 5]
        // sayilar listesinin basindaki 44'den sonraya eklenecek listeyi ekleyin
        numbers.addAll(1,addedList);
        System.out.println(numbers); // [44, 3, 5, 10, 15, 20, 3, 5]
    }
}
