package Java_Education.day24_constractorsWithParameters;

public class EN_Car {
            int advertNo;
            String brand = "not assigned";
            String model = "not assigned";
            String fuel;
            int year;

            public EN_Car (){

    }

            /*    public Car (int advertNo, String brand, String model, String fuel, int year){
            //    this.advertNo = advertNo;
            //    this.brand = brand;
            //    this.model = model;
            //    this.fuel = fuel;
            //    this.year = year;
                }*/


      public EN_Car(int advertNo, String brand, String model, String fuel, int year) {
        this.advertNo = advertNo;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.year = year;
    }

    public EN_Car (int advertNo, String brand, String model){
        this.advertNo = advertNo;
        this.brand = brand;
        this.model = model;
    }


    public String toString() {
        return "Car{" +
                "advertNo=" + advertNo +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", year=" + year +
                '}';
    }
}
