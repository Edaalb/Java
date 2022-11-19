package bootcamp.day_04;

public class Day03_IncrementDecrement {

        public static void main(String[] args) {

            int number = 10 ;
            // Increase this number by 3 and print

            number = number+3;
            System.out.println(number); // 13
            number +=3;
            System.out.println(number); // 16
            int s= 10;
            // Increase this number by 1
            s=s+1;
            System.out.println(s); // 11
            s+=1;
            System.out.println(s); // 12
            s++;
            System.out.println(s); // 13
            ++s;
            System.out.println(s); // 14
            int t= 10;
            // Decrase this numbers value by one
            t=t-1; // 9
            t-=1; // 8
            t--; // 7
            --t; // 6
            System.out.println(t);
        }
}
