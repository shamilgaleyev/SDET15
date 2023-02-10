package review7;

public class Garage {
    public static void main(String[] args) {


        Tesla tesla = new Tesla("Tesla", "S", 2022, 340, "electric", true);
        tesla.start();
        tesla.drive(100);
        tesla.autoPilot = true;
        tesla.haveAutoPilot();
        tesla.drive("New York");
        tesla.drive(100, "new york");
    }

}
