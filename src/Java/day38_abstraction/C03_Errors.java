package Java.day38_abstraction;

public class C03_Errors {
    public static void main(String[] args) {

        test();
    }

    public static void test(){

        System.out.println("Test is worikng");
        test();
    }
}
