package Java_Education.day08_nestedTernary;

public class Day08_Ternary3 {
    public static void main(String[] args) {

        int a= 5;
        /*
        Ternary operation cannot be used alone
        ternary turns a result to us
        we have to print the result directly or assign to a variable
         */
        String result =a%2==0 ? "even number" : "odd number";
        /*
          If we assign the result of ternary to a variable
          the result of the variable in case of true or false
          need to be same.
          If not CTE occurs
          but if we use ternary in sout, the results data type don't need to be same
         */
        String result2= a>10 ? "greater number" : ""+2*a ; // we turned it to a String for not facing with CTE
        System.out.println(a>10 ? "greater number" : 2*a);
    }
}
