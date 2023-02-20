package class25;

public class MovAbleTester {
    public static void main(String[] args) {
        MovAble[] movAbles = {new Car(), new Dog()};

        for (MovAble x: movAbles){
            x.move();

        }
        OwnAble[] ownAbles = {new Car(), new Dog()};
        for (OwnAble y: ownAbles){
            y.own();
        }

    }
}
