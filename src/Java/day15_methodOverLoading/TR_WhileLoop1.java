package Java.day15_methodOverLoading;

public class TR_WhileLoop1 {
    public static void main(String[] args) {

        // Print 2-digit numbers side by side with a space between them.
        // 2 basamakli sayilari aralarinda bir bosluk olacak sekilde yanyana yazdirin

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i + " ");
        }
        // if we use while loop

        System.out.println("");
        int a=10;
        while (a<100){
            System.out.print(a+" ");
            a++;
        }
    }
}
