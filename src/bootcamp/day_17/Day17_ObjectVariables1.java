package bootcamp.day_17;

public class Day17_ObjectVariables1 {
    static String hospitalName="New Care Hospital";
    static int patientNumber= 23453;
    static String cheifPsyName;

    String persName="No Name Entered";
    String persPhone="No Phone Number Entered";

    int persAge;
    /*
      Class level variables scope is the whole class
      As the variables indicated with static word can be reached anywhere within scope,
      it is also called class variables.
      The variables not indicated with the static word are instance varaibles.
      As instance variables are sticked to objects, they are also called object variables.
   */
    public static void main(String[] args) {
        System.out.println(hospitalName);
    }
}
