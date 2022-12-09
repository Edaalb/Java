package Java_Education.day23_constructors;

public class EN_HCarRunner {
    public static void main(String[] args) {

        EN_HCar firstCar = new EN_HCar();

        firstCar.advertNo=1111;
        firstCar.brand = "Toyota";
        firstCar.model ="Corolla";
        firstCar.fuel = "diesel";
        firstCar.price= 13000;

        System.out.println(firstCar);


        EN_HCar secondCar = new EN_HCar(2002,"Tesla","x","electric",100000);
        System.out.println("---------------");
        System.out.println(secondCar);
        EN_HCar.maxSpeed(secondCar.fuel);

        EN_HCar thirdCar = new EN_HCar(3000,"Mercedes","E200");

        System.out.println("-----------------");
        System.out.println(thirdCar);


    }


}
