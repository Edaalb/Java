package Java_Education.day20_multiDimensionalArrays;

public class EN_MDA_AddElements2 {

        public static void main(String[] args) {

            int[] arr1 ={3,5,7,8}; // 23
            int total=0;
            for (int i = 0; i <arr1.length ; i++) {
                total += arr1[i];
            }
            System.out.println("Sum of elements of the single-level array: : " + total);
            int[][] arr = {{1,2},{3,4,5},{7}};
            // add the elements
            total=0;
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    total += arr[i][j];
                }
            }
            System.out.println("Sum of elements of a two-level array: : " + total); //22
        }
}
