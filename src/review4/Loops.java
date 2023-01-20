package review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scan.nextLine();

        } while (!answer.equalsIgnoreCase("yes"));
        System.out.println("Great jobs, lets learn arrays");
    }
}
