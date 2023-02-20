package class25;

public class WashAbleTester {
    public static void main(String[] args) {
        WashAble[] washAbles = {new SmartWash(),new Inverter(),new Phone()};
        for(WashAble x: washAbles){
            x.wash();

        }
    }
}
