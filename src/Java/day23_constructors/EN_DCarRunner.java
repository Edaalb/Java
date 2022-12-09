package Java.day23_constructors;

public class EN_DCarRunner {
    public static void main(String[] args) {

        //Let's create an object from DCar Class

        EN_DCar firstCar = new EN_DCar();

        System.out.println(firstCar.advertNo);
        System.out.println(firstCar.brand);
        System.out.println(firstCar.model);
        System.out.println(firstCar.fuel);
        System.out.println(firstCar.price);



        firstCar.advertNo =1001;
        firstCar.brand = "BMW";
        firstCar.model = "E5.20";
        firstCar.fuel="benzine";
        firstCar.price=10000;

        System.out.println("-------------------");
        System.out.println(firstCar.advertNo);
        System.out.println(firstCar.brand);
        System.out.println(firstCar.model);
        System.out.println(firstCar.fuel);
        System.out.println(firstCar.price);
        EN_DCar.maxSpeed(firstCar.fuel);


        System.out.println(firstCar);

        EN_DCar secondCar = new EN_DCar();

        System.out.println(secondCar);




    }
}
