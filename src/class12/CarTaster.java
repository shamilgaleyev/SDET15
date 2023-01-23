package class12;

public class CarTaster {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.make = "BMW";
        bmw.model = "i7";
        bmw.year = 2023;
        bmw.color = "White";
        bmw.moveForward();
        bmw.applyBrakes();

        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.model = "RAV4";
        toyota.color = "White";
        toyota.year = 2021;
        toyota.moveForward();
        toyota.applyBrakes();
    }
}
