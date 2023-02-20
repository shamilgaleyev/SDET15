package review8;

public class InsuranceTest {
    public static void main(String[] args) {
       Insurance carPolicy = new CarPolicy("I554343","John Smith",200, 25);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());


       // Insurance[] insurances = {new CarPolicy(),new PetPolicy()};
    }
}
