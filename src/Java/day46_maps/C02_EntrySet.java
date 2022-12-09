package Java.day46_maps;

import Java.day44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        // Ogrenci map'inde sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin


        //Adı öğrenci map’i olan, Integer ve Stringlerden oluşan bir Map oluşturalım. Değerini MapDepo’dan alsın.
        Map<Integer,String> ogrenciMapi= MapDepo.ornekMapOlustur();
        //öğrenci ekleyelim
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");


        // Soz, 11, D, Adem Demir, 109
        // Bu formatta String'ler olusturup bir treeSet'e atayan
        // ve bu set'i bize donduren bir Method olusturalim


        //bize bir set döndüreceği için, dönen seti kaydetmek için yine bir set oluşturmamız gerekmektedir.
        //Stringlerden oluşan siraliOgrenciListesi değerini MapDepo class’ında oluşturacağımız
        // siraliOgrenciListesiOlustur methodundan alacak. Bu methoda öğrenci mapini yollamamız gerekmektedir.
        // biz bunu yolladığımızda onu bölüp parçalayacak, istediğimiz formata sokacak
        // ve hepsini treeSet’e atayıp bize geri döndürecek.

        Set<String> siraliOgrenciListesi = MapDepo.siraliOgrenciListesiOlustur(ogrenciMapi);
        //method oluştura basarak methodu oluşturduk. Şimdi mapDepo classın’ı düzenliyoruz.

        System.out.println(siraliOgrenciListesi);
        //depodan dönüp yazdırıyoruz.
        /*
        [
        MF, 10, H, Ali Can, 101,
        MF, 10, H, Ayse Can, 104,
        Soz, 10, K, Fatma Han, 106,
        Soz, 11, D, Adem Demir, 109,
        Soz, 11, M, Veli Cem, 102,
        TM, 11, H, Ali Cem, 103,
        TM, 11, M, Ayse Cem, 105
        ]

         */

    }

}
