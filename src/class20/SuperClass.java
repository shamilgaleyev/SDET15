package class20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from parent class");
    }
}

class SubClass extends SuperClass{
       SubClass(){
           //super();
           System.out.println("I am from child constructor");
       }
}
