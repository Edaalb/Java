package Java_Education.day31_inheritance;

public class TR_BinekArac extends TR_Arac{
    protected  String marka="Binek araclarin markasi vardir";
    protected String model="Binek araclarin modeli olur";
    protected int yil=1900;
    protected void hiz(String yakit){
        System.out.println("binekl araclarin hizi modele gore degisir");
    }
    protected void teker(){
        System.out.println("binek araclarin 4 tekeri olur");
    }
}
