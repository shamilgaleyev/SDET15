package review9;

public interface Drawable {

    public static final String TOOL = "Pencil";

    void draw();

    default void print(){
        System.out.println("We are drawing object using  " + TOOL);
    }
    static void erase(){
        System.out.println("All drawing are erasable");
    }

}
abstract class Shape{
    String color;
    double width,length;
    Shape(String color,double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    }
    public abstract double calculateArea();
}


class Rectangle extends Shape implements Drawable {

    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public void draw() {
        System.out.println("I am drawing rectangle");
    }
}
class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("I am drawing Square");
    }
}