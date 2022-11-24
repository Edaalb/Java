package bootcamp.day_04;

public class Day03_PrePostIncrement {
    public static void main(String[] args) {
        int x= 3;
        int y = 2 * ++x ;
        int z= 5 + y-- ;
        System.out.println(x+y+z);
    }
}
