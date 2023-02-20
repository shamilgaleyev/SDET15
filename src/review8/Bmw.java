package review8;

import review7.Car;

public class Bmw extends Car {
    public Bmw(String make, String model) {
        super(make, model);
    }

    public Bmw(String make, String model, int year, int horsePower) {
        super(make, model, year, horsePower);
    }

    @Override
    public void start() {
        super.start();
        System.out.println(make + " starts with push a start button" );
    }

    @Override
    public void drive(int speed) {
        super.drive(speed);

    }

    @Override
    protected String drive(String destination) {
        return super.drive(destination);
    }
}
