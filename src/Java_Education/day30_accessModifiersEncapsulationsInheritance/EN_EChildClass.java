package Java_Education.day30_accessModifiersEncapsulationsInheritance;

public class EN_EChildClass extends EN_DParentClass{
    public static void main(String[] args) {


        System.out.println(name);
        System.out.println( age);
        System.out.println(isEnough);
        // System.out.println(privateVar); If it is a private variable, even if we are child of that class, we can not
        // reach of use that private variable
        callMe();

    }
}
