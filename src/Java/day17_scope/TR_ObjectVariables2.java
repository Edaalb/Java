package Java.day17_scope;

public class TR_ObjectVariables2 {
    public static void main(String[] args) {

        // C03 class'indaki instance variable'lara nasil ulasabiliriz ?
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz

        TR_ObjectVariables1 pers1= new TR_ObjectVariables1();
        System.out.println(pers1.persIsmi); // Isim girilmedi
        System.out.println(pers1.persYasi); // 0
        pers1.persIsmi="Suleyman";
        pers1.persYasi=35;
        pers1.persTelefonu="555.3456754";
        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers1.persYasi); // 35
        TR_ObjectVariables1 pers2= new TR_ObjectVariables1();
        pers2.persIsmi="Latife";
        pers2.persYasi=32;
        pers2.persTelefonu="555 4322321";
        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers2.persIsmi); // Latife
        TR_ObjectVariables1 pers3= new TR_ObjectVariables1();
        pers3.persIsmi="Heysem";
        pers3.persYasi=30;
        pers3.persTelefonu="312 2134567";
        System.out.println(pers1.persYasi); // 35
        System.out.println(pers2.persYasi); // 32
        System.out.println(pers3.persYasi); // 30
    }
}
