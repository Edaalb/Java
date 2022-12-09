package Java_Education.day22_arraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TR_TamBolenlerListesi {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan pozitif bir tamsayi alip,
        //        o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı girininiz");
        int input= scan.nextInt();
        System.out.println(tamBolenlerListesiOlustur(input));
    }
    public static List<Integer> tamBolenlerListesiOlustur(int input){
        List<Integer> tamBolenlerListesi= new ArrayList<>();
        for (int i = 1; i <=input ; i++) {
            if (input % i == 0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}
