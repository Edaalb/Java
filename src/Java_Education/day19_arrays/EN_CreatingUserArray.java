package Java_Education.day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EN_CreatingUserArray {
    public static void main(String[] args) {

        // Take as many numbers as from the user and create an array
        // User will press 0 to element enterance

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        // kullanici eleman girisini bitirmek icin 0'a bassin

        Scanner scan= new Scanner(System.in);
        int[] arr={0};
        int enteredNumber=0;

        do {
            System.out.println("Enter a whole number to add to " +
                    "\n Press 0 to finish entrance ");
            enteredNumber= scan.nextInt();

            if (arr[0]==0 ){
                arr[0]=enteredNumber;
            }else if(enteredNumber!=0){
                arr= EN_AddingNewElement.addElementToArray(arr,enteredNumber);
            }

        }while(enteredNumber!=0);
        System.out.println(Arrays.toString(arr));
    }
}
