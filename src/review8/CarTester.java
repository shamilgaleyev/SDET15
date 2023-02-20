package review8;

import review7.Car;
import review7.Tesla;

public class CarTester {
    public static void main(String[] args) {
      Bmw bmw = new Bmw("Bmw","X7") ;
      bmw.start();
      bmw.drive("Miami");

      Car car = new Car("Some Car","Some Model");
      car.start();
      car.drive(100);
      Tesla tesla = new Tesla("Tesla","s",2022,350,"automatic", true);
      tesla.start();
      tesla.drive(100);
      tesla.drive(100,"Miami");

      Car[] arr = {new Tesla("Tesla","s",2022,350,"automatic", true),new Bmw("Bmw","X7")};
      for(Car x: arr){
          x.start();
          x.drive(120,"Miami");
          x.drive(110);
      }
    }
}
