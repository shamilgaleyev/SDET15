package HomeWork2;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        /*
        You are a loan specialist and you need to ask user what is the amount of loan is needed.
         If loan is less or equal to 200,000 then you would lend the money
          otherwise you would reject the client.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How mach many do you need?");
        int loanAmount = input.nextInt();
        if (loanAmount <= 200000) {
            System.out.println("Client will take a loan");
        } else {
            System.out.println("Client will not take a loan");
        }

    }
}
