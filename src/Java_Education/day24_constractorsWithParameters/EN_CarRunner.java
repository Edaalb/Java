package Java_Education.day24_constractorsWithParameters;

public class EN_CarRunner {
    public static void main(String[] args) {


        EN_Car firstCar = new EN_Car();

        firstCar.advertNo= 1234;
        firstCar.brand ="Opel";
        firstCar.model ="Corsa";
        firstCar.fuel =" benzine";
        firstCar.year =1999;


        EN_Car secondCar = new EN_Car(4321,"Mercedes","E200","diesel",2013);

        System.out.println(secondCar);

    }

}
