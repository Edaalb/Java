package practice_01;

import java.util.Scanner;

public class Q_03_MergeSecondWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 words");
        String a = scan.next();
        String b = scan.next();

        System.out.println(a.length() <= 3 && b.length() <= 3 ? "Output : " + a.substring(0, 1) + b.substring(0, 1) + a.substring(1, 2) + b.substring(1, 2) + a.substring(2, 3) + b.substring(2, 3) : "Output : Cannot Merged");
    }
}

