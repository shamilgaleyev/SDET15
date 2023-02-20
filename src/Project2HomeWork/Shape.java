package Project2HomeWork;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
     */
    double p = 3.14;
    void calculateArea();
    void calculatePerimiter();
}
class Circle implements Shape{

    double radius;
    @Override
    public void calculateArea() {
        System.out.println("Area of circle: " + p*radius*radius);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of circle equals " + 2*p*radius);
    }

}
class Square implements Shape{

    double side;
    @Override
    public void calculateArea() {
        System.out.println("Area of square: " + side*side);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of square: " + 4*side);
    }
}
class Tester{
    public static void main(String[] args) {
        Circle o1 = new Circle();
        Square o2 = new Square();
        o1.radius = 7.7;
        o2.side = 5.5;
        o1.calculateArea();
        o1.calculatePerimiter();
        o2.calculateArea();
        o2.calculatePerimiter();
    }
}