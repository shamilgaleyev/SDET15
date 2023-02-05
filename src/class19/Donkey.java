package class19;

public class Donkey {
    String name;
    int age;
    double weight;

//    Donkey(){
//        System.out.println("This is non argument constructor");
//    }

    Donkey(String name, int age){
        this.age = age;
        this.name = name;
    }
    void print(){
        System.out.println("Donkey's name is "
                + name + " age is " + age + " and weight " + weight);
    }

}
