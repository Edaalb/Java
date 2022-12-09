package Java_Education.day11_stringManipulations;

public class Day11_SM_replaceAll2 {
    public static void main(String[] args) {
        // Write a code that clears all characters except from letter
        // NOT : space shouldn't be deleted
        String input= "9%J2av*(a  i_s 1*fine";
        input=input.replaceAll("\\d",""); // %Jav*(a  i_s *fine
        System.out.println(input);
        input=input.replace(" ","5"); // %Jav*(a55i_s5*fine
        System.out.println(input);
        input=input.replaceAll("\\W","");// Java55i_s5fine
        System.out.println(input);
        input=input.replace("_",""); //Java55is5fine
        System.out.println(input);
        input=input.replace("5"," "); // Java  is fine
        System.out.println(input);
        input=input.replaceAll("\\s+"," ");//Java is fine
        System.out.println(input);
    }
}
