package Java_Education.day40_interfaces;

public class TR_I09_ChildOfI08 implements TR_I08_InterfaceStaticVeDefaultMethods{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }


    public static void main(String[] args) {
        TR_I09_ChildOfI08 obj= new  TR_I09_ChildOfI08();
        obj.method3();

        TR_I08_InterfaceStaticVeDefaultMethods.method4();

    }

}
