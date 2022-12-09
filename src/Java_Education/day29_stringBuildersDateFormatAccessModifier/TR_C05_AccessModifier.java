package Java_Education.day29_stringBuildersDateFormatAccessModifier;

public class TR_C05_AccessModifier {
    public static void main(String[] args) {
        TR_C04_AccessModifiers obj= new TR_C04_AccessModifiers();
        obj.isim="Tugay";
        System.out.println(obj.isim); // Tugay
        // obj.sayi=20; private variable'lara baska class'dan ulasilamaz
        TR_C04_AccessModifiers obj2= new TR_C04_AccessModifiers();
        System.out.println(obj2.isim); // Ali
    }

}
