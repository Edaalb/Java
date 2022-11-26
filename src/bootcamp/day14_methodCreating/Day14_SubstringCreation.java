package bootcamp.day14_methodCreatins;

public class Day14_SubstringCreation {
    /* Question 1
    Create a method that prints the letters in the String given as input from the user ,
    including, the starting index, excluding the ending index, according to the start and end indexes.
    if the user enters a number greater than the end value as the start value, give an error message
    if the user enters an index larger than the length , print an error

    Kullanicidan input olarak bir String alin,
    baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.*/

    public static void main(String[] args) {

        String input = "Java is so beautiful";
        int startIndex=5;
        int endIndex=7;

        ownSubstringMethod(input,startIndex,endIndex); //is
        ownSubstringMethod("Java",1,3); // av
        ownSubstringMethod("Try",6,3); // Baslangic indexi, bitis indexinden buyuk olamaz
        ownSubstringMethod("Java",6,8); // Bitis indexi String'in sinirlari disinda
    }
    public static void  ownSubstringMethod(String input, int startIndex, int endIndex){
        if (startIndex>endIndex){
            System.out.println("Starting index cannot be greater than the finisihing index");
        } else if (endIndex>=input.length()) {
            System.out.println("Ending index is out of borders");
        }else{
            // Create a method that prints the letters in the String given as input from the user ,
            //    including, the starting index, excluding the ending index, according to the start and end indexes.
            for (int i = startIndex ; i <endIndex ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }
    }












}
