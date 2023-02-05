package class19;

public class Test {
    public static void main(String[] args) {
         BankAccount ba = new BankAccount();
         ba.accountNumber = 87786526988L;
         ba.money = 1000;
         ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        System.out.println(" -- Creating object");

        Checking check = new Checking();
        check.accountNumber = 2435367272l;
        check.interest=0;
        check.deposit();
        check.transfer();

        Saving save = new Saving();
        save.accountNumber = 763767866l;
        save.money = 6543;
        save.profit = 100;

        save.deposit();
        save.takeProfit();

        SuperSavings superSave = new SuperSavings();
        superSave.accountNumber =787538788l;
        superSave.money = 6554332;
        superSave.profit = 100;
        superSave.deposit();
        superSave.takeProfit();
        superSave.superSaving();


    }
}
