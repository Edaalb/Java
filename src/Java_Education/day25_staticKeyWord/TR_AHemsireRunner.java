package Java_Education.day25_staticKeyWord;

public class TR_AHemsireRunner {
    public static void main(String[] args) {
        TR_AHemsire h1=new TR_AHemsire();
        h1.personelIsim="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="3123425465";
        System.out.println(h1);
        TR_AHemsire h2= new TR_AHemsire();
        System.out.println(h2);
        h2.personelIsim="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="3124323232";
        h2.bashekimIsmi="Yasar Kemal";
        System.out.println("h1 : " + h1);
        System.out.println("h2 : " + h2);
        TR_AHemsire h3=new TR_AHemsire();
        System.out.println("h3 : "+h3);
        h3.hastaneIsmi="Java Hastanesi";
        System.out.println(h2.hastaneIsmi); // Java Hastanesi
    }
}
