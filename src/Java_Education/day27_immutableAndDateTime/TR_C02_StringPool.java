package Java_Education.day27_immutableAndDateTime;

public class TR_C02_StringPool {
    public static void main(String[] args) {
        String str1 = "Java_Education";
        String str2 = "Java_Education";
        String str3 = new String("Java_Education");
        String str4="";
        str4= str4.concat("Java_Education");
        String str5="Ja";
        str5=str5.concat("va");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1==str2); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1==str4); // false
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1==str5); // false
        System.out.println(str1== "Java_Education"); //true
        System.out.println(str3== "Java_Education"); // false
        /*
          == 'in true vermesi icin hem referance hem de adress ayni olmalidir
          equals() ise sadece degerlere bakar, dolayisla supriz yasamazsiniz
         */
    }
}
