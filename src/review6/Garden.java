package review6;

public class Garden {
    void hello(){
        String name = "Adem";
        System.out.println("Hello" + name);

    }
    public static void main(String[] args) {
        System.out.println(Flower.pretty);


     Flower flower1 = new Flower();
     flower1.name = "Hibiscus";
     flower1.color = "red";
     flower1.price = 5;
     flower1.bloom();
     flower1.grow();
     flower1.smell();
     flower1.pretty = false;

     Flower flower2 = new Flower();
        flower2.name = "Rose";
        flower2.color = "red";
        flower2.price = 15;
        flower2.bloom();
        flower2.grow();
        flower2.smell();
        System.out.println(flower2.pretty);

     Flower flower3 = new Flower();


    }
}
