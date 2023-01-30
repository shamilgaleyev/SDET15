package class15;

public class Dog {
    String name; //instance variable

    static int age; // static variable

    void printFood(){
        String food = "meat";// local
        System.out.println(food);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printFood();
    }
}
