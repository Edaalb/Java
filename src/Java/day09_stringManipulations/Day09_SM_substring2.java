package Java.day09_stringManipulations;

public class Day09_SM_substring2 {
    public static void main(String[] args) {

        String str= "Java is getting nicer day by day";

        System.out.println(str.substring(5, 7)); // is
        // starts from 5th index and prints (7-5) characters
        // 5.index is included (inclusive) , 8.index is not included (exclusive)

        // print getting
        System.out.println(str.substring(8,15)); // getting
        System.out.println(str.substring(3,7)); // a is

        System.out.println("************************************");

        String name= "eLIF";

        // record the given name as the first letter is uppercase and the last ones lowercase

        name = name.substring(0,1).toUpperCase()+ // we take the first letter and make it uppercase
                name.substring(1).toLowerCase(); // 1.index ve sonrasini alip kucuk harf yaptik

        System.out.println(name); // Elif
        System.out.println(name.substring(2,4)); // if

        // print only in 3rd index
        System.out.println(name.substring(3,4)); // f

        //System.out.println("answer of the hard question is : " + name.substring(2,2)); // "" prints nothingless
        // System.out.println(isim.substring(5,2)); // StringIndexOutOfBoundsException
    }
}
