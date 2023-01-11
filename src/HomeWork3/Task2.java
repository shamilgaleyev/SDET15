package HomeWork3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("Please enter number of week day");
        int dayWeek = days.nextInt();
        if(dayWeek >= 1 && dayWeek <= 5){
            System.out.println("It is a weekday");
        } else if (dayWeek > 5 && dayWeek < 8) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid day");
        }

    }
}
