package Java.day27_immutableAndDateTime;

import java.time.LocalDate;
import java.time.Period;

public class TR_C07_PeriodOf {
    public static void main(String[] args) {
        // dogumunuzdan bugune ne kadar zaman gecti ?
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1972,01,18);
        Period gecenSure= Period.between(dogumGunu,bugun);
        System.out.println(gecenSure); // P50Y9M11D
        System.out.println(gecenSure.getYears()); // 50
    }
}
