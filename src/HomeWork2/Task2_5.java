package HomeWork2;

import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print
         “The temperature is the city  is ”
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the city");
        String name = input.nextLine();
        System.out.println("Please enter the temperature by Farengate");
        int tempF = input.nextInt();
        int tempC = (int) Math.ceil((tempF - 32) / 1.8);
        System.out.println("The temperature in the city  is " + tempC);

    }
}
