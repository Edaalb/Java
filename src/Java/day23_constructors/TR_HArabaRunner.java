package Java.day23_constructors;

public class TR_HArabaRunner {
    public static void main(String[] args) {
        TR_HAraba arb1= new TR_HAraba();
        arb1.marka="Toyota";
        arb1.model="Corolla";
        arb1.yakit="Dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;
        System.out.println(arb1);
        TR_HAraba arb2= new TR_HAraba("Honda","Civic","Benzin",2011,11000);
        System.out.println(arb2);
        TR_HAraba arb3=new TR_HAraba("Opel","Corsa","Dizel",2013,10000);
        System.out.println(arb3);
        TR_HAraba arb4= new TR_HAraba("Tesla","x",2020);
        System.out.println(arb4);
    }
}
