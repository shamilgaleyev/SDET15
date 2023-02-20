package class25;

public interface MovAble {
    void move();
}
interface OwnAble{
    void own();
}
class Car implements MovAble, OwnAble{

    @Override
    public void move() {

    }

    @Override
    public void own() {

    }
}
class Dog implements MovAble, OwnAble{

    @Override
    public void move() {

    }

    @Override
    public void own() {

    }
}