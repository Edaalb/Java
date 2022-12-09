package Java.day31_inheritance;

public class TR_CSuv extends TR_BinekArac {
    public static void main(String[] args) {
        TR_CSuv suv1=new TR_CSuv();
        System.out.println(suv1.marka); // Binek araclarin markasi vardir
        System.out.println(suv1.model); // Binek araclarin modeli olur
        System.out.println(suv1.motor); // Tum araclar motor kullanir
        System.out.println(suv1.plaka); // Tum araclarin plakasi olur
        System.out.println(suv1.yakit); // Araclar farkli yakitlar kullanir
        System.out.println(suv1.yil); // 1900
        suv1.hiz("benzin"); // binekl araclarin hizi modele gore degisir
        suv1.teker(); // binek araclarin 4 tekeri olur
        TR_CSuv suv2 = new TR_CSuv();
        suv2.marka="Toyota";
        suv2.model= "Rav4";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 006";
        suv2.yakit="Benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);
    }
    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'ler max 300 km hiz yapar");
        }else if(yakit.equalsIgnoreCase("Dizel")){
            System.out.println("Dizel SUV'ler max 260 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit SUV'ler max 220 km hiz yapar");
        }else{
            System.out.println("yakit belli degil, max hiz soyleyemem");
        }
    }

}
