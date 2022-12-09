package Java_Education.day26_staticBlock_passByValue;

import java.util.Arrays;

public class TR_PassByValueArray {
    public static void main(String[] args) {
        // verilen bir array'in elementlerini 5 artirip
        // sonra yazdiran bir method olusturun
        int[] arr={3,4,5};
        elemntleri5Artir(arr);
        elemntleri5Artir(arr);
        elemntleri5Artir(arr);
        System.out.println("Method call'dan sonra main method icinde arr : " + Arrays.toString(arr));
    }
    public static void elemntleri5Artir(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i] +5 ;
        }
        System.out.println(Arrays.toString(arr));
    }
}
