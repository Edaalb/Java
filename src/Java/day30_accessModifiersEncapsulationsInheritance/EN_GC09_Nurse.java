package Java.day30_accessModifiersEncapsulationsInheritance;

public class EN_GC09_Nurse extends EN_GC07_Accounting{
    public static void main(String[] args) {

        EN_GC09_Nurse nurse1 = new EN_GC09_Nurse();
        nurse1.salary=30*8*20;
        System.out.println(nurse1.salary);

        nurse1.name= "Hatice";
        nurse1.lastName="Cooker";
        nurse1.sgkNo= 12341234;

        System.out.println(nurse1.name);


        EN_GC09_Nurse  nurse2 = new EN_GC09_Nurse();
        nurse2.lastName="Last";
        nurse2.name ="Beyza";

        System.out.println(nurse2.name);
        System.out.println(nurse2.lastName);
    }
}
