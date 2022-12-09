package Java_Education.day13_nestedLoops_MethodCreation;

public class Day13_NestedForLoop3 {

        public static void main(String[] args) {
        /*
        Create the shape below by using nested for loop
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
            for (int i = 1; i <=5 ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j+" ");
                }
                System.out.println("");
            }
        }
}
