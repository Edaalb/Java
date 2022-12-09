package Java.day25_staticKeyWord;

public class TR_Deneme {
    int a=10;
    static int b=20;
    String str1="Ali";
    static String str2="Ayse";
    TR_Deneme(){
        str1="Hasan";
        str2 += "++";
    }
    TR_Deneme(int x, int y){
        a=x;
        b=y;
    }
    public static void main(String[] args) {
        TR_Deneme dnm1= new TR_Deneme(6,8);
        System.out.println(dnm1.b);
        TR_Deneme dnm2=new TR_Deneme(10,12);
        System.out.println(dnm1.b);
    }
}
