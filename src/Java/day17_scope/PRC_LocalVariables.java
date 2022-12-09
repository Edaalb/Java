package Java.day17_scope;

public class PRC_LocalVariables {
    public static void main(String[] args) {

        // a variables scope created in a method is the method created in.
        // they CANNOT reach out of that scope

        int number=10;
        String name="Elif";
        // System.out.println(isItCorrect);

        for (int i = 0; i <10 ; i++) {
            String address="Sakarya";
            // variables created in a loop is valid only in that loop
        }
        // System.out.println(address);
        double pi;
        // System.out.println(pi);
        //local variables can be created without not assigning value, but CANNOT be used
        // it MUST be assigned value before using
    }
    public static void method1(){
        //System.out.println(number);
        // isim ="ALi";
        boolean isItTrue=true;
    }
}
