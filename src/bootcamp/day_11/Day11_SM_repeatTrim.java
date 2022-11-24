package bootcamp.day_11;

public class Day11_SM_repeatTrim {
    public static void main(String[] args) {

        String str= "java is good\n";
        System.out.println(str.repeat(4));
        // java is good java is good java is good java is good

        str= "   Java is good   ";
        System.out.println(str.length()); // 18

        str=str.trim();
        System.out.println(str); // Java is good
        System.out.println(str.length()); // 12
    }
}
