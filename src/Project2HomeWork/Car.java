package Project2HomeWork;

abstract public class Car {
    /*
    Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount

     */
    String color;
    double carPrice,salePrice;
    abstract double calculateSalePrice();
    Car(double carPrice){
        this.carPrice = carPrice;
    }

}
class Truck extends Car{
    double weight;
    Truck(double carPrice, double weight){
        super(carPrice);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight > 2000){
            salePrice = carPrice -(carPrice/100*10);
        } else {
            salePrice = carPrice -(carPrice/100*20);
        }
        return salePrice;
    }
}
class Sedan extends Car{
    double length;
    Sedan(double carPrice, double length){
        super(carPrice);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if(length > 20){
            salePrice = carPrice -(carPrice/100*5);
        } else {
            salePrice = carPrice -(carPrice/100*10);
        }
        return salePrice;
    }
}
class TesterCar{
    public static void main(String[] args) {
        Car t = new Truck(65000,2500);
        Car s = new Sedan(40000,25);
        System.out.println("Price of truck: "+ t.calculateSalePrice());
        System.out.println("Price of sedan: "+ s.calculateSalePrice());
    }
}