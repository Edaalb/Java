package Java.day24_constractorsWithParameters;

public class TR_Araba {
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    public TR_Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }
    int fiyat;
    public TR_Araba (String mrk,String mdl){
        marka=mrk;
        model=mdl;
    }
    public TR_Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }
    public TR_Araba(){
    }
    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }
}
