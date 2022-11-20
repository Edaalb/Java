package bootcamp.day_09;

public class Day09_SM_Substring {
    public static void main(String[] args) {
        String str= "Learn Java, and take the job";

        System.out.println(str.substring(5)); // Java, and take the job
        System.out.println(str.substring(0)); // Learn Java, and take the job
        System.out.println(str.length()); // 28

        // keep the last character as String
        String sonHarf= ""+str.charAt(str.length()-1);
        sonHarf= str.substring(str.length()-1);
        System.out.println(sonHarf); // b

        // print the character in last index as upper case
        System.out.println(str.substring(str.length()-1).toUpperCase()); // B

        // Print the last 3 characters as uppercase
        System.out.println(str.substring(str.length()-3).toUpperCase()); // JOB
    }
}
