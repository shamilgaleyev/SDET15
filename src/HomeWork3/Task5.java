package HomeWork3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        double num1 = number.nextDouble();
        double num2 = number.nextDouble();
        double num3 = number.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The Largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The Largest number is " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The Largest number is " + num3);
        }
    }
}
