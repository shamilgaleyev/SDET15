package review8;

public abstract class Insurance {
    public static String company = "Geico";
   public String policyNumber;
    protected String policyHolder;

    public Insurance(String policyNumber, String policyHolder){
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
    }
    public void getInsurance(){
        System.out.println("I need to get insurance");
    }
    public abstract double calculateCoverage();
}

class CarPolicy extends Insurance{
    double premium;
    int age;

    public CarPolicy(String policyNumber, String policyHolder,double premium,int age) {
        super(policyNumber, policyHolder);
        this.premium = premium;
        this.age = age;
    }

    @Override
    public double calculateCoverage() {
        if(age < 20){
            return premium*2;
        }else if(age < 40){
            return premium*0.5;
        }else{
            return premium*0.2;
        }
    }
}
class PetPolicy extends Insurance{

    int numberOfPets;
    double premium;
    public PetPolicy(String policyNumber, String policyHolder,double premium,int numberOfPets) {
        super(policyNumber, policyHolder);
        this.numberOfPets = numberOfPets;
        this.premium = premium;
    }

    @Override
    public double calculateCoverage() {
        if(numberOfPets > 2){
            return premium*2;
        }else if(numberOfPets>5){
            return  premium*3;
        }else {
            return premium*5;
        }
    }
}