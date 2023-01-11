package HomeWork3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*
        HomeWork: Using scanner class create calculator.
         Allow user to enter 2 numbers and operator(+,-,*,/).
         Based on operator provide the result to user.
         */
        Scanner calculator = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        double num1 = calculator.nextDouble();
        double num2 = calculator.nextDouble();
        System.out.println("Please enter Math operator");
        char operator = calculator.next().charAt(0);
        if (operator == '+'){
            System.out.println("Sum of 2 numbers is " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Subtraction of 2 numbers is " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Multiplication of 2 numbers is " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("Division of 2 numbers is " + (num1 / num2));
        } else {
            System.out.println("Wrong operator");
        }
    }
}
