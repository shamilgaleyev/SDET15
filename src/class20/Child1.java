package class20;

public class Child1 extends Parent{
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.hello();
        Parent.bye();// becouse static
        Child1.bye();// becouse static
        c1.bye();

        c1.name = "Gulzhanar";
        Child1.lastname = "Berik";// becouse static
        Parent.lastname= "Berik";// static

    }
}
