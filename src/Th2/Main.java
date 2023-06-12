package Th2;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Vin", "VF9");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mec", "C300");
        System.out.println(Car.numberOfCars);
    }
}
