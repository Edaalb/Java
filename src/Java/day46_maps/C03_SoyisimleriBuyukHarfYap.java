package Java.day46_maps;

import Java.day44_maps.MapDepo;

import java.util.Map;

public class C03_SoyisimleriBuyukHarfYap {
    public static void main(String[] args) {

        // ogrenci map'indeki soyisimleri buyuk harfe cevirip
        // map'i bize donduren bir method olusturun


        Map<Integer, String> ogrenciMapi = MapDepo.ornekMapOlustur();
        //bunu değişiklikleri görmek için ekliyoruz. Normalde eklemeyiz.
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");

        //öğrenci map’ini yollayacağız, soyisimleri büyük yapıp geri map’i yollayacak.
        // Bunun için ogrenciMap’ine gelen yeni değeri atamamız lazım.
        // MapDepo’da oluşturacağımız soyisimleriBuyukharfYap methodundan dönen map’i öğrenci map’ine atayacağız.
        // Yani bizdeki öğrenci map’inin kopyasını oraya yollayacağız, method kopya üzerinden çalışıp
        // ulaştığı noktanın bir kopyasını buraya yollayacak.

        ogrenciMapi=MapDepo.soyisimleriBuyukharfYap(ogrenciMapi);
        //böyle bir method olmadığı için sağ click ile oluştururuz.

        //şimdi mapDepo’ya gidiyoruz.


        System.out.println(ogrenciMapi); //MapDepo’dan dönüp yazdırırız.
    }
}
