package Java.day18_arrays;

public class EN_AddAllPositiveValues {
    public static void main(String[] args) {

        // Write a method that adds the positive integers in a given array and returns the result.
        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

        int[] arr={3,-3,5,-7,-6,1,-2};

        System.out.println(addPositiveElements(arr)); // 9
    }
    public static int addPositiveElements(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
                total += arr[i];
            }
        }
        return total;
    }
}
