package class24;

public class AnimalTester {
    public static void main(String[] args) {
        Animal[] animals ={new Dog(),new Cat(),new Cow()};
        for(Animal a:animals){
            a.eat();
            a.speak();
        }
    }
}
