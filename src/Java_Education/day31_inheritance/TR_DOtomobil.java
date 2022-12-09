package Java_Education.day31_inheritance;

public class TR_DOtomobil extends TR_BinekArac {
    public static void main(String[] args) {
        TR_DOtomobil oto1=new TR_DOtomobil();
        System.out.println(oto1.marka);
        // Inheritance sayesinde bir Child class olusturdugumuzda
        // yeni hicbir variable veya method olusturmadan
        // parent clas(lar)'daki tum ozellikleri almis oluruz
        // Child class'da parent'dan gelen ozellikleri
        // update edebilir veya yeni ozellikler ekleyebiliriz
    }

}
