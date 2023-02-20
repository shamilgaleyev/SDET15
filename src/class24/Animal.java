package class24;

public abstract class Animal {
   abstract void speak();
   abstract void eat();
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff wuff");
    }

    @Override
    void eat() {
        System.out.println("Like meat");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Miau");
    }

    @Override
    void eat() {
        System.out.println("Like fish");
    }
}
class Cow extends Animal{
    @Override
    void speak() {
        System.out.println("Moo moo");
    }

    @Override
    void eat() {
        System.out.println("Like grass");
    }
}