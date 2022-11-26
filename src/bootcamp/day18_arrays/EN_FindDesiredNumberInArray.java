package bootcamp.day18_arrays;

public class Day18_SearchElementsInArray {
    public static void main(String[] args) {

        // Create a method that prints whether a desired element exists in a given array and,
        // if so, how many times it has been used.

        // Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,2,4,5,3,6,7,4,2,3,5,1,3,2};
        int searchedElement= 2;
        searchElement(arr,searchedElement);
    }
    public static void searchElement(int[] arr, int searchedElement){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==searchedElement){
                count++;
            }
        }
        if (count==0){
            System.out.println("Searched element not found in the array");
        }else{
            System.out.println("Searched element " + searchedElement + " is found " + count + " times in the array.");
        }
    }
}
