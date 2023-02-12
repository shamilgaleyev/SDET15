package HomeWork21;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.

     */
    double balance;
    double interest;

    public CreditCard(double balance,double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void interest(){
         System.out.println("interest"+(balance*interest)/100);

     }



}
class Visa extends CreditCard{

    public Visa(double balance, double interest) {
        super(balance, interest);

    }
}
class AX extends CreditCard{

    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void interest() {
        System.out.println("interest"+(balance*interest/100)+30);
    }
}
class Tester{
    public static void main(String[] args) {
        AX ax = new AX(100,10);
        Visa visa = new Visa(100,10);
        CreditCard creditCard = new CreditCard(100,10);
        ax.interest();
        creditCard.interest();
        visa.interest();
    }
}