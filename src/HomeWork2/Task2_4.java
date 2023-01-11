package HomeWork2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        /*
        You are DMV representative and you need to ask customer their age.
        If they are 18 and older you will issue a driver licence to them,
         otherwise you will offer them to get a learners permit.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("I will issue a driver licence");
        } else {
            System.out.println("I will offer to get a learners permit");
        }

    }
}
