package HomeWork2;

import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask if user has a credit card or not.
        If you user does not have a credit card then offer them.
        If they do have one ask what is balance on the card?
         If balance of the card is larger than 1000, tell them to pay off immediately,
         otherwise you can tell them that they can spend more.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean creditCard = input.nextBoolean();
        if (creditCard) {
            System.out.println(" what is balance on the card?");
            int amount = input.nextInt();
            if (amount > 1000) {
                System.out.println(" You must pay off immediately");
            } else {
                System.out.println(" You can spend more");
            }
        } else {
            System.out.println("You can take a credit card");
        }
    }
}

