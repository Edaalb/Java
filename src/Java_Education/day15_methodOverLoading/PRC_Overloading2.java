package Java_Education.day15_methodOverLoading;

public class PRC_Overloading2 {

    // In a class there cannot be two methods that have same name and signatures

    /*
     Java decides which method will run in the classes there occur overloading
    1- first looks at the method name
    2- looks at the argument numbers and parameter numbers
    3- looks at the argument and parameter coherence
    4- minimum casting
     */
    public static void main(String[] args) {
        multiplication(3,5); //arguments are written in the method parenthesis during method call
        multiplication(3.4,2); // double - Integer numbers multiplication: 6.8
    }
    public static void   multiplication(int number1, int number2){ // multiplication of int - int
        System.out.println("Two Integer numbers multiplication: "+number1*number2);
    }
    public static void   multiplication(int number3, int number4,int number5){ // multiplication int int int
        System.out.println("Three Integer numbers multiplication: "+number3*number4*number5);
    }
    public static void   multiplication(double number1, int number2){ // multiplication double int
        System.out.println("double - Integer numbers multiplication: "+number1*number2);
    }
    public static void   multiplication(int number1, double number2){ // multiplication int double
        System.out.println("integer-double numbers multiplication: "+number1*number2);
    }
    public static void   multiplication(double number1, double number2){ // multiplication double double
        System.out.println("Two double numbers multiplication: "+number1*number2);
    }
}
