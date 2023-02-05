package class19;

public class ConstructorChain {

    ConstructorChain(){
        System.out.println("I am non argument constructor");
    }

    ConstructorChain(String str){
        this();
        System.out.println(str);
    }

    ConstructorChain(String str, int number){

        this(str);

        System.out.println("This is constructor with int parametr " + number);
    }

    public static void main(String[] args) {
        ConstructorChain obj = new ConstructorChain("hello",20);

    }
}
