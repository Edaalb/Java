package practice_01;

public class Q_04_FindHalf {
    // Question 4:
    //Print half twice
    //Write a program that will print out first half of the word twice.
    //Example:
    //```
    //input: java
    //output: jaja

    public static void main(String[] args) {
        String input= "java";

        System.out.println(input.substring(0,input.length()/2).repeat(2));

    }
}
