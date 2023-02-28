package HomeWork28;

import java.util.ArrayList;

abstract public class Insurance {

        /*
         Create a class Insurance that will have an attribute as insuranceName and unimplemented
          behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
           Car class has it’s own attribute as carModel and Class Pet has petType attribute.
            Create 3 objects of the sub classes and store them in ArrayList.
             Using for loop/advanced for loop/ iterator access all methods of the class.
         */
    String insuranceName;
    public abstract void getQuote();
    public abstract void cancelInsurance();

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Car class method getQuote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Car class method cancelInsurance");
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
   public void getQuote() {
        System.out.println("Pet class method getQuote");
    }

    @Override
   public void cancelInsurance() {
        System.out.println("Pet class method cancelInsurance");
    }
}
class Health extends Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
   public void getQuote() {
        System.out.println("Health class method getQuote");
    }

    @Override
  public   void cancelInsurance() {
        System.out.println("Health class method cancelInsurance");
    }
}
class Tester {
    public static void main(String[] args) {
        Insurance c = new Car("Geico","BMW");
        Insurance p = new Pet("Pet love", "CAt");
        Insurance h = new Health("Aliance");
        ArrayList<Insurance> classes = new ArrayList<>();
        classes.add(c);
        classes.add(p);
        classes.add(h);
        for(Insurance x: classes){
            x.getQuote();
            x.cancelInsurance();
        }
    }
}