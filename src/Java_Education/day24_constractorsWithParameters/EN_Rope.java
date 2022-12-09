package Java_Education.day24_constractorsWithParameters;

public class EN_Rope {
    public EN_Rope (){

    }
    public  void test(){

        System.out.println("test");
    }

    public static void main(String[] args) {

        EN_Rope rope1 = null;
        rope1.test(); // NullPointerException

    }

}
