package Java.day19_arrays;

import java.util.Arrays;

public class EN_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,8,9,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8)); // 7
        System.out.println(Arrays.binarySearch(arr,5)); // -2
        System.out.println(Arrays.binarySearch(arr,1)); // 0
        System.out.println(Arrays.binarySearch(arr,9)); // -10
        /*
          binary search may give us wrong answers if we do not use sort method from Arrays Class

          Binary search method'unun dogru sonuclar verebilmesi icin sort method'u kullanilmalidir.
          sort() kullanmadan binarySearch() ile yapilan aramanin sonucu dogru ya da yanlis sonuc verebilir.

         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 7, 8, 8, 9]
        System.out.println(Arrays.binarySearch(arr,8)); // 6
        System.out.println(Arrays.binarySearch(arr,5)); // 4
        System.out.println(Arrays.binarySearch(arr,1)); // 1
        System.out.println(Arrays.binarySearch(arr,9)); // 8

        /*
           If we search for a element which is not in the array, binary search will return
           a "-" number. and this "-" number will give us the place as if it was in the array

           array'de olmayan bir eleman aratirsak
           java once o sayi array'de olsa nerede olurdu onu bulur
           sonra buldugu bu SIRA'yi - isareti ile verir
        */
        System.out.println(Arrays.binarySearch(arr,-3)); // -1
        System.out.println(Arrays.binarySearch(arr,4)); // -5
        System.out.println(Arrays.binarySearch(arr,10)); // -10
        System.out.println(Arrays.binarySearch(arr,100)); // -10
    }
}
