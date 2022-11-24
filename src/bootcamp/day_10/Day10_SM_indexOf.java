package bootcamp.day_10;

public class Day10_SM_indexOf {
    public static void main(String[] args) {
        String str = "Everything is clear with our teacher";
        System.out.println(str.indexOf("a")); // 17 it turns the first index of a
        System.out.println(str.indexOf('c')); // 14
        System.out.println(str.indexOf("Everything")); // 0
        System.out.println(str.indexOf("e",9)); // 16
        // Let's afind the next index of e after the first one
        System.out.println(str.indexOf("e",17)); // 30
        // find second c's index
        int firstCIndexIndex= str.indexOf("c"); // 14
        System.out.println(firstCIndexIndex);
        System.out.println(str.indexOf("c",firstCIndexIndex+1)); // 32
        System.out.println(str.indexOf("ali")); // -1 it is supposed to turn -1
        System.out.println(str.indexOf("x")); // -1
    }
}
