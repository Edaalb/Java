package bootcamp.day_17;

public class Day17_ObjectVariables2 {
    public static void main(String[] args) {

        // C03 class'indaki instance variable'lara nasil ulasabiliriz ?
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz

        Day17_ObjectVariables1 pers1= new Day17_ObjectVariables1();

        System.out.println(pers1.persName); // No Name Entered
        System.out.println(pers1.persAge); // 0

        pers1.persName="Nana";
        pers1.persAge=35;
        pers1.persPhone="555.3456754";

        System.out.println(pers1.persName); // Nana
        System.out.println(pers1.persAge); // 35

        Day17_ObjectVariables1 pers2= new Day17_ObjectVariables1();

        pers2.persName="Elisa";
        pers2.persAge=32;
        pers2.persPhone="555 4322321";

        System.out.println(pers1.persName); // Nana
        System.out.println(pers2.persName); // Elisa

        Day17_ObjectVariables1 pers3= new Day17_ObjectVariables1();

        pers3.persName="Martin";
        pers3.persAge=30;
        pers3.persPhone="312 2134567";
        System.out.println(pers1.persAge); // 35
        System.out.println(pers2.persAge); // 32
        System.out.println(pers3.persAge); // 30
    }
}
