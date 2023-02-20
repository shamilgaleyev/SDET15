package review7;

public class Tesla extends Car{
    String type;
    boolean autoPilot;
    public Tesla(String make, String model, int year, int horsePower,String type, boolean autoPilot){
        super(make,model,year,horsePower);
        this.type = type;
        this.autoPilot = autoPilot;
    }
    void haveAutoPilot(){
        System.out.println(make + " have auto pilot " + autoPilot);
    }
    public void start(){

    }
}
