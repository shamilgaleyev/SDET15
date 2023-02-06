package class20;

public class BaseClass {
    String name = "John";
    void hello(){
        System.out.println("hello method from BaseClass");
    }
}

class Child extends BaseClass {
    String name = "Jane";

    void callMe(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
    void hello(){
        System.out.println("Hello method from child class");
    }
    void callingParentMethod(){
        hello();
        super.hello();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.callMe();
        child.callingParentMethod();
    }
}


