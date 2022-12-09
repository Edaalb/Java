package Java.day03_mathCalculations;

public class Day03_ExplicitNarrowing {
    public static void main(String[] args) {
        int number =20;
        /*
          If you want to assign the large data type to the narrow data type,
          Java asks you take the responsibility.

          To take this responsibility you need to write the data type with () in front of the value you will cast

          But in this situation data loses (while getting to int from double, the values after comma will be deleted)
          and also metamorph. can be seen (if we can int tp the byte, it will continuously starts from the beginning)
         */
        short sh= (short)number;
        System.out.println(sh); // 20
        double dbl = 23.5;
        int num = (int)dbl;
        System.out.println(num); // 23
        num= 256; // int
        byte byt= (byte)num;
        System.out.println(byt); // 0
    }
}

