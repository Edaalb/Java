package Java.day23_constructors;

public class EN_HCarsDifferentCars {
    public static void main(String[] args) {

        EN_HCar superModelCar = new EN_HCar(1234,"Mercedes","C180","benzine",30000);

        System.out.println(superModelCar);

        EN_HCar.maxSpeed(superModelCar.fuel);

        System.out.println("superModelCar.numberOfTires = " + superModelCar.numberOfTires); //4


        EN_HCar secondCar = new EN_HCar(34534,"Opel","corsa","diesel",333334);
        System.out.println(secondCar);

        System.out.println("secondCar.numberOfTires = " + secondCar.numberOfTires); //4
        secondCar.numberOfTires=5;
        System.out.println("secondCar.numberOfTires = " + secondCar.numberOfTires); //5


        System.out.println("superModelCar.numberOfTires = " + superModelCar.numberOfTires); //5
    }
}
