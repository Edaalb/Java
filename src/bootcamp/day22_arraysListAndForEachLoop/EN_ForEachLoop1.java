package bootcamp.day22_arraysListAndForEachLoop;

public class EN_ForEachLoop1 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i <arr.length ; i++) {   // 4 6 8 4 6 8 4

            System.out.print(arr[i]+" ");

        }
        System.out.println();

        for (int each: arr                // 4 6 8 4 6 8 4
        ) {
            System.out.print(each+" ");

        }


    }
}
