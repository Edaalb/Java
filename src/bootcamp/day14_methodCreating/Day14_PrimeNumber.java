package bootcamp.day14_methodCreatins;

public class Day14_PrimeNumber {

    //Question 3
    //Get a positive integer from user in main method. Create a method that checks if the entered
    //number is a prime number and returns "prime" or "not prime" as a result.

    // Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.

    public static void main(String[] args) {
        int number=24;
        System.out.println(checkPrimeNumber(number)); // not prime
        System.out.println(checkPrimeNumber(23)); // prime
        System.out.println(checkPrimeNumber(5674532)); // not prime
    }
    public static String checkPrimeNumber(int number){
        String result="";
        for (int i = 2; i <= (number-1) ; i++) {
            if (number%i==0){
                result="not prime";
                break;
            }
        }
        if (!result.equals("not prime")){
            result="prime";
        }
        return result;
    }
}
