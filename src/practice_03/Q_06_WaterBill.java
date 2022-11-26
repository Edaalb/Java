package practice_03;

import java.util.Scanner;

public class Q_06_WaterBill2 {
    public static void main(String args[]) {
         /*Methods with return
        The **waterTax** method calculates a water bill. The method takes a double and returns a double.
        The more water you use the more it will cost you
                  >Cost under 50`: bill = units * 0.60;
                  >Cost above 50`: bill = units * 0.90;
                  >Cost above 100 : the calculation is same as `above 50` but an additional 50 fine
                  >Cost above 150 : it's the same as `above 50` but an additional 100 fine
       Examples:
            waterTax(50) returns 30
            waterTax(55) returns 49.5
            waterTax(101) returns 140.9
            waterTax(151) returns 235.9 */

        double unit;
        double b;


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of units");
        unit = scan.nextDouble();

        b = waterTax(unit);

        System.out.println("Bill to pay : " + b);
    }

    static double waterTax(double unit) {
        double billpay = 0;

        if (unit <= 50) {
            billpay= unit * 0.60;
        } else if (unit >50 && unit <=100) {
            billpay= unit * 0.90;
        } else if (unit >100 && unit<=150) {
            billpay= (unit*0.90) + 50.00;
        } else if (unit > 150) {
            billpay= (unit * 0.90) + 100.00;

        }
        return billpay;
    }
}
