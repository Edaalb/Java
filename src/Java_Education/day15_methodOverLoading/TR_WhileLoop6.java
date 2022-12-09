package Java_Education.day15_methodOverLoading;

public class TR_WhileLoop6 {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        int sayi=3;
        int us= 4;
        usHesapla(sayi,us);
    }
    public static void usHesapla(int sayi, int us){
        int sonuc=1;
        while (us>0){
            sonuc *=sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}
