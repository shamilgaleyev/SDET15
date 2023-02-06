package class20;

public class Parent {
    String name;
    static String lastname;

    Parent(){
        System.out.println("I am a parent class Contructor");
    }
    public void hello(){
        System.out.println("Pablic method hello from Parent class");
    }

    protected static void bye(){
        System.out.println("Protected method bye from Parent class");
    }

    private void money(){
        System.out.println("Private method money from Parent class");
    }


}
