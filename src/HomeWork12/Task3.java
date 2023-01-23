package HomeWork12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String mam = scan.next();

        System.out.println("Dad’s first name?");
        String dad = scan.next();

        System.out.println("Boy or Girl?");
        String gender = scan.next();
        if (gender.equalsIgnoreCase("boy")){
            System.out.println("DANRY");
        } else if (gender.equalsIgnoreCase("girl")) {
            System.out.println("MAIEL");

        }

    }
}
