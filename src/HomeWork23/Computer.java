package HomeWork23;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override
 some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
 Loop through each object and execute available methods.
     */
     void speed() {
        System.out.println("Computer has to be fast");
    }

     void storage() {
        System.out.println("Computer has to have a big storage");
    }

    void comfort() {
        System.out.println("Computer has to be comfortable");
    }
}

class Apple extends Computer {
    @Override
     void speed() {
        System.out.println("Apple is fast");
    }

    @Override
    void storage() {
        System.out.println("Apple has a big storage");
    }

    @Override
    void comfort() {
        System.out.println("Apple is comfortable");
    }
}

class Lenovo extends Computer {
    @Override
     void speed() {
        System.out.println("Lenovo is fast");
    }
    @Override
     void comfort() {
        System.out.println("Lenovo is comfortable");
    }

    @Override
    void storage() {

    }
}
class HP extends Computer {
    @Override
     void storage() {
        System.out.println("HP have a big storage");
    }

    @Override
    void speed() {

    }

    @Override
    void comfort() {

    }
}
class Dell extends Computer {
    @Override
     void speed() {
        System.out.println("Dell is fast");
    }


    @Override
     void storage() {
        System.out.println("Dell has a big storage");
    }

    @Override
     void comfort() {
        System.out.println("Dell is comfortable");
    }
}