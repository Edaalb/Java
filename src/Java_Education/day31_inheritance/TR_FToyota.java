package Java_Education.day31_inheritance;

public class TR_FToyota extends TR_EAraba{

    TR_FToyota(){

        super();
        System.out.println("Toyota cons. calisti");
    }
    protected String marka = "Toyata";
    protected String motor= "Toyota araclar cevreci motor kullanir";
    protected String uretimYeri="Uretim yeri belirtilmemis";
    protected int hiz=140;
}
