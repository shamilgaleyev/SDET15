package HomeWork9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).
        String[] arr = {"Tami", "Omid", "Samuel", "Julia", "Tatiana",
                "Mohammad", "Saidjon", "William", "Shamil"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("Shamil")) {
                System.out.println(arr[i]);
            }
        }

    }

}
