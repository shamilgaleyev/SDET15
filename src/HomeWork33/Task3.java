package HomeWork33;

import java.util.Scanner;

public class Task3 {
    //Create a method to check age eligibility that will throw a runtime exception.
    // Method should throw an exception age is less than 16.
    static boolean checkAge(int age){
        if(age < 16){
            throw new RuntimeException("Age is less than 16");
        } else {
            System.out.println("You're good to go!");
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int a = input.nextInt();

        checkAge(a);

    }

}
