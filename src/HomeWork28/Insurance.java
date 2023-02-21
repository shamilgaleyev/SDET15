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
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;

    @Override
    void getQuote() {
        System.out.println("Car class method getQuote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Car class method cancelInsurance");
    }
}
class Pet extends Insurance{
    String petType;

    @Override
    void getQuote() {
        System.out.println("Pet class method getQuote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Pet class method cancelInsurance");
    }
}
class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("Health class method getQuote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Health class method cancelInsurance");
    }
}
class Tester {
    public static void main(String[] args) {
        Insurance c = new Car();
        Insurance p = new Pet();
        Insurance h = new Health();
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