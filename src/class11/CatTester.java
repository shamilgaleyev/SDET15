package class11;

public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Barsic";
        cat1.breed = "Van cat";
        cat1.color = "Grey";
        cat1.age = 2;
        cat1.attitudes = false;

        cat1.eat();
        Cat cat2 = new Cat();
        cat2.name = "Loki";
        cat2.breed = "Domestic";
        cat2.color = "White";
        cat2.age = 3;
        cat2.attitudes = false;
        cat2.speak();

    }
}
