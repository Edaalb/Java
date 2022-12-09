package Java.day04_incremets_decrements;

public class Day03_PrePostIncrement2 {
    public static void main(String[] args) {
        int a= 10;
        int b = a++;
        int c= ++b;
        System.out.println("a: " + a + ", b : " + b +", c : "+ c);
        a= 20;
        b= ++a;
        c= a++;
        System.out.println("a: " + a + ", b : " + b +", c : "+ c);
        a=30;
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
}
