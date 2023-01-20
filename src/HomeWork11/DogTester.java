package HomeWork11;

public class DogTester {
    public static void main(String[] args) {
        Dog husky=new Dog();
        husky.age=3;
        husky.name="Druzhok";
        husky.size="Large";
        husky.color = "grey";

        Dog bulldog=new Dog();
        bulldog.age=5;
        bulldog.name="Tuzik";
        bulldog.size="Large";
        bulldog.color = "brown";

        Dog labrador=new Dog();
        labrador.age=7;
        labrador.name="Sharik";
        labrador.size="Large";
        labrador.color = "brown";


        husky.bark();
        bulldog.eat();
        labrador.run();

    }
}
