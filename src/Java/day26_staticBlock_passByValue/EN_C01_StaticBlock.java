package Java.day26_staticBlock_passByValue;

public class EN_C01_StaticBlock {
    static {
        System.out.println("above static block ran");

    }

    public static void main(String[] args) {

        System.out.println("main method ran");

    }

    static {
        System.out.println("below static code ran");

    }

}
