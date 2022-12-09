package Java_Education.day46_maps;

import Java_Education.day44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {


        // onceki iki derste key(Set) ve value(Collection) degerlerini toplu olarak alabiliyorduk
        // ancak key ve value birlikte kullanmak istedigimizde
        // bu islemi yapmak zor olur


        // Bunun icin Java Entry Interface'ini olusturmustur
        // Entry'ler key=Value ikilisini 1 Entry olarak kabul ederler

        // bir tane öğrenci map’i oluşturduk, değerini depodan aldık.

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap); // class’ın başındaki halini yazdırır.
        System.out.println(ogrenciMap.size()); // 6 element size’ı, her bir elementin key’i ve value’su var.

        //bugüne kadar ayrı ayrı 6 tane key ve 6 tane value olarak ayrı ayrı elde ettik
        // ancak şimdi bu şekilde istemiyoruz. 6 tane içerisinde key ve value’den oluşan element var.
        ogrenciMap.put(108, "Mehmet-Erkan-12-K-MF");


        /* map olarak yazdırdık
            {
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            }
         */

        //entry’lerden oluşan bir set var. Entry’ler de key ve value’nun değerlerinden oluşuyor.
        //Entry set’i istediğimiz zaman, karşısına getireceği bilgiyi store edeceği
        // bir set oluşturmalıyız. Bu set entry’lerden oluşmalıdır.
        // Entry’ler ise key ve value’nun data türlerinden yani Integer ve Stringden.
              //  Java util’den Entry K V olan seçilmelidir.

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);

        /* entry set olarak yazdırdık
            [
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            ]
            aralarindaki farklar
            1- yukaridaki map, bu Set
            2- yukaridakinde {} kullaniyor, bu ise [ ]
            3- yukaridakinde key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
               Entry'de ise K=V  ikisi birlikte bir element oluşturuyor
               Bir entry setinde yalnızca key ya da value olmaz K=V ayrılamazlar.
               Diğerinde ise ikisi yanyana yazılı olsa dahi aslında ayrı iki kavram
               K=V olarak hepsini entry olarak tutuyor, String değil.
               Entry bugüne kadar gördüğümüz data türlerinin dışındadır. Set, array, list vs değil, kendi başına bir interface
         */

        // entry seti icerisindeki entry'leri entryleri sira numarasi vererek yazdiralim
        //Setteki elementleri yazdırmak için en mantıklısı for Each loop
        //entryleri tek başına kullanamıyoruz, nasıl bir entry yazdıracağımızı seçmeliyiz.
        // Burada String ve Integer’dan oluşan bir Entry yazdıracağız. Adı eachEntry olsun

        int siraNo=1;


        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
        ) {


            System.out.println(siraNo + "-   " + eachEntry);
            siraNo++;
        }


        // Entry'leri kullanarak Key'leri yazdirin

        //Entry’leri kullanarak key’leri nasıl elden geçireceğimizi görelim
        //bunun için bir for Each loop oluşturalım. Burada Entry’lerle uğraşacağız.
        // Bu entry’ler Integer, Stringlerden oluşacak. Adı eachEntry. Bu entryler öğrenciEntrySeti’inden gelecek.

        //Entry’i map’ten import ediyoruz.

        //Bu şekilde her bir entry’deki keyleri ele almış oluruz.

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
        ) {


            System.out.println(eachEntry.getKey()); //sadece keyleri yazdırır.
        }


        // Entry'leri kullanarak tum ogrencilerin siniflarini 1 artirin
        // 12. sinifta olan varsa, map'ten cikarin


        // tum entry'leri elden gecirelim
        String entryValue;
        String[] entryValueArr;
        //entrylerle uğraşacağımız bir for Each loop oluşturalım. Bu entryler integer ve stringlerden oluşuyor.
        // Adı eachEntry. Map’ten import edelim.bu entryler öğrenci entry setinden gelecekler.
       // Ancak value’de update var. her bir entrydeki value’yu almada problem yok.
        // get ile alabilibiliriz.bu bize bir String getirir. Bu stringi alıp, parçalayıp,
        // değiştirip sonra yeninden map’a eklememeiz gerekir.

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
        ) {
            // herbir entry'deki value'yu alip, parcalayip istenen update'i yapip,
            // yeniden map'e eklememiz lazim
            //value bize bir String getireceği için bunu kaydetmemiz lazım. Bu yüzden yukarıda entryValue stringini oluşturduk.
            //her bir entry’deki value’yu getirecek ve bunu entryValue’ye atayacağız.

            entryValue=eachEntry.getValue(); // Ali-Can-10-H-MF

            //bunun içerisindeki class level’ı bize getirecek bunun için bir array oluşturmalıyız.
            // Yukarıdaki entryValueArr oluşturuyoruz bunun için.
            //Çizgi  - ile split edeceğiz.

            entryValueArr=entryValue.split("-"); // [Ali, Can, 10, H, MF]

            //şimdi sınıfını 1 arttıralım. Şartı 12 ise arttırmayacağız bu yüzden bir kontrol koymalıyız.
            // entryValueArr array’deki 2. İndex (sınıf) String 12’ye eşitse

            if (entryValueArr[2].equals("12")){
                // ogrencinin sinifi 12 ise
                eachEntry.setValue("Mezun oldu"); //delete olmadığı için mezun oldu diyoruz.


            }else{
                // ogrencinin sinifi 12 degilse
                // ya String olan 12’yi Integer’a çevirmeliyiz ya da bir if/else daha yapabiliriz, 10sa 11yap gibi.Integer’a çevirsek bile 11 yaptıktan sonra tekrar buraya koymamız için String olması lazım.

                //Integer yaparak çözelim. entryValueArr’nin 2. İndexini Integer’a çevirecek.
                int sinif=Integer.parseInt(entryValueArr[2]);
                sinif++;
                //sınıf integer’dı hiçlikle toplayarak onu String’e çevirdik.
                entryValueArr[2] = sinif+""; // [Ali, Can, 11, H, MF] 10 artık 11 olarak update edilmiş oldu.
                //update’i array’de yaptık bunu entry’de de yapmak lazım, entry’e döndürmek lazım.
                // Parçaladık, update’i yaptık, şimdi yeniden birleştirip montaj yapmamız gerekmekte.


                //setValue ile entry üzerinden value’u update ederiz. İçerisine String olarak yeni value’yu girmeliyiz.

                eachEntry.setValue(entryValueArr[0]+"-"+
                        entryValueArr[1]+"-"+
                        entryValueArr[2]+"-"+
                        entryValueArr[3]+"-"+
                        entryValueArr[4]);
            }   // Array’den alıp yapıştırdık. Sınıfı 12’ye kadar olanları arttırdık.
        }


                 System.out.println(ogrenciMap);


    }

}

