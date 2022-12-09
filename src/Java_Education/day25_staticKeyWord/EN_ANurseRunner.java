package Java_Education.day25_staticKeyWord;

public class EN_ANurseRunner {
    public static void main(String[] args) {

        EN_ANurse nurs1 = new EN_ANurse();

        System.out.println(nurs1);
        nurs1.nurseName="Ayse";
        nurs1.nurseAddress="Cankaya";
        nurs1.nursePhone="232435445";
        System.out.println("------------");
        System.out.println(nurs1);

        EN_ANurse nurs2 = new EN_ANurse();
        nurs2.nurseName= "Fatma";
        nurs2.nurseAddress="ulus";
        nurs2.nursePhone ="23423423234";
        nurs2.headPhysi="Dr. Yasar";

        System.out.println("------------");
        System.out.println(nurs1);

        EN_ANurse nurs3= new EN_ANurse();
        System.out.println(nurs3);
        nurs3.hospitalName = "Java Hospital";

        System.out.println("what is the name of the hospital :"+ nurs1.hospitalName);


    }
}
