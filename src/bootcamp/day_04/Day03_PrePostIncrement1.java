package bootcamp.day_04;

public class Day03_PrePostIncrement {
    public static void main(String[] args) {
        int a= 10;
        // print the value of "a" variable, then increase the value of "a" by one

        System.out.println("a: " +a); // 10
        a++;
        // a is 11 from now on
        int b=10;
        // Increase the value of "b" by one, then print it

        b++;
        System.out.println("b : "+b); // 11
        int c=10;
        // print the value of "c" variable, then increase the value of "c" by one
        System.out.println("c : " + c++); // 10
        int d=10;
        // Increase the value of "d" variable, then print it
        System.out.println("d : " + ++d); // 11
        /*
         if we use c++  or ++d on printing or assigning, it is called post increment for c++
         it calculates the result first then increases.
         ++d is called as pre increment, it first increases then calculates the result
         when it gets the line below, we can see that c and d has been increased.
         */
    }
}
