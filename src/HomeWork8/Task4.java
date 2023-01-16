package HomeWork8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Write a program to ask a user to enter item they want to buy and the price of that item.
         Every time user enters money accumulate the amount and tell the user how much is left
          to pay off. If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"
         */
        Scanner scan1 = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 3; i ++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the item and price");
            String item = scan.next();

            double price = scan.nextDouble();
            total = total + price;


        }
        System.out.println("This is the total price that you have to pay " + total);
        System.out.println("Please pay");
        double amountPaid = scan1.nextDouble();

         if(amountPaid>total){
            double chang=amountPaid-total;
            System.out.println("Hey here is your change "+chang);
        }else if(amountPaid<total) {
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");

    }
}
