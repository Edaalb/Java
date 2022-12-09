package Java_Education.day03_mathCalculations;

public class Day03_DataCasting1 {
    public static void main(String[] args) {
        /*
          some data types never can be cast to each other
         */
        // String str=20;
        // boolean isItHappy="true";
        // int a= true;
        double s = 20;
        int number = 15;
        long ln = number;  // the left side of the equality is long, the right side is int
                          // java didn't compile
        /*
          Java automatically accepts it if you assign
          the narrow data type to the large data type
         */
        short sh= 23;

        int a=sh;

        long lng= sh;

        float fl= lng;

       /*
          but if we want to the reverse
          by assigning the large data type to the narrow one
          Java doesn't accept this
        */
        double dbl= 20;

        // a = dbl;

        // short abc= dbl;
    }
}


