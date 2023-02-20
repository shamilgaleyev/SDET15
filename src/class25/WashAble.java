package class25;

public interface WashAble {
    void wash();
}

 class SmartWash implements WashAble {


    @Override
    public void wash() {
        System.out.println("You can wash this smartphone");
    }
}
class Phone implements WashAble {

    public void wash(){
        System.out.println("I am ip65 rated  you can wash me");
    }

}

class Inverter implements WashAble {
    public void wash(){
        System.out.println("I am ip65 rated  you can wash me");
    }

}