package Java_Education.day24_constractorsWithParameters;

public class TR_ArabaRunner {
    public static void main(String[] args) {
        TR_Araba arb1= new TR_Araba();
        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;
        System.out.println(arb1);
        TR_Araba arb2= new TR_Araba("Volvo","CX60");
        System.out.println(arb2);
        TR_Araba arb3= new TR_Araba("Hyundai","i10",10000);
        System.out.println(arb3);
        TR_Araba arb4= new TR_Araba("Porche","cayanne","lpg",1990,12000);
        System.out.println(arb4);
    }
}

