package class19;

public class BankAccount {//parents class, supper class
    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit method from BankAccount class");
    }
}

class Checking extends BankAccount{// chald class or sub class or dereived class
    double interest;
    void transfer(){
        System.out.println("transfer method from Checking class");


        }
}

class Saving extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("Profit method from Saving class");
    }
}
class SuperSavings extends Saving{
    void superSaving(){
        System.out.println("SuperSaving method from SuperSaving class");
    }
}


