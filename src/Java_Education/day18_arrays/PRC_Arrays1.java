package Java_Education.day18_arrays;

public class PRC_Arrays1 {
    public static void main(String[] args) {

        int[] arr1 = {2,4,6,8,10};
        // if we want to reach and update an array's element

        System.out.println(arr1[2]); // 6

        arr1[3]=20;

        System.out.println(arr1[3]); // 20
        System.out.println(arr1.length); // 5

        // print the last element
        System.out.println(arr1[arr1.length-1]); // 10

        // print all elements of the array
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i] +" "); // 2 4 6 20 10
        }
        // array's lenght cannot be changed afterwards
        // if we want to make assignment to an index not stated in an array
        // ArrayIndexOutOfBoundsException occurs
        // it is not a Compile Time Error (CTE)
        // but it is a Run Time Error
        // arr1[5]=35;
    }
}
