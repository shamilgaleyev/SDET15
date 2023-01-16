package HomeWork8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Write a program that reads a range of integers (start and end point),
//        provided by a user and then from that range prints the sum of the even and
//        odd integers.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = num1; i<= num2; i ++) {
            if (i % 2 == 0) {
                evenSum += i;// evenSum = evenSum + i;
            } else {
                oddSum += i;
            }
        }
            System.out.println("Sum of even number " + evenSum);
            System.out.println("Sum of odd number " + oddSum);


    }
}
