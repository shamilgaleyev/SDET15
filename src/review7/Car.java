package review7;

public class Car {
    String make, model;
    int year, horsePower, speed;

    public Car(String make, String model){
        this.make = make;
        this.model = model;

    }
    public Car(String make, String model, int year, int horsePower){
        this(make,model);
        this.year= year;
        this.horsePower = horsePower;
    }
    void start(){
        System.out.println(make + "start");
    }

     public void drive(int speed){
        System.out.println(make + "drives with speed " + speed);
    }

    void drive(String destination){
        System.out.println(make + " drive to " + destination);
    }

    public void drive(int speed, String destination){
        System.out.println(make + " drive to " + destination);
    }
}

