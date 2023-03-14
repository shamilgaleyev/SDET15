package HomeWork33;

import java.util.Scanner;

public class Task4 {
    // Create a method checkUserName that will throw a runtime exception.
    // Method should throw an exception when entered username is less than 5 characters.

    static boolean checkUsername(String un){

        if (un.length() < 5){
            throw new RuntimeException("Username must be 5 characters or more");
        } else {
            System.out.println("You're good to go!");
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter username");
        String u = input.nextLine();

        checkUsername(u);

    }
}
