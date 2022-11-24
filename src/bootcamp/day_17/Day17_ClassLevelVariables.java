package bootcamp.day_17;

public class Day17_ClassLevelVariables {

    // class level variables are created out of methods
    // generally they are created at top
    static String hospitalName= "New Care Hospital";
    static int patientNumber= 23453;
    static String chiefPhyName;

    String persName= "No name entered";
    String persPhone= "No phone number entered";

    int persAge;

    public static void main(String[] args) {
        System.out.println(hospitalName); // New Care Hospital
        System.out.println(chiefPhyName); // null
        //System.out.println(persName); // As it is not static, it cannot be used with static main method

        /*
        If no value is assigned to the class level variables
        Java assigns these variables the values defined as default according to the data type
         default values
         numeric variables : 0
         boolean : false
         char : ''
         Objects (including String) : null
         */
    }
    public static void method1(){
        System.out.println(patientNumber);
        patientNumber++;
        // System.out.println(persName);
    }
    public void method2(){
        System.out.println(hospitalName); // New Care Hospital
        patientNumber++;
        System.out.println(persName); // null
        System.out.println(persAge); // 0
    }
}
