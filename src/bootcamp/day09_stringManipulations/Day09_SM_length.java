package bootcamp.day_09;

public class Day09_SM_length {
    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length()); // 34
        // print the last character
        System.out.println(str.charAt(33)); // u
        System.out.println(str.charAt(str.length()-1)); // is used for getting the last character
        // sprint the character last from 3
        System.out.println(str.charAt(str.length()-3)); // g
    }
}
