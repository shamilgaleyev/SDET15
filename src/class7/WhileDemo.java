package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner scan = new Scanner(System.in);
        int num = 15;
        while (condition) {
            System.out.println("Please enter number between 10 and 20");
            int userInput = scan.nextInt();
            if (userInput > num) {
                System.out.println("Your entered number is greater");
            } else if (userInput < num){
                System.out.println("Your entered number is smaller");
            } else {
                System.out.println("You won!!!");
                condition = false;
            }
        }
    }
}
