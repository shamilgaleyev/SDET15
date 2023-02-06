package HomeWork20;

public class Shape {
    /*
     Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
      In circle class create a method to calculate the area of circle. Test your code
     */
    double radius;
    Shape(double radius){
        this.radius = radius;
    }
}
class Circle extends Shape{
    double p;
    Circle(double radius, double p) {
        super(radius);
        this.p = p;
    }
    void area(){
        System.out.println("The area of sircle equals " +(p * radius * radius));
    }

    public static void main(String[] args) {
        Circle area = new Circle(4,3.14);
        area.area();
    }

}

